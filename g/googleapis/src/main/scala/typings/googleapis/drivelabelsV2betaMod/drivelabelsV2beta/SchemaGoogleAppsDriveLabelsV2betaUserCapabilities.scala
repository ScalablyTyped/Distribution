package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2betaUserCapabilities extends StObject {
  
  /**
    * Output only. Whether the user is allowed access to the label manager.
    */
  var canAccessLabelManager: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Whether the user is an administrator for the shared labels feature.
    */
  var canAdministrateLabels: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Whether the user is allowed to create new admin labels.
    */
  var canCreateAdminLabels: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Whether the user is allowed to create new shared labels.
    */
  var canCreateSharedLabels: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Resource name for the user capabilities.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2betaUserCapabilities {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2betaUserCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2betaUserCapabilities]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2betaUserCapabilities](x: Self) {
    
    inline def setCanAccessLabelManager(value: Boolean): Self = StObject.set(x, "canAccessLabelManager", value.asInstanceOf[js.Any])
    
    inline def setCanAccessLabelManagerNull: Self = StObject.set(x, "canAccessLabelManager", null)
    
    inline def setCanAccessLabelManagerUndefined: Self = StObject.set(x, "canAccessLabelManager", js.undefined)
    
    inline def setCanAdministrateLabels(value: Boolean): Self = StObject.set(x, "canAdministrateLabels", value.asInstanceOf[js.Any])
    
    inline def setCanAdministrateLabelsNull: Self = StObject.set(x, "canAdministrateLabels", null)
    
    inline def setCanAdministrateLabelsUndefined: Self = StObject.set(x, "canAdministrateLabels", js.undefined)
    
    inline def setCanCreateAdminLabels(value: Boolean): Self = StObject.set(x, "canCreateAdminLabels", value.asInstanceOf[js.Any])
    
    inline def setCanCreateAdminLabelsNull: Self = StObject.set(x, "canCreateAdminLabels", null)
    
    inline def setCanCreateAdminLabelsUndefined: Self = StObject.set(x, "canCreateAdminLabels", js.undefined)
    
    inline def setCanCreateSharedLabels(value: Boolean): Self = StObject.set(x, "canCreateSharedLabels", value.asInstanceOf[js.Any])
    
    inline def setCanCreateSharedLabelsNull: Self = StObject.set(x, "canCreateSharedLabels", null)
    
    inline def setCanCreateSharedLabelsUndefined: Self = StObject.set(x, "canCreateSharedLabels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
