package typings.iobroker.mod.global.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines the rights a user or group has to change objects */
@js.native
trait ObjectPermissions extends js.Object {
  
  /** The access rights for files */
  var file: ObjectOperationPermissions = js.native
  
  /** The access rights for objects */
  var `object`: ObjectOperationPermissions = js.native
  
  /** The access rights for states */
  var state: js.UndefOr[ObjectOperationPermissions] = js.native
  
  /** The access rights for users/groups */
  var users: ObjectOperationPermissions = js.native
}
object ObjectPermissions {
  
  @scala.inline
  def apply(
    file: ObjectOperationPermissions,
    `object`: ObjectOperationPermissions,
    users: ObjectOperationPermissions
  ): ObjectPermissions = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectPermissions]
  }
  
  @scala.inline
  implicit class ObjectPermissionsOps[Self <: ObjectPermissions] (val x: Self) extends AnyVal {
    
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
    def setUsers(value: ObjectOperationPermissions): Self = this.set("users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: ObjectOperationPermissions): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
