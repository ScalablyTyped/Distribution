package typings.libp2pCrypto

import typings.libp2pCrypto.distSrcAesMod.AESCipher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object aesMod {
  
  @JSImport("@libp2p/crypto/aes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(key: js.typedarray.Uint8Array, iv: js.typedarray.Uint8Array): js.Promise[AESCipher] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AESCipher]]
}
