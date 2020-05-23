package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cert extends js.Object {
  var cert: String
  var hasis: Boolean
}

object Cert {
  @scala.inline
  def apply(cert: String, hasis: Boolean): Cert = {
    val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], hasis = hasis.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cert]
  }
}

