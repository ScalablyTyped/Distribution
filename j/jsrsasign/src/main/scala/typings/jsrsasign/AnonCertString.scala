package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCertString extends js.Object {
  var cert: String
}

object AnonCertString {
  @scala.inline
  def apply(cert: String): AnonCertString = {
    val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCertString]
  }
}

