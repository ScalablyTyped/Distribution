package typings.googleapis.loggingV2Mod.loggingV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result returned from ListLogMetrics.
  */
@js.native
trait SchemaListLogMetricsResponse extends js.Object {
  /**
    * A list of logs-based metrics.
    */
  var metrics: js.UndefOr[js.Array[SchemaLogMetric]] = js.native
  /**
    * If there might be more results than appear in this response, then
    * nextPageToken is included. To get the next set of results, call this
    * method again using the value of nextPageToken as pageToken.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListLogMetricsResponse {
  @scala.inline
  def apply(metrics: js.Array[SchemaLogMetric] = null, nextPageToken: String = null): SchemaListLogMetricsResponse = {
    val __obj = js.Dynamic.literal()
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListLogMetricsResponse]
  }
}

