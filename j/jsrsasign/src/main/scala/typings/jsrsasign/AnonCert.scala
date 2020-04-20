package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCert extends js.Object {
  var cert: String
  var hasis: Boolean
}

object AnonCert {
  @scala.inline
  def apply(cert: String, hasis: Boolean): AnonCert = {
    val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], hasis = hasis.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCert]
  }
}

