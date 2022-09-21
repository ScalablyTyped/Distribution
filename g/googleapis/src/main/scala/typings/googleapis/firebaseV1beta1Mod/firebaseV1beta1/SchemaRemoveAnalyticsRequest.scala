package typings.googleapis.firebaseV1beta1Mod.firebaseV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRemoveAnalyticsRequest extends StObject {
  
  /**
    * Optional. The ID of the Google Analytics property associated with the specified `FirebaseProject`. - If not set, then the Google Analytics property that is currently associated with the specified `FirebaseProject` is removed. - If set, and the specified `FirebaseProject` is currently associated with a *different* Google Analytics property, then the response is a `412 Precondition Failed` error.
    */
  var analyticsPropertyId: js.UndefOr[String | Null] = js.undefined
}
object SchemaRemoveAnalyticsRequest {
  
  inline def apply(): SchemaRemoveAnalyticsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRemoveAnalyticsRequest]
  }
  
  extension [Self <: SchemaRemoveAnalyticsRequest](x: Self) {
    
    inline def setAnalyticsPropertyId(value: String): Self = StObject.set(x, "analyticsPropertyId", value.asInstanceOf[js.Any])
    
    inline def setAnalyticsPropertyIdNull: Self = StObject.set(x, "analyticsPropertyId", null)
    
    inline def setAnalyticsPropertyIdUndefined: Self = StObject.set(x, "analyticsPropertyId", js.undefined)
  }
}
