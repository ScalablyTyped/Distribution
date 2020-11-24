package typings.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A change of the permission setting on an item.
  */
@js.native
trait SchemaPermissionChange extends js.Object {
  
  /**
    * The set of permissions added by this change.
    */
  var addedPermissions: js.UndefOr[js.Array[SchemaPermission]] = js.native
  
  /**
    * The set of permissions removed by this change.
    */
  var removedPermissions: js.UndefOr[js.Array[SchemaPermission]] = js.native
}
object SchemaPermissionChange {
  
  @scala.inline
  def apply(): SchemaPermissionChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPermissionChange]
  }
  
  @scala.inline
  implicit class SchemaPermissionChangeOps[Self <: SchemaPermissionChange] (val x: Self) extends AnyVal {
    
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
    def setAddedPermissionsVarargs(value: SchemaPermission*): Self = this.set("addedPermissions", js.Array(value :_*))
    
    @scala.inline
    def setAddedPermissions(value: js.Array[SchemaPermission]): Self = this.set("addedPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddedPermissions: Self = this.set("addedPermissions", js.undefined)
    
    @scala.inline
    def setRemovedPermissionsVarargs(value: SchemaPermission*): Self = this.set("removedPermissions", js.Array(value :_*))
    
    @scala.inline
    def setRemovedPermissions(value: js.Array[SchemaPermission]): Self = this.set("removedPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemovedPermissions: Self = this.set("removedPermissions", js.undefined)
  }
}
