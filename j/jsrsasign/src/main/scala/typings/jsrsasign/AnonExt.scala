package typings.jsrsasign

import typings.jsrsasign.jsrsasign.KJUR.crypto.DSA
import typings.jsrsasign.jsrsasign.KJUR.crypto.ECDSA
import typings.jsrsasign.jsrsasign.KJUR.jws.JWS.JsonWebKey
import typings.jsrsasign.jsrsasign.RSAKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExt extends js.Object {
  var ext: js.UndefOr[js.Array[AnonSubjectAltName]] = js.undefined
  var sbjprvkey: RSAKey | ECDSA | DSA | JsonWebKey | AnonE | String
  var sbjpubkey: RSAKey | ECDSA | DSA | JsonWebKey | AnonE | String
  var sigalg: String
  var subject: StringParamcertissuerstri | X500NameParamcertissuerst | AnonCertissuer
}

object AnonExt {
  @scala.inline
  def apply(
    sbjprvkey: RSAKey | ECDSA | DSA | JsonWebKey | AnonE | String,
    sbjpubkey: RSAKey | ECDSA | DSA | JsonWebKey | AnonE | String,
    sigalg: String,
    subject: StringParamcertissuerstri | X500NameParamcertissuerst | AnonCertissuer,
    ext: js.Array[AnonSubjectAltName] = null
  ): AnonExt = {
    val __obj = js.Dynamic.literal(sbjprvkey = sbjprvkey.asInstanceOf[js.Any], sbjpubkey = sbjpubkey.asInstanceOf[js.Any], sigalg = sigalg.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExt]
  }
}

