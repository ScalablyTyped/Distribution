package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1ListSecuritySettingsResponse extends StObject {
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of security settings.
    */
  var securitySettings: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3beta1SecuritySettings]] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1ListSecuritySettingsResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1ListSecuritySettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1ListSecuritySettingsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1ListSecuritySettingsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSecuritySettings(value: js.Array[SchemaGoogleCloudDialogflowCxV3beta1SecuritySettings]): Self = StObject.set(x, "securitySettings", value.asInstanceOf[js.Any])
    
    inline def setSecuritySettingsUndefined: Self = StObject.set(x, "securitySettings", js.undefined)
    
    inline def setSecuritySettingsVarargs(value: SchemaGoogleCloudDialogflowCxV3beta1SecuritySettings*): Self = StObject.set(x, "securitySettings", js.Array(value*))
  }
}
