package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for listing the metrics that are measured in number of
  * impressions.
  */
@js.native
trait SchemaListImpressionMetricsResponse extends js.Object {
  /**
    * List of rows, each containing a set of impression metrics.
    */
  var impressionMetricsRows: js.UndefOr[js.Array[SchemaImpressionMetricsRow]] = js.native
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListImpressionMetricsRequest.pageToken field in the subsequent call to
    * the impressionMetrics.list method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListImpressionMetricsResponse {
  @scala.inline
  def apply(impressionMetricsRows: js.Array[SchemaImpressionMetricsRow] = null, nextPageToken: String = null): SchemaListImpressionMetricsResponse = {
    val __obj = js.Dynamic.literal()
    if (impressionMetricsRows != null) __obj.updateDynamic("impressionMetricsRows")(impressionMetricsRows.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListImpressionMetricsResponse]
  }
}

