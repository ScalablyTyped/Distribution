package typings.jsrsasign

import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.GeneralNameParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CertissuerString extends GeneralNameParam {
  var certissuer: String
}

object Anon_CertissuerString {
  @scala.inline
  def apply(certissuer: String): Anon_CertissuerString = {
    val __obj = js.Dynamic.literal(certissuer = certissuer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CertissuerString]
  }
}

