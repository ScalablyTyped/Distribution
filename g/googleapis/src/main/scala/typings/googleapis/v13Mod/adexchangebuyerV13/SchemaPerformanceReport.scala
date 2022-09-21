package typings.googleapis.v13Mod.adexchangebuyerV13

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPerformanceReport extends StObject {
  
  /**
    * The number of bid responses with an ad.
    */
  var bidRate: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The number of bid requests sent to your bidder.
    */
  var bidRequestRate: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Rate of various prefiltering statuses per match. Please refer to the callout-status-codes.txt file for different statuses.
    */
  var calloutStatusRate: js.UndefOr[js.Array[Any] | Null] = js.undefined
  
  /**
    * Average QPS for cookie matcher operations.
    */
  var cookieMatcherStatusRate: js.UndefOr[js.Array[Any] | Null] = js.undefined
  
  /**
    * Rate of ads with a given status. Please refer to the creative-status-codes.txt file for different statuses.
    */
  var creativeStatusRate: js.UndefOr[js.Array[Any] | Null] = js.undefined
  
  /**
    * The number of bid responses that were filtered due to a policy violation or other errors.
    */
  var filteredBidRate: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Average QPS for hosted match operations.
    */
  var hostedMatchStatusRate: js.UndefOr[js.Array[Any] | Null] = js.undefined
  
  /**
    * The number of potential queries based on your pretargeting settings.
    */
  var inventoryMatchRate: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The 50th percentile round trip latency(ms) as perceived from Google servers for the duration period covered by the report.
    */
  var latency50thPercentile: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The 85th percentile round trip latency(ms) as perceived from Google servers for the duration period covered by the report.
    */
  var latency85thPercentile: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The 95th percentile round trip latency(ms) as perceived from Google servers for the duration period covered by the report.
    */
  var latency95thPercentile: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Rate of various quota account statuses per quota check.
    */
  var noQuotaInRegion: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Rate of various quota account statuses per quota check.
    */
  var outOfQuota: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Average QPS for pixel match requests from clients.
    */
  var pixelMatchRequests: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Average QPS for pixel match responses from clients.
    */
  var pixelMatchResponses: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The configured quota limits for this account.
    */
  var quotaConfiguredLimit: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The throttled quota limits for this account.
    */
  var quotaThrottledLimit: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The trading location of this data.
    */
  var region: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of properly formed bid responses received by our servers within the deadline.
    */
  var successfulRequestRate: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The unix timestamp of the starting time of this performance data.
    */
  var timestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of bid responses that were unsuccessful due to timeouts, incorrect formatting, etc.
    */
  var unsuccessfulRequestRate: js.UndefOr[Double | Null] = js.undefined
}
object SchemaPerformanceReport {
  
