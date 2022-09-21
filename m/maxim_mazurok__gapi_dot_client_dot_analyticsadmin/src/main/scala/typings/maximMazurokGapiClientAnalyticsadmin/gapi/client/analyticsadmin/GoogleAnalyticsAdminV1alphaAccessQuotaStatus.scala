package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaAccessQuotaStatus extends StObject {
  
  /** Quota consumed by this request. */
  var consumed: js.UndefOr[Double] = js.undefined
  
  /** Quota remaining after this request. */
  var remaining: js.UndefOr[Double] = js.undefined
}
object GoogleAnalyticsAdminV1alphaAccessQuotaStatus {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaAccessQuotaStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaAccessQuotaStatus]
  }
  
  extension [Self <: GoogleAnalyticsAdminV1alphaAccessQuotaStatus](x: Self) {
    
    inline def setConsumed(value: Double): Self = StObject.set(x, "consumed", value.asInstanceOf[js.Any])
    
    inline def setConsumedUndefined: Self = StObject.set(x, "consumed", js.undefined)
    
    inline def setRemaining(value: Double): Self = StObject.set(x, "remaining", value.asInstanceOf[js.Any])
    
    inline def setRemainingUndefined: Self = StObject.set(x, "remaining", js.undefined)
  }
}
