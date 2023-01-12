package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaDataStreamAndroidAppStreamData extends StObject {
  
  /** Output only. ID of the corresponding Android app in Firebase, if any. This ID can change if the Android app is deleted and recreated. */
  var firebaseAppId: js.UndefOr[String] = js.undefined
  
  /** Immutable. The package name for the app being measured. Example: "com.example.myandroidapp" */
  var packageName: js.UndefOr[String] = js.undefined
}
object GoogleAnalyticsAdminV1alphaDataStreamAndroidAppStreamData {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaDataStreamAndroidAppStreamData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaDataStreamAndroidAppStreamData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleAnalyticsAdminV1alphaDataStreamAndroidAppStreamData] (val x: Self) extends AnyVal {
    
    inline def setFirebaseAppId(value: String): Self = StObject.set(x, "firebaseAppId", value.asInstanceOf[js.Any])
    
    inline def setFirebaseAppIdUndefined: Self = StObject.set(x, "firebaseAppId", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
  }
}
