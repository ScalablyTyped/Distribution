package typings.libp2pCrypto

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lengthsMod {
  
  object default {
    
    @JSImport("@libp2p/crypto/dist/src/hmac/lengths", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@libp2p/crypto/dist/src/hmac/lengths", "default.SHA1")
    @js.native
    def SHA1: Double = js.native
    inline def SHA1_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHA1")(x.asInstanceOf[js.Any])
    
    @JSImport("@libp2p/crypto/dist/src/hmac/lengths", "default.SHA256")
    @js.native
    def SHA256: Double = js.native
    inline def SHA256_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHA256")(x.asInstanceOf[js.Any])
    
    @JSImport("@libp2p/crypto/dist/src/hmac/lengths", "default.SHA512")
    @js.native
    def SHA512: Double = js.native
    inline def SHA512_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHA512")(x.asInstanceOf[js.Any])
  }
}
