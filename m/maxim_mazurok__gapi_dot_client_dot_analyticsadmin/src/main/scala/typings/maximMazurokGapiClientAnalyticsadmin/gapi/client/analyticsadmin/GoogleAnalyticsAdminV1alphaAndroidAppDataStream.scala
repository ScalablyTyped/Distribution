package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaAndroidAppDataStream extends StObject {
  
  /** Output only. Time when this stream was originally created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Human-readable display name for the Data Stream. The max allowed display name length is 255 UTF-16 code units. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Output only. ID of the corresponding Android app in Firebase, if any. This ID can change if the Android app is deleted and recreated. */
  var firebaseAppId: js.UndefOr[String] = js.undefined
  
  /** Output only. Resource name of this Data Stream. Format: properties/{property_id}/androidAppDataStreams/{stream_id} Example: "properties/1000/androidAppDataStreams/2000" */
  var name: js.UndefOr[String] = js.undefined
  
  /** Immutable. The package name for the app being measured. Example: "com.example.myandroidapp" */
  var packageName: js.UndefOr[String] = js.undefined
  
  /** Output only. Time when stream payload fields were last updated. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object GoogleAnalyticsAdminV1alphaAndroidAppDataStream {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaAndroidAppDataStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaAndroidAppDataStream]
  }
  
  extension [Self <: GoogleAnalyticsAdminV1alphaAndroidAppDataStream](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFirebaseAppId(value: String): Self = StObject.set(x, "firebaseAppId", value.asInstanceOf[js.Any])
    
    inline def setFirebaseAppIdUndefined: Self = StObject.set(x, "firebaseAppId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
