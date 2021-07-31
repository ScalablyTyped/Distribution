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
  
  @scala.inline
  def apply(
    ciphertext: String,
    encryptionSchemeAlg: String,
    encryptionSchemeIV: String,
    pbkdf2Salt: String,
    pkbdf2Iter: String
  ): PKCS8Info = {
    val __obj = js.Dynamic.literal(ciphertext = ciphertext.asInstanceOf[js.Any], encryptionSchemeAlg = encryptionSchemeAlg.asInstanceOf[js.Any], encryptionSchemeIV = encryptionSchemeIV.asInstanceOf[js.Any], pbkdf2Salt = pbkdf2Salt.asInstanceOf[js.Any], pkbdf2Iter = pkbdf2Iter.asInstanceOf[js.Any])
    __obj.asInstanceOf[PKCS8Info]
  }
  
  @scala.inline
  implicit class PKCS8InfoMutableBuilder[Self <: PKCS8Info] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCiphertext(value: String): Self = StObject.set(x, "ciphertext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionSchemeAlg(value: String): Self = StObject.set(x, "encryptionSchemeAlg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionSchemeIV(value: String): Self = StObject.set(x, "encryptionSchemeIV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPbkdf2Salt(value: String): Self = StObject.set(x, "pbkdf2Salt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPkbdf2Iter(value: String): Self = StObject.set(x, "pkbdf2Iter", value.asInstanceOf[js.Any])
  }
}
