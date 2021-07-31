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
  
  @scala.inline
  def apply(): SchemaPermissionChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPermissionChange]
  }
  
  @scala.inline
  implicit class SchemaPermissionChangeMutableBuilder[Self <: SchemaPermissionChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddedPermissions(value: js.Array[SchemaPermission]): Self = StObject.set(x, "addedPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddedPermissionsUndefined: Self = StObject.set(x, "addedPermissions", js.undefined)
    
    @scala.inline
    def setAddedPermissionsVarargs(value: SchemaPermission*): Self = StObject.set(x, "addedPermissions", js.Array(value :_*))
    
    @scala.inline
    def setRemovedPermissions(value: js.Array[SchemaPermission]): Self = StObject.set(x, "removedPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedPermissionsUndefined: Self = StObject.set(x, "removedPermissions", js.undefined)
    
    @scala.inline
    def setRemovedPermissionsVarargs(value: SchemaPermission*): Self = StObject.set(x, "removedPermissions", js.Array(value :_*))
  }
}
