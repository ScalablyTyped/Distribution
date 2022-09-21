package typings.googleapis.resourcesettingsV1Mod.resourcesettingsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudResourcesettingsV1Setting extends StObject {
  
  /**
    * Output only. The effective value of the setting at the given parent resource, evaluated based on the resource hierarchy The effective value evaluates to one of the following options, in this order. If an option is not valid or doesn't exist, then the next option is used: 1. The local setting value on the given resource: Setting.local_value 2. If one of the given resource's ancestors in the resource hierarchy have a local setting value, the local value at the nearest such ancestor. 3. The setting's default value: SettingMetadata.default_value 4. An empty value, defined as a `Value` with all fields unset. The data type of Value must always be consistent with the data type defined in Setting.metadata.
    */
  var effectiveValue: js.UndefOr[SchemaGoogleCloudResourcesettingsV1Value] = js.undefined
  
  /**
    * A fingerprint used for optimistic concurrency. See UpdateSetting for more details.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The configured value of the setting at the given parent resource, ignoring the resource hierarchy. The data type of Value must always be consistent with the data type defined in Setting.metadata.
    */
  var localValue: js.UndefOr[SchemaGoogleCloudResourcesettingsV1Value] = js.undefined
  
  /**
    * Output only. Metadata about a setting which is not editable by the end user.
    */
  var metadata: js.UndefOr[SchemaGoogleCloudResourcesettingsV1SettingMetadata] = js.undefined
  
  /**
    * The resource name of the setting. Must be in one of the following forms: * `projects/{project_number\}/settings/{setting_name\}` * `folders/{folder_id\}/settings/{setting_name\}` * `organizations/{organization_id\}/settings/{setting_name\}` For example, "/projects/123/settings/gcp-enableMyFeature"
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudResourcesettingsV1Setting {
  
  inline def apply(): SchemaGoogleCloudResourcesettingsV1Setting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudResourcesettingsV1Setting]
  }
  
  extension [Self <: SchemaGoogleCloudResourcesettingsV1Setting](x: Self) {
    
    inline def setEffectiveValue(value: SchemaGoogleCloudResourcesettingsV1Value): Self = StObject.set(x, "effectiveValue", value.asInstanceOf[js.Any])
    
    inline def setEffectiveValueUndefined: Self = StObject.set(x, "effectiveValue", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setLocalValue(value: SchemaGoogleCloudResourcesettingsV1Value): Self = StObject.set(x, "localValue", value.asInstanceOf[js.Any])
    
    inline def setLocalValueUndefined: Self = StObject.set(x, "localValue", js.undefined)
    
    inline def setMetadata(value: SchemaGoogleCloudResourcesettingsV1SettingMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
