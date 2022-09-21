package typings.googleapis.resourcesettingsV1Mod.resourcesettingsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudResourcesettingsV1SettingMetadata extends StObject {
  
  /**
    * The data type for this setting.
    */
  var dataType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The value provided by Setting.effective_value if no setting value is explicitly set. Note: not all settings have a default value.
    */
  var defaultValue: js.UndefOr[SchemaGoogleCloudResourcesettingsV1Value] = js.undefined
  
  /**
    * A detailed description of what this setting does.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The human readable name for this setting.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A flag indicating that values of this setting cannot be modified. See documentation for the specific setting for updates and reasons.
    */
  var readOnly: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudResourcesettingsV1SettingMetadata {
  
  inline def apply(): SchemaGoogleCloudResourcesettingsV1SettingMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudResourcesettingsV1SettingMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudResourcesettingsV1SettingMetadata](x: Self) {
    
    inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeNull: Self = StObject.set(x, "dataType", null)
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setDefaultValue(value: SchemaGoogleCloudResourcesettingsV1Value): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyNull: Self = StObject.set(x, "readOnly", null)
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
  }
}
