package typings.iobroker.iobrokerMod.Global.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// interface UserGroup { }
/** Contains information about a user */
trait User extends js.Object {
  /** Access rights of this user */
  var acl: ObjectPermissions
  /** Which groups this user belongs to */
  var groups: js.Array[UserGroup]
}

object User {
  @scala.inline
  def apply(acl: ObjectPermissions, groups: js.Array[UserGroup]): User = {
    val __obj = js.Dynamic.literal(acl = acl, groups = groups)
  
    __obj.asInstanceOf[User]
  }
}

