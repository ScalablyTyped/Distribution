package typings.jsrsasign.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PKCS8Info extends js.Object {
  /** hexadecimal string of encrypted private key */
  var ciphertext: String = js.native
  /** encryption algorithm name (currently TripleDES only) */
  var encryptionSchemeAlg: String = js.native
  /** initial vector for encryption algorithm */
  var encryptionSchemeIV: String = js.native
  /** hexadecimal string of PBKDF2 salt */
  var pbkdf2Salt: String = js.native
  /** iteration count */
  var pkbdf2Iter: String = js.native
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
  implicit class PKCS8InfoOps[Self <: PKCS8Info] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCiphertext(value: String): Self = this.set("ciphertext", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncryptionSchemeAlg(value: String): Self = this.set("encryptionSchemeAlg", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncryptionSchemeIV(value: String): Self = this.set("encryptionSchemeIV", value.asInstanceOf[js.Any])
    @scala.inline
    def setPbkdf2Salt(value: String): Self = this.set("pbkdf2Salt", value.asInstanceOf[js.Any])
    @scala.inline
    def setPkbdf2Iter(value: String): Self = this.set("pkbdf2Iter", value.asInstanceOf[js.Any])
  }
  
}

