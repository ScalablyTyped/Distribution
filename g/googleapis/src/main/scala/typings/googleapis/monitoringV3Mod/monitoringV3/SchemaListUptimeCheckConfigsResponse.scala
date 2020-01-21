package typings.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The protocol for the ListUptimeCheckConfigs response.
  */
@js.native
trait SchemaListUptimeCheckConfigsResponse extends js.Object {
  /**
    * This field represents the pagination token to retrieve the next page of
    * results. If the value is empty, it means no further results for the
    * request. To retrieve the next page of results, the value of the
    * next_page_token is passed to the subsequent List method call (in the
    * request message&#39;s page_token field).
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The total number of uptime check configurations for the project,
    * irrespective of any pagination.
    */
  var totalSize: js.UndefOr[Double] = js.native
  /**
    * The returned uptime check configurations.
    */
  var uptimeCheckConfigs: js.UndefOr[js.Array[SchemaUptimeCheckConfig]] = js.native
}

object SchemaListUptimeCheckConfigsResponse {
  @scala.inline
  def apply(
    nextPageToken: String = null,
    totalSize: Int | Double = null,
    uptimeCheckConfigs: js.Array[SchemaUptimeCheckConfig] = null
  ): SchemaListUptimeCheckConfigsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (totalSize != null) __obj.updateDynamic("totalSize")(totalSize.asInstanceOf[js.Any])
    if (uptimeCheckConfigs != null) __obj.updateDynamic("uptimeCheckConfigs")(uptimeCheckConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListUptimeCheckConfigsResponse]
  }
}

