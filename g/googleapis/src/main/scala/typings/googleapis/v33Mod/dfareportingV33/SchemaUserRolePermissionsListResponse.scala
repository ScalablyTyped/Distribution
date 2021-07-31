package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * User Role Permission List Response
  */
trait SchemaUserRolePermissionsListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#userRolePermissionsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * User role permission collection.
    */
  var userRolePermissions: js.UndefOr[js.Array[SchemaUserRolePermission]] = js.undefined
}
object SchemaUserRolePermissionsListResponse {
  
  @scala.inline
  def apply(): SchemaUserRolePermissionsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserRolePermissionsListResponse]
  }
  
  @scala.inline
  implicit class SchemaUserRolePermissionsListResponseMutableBuilder[Self <: SchemaUserRolePermissionsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setUserRolePermissions(value: js.Array[SchemaUserRolePermission]): Self = StObject.set(x, "userRolePermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserRolePermissionsUndefined: Self = StObject.set(x, "userRolePermissions", js.undefined)
    
    @scala.inline
    def setUserRolePermissionsVarargs(value: SchemaUserRolePermission*): Self = StObject.set(x, "userRolePermissions", js.Array(value :_*))
  }
}
