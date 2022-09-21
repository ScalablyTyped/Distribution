package typings.googleapis.v35Mod.dfareportingV35

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUserRolePermissionGroupsListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#userRolePermissionGroupsListResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User role permission group collection.
    */
  var userRolePermissionGroups: js.UndefOr[js.Array[SchemaUserRolePermissionGroup]] = js.undefined
}
object SchemaUserRolePermissionGroupsListResponse {
  
  inline def apply(): SchemaUserRolePermissionGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserRolePermissionGroupsListResponse]
  }
  
  extension [Self <: SchemaUserRolePermissionGroupsListResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setUserRolePermissionGroups(value: js.Array[SchemaUserRolePermissionGroup]): Self = StObject.set(x, "userRolePermissionGroups", value.asInstanceOf[js.Any])
    
    inline def setUserRolePermissionGroupsUndefined: Self = StObject.set(x, "userRolePermissionGroups", js.undefined)
    
    inline def setUserRolePermissionGroupsVarargs(value: SchemaUserRolePermissionGroup*): Self = StObject.set(x, "userRolePermissionGroups", js.Array(value*))
  }
}
