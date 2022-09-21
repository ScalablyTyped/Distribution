package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaDataStreamIosAppStreamData extends StObject {
  
  /**
    * Required. Immutable. The Apple App Store Bundle ID for the app Example: "com.example.myiosapp"
    */
  var bundleId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. ID of the corresponding iOS app in Firebase, if any. This ID can change if the iOS app is deleted and recreated.
    */
  var firebaseAppId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaDataStreamIosAppStreamData {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaDataStreamIosAppStreamData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaDataStreamIosAppStreamData]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaDataStreamIosAppStreamData](x: Self) {
    
    inline def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    inline def setBundleIdNull: Self = StObject.set(x, "bundleId", null)
    
    inline def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
    
    inline def setFirebaseAppId(value: String): Self = StObject.set(x, "firebaseAppId", value.asInstanceOf[js.Any])
    
    inline def setFirebaseAppIdNull: Self = StObject.set(x, "firebaseAppId", null)
    
    inline def setFirebaseAppIdUndefined: Self = StObject.set(x, "firebaseAppId", js.undefined)
  }
}
