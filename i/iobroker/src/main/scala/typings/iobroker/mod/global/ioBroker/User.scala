package typings.iobroker.mod.global.ioBroker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO find out how this looks like
// interface UserGroup { }
/** Contains information about a user */
@js.native
trait User extends StObject {
  
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
  implicit class UserMutableBuilder[Self <: User] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcl(value: ObjectPermissions): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroups(value: js.Array[UserGroup]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsVarargs(value: UserGroup*): Self = StObject.set(x, "groups", js.Array(value :_*))
  }
}
