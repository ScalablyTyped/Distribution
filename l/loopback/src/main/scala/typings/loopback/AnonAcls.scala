package typings.loopback

import typings.loopback.loopbackStrings.DENY
import typings.loopback.mod.ACL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAcls extends js.Object {
  var acls: js.Array[ACL]
  var defaultPermission: DENY
  var http: AnonPath
}

object AnonAcls {
  @scala.inline
  def apply(acls: js.Array[ACL], defaultPermission: DENY, http: AnonPath): AnonAcls = {
    val __obj = js.Dynamic.literal(acls = acls.asInstanceOf[js.Any], defaultPermission = defaultPermission.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAcls]
  }
}

