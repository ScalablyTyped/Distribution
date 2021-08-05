package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A change of the permission setting on an item.
  */
trait SchemaPermissionChange extends StObject {
  
  /**
    * The set of permissions added by this change.
    */
  var addedPermissions: js.UndefOr[js.Array[SchemaPermission]] = js.undefined
  
  /**
    * The set of permissions removed by this change.
    */
  var removedPermissions: js.UndefOr[js.Array[SchemaPermission]] = js.undefined
}
object SchemaPermissionChange {
  
  inline def apply(): SchemaPermissionChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPermissionChange]
  }
  
  extension [Self <: SchemaPermissionChange](x: Self) {
    
    inline def setAddedPermissions(value: js.Array[SchemaPermission]): Self = StObject.set(x, "addedPermissions", value.asInstanceOf[js.Any])
    
    inline def setAddedPermissionsUndefined: Self = StObject.set(x, "addedPermissions", js.undefined)
    
    inline def setAddedPermissionsVarargs(value: SchemaPermission*): Self = StObject.set(x, "addedPermissions", js.Array(value :_*))
    
    inline def setRemovedPermissions(value: js.Array[SchemaPermission]): Self = StObject.set(x, "removedPermissions", value.asInstanceOf[js.Any])
    
    inline def setRemovedPermissionsUndefined: Self = StObject.set(x, "removedPermissions", js.undefined)
    
    inline def setRemovedPermissionsVarargs(value: SchemaPermission*): Self = StObject.set(x, "removedPermissions", js.Array(value :_*))
  }
}
