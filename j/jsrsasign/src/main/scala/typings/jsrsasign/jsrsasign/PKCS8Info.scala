package typings.jsrsasign.jsrsasign

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PKCS8Info extends StObject {
  
  /** hexadecimal string of encrypted private key */
  var ciphertext: String
  
  /** encryption algorithm name (currently TripleDES only) */
  var encryptionSchemeAlg: String
  
  /** initial vector for encryption algorithm */
  var encryptionSchemeIV: String
  
  /** hexadecimal string of PBKDF2 salt */
  var pbkdf2Salt: String
  
  /** iteration count */
  var pkbdf2Iter: String
}
object PKCS8Info {
  
  inline def apply(
    ciphertext: String,
    encryptionSchemeAlg: String,
    encryptionSchemeIV: String,
    pbkdf2Salt: String,
    pkbdf2Iter: String
  ): PKCS8Info = {
    val __obj = js.Dynamic.literal(ciphertext = ciphertext.asInstanceOf[js.Any], encryptionSchemeAlg = encryptionSchemeAlg.asInstanceOf[js.Any], encryptionSchemeIV = encryptionSchemeIV.asInstanceOf[js.Any], pbkdf2Salt = pbkdf2Salt.asInstanceOf[js.Any], pkbdf2Iter = pkbdf2Iter.asInstanceOf[js.Any])
    __obj.asInstanceOf[PKCS8Info]
  }
  
  extension [Self <: PKCS8Info](x: Self) {
    
    inline def setCiphertext(value: String): Self = StObject.set(x, "ciphertext", value.asInstanceOf[js.Any])
    
    inline def setEncryptionSchemeAlg(value: String): Self = StObject.set(x, "encryptionSchemeAlg", value.asInstanceOf[js.Any])
    
    inline def setEncryptionSchemeIV(value: String): Self = StObject.set(x, "encryptionSchemeIV", value.asInstanceOf[js.Any])
    
    inline def setPbkdf2Salt(value: String): Self = StObject.set(x, "pbkdf2Salt", value.asInstanceOf[js.Any])
    
    inline def setPkbdf2Iter(value: String): Self = StObject.set(x, "pkbdf2Iter", value.asInstanceOf[js.Any])
  }
}
