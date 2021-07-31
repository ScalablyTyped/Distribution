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
  
  @scala.inline
  def apply(): ResourceQuotasRemaining = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceQuotasRemaining]
  }
  
  @scala.inline
  implicit class ResourceQuotasRemainingMutableBuilder[Self <: ResourceQuotasRemaining] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDailyQuotaTokensRemaining(value: Double): Self = StObject.set(x, "dailyQuotaTokensRemaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDailyQuotaTokensRemainingUndefined: Self = StObject.set(x, "dailyQuotaTokensRemaining", js.undefined)
    
    @scala.inline
    def setHourlyQuotaTokensRemaining(value: Double): Self = StObject.set(x, "hourlyQuotaTokensRemaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourlyQuotaTokensRemainingUndefined: Self = StObject.set(x, "hourlyQuotaTokensRemaining", js.undefined)
  }
}
