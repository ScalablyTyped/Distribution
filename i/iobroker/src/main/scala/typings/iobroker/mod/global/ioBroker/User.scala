package typings.iobroker.mod.global.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// interface UserGroup { }
/** Contains information about a user */
@js.native
trait User extends js.Object {
  
  /** Access rights of this user */
  var acl: ObjectPermissions = js.native
  
  /** Which groups this user belongs to */
  var groups: js.Array[UserGroup] = js.native
}
object User {
  
  @scala.inline
  def apply(acl: ObjectPermissions, groups: js.Array[UserGroup]): User = {
    val __obj = js.Dynamic.literal(acl = acl.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
  
  @scala.inline
  implicit class UserOps[Self <: User] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAcl(value: ObjectPermissions): Self = this.set("acl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsVarargs(value: UserGroup*): Self = this.set("groups", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: js.Array[UserGroup]): Self = this.set("groups", value.asInstanceOf[js.Any])
  }
}
