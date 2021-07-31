package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The configuration data for an Ad Exchange performance report list.
  */
trait SchemaPerformanceReport extends StObject {
  
  /**
    * The number of bid responses with an ad.
    */
  var bidRate: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of bid requests sent to your bidder.
    */
  var bidRequestRate: js.UndefOr[Double] = js.undefined
  
  /**
    * Rate of various prefiltering statuses per match. Please refer to the
    * callout-status-codes.txt file for different statuses.
    */
  var calloutStatusRate: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * Average QPS for cookie matcher operations.
    */
  var cookieMatcherStatusRate: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * Rate of ads with a given status. Please refer to the
    * creative-status-codes.txt file for different statuses.
    */
  var creativeStatusRate: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * The number of bid responses that were filtered due to a policy violation
    * or other errors.
    */
  var filteredBidRate: js.UndefOr[Double] = js.undefined
  
  /**
    * Average QPS for hosted match operations.
    */
  var hostedMatchStatusRate: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * The number of potential queries based on your pretargeting settings.
    */
  var inventoryMatchRate: js.UndefOr[Double] = js.undefined
  
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The 50th percentile round trip latency(ms) as perceived from Google
    * servers for the duration period covered by the report.
    */
  var latency50thPercentile: js.UndefOr[Double] = js.undefined
  
  /**
    * The 85th percentile round trip latency(ms) as perceived from Google
    * servers for the duration period covered by the report.
    */
  var latency85thPercentile: js.UndefOr[Double] = js.undefined
  
  /**
    * The 95th percentile round trip latency(ms) as perceived from Google
    * servers for the duration period covered by the report.
    */
  var latency95thPercentile: js.UndefOr[Double] = js.undefined
  
  /**
    * Rate of various quota account statuses per quota check.
    */
  var noQuotaInRegion: js.UndefOr[Double] = js.undefined
  
  /**
    * Rate of various quota account statuses per quota check.
    */
  var outOfQuota: js.UndefOr[Double] = js.undefined
  
  /**
    * Average QPS for pixel match requests from clients.
    */
  var pixelMatchRequests: js.UndefOr[Double] = js.undefined
  
  /**
    * Average QPS for pixel match responses from clients.
    */
  var pixelMatchResponses: js.UndefOr[Double] = js.undefined
  
  /**
    * The configured quota limits for this account.
    */
  var quotaConfiguredLimit: js.UndefOr[Double] = js.undefined
  
  /**
    * The throttled quota limits for this account.
    */
  var quotaThrottledLimit: js.UndefOr[Double] = js.undefined
  
  /**
    * The trading location of this data.
    */
  var region: js.UndefOr[String] = js.undefined
  
  /**
    * The number of properly formed bid responses received by our servers
    * within the deadline.
    */
  var successfulRequestRate: js.UndefOr[Double] = js.undefined
  
  /**
    * The unix timestamp of the starting time of this performance data.
    */
  var timestamp: js.UndefOr[String] = js.undefined
  
  /**
    * The number of bid responses that were unsuccessful due to timeouts,
    * incorrect formatting, etc.
    */
  var unsuccessfulRequestRate: js.UndefOr[Double] = js.undefined
}
object SchemaPerformanceReport {
  
