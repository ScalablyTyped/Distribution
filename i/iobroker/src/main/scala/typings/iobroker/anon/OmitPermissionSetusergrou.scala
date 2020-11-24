package typings.iobroker.anon

import typings.iobroker.mod.global.ioBroker.ObjectOperationPermissions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<iobroker.iobroker.<global>.ioBroker.PermissionSet, 'user' | 'groups'> */
@js.native
trait OmitPermissionSetusergrou extends js.Object {
  
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
  implicit class OmitPermissionSetusergrouOps[Self <: OmitPermissionSetusergrou] (val x: Self) extends AnyVal {
    
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
    def setFile(value: ObjectOperationPermissions): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: ObjectOperationPermissions): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOther(value: Execute): Self = this.set("other", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsers(value: ObjectOperationPermissions): Self = this.set("users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: ObjectOperationPermissions): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
