package typings.googleapis.firebaseV1beta1Mod.firebaseV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAddGoogleAnalyticsRequest extends StObject {
  
  /**
    * The ID for the existing [Google Analytics account](http://www.google.com/analytics/) that you want to link with the `FirebaseProject`. Specifying this field will provision a new Google Analytics property in your Google Analytics account and associate the new property with the `FirebaseProject`.
    */
  var analyticsAccountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID for the existing Google Analytics property that you want to associate with the `FirebaseProject`.
    */
  var analyticsPropertyId: js.UndefOr[String | Null] = js.undefined
}
object SchemaAddGoogleAnalyticsRequest {
  
  inline def apply(): SchemaAddGoogleAnalyticsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddGoogleAnalyticsRequest]
  }
  
  extension [Self <: SchemaAddGoogleAnalyticsRequest](x: Self) {
    
    inline def setAnalyticsAccountId(value: String): Self = StObject.set(x, "analyticsAccountId", value.asInstanceOf[js.Any])
    
    inline def setAnalyticsAccountIdNull: Self = StObject.set(x, "analyticsAccountId", null)
    
    inline def setAnalyticsAccountIdUndefined: Self = StObject.set(x, "analyticsAccountId", js.undefined)
    
    inline def setAnalyticsPropertyId(value: String): Self = StObject.set(x, "analyticsPropertyId", value.asInstanceOf[js.Any])
    
    inline def setAnalyticsPropertyIdNull: Self = StObject.set(x, "analyticsPropertyId", null)
    
    inline def setAnalyticsPropertyIdUndefined: Self = StObject.set(x, "analyticsPropertyId", js.undefined)
  }
}
