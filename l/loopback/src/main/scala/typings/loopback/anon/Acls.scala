package typings.loopback.anon

import typings.loopback.loopbackStrings.DENY
import typings.loopback.mod.ACL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Acls extends js.Object {
  var acls: js.Array[ACL]
  var defaultPermission: DENY
  var http: Path
}

object Acls {
  @scala.inline
  def apply(acls: js.Array[ACL], defaultPermission: DENY, http: Path): Acls = {
    val __obj = js.Dynamic.literal(acls = acls.asInstanceOf[js.Any], defaultPermission = defaultPermission.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any])
    __obj.asInstanceOf[Acls]
  }
}

