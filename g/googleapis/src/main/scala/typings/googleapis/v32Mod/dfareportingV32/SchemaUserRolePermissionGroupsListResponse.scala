package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * User Role Permission Group List Response
  */
trait SchemaUserRolePermissionGroupsListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#userRolePermissionGroupsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * User role permission group collection.
    */
  var userRolePermissionGroups: js.UndefOr[js.Array[SchemaUserRolePermissionGroup]] = js.undefined
}
object SchemaUserRolePermissionGroupsListResponse {
  
  @scala.inline
  def apply(): SchemaUserRolePermissionGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserRolePermissionGroupsListResponse]
  }
  
  @scala.inline
  implicit class SchemaUserRolePermissionGroupsListResponseMutableBuilder[Self <: SchemaUserRolePermissionGroupsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setUserRolePermissionGroups(value: js.Array[SchemaUserRolePermissionGroup]): Self = StObject.set(x, "userRolePermissionGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserRolePermissionGroupsUndefined: Self = StObject.set(x, "userRolePermissionGroups", js.undefined)
    
    @scala.inline
    def setUserRolePermissionGroupsVarargs(value: SchemaUserRolePermissionGroup*): Self = StObject.set(x, "userRolePermissionGroups", js.Array(value :_*))
  }
}
