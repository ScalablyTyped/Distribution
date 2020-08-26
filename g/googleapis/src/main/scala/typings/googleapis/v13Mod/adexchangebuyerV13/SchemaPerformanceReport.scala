package typings.googleapis.v13Mod.adexchangebuyerV13

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration data for an Ad Exchange performance report list.
  */
@js.native
trait SchemaPerformanceReport extends js.Object {
  /**
    * The number of bid responses with an ad.
    */
  var bidRate: js.UndefOr[Double] = js.native
  /**
    * The number of bid requests sent to your bidder.
    */
  var bidRequestRate: js.UndefOr[Double] = js.native
  /**
    * Rate of various prefiltering statuses per match. Please refer to the
    * callout-status-codes.txt file for different statuses.
    */
  var calloutStatusRate: js.UndefOr[js.Array[_]] = js.native
  /**
    * Average QPS for cookie matcher operations.
    */
  var cookieMatcherStatusRate: js.UndefOr[js.Array[_]] = js.native
  /**
    * Rate of ads with a given status. Please refer to the
    * creative-status-codes.txt file for different statuses.
    */
  var creativeStatusRate: js.UndefOr[js.Array[_]] = js.native
  /**
    * The number of bid responses that were filtered due to a policy violation
    * or other errors.
    */
  var filteredBidRate: js.UndefOr[Double] = js.native
  /**
    * Average QPS for hosted match operations.
    */
  var hostedMatchStatusRate: js.UndefOr[js.Array[_]] = js.native
  /**
    * The number of potential queries based on your pretargeting settings.
    */
  var inventoryMatchRate: js.UndefOr[Double] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The 50th percentile round trip latency(ms) as perceived from Google
    * servers for the duration period covered by the report.
    */
  var latency50thPercentile: js.UndefOr[Double] = js.native
  /**
    * The 85th percentile round trip latency(ms) as perceived from Google
    * servers for the duration period covered by the report.
    */
  var latency85thPercentile: js.UndefOr[Double] = js.native
  /**
    * The 95th percentile round trip latency(ms) as perceived from Google
    * servers for the duration period covered by the report.
    */
  var latency95thPercentile: js.UndefOr[Double] = js.native
  /**
    * Rate of various quota account statuses per quota check.
    */
  var noQuotaInRegion: js.UndefOr[Double] = js.native
  /**
    * Rate of various quota account statuses per quota check.
    */
  var outOfQuota: js.UndefOr[Double] = js.native
  /**
    * Average QPS for pixel match requests from clients.
    */
  var pixelMatchRequests: js.UndefOr[Double] = js.native
  /**
    * Average QPS for pixel match responses from clients.
    */
  var pixelMatchResponses: js.UndefOr[Double] = js.native
  /**
    * The configured quota limits for this account.
    */
  var quotaConfiguredLimit: js.UndefOr[Double] = js.native
  /**
    * The throttled quota limits for this account.
    */
  var quotaThrottledLimit: js.UndefOr[Double] = js.native
  /**
    * The trading location of this data.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * The number of properly formed bid responses received by our servers
    * within the deadline.
    */
  var successfulRequestRate: js.UndefOr[Double] = js.native
  /**
    * The unix timestamp of the starting time of this performance data.
    */
  var timestamp: js.UndefOr[String] = js.native
  /**
    * The number of bid responses that were unsuccessful due to timeouts,
    * incorrect formatting, etc.
    */
  var unsuccessfulRequestRate: js.UndefOr[Double] = js.native
}

