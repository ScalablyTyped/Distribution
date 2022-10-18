package typings.libp2pCrypto

import typings.libp2pCrypto.anon.Update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcAesCiphersBrowserMod {
  
  @JSImport("@libp2p/crypto/dist/src/aes/ciphers-browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createCipheriv(mode: Any, key: js.typedarray.Uint8Array, iv: js.typedarray.Uint8Array): Update = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(mode.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[Update]
  
  inline def createDecipheriv(mode: Any, key: js.typedarray.Uint8Array, iv: js.typedarray.Uint8Array): Update = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(mode.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[Update]
}
