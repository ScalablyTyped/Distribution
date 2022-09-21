package typings.googleapis.dfareportingV4Mod.dfareportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUserRolePermission extends StObject {
  
  /**
    * Levels of availability for a user role permission.
    */
  var availability: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ID of this user role permission.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#userRolePermission".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of this user role permission.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ID of the permission group that this user role permission belongs to.
    */
  var permissionGroupId: js.UndefOr[String | Null] = js.undefined
}
object SchemaUserRolePermission {
  
  inline def apply(): SchemaUserRolePermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserRolePermission]
  }
  
  extension [Self <: SchemaUserRolePermission](x: Self) {
    
    inline def setAvailability(value: String): Self = StObject.set(x, "availability", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityNull: Self = StObject.set(x, "availability", null)
    
    inline def setAvailabilityUndefined: Self = StObject.set(x, "availability", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPermissionGroupId(value: String): Self = StObject.set(x, "permissionGroupId", value.asInstanceOf[js.Any])
    
    inline def setPermissionGroupIdNull: Self = StObject.set(x, "permissionGroupId", null)
    
    inline def setPermissionGroupIdUndefined: Self = StObject.set(x, "permissionGroupId", js.undefined)
  }
}
