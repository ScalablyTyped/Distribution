package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains properties of a user role permission.
  */
@js.native
trait SchemaUserRolePermission extends StObject {
  
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
  implicit class SchemaUserRolePermissionMutableBuilder[Self <: SchemaUserRolePermission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailability(value: String): Self = StObject.set(x, "availability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityUndefined: Self = StObject.set(x, "availability", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPermissionGroupId(value: String): Self = StObject.set(x, "permissionGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionGroupIdUndefined: Self = StObject.set(x, "permissionGroupId", js.undefined)
  }
}
