package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains properties of a user role permission.
  */
@js.native
trait SchemaUserRolePermission extends js.Object {
  
  /**
    * Levels of availability for a user role permission.
    */
  var availability: js.UndefOr[String] = js.native
  
  /**
    * ID of this user role permission.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#userRolePermission&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Name of this user role permission.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * ID of the permission group that this user role permission belongs to.
    */
  var permissionGroupId: js.UndefOr[String] = js.native
}
object SchemaUserRolePermission {
  
  @scala.inline
  def apply(): SchemaUserRolePermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserRolePermission]
  }
  
  @scala.inline
  implicit class SchemaUserRolePermissionOps[Self <: SchemaUserRolePermission] (val x: Self) extends AnyVal {
    
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
    def setAvailability(value: String): Self = this.set("availability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailability: Self = this.set("availability", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPermissionGroupId(value: String): Self = this.set("permissionGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionGroupId: Self = this.set("permissionGroupId", js.undefined)
  }
}
