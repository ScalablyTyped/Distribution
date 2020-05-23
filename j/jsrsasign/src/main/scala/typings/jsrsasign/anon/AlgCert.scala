package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlgCert extends js.Object {
  var alg: String
  var cert: String
}

object AlgCert {
  @scala.inline
  def apply(alg: String, cert: String): AlgCert = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], cert = cert.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlgCert]
  }
}

