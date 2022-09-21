package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaAccessQuotaStatus extends StObject {
  
  /**
    * Quota consumed by this request.
    */
  var consumed: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Quota remaining after this request.
    */
  var remaining: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaAccessQuotaStatus {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaAccessQuotaStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaAccessQuotaStatus]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaAccessQuotaStatus](x: Self) {
    
    inline def setConsumed(value: Double): Self = StObject.set(x, "consumed", value.asInstanceOf[js.Any])
    
    inline def setConsumedNull: Self = StObject.set(x, "consumed", null)
    
    inline def setConsumedUndefined: Self = StObject.set(x, "consumed", js.undefined)
    
    inline def setRemaining(value: Double): Self = StObject.set(x, "remaining", value.asInstanceOf[js.Any])
    
    inline def setRemainingNull: Self = StObject.set(x, "remaining", null)
    
    inline def setRemainingUndefined: Self = StObject.set(x, "remaining", js.undefined)
  }
}