  inline def apply(): SchemaPerformanceReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPerformanceReport]
  }
  
  extension [Self <: SchemaPerformanceReport](x: Self) {
    
    inline def setBidRate(value: Double): Self = StObject.set(x, "bidRate", value.asInstanceOf[js.Any])
    
    inline def setBidRateNull: Self = StObject.set(x, "bidRate", null)
    
    inline def setBidRateUndefined: Self = StObject.set(x, "bidRate", js.undefined)
    
    inline def setBidRequestRate(value: Double): Self = StObject.set(x, "bidRequestRate", value.asInstanceOf[js.Any])
    
    inline def setBidRequestRateNull: Self = StObject.set(x, "bidRequestRate", null)
    
    inline def setBidRequestRateUndefined: Self = StObject.set(x, "bidRequestRate", js.undefined)
    
    inline def setCalloutStatusRate(value: js.Array[Any]): Self = StObject.set(x, "calloutStatusRate", value.asInstanceOf[js.Any])
    
    inline def setCalloutStatusRateNull: Self = StObject.set(x, "calloutStatusRate", null)
    
    inline def setCalloutStatusRateUndefined: Self = StObject.set(x, "calloutStatusRate", js.undefined)
    
    inline def setCalloutStatusRateVarargs(value: Any*): Self = StObject.set(x, "calloutStatusRate", js.Array(value*))
    
    inline def setCookieMatcherStatusRate(value: js.Array[Any]): Self = StObject.set(x, "cookieMatcherStatusRate", value.asInstanceOf[js.Any])
    
    inline def setCookieMatcherStatusRateNull: Self = StObject.set(x, "cookieMatcherStatusRate", null)
    
    inline def setCookieMatcherStatusRateUndefined: Self = StObject.set(x, "cookieMatcherStatusRate", js.undefined)
    
    inline def setCookieMatcherStatusRateVarargs(value: Any*): Self = StObject.set(x, "cookieMatcherStatusRate", js.Array(value*))
    
    inline def setCreativeStatusRate(value: js.Array[Any]): Self = StObject.set(x, "creativeStatusRate", value.asInstanceOf[js.Any])
    
    inline def setCreativeStatusRateNull: Self = StObject.set(x, "creativeStatusRate", null)
    
    inline def setCreativeStatusRateUndefined: Self = StObject.set(x, "creativeStatusRate", js.undefined)
    
    inline def setCreativeStatusRateVarargs(value: Any*): Self = StObject.set(x, "creativeStatusRate", js.Array(value*))
    
    inline def setFilteredBidRate(value: Double): Self = StObject.set(x, "filteredBidRate", value.asInstanceOf[js.Any])
    
    inline def setFilteredBidRateNull: Self = StObject.set(x, "filteredBidRate", null)
    
    inline def setFilteredBidRateUndefined: Self = StObject.set(x, "filteredBidRate", js.undefined)
    
    inline def setHostedMatchStatusRate(value: js.Array[Any]): Self = StObject.set(x, "hostedMatchStatusRate", value.asInstanceOf[js.Any])
    
    inline def setHostedMatchStatusRateNull: Self = StObject.set(x, "hostedMatchStatusRate", null)
    
    inline def setHostedMatchStatusRateUndefined: Self = StObject.set(x, "hostedMatchStatusRate", js.undefined)
    
    inline def setHostedMatchStatusRateVarargs(value: Any*): Self = StObject.set(x, "hostedMatchStatusRate", js.Array(value*))
    
    inline def setInventoryMatchRate(value: Double): Self = StObject.set(x, "inventoryMatchRate", value.asInstanceOf[js.Any])
    
    inline def setInventoryMatchRateNull: Self = StObject.set(x, "inventoryMatchRate", null)
    
    inline def setInventoryMatchRateUndefined: Self = StObject.set(x, "inventoryMatchRate", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLatency50thPercentile(value: Double): Self = StObject.set(x, "latency50thPercentile", value.asInstanceOf[js.Any])
    
    inline def setLatency50thPercentileNull: Self = StObject.set(x, "latency50thPercentile", null)
    
    inline def setLatency50thPercentileUndefined: Self = StObject.set(x, "latency50thPercentile", js.undefined)
    
    inline def setLatency85thPercentile(value: Double): Self = StObject.set(x, "latency85thPercentile", value.asInstanceOf[js.Any])
    
    inline def setLatency85thPercentileNull: Self = StObject.set(x, "latency85thPercentile", null)
    
    inline def setLatency85thPercentileUndefined: Self = StObject.set(x, "latency85thPercentile", js.undefined)
    
    inline def setLatency95thPercentile(value: Double): Self = StObject.set(x, "latency95thPercentile", value.asInstanceOf[js.Any])
    
    inline def setLatency95thPercentileNull: Self = StObject.set(x, "latency95thPercentile", null)
    
    inline def setLatency95thPercentileUndefined: Self = StObject.set(x, "latency95thPercentile", js.undefined)
    
    inline def setNoQuotaInRegion(value: Double): Self = StObject.set(x, "noQuotaInRegion", value.asInstanceOf[js.Any])
    
    inline def setNoQuotaInRegionNull: Self = StObject.set(x, "noQuotaInRegion", null)
    
    inline def setNoQuotaInRegionUndefined: Self = StObject.set(x, "noQuotaInRegion", js.undefined)
    
    inline def setOutOfQuota(value: Double): Self = StObject.set(x, "outOfQuota", value.asInstanceOf[js.Any])
    
    inline def setOutOfQuotaNull: Self = StObject.set(x, "outOfQuota", null)
    
    inline def setOutOfQuotaUndefined: Self = StObject.set(x, "outOfQuota", js.undefined)
    
    inline def setPixelMatchRequests(value: Double): Self = StObject.set(x, "pixelMatchRequests", value.asInstanceOf[js.Any])
    
    inline def setPixelMatchRequestsNull: Self = StObject.set(x, "pixelMatchRequests", null)
    
    inline def setPixelMatchRequestsUndefined: Self = StObject.set(x, "pixelMatchRequests", js.undefined)
    
    inline def setPixelMatchResponses(value: Double): Self = StObject.set(x, "pixelMatchResponses", value.asInstanceOf[js.Any])
    
    inline def setPixelMatchResponsesNull: Self = StObject.set(x, "pixelMatchResponses", null)
    
    inline def setPixelMatchResponsesUndefined: Self = StObject.set(x, "pixelMatchResponses", js.undefined)
    
    inline def setQuotaConfiguredLimit(value: Double): Self = StObject.set(x, "quotaConfiguredLimit", value.asInstanceOf[js.Any])
    
    inline def setQuotaConfiguredLimitNull: Self = StObject.set(x, "quotaConfiguredLimit", null)
    
    inline def setQuotaConfiguredLimitUndefined: Self = StObject.set(x, "quotaConfiguredLimit", js.undefined)
    
    inline def setQuotaThrottledLimit(value: Double): Self = StObject.set(x, "quotaThrottledLimit", value.asInstanceOf[js.Any])
    
    inline def setQuotaThrottledLimitNull: Self = StObject.set(x, "quotaThrottledLimit", null)
    
    inline def setQuotaThrottledLimitUndefined: Self = StObject.set(x, "quotaThrottledLimit", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionNull: Self = StObject.set(x, "region", null)
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setSuccessfulRequestRate(value: Double): Self = StObject.set(x, "successfulRequestRate", value.asInstanceOf[js.Any])
    
    inline def setSuccessfulRequestRateNull: Self = StObject.set(x, "successfulRequestRate", null)
    
    inline def setSuccessfulRequestRateUndefined: Self = StObject.set(x, "successfulRequestRate", js.undefined)
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampNull: Self = StObject.set(x, "timestamp", null)
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setUnsuccessfulRequestRate(value: Double): Self = StObject.set(x, "unsuccessfulRequestRate", value.asInstanceOf[js.Any])
    
    inline def setUnsuccessfulRequestRateNull: Self = StObject.set(x, "unsuccessfulRequestRate", null)
    
    inline def setUnsuccessfulRequestRateUndefined: Self = StObject.set(x, "unsuccessfulRequestRate", js.undefined)
  }
}
