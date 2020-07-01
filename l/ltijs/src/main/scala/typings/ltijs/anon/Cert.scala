package typings.ltijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cert extends js.Object {
  var cert: String
  var key: String
}

object Cert {
  @scala.inline
  def apply(cert: String, key: String): Cert = {
    val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cert]
  }
}

