package typings.iobroker.mod.global.ioBroker

import typings.iobroker.anon.Execute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defined the complete set of access rights a user has */
trait PermissionSet
  extends StObject
     with ObjectPermissions {
  
  /** The name of the groups this ACL was merged from */
  var groups: js.Array[String]
  
  /** The access rights for certain commands */
  var other: Execute
  
  /** The name of the user this ACL is for */
  var user: String
}
object PermissionSet {
  
  @scala.inline
  def apply(
    file: ObjectOperationPermissions,
    groups: js.Array[String],
    `object`: ObjectOperationPermissions,
    other: Execute,
    user: String,
    users: ObjectOperationPermissions
  ): PermissionSet = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionSet]
  }
  
  @scala.inline
  implicit class PermissionSetMutableBuilder[Self <: PermissionSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value :_*))
    
    @scala.inline
    def setOther(value: Execute): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
