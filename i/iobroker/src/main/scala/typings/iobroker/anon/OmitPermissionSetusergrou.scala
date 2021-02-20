package typings.iobroker.anon

import typings.iobroker.mod.global.ioBroker.ObjectOperationPermissions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<iobroker.iobroker.<global>.ioBroker.PermissionSet, 'user' | 'groups'> */
@js.native
trait OmitPermissionSetusergrou extends StObject {
  
  var file: ObjectOperationPermissions = js.native
  
  var `object`: ObjectOperationPermissions = js.native
  
  var other: Execute = js.native
  
  var state: js.UndefOr[ObjectOperationPermissions] = js.native
  
  var users: ObjectOperationPermissions = js.native
}
object OmitPermissionSetusergrou {
  
  @scala.inline
  def apply(
    file: ObjectOperationPermissions,
    `object`: ObjectOperationPermissions,
    other: Execute,
    users: ObjectOperationPermissions
  ): OmitPermissionSetusergrou = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitPermissionSetusergrou]
  }
  
  @scala.inline
  implicit class OmitPermissionSetusergrouMutableBuilder[Self <: OmitPermissionSetusergrou] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFile(value: ObjectOperationPermissions): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: ObjectOperationPermissions): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOther(value: Execute): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: ObjectOperationPermissions): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setUsers(value: ObjectOperationPermissions): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
  }
}
