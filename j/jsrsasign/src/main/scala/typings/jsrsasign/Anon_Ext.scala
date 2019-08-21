package typings.jsrsasign

import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.StringParam
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.x509Ns.X500NameParam
import typings.jsrsasign.jsrsasignNs.KJURNs.cryptoNs.DSA
import typings.jsrsasign.jsrsasignNs.KJURNs.cryptoNs.ECDSA
import typings.jsrsasign.jsrsasignNs.KJURNs.jwsNs.JWSNs.JsonWebKey
import typings.jsrsasign.jsrsasignNs.RSAKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ext extends js.Object {
  var ext: js.UndefOr[js.Array[Anon_SubjectAltName]] = js.undefined
  var sbjprvkey: RSAKey | ECDSA | DSA | JsonWebKey | Anon_E | String
  var sbjpubkey: RSAKey | ECDSA | DSA | JsonWebKey | Anon_E | String
  var sigalg: String
  var subject: (StringParam with Anon_Certissuer) | (X500NameParam with Anon_Certissuer) | Anon_CertissuerCertsubject
}

object Anon_Ext {
  @scala.inline
  def apply(
    sbjprvkey: RSAKey | ECDSA | DSA | JsonWebKey | Anon_E | String,
    sbjpubkey: RSAKey | ECDSA | DSA | JsonWebKey | Anon_E | String,
    sigalg: String,
    subject: (StringParam with Anon_Certissuer) | (X500NameParam with Anon_Certissuer) | Anon_CertissuerCertsubject,
    ext: js.Array[Anon_SubjectAltName] = null
  ): Anon_Ext = {
    val __obj = js.Dynamic.literal(sbjprvkey = sbjprvkey.asInstanceOf[js.Any], sbjpubkey = sbjpubkey.asInstanceOf[js.Any], sigalg = sigalg, subject = subject.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext)
    __obj.asInstanceOf[Anon_Ext]
  }
}

