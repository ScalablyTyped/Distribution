package typings.libp2pCrypto

import typings.std.JsonWebKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcKeysJwk2pemMod {
  
  @JSImport("@libp2p/crypto/dist/src/keys/jwk2pem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def jwk2priv(key: JsonWebKey): JWK = ^.asInstanceOf[js.Dynamic].applyDynamic("jwk2priv")(key.asInstanceOf[js.Any]).asInstanceOf[JWK]
  
  inline def jwk2pub(key: JsonWebKey): JWK = ^.asInstanceOf[js.Dynamic].applyDynamic("jwk2pub")(key.asInstanceOf[js.Any]).asInstanceOf[JWK]
  
  trait JWK extends StObject {
    
    def decrypt(msg: String): String
    
    def encrypt(msg: String): String
  }
  object JWK {
    
    inline def apply(decrypt: String => String, encrypt: String => String): JWK = {
      val __obj = js.Dynamic.literal(decrypt = js.Any.fromFunction1(decrypt), encrypt = js.Any.fromFunction1(encrypt))
      __obj.asInstanceOf[JWK]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JWK] (val x: Self) extends AnyVal {
      
      inline def setDecrypt(value: String => String): Self = StObject.set(x, "decrypt", js.Any.fromFunction1(value))
      
      inline def setEncrypt(value: String => String): Self = StObject.set(x, "encrypt", js.Any.fromFunction1(value))
    }
  }
}
