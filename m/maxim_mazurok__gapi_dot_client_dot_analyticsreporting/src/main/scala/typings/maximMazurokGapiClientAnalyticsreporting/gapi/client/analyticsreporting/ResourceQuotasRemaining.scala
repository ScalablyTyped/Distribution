package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceQuotasRemaining extends StObject {
  
  /** Daily resource quota remaining remaining. */
  var dailyQuotaTokensRemaining: js.UndefOr[Double] = js.undefined
  
  /** Hourly resource quota tokens remaining. */
  var hourlyQuotaTokensRemaining: js.UndefOr[Double] = js.undefined
}
object ResourceQuotasRemaining {
  
  inline def apply(): ResourceQuotasRemaining = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceQuotasRemaining]
  }
  
  extension [Self <: ResourceQuotasRemaining](x: Self) {
    
    inline def setDailyQuotaTokensRemaining(value: Double): Self = StObject.set(x, "dailyQuotaTokensRemaining", value.asInstanceOf[js.Any])
    
    inline def setDailyQuotaTokensRemainingUndefined: Self = StObject.set(x, "dailyQuotaTokensRemaining", js.undefined)
    
    inline def setHourlyQuotaTokensRemaining(value: Double): Self = StObject.set(x, "hourlyQuotaTokensRemaining", value.asInstanceOf[js.Any])
    
    inline def setHourlyQuotaTokensRemainingUndefined: Self = StObject.set(x, "hourlyQuotaTokensRemaining", js.undefined)
  }
}
