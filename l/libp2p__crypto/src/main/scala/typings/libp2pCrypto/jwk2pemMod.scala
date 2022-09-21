package typings.libp2pCrypto

import typings.std.JsonWebKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jwk2pemMod {
  
  @JSImport("@libp2p/crypto/dist/src/keys/jwk2pem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def jwk2priv(key: JsonWebKey): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("jwk2priv")(key.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def jwk2pub(key: JsonWebKey): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("jwk2pub")(key.asInstanceOf[js.Any]).asInstanceOf[Any]
}
