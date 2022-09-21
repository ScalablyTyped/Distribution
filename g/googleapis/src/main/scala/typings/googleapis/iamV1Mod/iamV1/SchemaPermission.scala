package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPermission extends StObject {
  
  /**
    * The service API associated with the permission is not enabled.
    */
  var apiDisabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The current custom role support level.
    */
  var customRolesSupportLevel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A brief description of what this Permission is used for. This permission can ONLY be used in predefined roles.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of this Permission.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  var onlyInPredefinedRoles: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The preferred name for this permission. If present, then this permission is an alias of, and equivalent to, the listed primary_permission.
    */
  var primaryPermission: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The current launch stage of the permission.
    */
  var stage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The title of this Permission.
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaPermission {
  
  inline def apply(): SchemaPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPermission]
  }
  
  extension [Self <: SchemaPermission](x: Self) {
    
    inline def setApiDisabled(value: Boolean): Self = StObject.set(x, "apiDisabled", value.asInstanceOf[js.Any])
    
    inline def setApiDisabledNull: Self = StObject.set(x, "apiDisabled", null)
    
    inline def setApiDisabledUndefined: Self = StObject.set(x, "apiDisabled", js.undefined)
    
    inline def setCustomRolesSupportLevel(value: String): Self = StObject.set(x, "customRolesSupportLevel", value.asInstanceOf[js.Any])
    
    inline def setCustomRolesSupportLevelNull: Self = StObject.set(x, "customRolesSupportLevel", null)
    
    inline def setCustomRolesSupportLevelUndefined: Self = StObject.set(x, "customRolesSupportLevel", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnlyInPredefinedRoles(value: Boolean): Self = StObject.set(x, "onlyInPredefinedRoles", value.asInstanceOf[js.Any])
    
    inline def setOnlyInPredefinedRolesNull: Self = StObject.set(x, "onlyInPredefinedRoles", null)
    
    inline def setOnlyInPredefinedRolesUndefined: Self = StObject.set(x, "onlyInPredefinedRoles", js.undefined)
    
    inline def setPrimaryPermission(value: String): Self = StObject.set(x, "primaryPermission", value.asInstanceOf[js.Any])
    
    inline def setPrimaryPermissionNull: Self = StObject.set(x, "primaryPermission", null)
    
    inline def setPrimaryPermissionUndefined: Self = StObject.set(x, "primaryPermission", js.undefined)
    
    inline def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    inline def setStageNull: Self = StObject.set(x, "stage", null)
    
    inline def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
