package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3ListSecuritySettingsResponse extends StObject {
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of security settings.
    */
  var securitySettings: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3SecuritySettings]] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3ListSecuritySettingsResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3ListSecuritySettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3ListSecuritySettingsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3ListSecuritySettingsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSecuritySettings(value: js.Array[SchemaGoogleCloudDialogflowCxV3SecuritySettings]): Self = StObject.set(x, "securitySettings", value.asInstanceOf[js.Any])
    
    inline def setSecuritySettingsUndefined: Self = StObject.set(x, "securitySettings", js.undefined)
    
    inline def setSecuritySettingsVarargs(value: SchemaGoogleCloudDialogflowCxV3SecuritySettings*): Self = StObject.set(x, "securitySettings", js.Array(value*))
  }
}