  @scala.inline
  def apply(): SchemaPerformanceReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPerformanceReport]
  }
  
  @scala.inline
  implicit class SchemaPerformanceReportMutableBuilder[Self <: SchemaPerformanceReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBidRate(value: Double): Self = StObject.set(x, "bidRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBidRateUndefined: Self = StObject.set(x, "bidRate", js.undefined)
    
    @scala.inline
    def setBidRequestRate(value: Double): Self = StObject.set(x, "bidRequestRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBidRequestRateUndefined: Self = StObject.set(x, "bidRequestRate", js.undefined)
    
    @scala.inline
    def setCalloutStatusRate(value: js.Array[js.Any]): Self = StObject.set(x, "calloutStatusRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalloutStatusRateUndefined: Self = StObject.set(x, "calloutStatusRate", js.undefined)
    
    @scala.inline
    def setCalloutStatusRateVarargs(value: js.Any*): Self = StObject.set(x, "calloutStatusRate", js.Array(value :_*))
    
    @scala.inline
    def setCookieMatcherStatusRate(value: js.Array[js.Any]): Self = StObject.set(x, "cookieMatcherStatusRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookieMatcherStatusRateUndefined: Self = StObject.set(x, "cookieMatcherStatusRate", js.undefined)
    
    @scala.inline
    def setCookieMatcherStatusRateVarargs(value: js.Any*): Self = StObject.set(x, "cookieMatcherStatusRate", js.Array(value :_*))
    
    @scala.inline
    def setCreativeStatusRate(value: js.Array[js.Any]): Self = StObject.set(x, "creativeStatusRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeStatusRateUndefined: Self = StObject.set(x, "creativeStatusRate", js.undefined)
    
    @scala.inline
    def setCreativeStatusRateVarargs(value: js.Any*): Self = StObject.set(x, "creativeStatusRate", js.Array(value :_*))
    
    @scala.inline
    def setFilteredBidRate(value: Double): Self = StObject.set(x, "filteredBidRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilteredBidRateUndefined: Self = StObject.set(x, "filteredBidRate", js.undefined)
    
    @scala.inline
    def setHostedMatchStatusRate(value: js.Array[js.Any]): Self = StObject.set(x, "hostedMatchStatusRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostedMatchStatusRateUndefined: Self = StObject.set(x, "hostedMatchStatusRate", js.undefined)
    
    @scala.inline
    def setHostedMatchStatusRateVarargs(value: js.Any*): Self = StObject.set(x, "hostedMatchStatusRate", js.Array(value :_*))
    
    @scala.inline
    def setInventoryMatchRate(value: Double): Self = StObject.set(x, "inventoryMatchRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInventoryMatchRateUndefined: Self = StObject.set(x, "inventoryMatchRate", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLatency50thPercentile(value: Double): Self = StObject.set(x, "latency50thPercentile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatency50thPercentileUndefined: Self = StObject.set(x, "latency50thPercentile", js.undefined)
    
    @scala.inline
    def setLatency85thPercentile(value: Double): Self = StObject.set(x, "latency85thPercentile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatency85thPercentileUndefined: Self = StObject.set(x, "latency85thPercentile", js.undefined)
    
    @scala.inline
    def setLatency95thPercentile(value: Double): Self = StObject.set(x, "latency95thPercentile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatency95thPercentileUndefined: Self = StObject.set(x, "latency95thPercentile", js.undefined)
    
    @scala.inline
    def setNoQuotaInRegion(value: Double): Self = StObject.set(x, "noQuotaInRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoQuotaInRegionUndefined: Self = StObject.set(x, "noQuotaInRegion", js.undefined)
    
    @scala.inline
    def setOutOfQuota(value: Double): Self = StObject.set(x, "outOfQuota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutOfQuotaUndefined: Self = StObject.set(x, "outOfQuota", js.undefined)
    
    @scala.inline
    def setPixelMatchRequests(value: Double): Self = StObject.set(x, "pixelMatchRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelMatchRequestsUndefined: Self = StObject.set(x, "pixelMatchRequests", js.undefined)
    
    @scala.inline
    def setPixelMatchResponses(value: Double): Self = StObject.set(x, "pixelMatchResponses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelMatchResponsesUndefined: Self = StObject.set(x, "pixelMatchResponses", js.undefined)
    
    @scala.inline
    def setQuotaConfiguredLimit(value: Double): Self = StObject.set(x, "quotaConfiguredLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaConfiguredLimitUndefined: Self = StObject.set(x, "quotaConfiguredLimit", js.undefined)
    
    @scala.inline
    def setQuotaThrottledLimit(value: Double): Self = StObject.set(x, "quotaThrottledLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaThrottledLimitUndefined: Self = StObject.set(x, "quotaThrottledLimit", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setSuccessfulRequestRate(value: Double): Self = StObject.set(x, "successfulRequestRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessfulRequestRateUndefined: Self = StObject.set(x, "successfulRequestRate", js.undefined)
    
    @scala.inline
    def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    @scala.inline
    def setUnsuccessfulRequestRate(value: Double): Self = StObject.set(x, "unsuccessfulRequestRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsuccessfulRequestRateUndefined: Self = StObject.set(x, "unsuccessfulRequestRate", js.undefined)
  }
}