object SchemaPerformanceReport {
  @scala.inline
  def apply(): SchemaPerformanceReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPerformanceReport]
  }
  @scala.inline
  implicit class SchemaPerformanceReportOps[Self <: SchemaPerformanceReport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBidRate(value: Double): Self = this.set("bidRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBidRate: Self = this.set("bidRate", js.undefined)
    @scala.inline
    def setBidRequestRate(value: Double): Self = this.set("bidRequestRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBidRequestRate: Self = this.set("bidRequestRate", js.undefined)
    @scala.inline
    def setCalloutStatusRateVarargs(value: js.Any*): Self = this.set("calloutStatusRate", js.Array(value :_*))
    @scala.inline
    def setCalloutStatusRate(value: js.Array[_]): Self = this.set("calloutStatusRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalloutStatusRate: Self = this.set("calloutStatusRate", js.undefined)
    @scala.inline
    def setCookieMatcherStatusRateVarargs(value: js.Any*): Self = this.set("cookieMatcherStatusRate", js.Array(value :_*))
    @scala.inline
    def setCookieMatcherStatusRate(value: js.Array[_]): Self = this.set("cookieMatcherStatusRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookieMatcherStatusRate: Self = this.set("cookieMatcherStatusRate", js.undefined)
    @scala.inline
    def setCreativeStatusRateVarargs(value: js.Any*): Self = this.set("creativeStatusRate", js.Array(value :_*))
    @scala.inline
    def setCreativeStatusRate(value: js.Array[_]): Self = this.set("creativeStatusRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreativeStatusRate: Self = this.set("creativeStatusRate", js.undefined)
    @scala.inline
    def setFilteredBidRate(value: Double): Self = this.set("filteredBidRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilteredBidRate: Self = this.set("filteredBidRate", js.undefined)
    @scala.inline
    def setHostedMatchStatusRateVarargs(value: js.Any*): Self = this.set("hostedMatchStatusRate", js.Array(value :_*))
    @scala.inline
    def setHostedMatchStatusRate(value: js.Array[_]): Self = this.set("hostedMatchStatusRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostedMatchStatusRate: Self = this.set("hostedMatchStatusRate", js.undefined)
    @scala.inline
    def setInventoryMatchRate(value: Double): Self = this.set("inventoryMatchRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInventoryMatchRate: Self = this.set("inventoryMatchRate", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLatency50thPercentile(value: Double): Self = this.set("latency50thPercentile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatency50thPercentile: Self = this.set("latency50thPercentile", js.undefined)
    @scala.inline
    def setLatency85thPercentile(value: Double): Self = this.set("latency85thPercentile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatency85thPercentile: Self = this.set("latency85thPercentile", js.undefined)
    @scala.inline
    def setLatency95thPercentile(value: Double): Self = this.set("latency95thPercentile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatency95thPercentile: Self = this.set("latency95thPercentile", js.undefined)
    @scala.inline
    def setNoQuotaInRegion(value: Double): Self = this.set("noQuotaInRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoQuotaInRegion: Self = this.set("noQuotaInRegion", js.undefined)
    @scala.inline
    def setOutOfQuota(value: Double): Self = this.set("outOfQuota", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutOfQuota: Self = this.set("outOfQuota", js.undefined)
    @scala.inline
    def setPixelMatchRequests(value: Double): Self = this.set("pixelMatchRequests", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePixelMatchRequests: Self = this.set("pixelMatchRequests", js.undefined)
    @scala.inline
    def setPixelMatchResponses(value: Double): Self = this.set("pixelMatchResponses", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePixelMatchResponses: Self = this.set("pixelMatchResponses", js.undefined)
    @scala.inline
    def setQuotaConfiguredLimit(value: Double): Self = this.set("quotaConfiguredLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotaConfiguredLimit: Self = this.set("quotaConfiguredLimit", js.undefined)
    @scala.inline
    def setQuotaThrottledLimit(value: Double): Self = this.set("quotaThrottledLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotaThrottledLimit: Self = this.set("quotaThrottledLimit", js.undefined)
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setSuccessfulRequestRate(value: Double): Self = this.set("successfulRequestRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccessfulRequestRate: Self = this.set("successfulRequestRate", js.undefined)
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    @scala.inline
    def setUnsuccessfulRequestRate(value: Double): Self = this.set("unsuccessfulRequestRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnsuccessfulRequestRate: Self = this.set("unsuccessfulRequestRate", js.undefined)
  }
  
}

