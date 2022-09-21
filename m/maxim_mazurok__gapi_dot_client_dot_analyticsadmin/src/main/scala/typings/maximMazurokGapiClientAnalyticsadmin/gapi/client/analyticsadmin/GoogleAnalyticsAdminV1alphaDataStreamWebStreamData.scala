package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaDataStreamWebStreamData extends StObject {
  
  /** Immutable. Domain name of the web app being measured, or empty. Example: "http://www.google.com", "https://www.google.com" */
  var defaultUri: js.UndefOr[String] = js.undefined
  
  /** Output only. ID of the corresponding web app in Firebase, if any. This ID can change if the web app is deleted and recreated. */
  var firebaseAppId: js.UndefOr[String] = js.undefined
  
  /** Output only. Analytics "Measurement ID", without the "G-" prefix. Example: "G-1A2BCD345E" would just be "1A2BCD345E" */
  var measurementId: js.UndefOr[String] = js.undefined
}
object GoogleAnalyticsAdminV1alphaDataStreamWebStreamData {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaDataStreamWebStreamData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaDataStreamWebStreamData]
  }
  
  extension [Self <: GoogleAnalyticsAdminV1alphaDataStreamWebStreamData](x: Self) {
    
    inline def setDefaultUri(value: String): Self = StObject.set(x, "defaultUri", value.asInstanceOf[js.Any])
    
    inline def setDefaultUriUndefined: Self = StObject.set(x, "defaultUri", js.undefined)
    
    inline def setFirebaseAppId(value: String): Self = StObject.set(x, "firebaseAppId", value.asInstanceOf[js.Any])
    
    inline def setFirebaseAppIdUndefined: Self = StObject.set(x, "firebaseAppId", js.undefined)
    
    inline def setMeasurementId(value: String): Self = StObject.set(x, "measurementId", value.asInstanceOf[js.Any])
    
    inline def setMeasurementIdUndefined: Self = StObject.set(x, "measurementId", js.undefined)
  }
}
