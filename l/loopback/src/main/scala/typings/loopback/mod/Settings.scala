package typings.loopback.mod

import typings.loopback.AnonPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var acls: js.Array[ACL]
  var http: AnonPath
}

object Settings {
  @scala.inline
  def apply(acls: js.Array[ACL], http: AnonPath): Settings = {
    val __obj = js.Dynamic.literal(acls = acls.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

