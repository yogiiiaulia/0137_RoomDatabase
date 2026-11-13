package com.example.p9

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.p9.ui.theme.P9Theme
// TAMBAHKAN IMPORT INI (Sesuaikan dengan package tempat file PetaNavigasi.kt berada)
import com.example.p9.uicontroller.SiswaApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            P9Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // PANGGIL FUNGSI UTAMA APLIKASI ANDA DI SINI
                    SiswaApp()
                }
            }
        }
    }
}