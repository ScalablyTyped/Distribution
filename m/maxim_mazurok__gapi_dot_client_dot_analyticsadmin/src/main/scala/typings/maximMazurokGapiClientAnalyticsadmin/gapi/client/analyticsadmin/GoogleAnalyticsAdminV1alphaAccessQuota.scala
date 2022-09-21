package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaAccessQuota extends StObject {
  
  /** Properties can use up to 50 concurrent requests. */
  var concurrentRequests: js.UndefOr[GoogleAnalyticsAdminV1alphaAccessQuotaStatus] = js.undefined
  
  /** Properties and cloud project pairs can have up to 50 server errors per hour. */
  var serverErrorsPerProjectPerHour: js.UndefOr[GoogleAnalyticsAdminV1alphaAccessQuotaStatus] = js.undefined
  
  /** Properties can use 250,000 tokens per day. Most requests consume fewer than 10 tokens. */
  var tokensPerDay: js.UndefOr[GoogleAnalyticsAdminV1alphaAccessQuotaStatus] = js.undefined
  
  /** Properties can use 50,000 tokens per hour. An API request consumes a single number of tokens, and that number is deducted from both the hourly and daily quotas. */
  var tokensPerHour: js.UndefOr[GoogleAnalyticsAdminV1alphaAccessQuotaStatus] = js.undefined
}
object GoogleAnalyticsAdminV1alphaAccessQuota {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaAccessQuota = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaAccessQuota]
  }
  
  extension [Self <: GoogleAnalyticsAdminV1alphaAccessQuota](x: Self) {
    
    inline def setConcurrentRequests(value: GoogleAnalyticsAdminV1alphaAccessQuotaStatus): Self = StObject.set(x, "concurrentRequests", value.asInstanceOf[js.Any])
    
    inline def setConcurrentRequestsUndefined: Self = StObject.set(x, "concurrentRequests", js.undefined)
    
    inline def setServerErrorsPerProjectPerHour(value: GoogleAnalyticsAdminV1alphaAccessQuotaStatus): Self = StObject.set(x, "serverErrorsPerProjectPerHour", value.asInstanceOf[js.Any])
    
    inline def setServerErrorsPerProjectPerHourUndefined: Self = StObject.set(x, "serverErrorsPerProjectPerHour", js.undefined)
    
    inline def setTokensPerDay(value: GoogleAnalyticsAdminV1alphaAccessQuotaStatus): Self = StObject.set(x, "tokensPerDay", value.asInstanceOf[js.Any])
    
    inline def setTokensPerDayUndefined: Self = StObject.set(x, "tokensPerDay", js.undefined)
    
    inline def setTokensPerHour(value: GoogleAnalyticsAdminV1alphaAccessQuotaStatus): Self = StObject.set(x, "tokensPerHour", value.asInstanceOf[js.Any])
    
    inline def setTokensPerHourUndefined: Self = StObject.set(x, "tokensPerHour", js.undefined)
  }
}
