package typings.jsrsasign

import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.GeneralNameParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCertsubj extends GeneralNameParam {
  var certsubj: String
}

object AnonCertsubj {
  @scala.inline
  def apply(certsubj: String): AnonCertsubj = {
    val __obj = js.Dynamic.literal(certsubj = certsubj.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCertsubj]
  }
}

