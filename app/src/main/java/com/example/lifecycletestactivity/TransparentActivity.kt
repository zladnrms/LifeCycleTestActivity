package com.example.lifecycletestactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class TransparentActivity : AppCompatActivity() {

    private val TAG = "Transparent Activity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transparent)
        Log.d(TAG, "${LifeCycleEx.CREATE}")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "${LifeCycleEx.RESTART}")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "${LifeCycleEx.RESUME}")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "${LifeCycleEx.START}")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "${LifeCycleEx.PAUSE}")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "${LifeCycleEx.STOP}")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "${LifeCycleEx.DESTROY}")
    }


    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.d(TAG, "${LifeCycleEx.NEWINTENT}")
    }
}
