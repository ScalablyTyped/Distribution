package typings.googleapis.resourcesettingsV1Mod.resourcesettingsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudResourcesettingsV1ListSettingsResponse extends StObject {
  
  /**
    * Unused. A page token used to retrieve the next page.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of settings that are available at the specified Cloud resource.
    */
  var settings: js.UndefOr[js.Array[SchemaGoogleCloudResourcesettingsV1Setting]] = js.undefined
}
object SchemaGoogleCloudResourcesettingsV1ListSettingsResponse {
  
  inline def apply(): SchemaGoogleCloudResourcesettingsV1ListSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudResourcesettingsV1ListSettingsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudResourcesettingsV1ListSettingsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSettings(value: js.Array[SchemaGoogleCloudResourcesettingsV1Setting]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    inline def setSettingsVarargs(value: SchemaGoogleCloudResourcesettingsV1Setting*): Self = StObject.set(x, "settings", js.Array(value*))
  }
}
