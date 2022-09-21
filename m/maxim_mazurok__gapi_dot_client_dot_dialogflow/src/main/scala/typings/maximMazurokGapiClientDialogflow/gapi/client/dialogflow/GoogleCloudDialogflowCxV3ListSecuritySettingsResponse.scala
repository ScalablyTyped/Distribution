package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3ListSecuritySettingsResponse extends StObject {
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The list of security settings. */
  var securitySettings: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3SecuritySettings]] = js.undefined
}
object GoogleCloudDialogflowCxV3ListSecuritySettingsResponse {
  
  inline def apply(): GoogleCloudDialogflowCxV3ListSecuritySettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3ListSecuritySettingsResponse]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3ListSecuritySettingsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSecuritySettings(value: js.Array[GoogleCloudDialogflowCxV3SecuritySettings]): Self = StObject.set(x, "securitySettings", value.asInstanceOf[js.Any])
    
    inline def setSecuritySettingsUndefined: Self = StObject.set(x, "securitySettings", js.undefined)
    
    inline def setSecuritySettingsVarargs(value: GoogleCloudDialogflowCxV3SecuritySettings*): Self = StObject.set(x, "securitySettings", js.Array(value*))
  }
}
