package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.crypto.DSA
import typings.jsrsasign.jsrsasign.KJUR.crypto.ECDSA
import typings.jsrsasign.jsrsasign.KJUR.jws.JWS.JsonWebKey
import typings.jsrsasign.jsrsasign.RSAKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ext extends js.Object {
  var ext: js.UndefOr[js.Array[SubjectAltName]] = js.undefined
  var sbjprvkey: RSAKey | ECDSA | DSA | JsonWebKey | E | String
  var sbjpubkey: RSAKey | ECDSA | DSA | JsonWebKey | E | String
  var sigalg: String
  var subject: StringParamcertissuerstri | X500NameParamcertissuerst | Certissuer
}

object Ext {
  @scala.inline
  def apply(
    sbjprvkey: RSAKey | ECDSA | DSA | JsonWebKey | E | String,
    sbjpubkey: RSAKey | ECDSA | DSA | JsonWebKey | E | String,
    sigalg: String,
    subject: StringParamcertissuerstri | X500NameParamcertissuerst | Certissuer,
    ext: js.Array[SubjectAltName] = null
  ): Ext = {
    val __obj = js.Dynamic.literal(sbjprvkey = sbjprvkey.asInstanceOf[js.Any], sbjpubkey = sbjpubkey.asInstanceOf[js.Any], sigalg = sigalg.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ext]
  }
}

