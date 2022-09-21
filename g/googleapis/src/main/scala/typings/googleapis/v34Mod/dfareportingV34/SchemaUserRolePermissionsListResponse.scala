package typings.googleapis.v34Mod.dfareportingV34

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUserRolePermissionsListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#userRolePermissionsListResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User role permission collection.
    */
  var userRolePermissions: js.UndefOr[js.Array[SchemaUserRolePermission]] = js.undefined
}
object SchemaUserRolePermissionsListResponse {
  
  inline def apply(): SchemaUserRolePermissionsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserRolePermissionsListResponse]
  }
  
  extension [Self <: SchemaUserRolePermissionsListResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setUserRolePermissions(value: js.Array[SchemaUserRolePermission]): Self = StObject.set(x, "userRolePermissions", value.asInstanceOf[js.Any])
    
    inline def setUserRolePermissionsUndefined: Self = StObject.set(x, "userRolePermissions", js.undefined)
    
    inline def setUserRolePermissionsVarargs(value: SchemaUserRolePermission*): Self = StObject.set(x, "userRolePermissions", js.Array(value*))
  }
}
