package typings.jsrsasign

import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.GeneralNameParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCertissuerString extends GeneralNameParam {
  var certissuer: String
}

object AnonCertissuerString {
  @scala.inline
  def apply(certissuer: String): AnonCertissuerString = {
    val __obj = js.Dynamic.literal(certissuer = certissuer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCertissuerString]
  }
}

