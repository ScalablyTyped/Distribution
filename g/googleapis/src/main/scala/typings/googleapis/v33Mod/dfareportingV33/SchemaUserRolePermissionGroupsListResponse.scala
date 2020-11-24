package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * User Role Permission Group List Response
  */
@js.native
trait SchemaUserRolePermissionGroupsListResponse extends js.Object {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#userRolePermissionGroupsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * User role permission group collection.
    */
  var userRolePermissionGroups: js.UndefOr[js.Array[SchemaUserRolePermissionGroup]] = js.native
}
object SchemaUserRolePermissionGroupsListResponse {
  
  @scala.inline
  def apply(): SchemaUserRolePermissionGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserRolePermissionGroupsListResponse]
  }
  
  @scala.inline
  implicit class SchemaUserRolePermissionGroupsListResponseOps[Self <: SchemaUserRolePermissionGroupsListResponse] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setUserRolePermissionGroupsVarargs(value: SchemaUserRolePermissionGroup*): Self = this.set("userRolePermissionGroups", js.Array(value :_*))
    
    @scala.inline
    def setUserRolePermissionGroups(value: js.Array[SchemaUserRolePermissionGroup]): Self = this.set("userRolePermissionGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserRolePermissionGroups: Self = this.set("userRolePermissionGroups", js.undefined)
  }
}
