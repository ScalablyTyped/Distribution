package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaWebDataStream extends StObject {
  
  /** Output only. Time when this stream was originally created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Immutable. Domain name of the web app being measured, or empty. Example: "http://www.google.com", "https://www.google.com" */
  var defaultUri: js.UndefOr[String] = js.undefined
  
  /** Required. Human-readable display name for the Data Stream. The max allowed display name length is 100 UTF-16 code units. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Output only. ID of the corresponding web app in Firebase, if any. This ID can change if the web app is deleted and recreated. */
  var firebaseAppId: js.UndefOr[String] = js.undefined
  
  /** Output only. Analytics "Measurement ID", without the "G-" prefix. Example: "G-1A2BCD345E" would just be "1A2BCD345E" */
  var measurementId: js.UndefOr[String] = js.undefined
  
  /** Output only. Resource name of this Data Stream. Format: properties/{property_id}/webDataStreams/{stream_id} Example: "properties/1000/webDataStreams/2000" */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. Time when stream payload fields were last updated. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object GoogleAnalyticsAdminV1alphaWebDataStream {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaWebDataStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaWebDataStream]
  }
  
  extension [Self <: GoogleAnalyticsAdminV1alphaWebDataStream](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDefaultUri(value: String): Self = StObject.set(x, "defaultUri", value.asInstanceOf[js.Any])
    
    inline def setDefaultUriUndefined: Self = StObject.set(x, "defaultUri", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFirebaseAppId(value: String): Self = StObject.set(x, "firebaseAppId", value.asInstanceOf[js.Any])
    
    inline def setFirebaseAppIdUndefined: Self = StObject.set(x, "firebaseAppId", js.undefined)
    
    inline def setMeasurementId(value: String): Self = StObject.set(x, "measurementId", value.asInstanceOf[js.Any])
    
    inline def setMeasurementIdUndefined: Self = StObject.set(x, "measurementId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
