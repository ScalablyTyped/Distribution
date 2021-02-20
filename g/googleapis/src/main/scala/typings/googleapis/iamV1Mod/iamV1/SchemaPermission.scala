package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A permission which can be included by a role.
  */
@js.native
trait SchemaPermission extends StObject {
  
  /**
    * The service API associated with the permission is not enabled.
    */
  var apiDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The current custom role support level.
    */
  var customRolesSupportLevel: js.UndefOr[String] = js.native
  
  /**
    * A brief description of what this Permission is used for.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The name of this Permission.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * This permission can ONLY be used in predefined roles.
    */
  var onlyInPredefinedRoles: js.UndefOr[Boolean] = js.native
  
  /**
    * The current launch stage of the permission.
    */
  var stage: js.UndefOr[String] = js.native
  
  /**
    * The title of this Permission.
    */
  var title: js.UndefOr[String] = js.native
}
object SchemaPermission {
  
  @scala.inline
  def apply(): SchemaPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPermission]
  }
  
  @scala.inline
  implicit class SchemaPermissionMutableBuilder[Self <: SchemaPermission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiDisabled(value: Boolean): Self = StObject.set(x, "apiDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiDisabledUndefined: Self = StObject.set(x, "apiDisabled", js.undefined)
    
    @scala.inline
    def setCustomRolesSupportLevel(value: String): Self = StObject.set(x, "customRolesSupportLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomRolesSupportLevelUndefined: Self = StObject.set(x, "customRolesSupportLevel", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOnlyInPredefinedRoles(value: Boolean): Self = StObject.set(x, "onlyInPredefinedRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyInPredefinedRolesUndefined: Self = StObject.set(x, "onlyInPredefinedRoles", js.undefined)
    
    @scala.inline
    def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
