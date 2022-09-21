package typings.libp2pCrypto

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cipherModeMod {
  
  @JSImport("@libp2p/crypto/dist/src/aes/cipher-mode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cipherMode(key: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cipherMode")(key.asInstanceOf[js.Any]).asInstanceOf[String]
}
