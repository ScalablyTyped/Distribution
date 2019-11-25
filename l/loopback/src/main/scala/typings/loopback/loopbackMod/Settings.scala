package typings.loopback.loopbackMod

import typings.loopback.Anon_Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var acls: js.Array[ACL]
  var http: Anon_Path
}

object Settings {
  @scala.inline
  def apply(acls: js.Array[ACL], http: Anon_Path): Settings = {
    val __obj = js.Dynamic.literal(acls = acls.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Settings]
  }
}

