package typings.libp2pCrypto

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object importerMod {
  
  @JSImport("@libp2p/crypto/dist/src/keys/importer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def importer(privateKey: String, password: String): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("importer")(privateKey.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
}
