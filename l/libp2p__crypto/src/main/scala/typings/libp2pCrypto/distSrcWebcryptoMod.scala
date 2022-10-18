package typings.libp2pCrypto

import typings.std.Crypto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcWebcryptoMod {
  
  object default {
    
    @JSImport("@libp2p/crypto/dist/src/webcrypto", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def get(): Crypto = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[Crypto]
    inline def get(win: /* globalThis */ Any): Crypto = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(win.asInstanceOf[js.Any]).asInstanceOf[Crypto]
  }
}
