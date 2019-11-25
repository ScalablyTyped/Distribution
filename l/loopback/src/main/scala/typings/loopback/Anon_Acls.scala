package typings.loopback

import typings.loopback.loopbackMod.ACL
import typings.loopback.loopbackStrings.DENY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Acls extends js.Object {
  var acls: js.Array[ACL]
  var defaultPermission: DENY
  var http: Anon_Path
}

object Anon_Acls {
  @scala.inline
  def apply(acls: js.Array[ACL], defaultPermission: DENY, http: Anon_Path): Anon_Acls = {
    val __obj = js.Dynamic.literal(acls = acls.asInstanceOf[js.Any], defaultPermission = defaultPermission.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Acls]
  }
}

