package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuotaStatus extends StObject {
  
  /** Quota consumed by this request. */
  var consumed: js.UndefOr[Double] = js.undefined
  
  /** Quota remaining after this request. */
  var remaining: js.UndefOr[Double] = js.undefined
}
object QuotaStatus {
  
  inline def apply(): QuotaStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuotaStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QuotaStatus] (val x: Self) extends AnyVal {
    
    inline def setConsumed(value: Double): Self = StObject.set(x, "consumed", value.asInstanceOf[js.Any])
    
    inline def setConsumedUndefined: Self = StObject.set(x, "consumed", js.undefined)
    
    inline def setRemaining(value: Double): Self = StObject.set(x, "remaining", value.asInstanceOf[js.Any])
    
    inline def setRemainingUndefined: Self = StObject.set(x, "remaining", js.undefined)
  }
}
