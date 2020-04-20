package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlgCert extends js.Object {
  var alg: String
  var cert: String
}

object AnonAlgCert {
  @scala.inline
  def apply(alg: String, cert: String): AnonAlgCert = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], cert = cert.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlgCert]
  }
}

