package typings.googleapis.firebaseV1beta1Mod.firebaseV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAnalyticsProperty extends StObject {
  
  /**
    * Output only. The ID of the [Google Analytics account](https://www.google.com/analytics/) for the Google Analytics property associated with the specified FirebaseProject.
    */
  var analyticsAccountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The display name of the Google Analytics property associated with the specified `FirebaseProject`.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The globally unique, Google-assigned identifier of the Google Analytics property associated with the specified `FirebaseProject`. If you called [`AddGoogleAnalytics`](../../v1beta1/projects/addGoogleAnalytics) to link the `FirebaseProject` with a Google Analytics account, the value in this `id` field is the same as the ID of the property either specified or provisioned with that call to `AddGoogleAnalytics`.
    */
  var id: js.UndefOr[String | Null] = js.undefined
}
object SchemaAnalyticsProperty {
  
  inline def apply(): SchemaAnalyticsProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnalyticsProperty]
  }
  
  extension [Self <: SchemaAnalyticsProperty](x: Self) {
    
    inline def setAnalyticsAccountId(value: String): Self = StObject.set(x, "analyticsAccountId", value.asInstanceOf[js.Any])
    
    inline def setAnalyticsAccountIdNull: Self = StObject.set(x, "analyticsAccountId", null)
    
    inline def setAnalyticsAccountIdUndefined: Self = StObject.set(x, "analyticsAccountId", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
