package typings.googleapis.iamV2betaMod.iamV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleIamAdminV1AuditDataPermissionDelta extends StObject {
  
  /**
    * Added permissions.
    */
  var addedPermissions: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Removed permissions.
    */
  var removedPermissions: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleIamAdminV1AuditDataPermissionDelta {
  
  inline def apply(): SchemaGoogleIamAdminV1AuditDataPermissionDelta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleIamAdminV1AuditDataPermissionDelta]
  }
  
  extension [Self <: SchemaGoogleIamAdminV1AuditDataPermissionDelta](x: Self) {
    
    inline def setAddedPermissions(value: js.Array[String]): Self = StObject.set(x, "addedPermissions", value.asInstanceOf[js.Any])
    
    inline def setAddedPermissionsNull: Self = StObject.set(x, "addedPermissions", null)
    
    inline def setAddedPermissionsUndefined: Self = StObject.set(x, "addedPermissions", js.undefined)
    
    inline def setAddedPermissionsVarargs(value: String*): Self = StObject.set(x, "addedPermissions", js.Array(value*))
    
    inline def setRemovedPermissions(value: js.Array[String]): Self = StObject.set(x, "removedPermissions", value.asInstanceOf[js.Any])
    
    inline def setRemovedPermissionsNull: Self = StObject.set(x, "removedPermissions", null)
    
    inline def setRemovedPermissionsUndefined: Self = StObject.set(x, "removedPermissions", js.undefined)
    
    inline def setRemovedPermissionsVarargs(value: String*): Self = StObject.set(x, "removedPermissions", js.Array(value*))
  }
}
