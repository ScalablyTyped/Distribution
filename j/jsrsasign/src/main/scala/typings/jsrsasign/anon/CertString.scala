package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertString extends js.Object {
  var cert: String
}

object CertString {
  @scala.inline
  def apply(cert: String): CertString = {
    val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertString]
  }
}

