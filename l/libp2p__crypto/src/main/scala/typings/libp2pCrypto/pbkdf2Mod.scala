package typings.libp2pCrypto

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pbkdf2Mod {
  
  @JSImport("@libp2p/crypto/dist/src/pbkdf2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(password: String, salt: String, iterations: Double, keySize: Double, hash: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keySize.asInstanceOf[js.Any], hash.asInstanceOf[js.Any])).asInstanceOf[String]
}
