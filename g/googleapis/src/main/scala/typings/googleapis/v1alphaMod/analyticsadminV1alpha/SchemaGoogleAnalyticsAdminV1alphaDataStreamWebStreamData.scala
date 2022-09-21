package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaDataStreamWebStreamData extends StObject {
  
  /**
    * Immutable. Domain name of the web app being measured, or empty. Example: "http://www.google.com", "https://www.google.com"
    */
  var defaultUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. ID of the corresponding web app in Firebase, if any. This ID can change if the web app is deleted and recreated.
    */
  var firebaseAppId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Analytics "Measurement ID", without the "G-" prefix. Example: "G-1A2BCD345E" would just be "1A2BCD345E"
    */
  var measurementId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaDataStreamWebStreamData {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaDataStreamWebStreamData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaDataStreamWebStreamData]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaDataStreamWebStreamData](x: Self) {
    
    inline def setDefaultUri(value: String): Self = StObject.set(x, "defaultUri", value.asInstanceOf[js.Any])
    
    inline def setDefaultUriNull: Self = StObject.set(x, "defaultUri", null)
    
    inline def setDefaultUriUndefined: Self = StObject.set(x, "defaultUri", js.undefined)
    
    inline def setFirebaseAppId(value: String): Self = StObject.set(x, "firebaseAppId", value.asInstanceOf[js.Any])
    
    inline def setFirebaseAppIdNull: Self = StObject.set(x, "firebaseAppId", null)
    
    inline def setFirebaseAppIdUndefined: Self = StObject.set(x, "firebaseAppId", js.undefined)
    
    inline def setMeasurementId(value: String): Self = StObject.set(x, "measurementId", value.asInstanceOf[js.Any])
    
    inline def setMeasurementIdNull: Self = StObject.set(x, "measurementId", null)
    
    inline def setMeasurementIdUndefined: Self = StObject.set(x, "measurementId", js.undefined)
  }
}
