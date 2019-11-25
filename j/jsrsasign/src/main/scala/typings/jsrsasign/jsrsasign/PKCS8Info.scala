package typings.jsrsasign.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PKCS8Info extends js.Object {
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
}

