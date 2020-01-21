package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for listing the metrics that are measured in number of
  * bids.
  */
@js.native
trait SchemaListBidMetricsResponse extends js.Object {
  /**
    * List of rows, each containing a set of bid metrics.
    */
  var bidMetricsRows: js.UndefOr[js.Array[SchemaBidMetricsRow]] = js.native
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListBidMetricsRequest.pageToken field in the subsequent call to the
    * bidMetrics.list method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListBidMetricsResponse {
  @scala.inline
  def apply(bidMetricsRows: js.Array[SchemaBidMetricsRow] = null, nextPageToken: String = null): SchemaListBidMetricsResponse = {
    val __obj = js.Dynamic.literal()
    if (bidMetricsRows != null) __obj.updateDynamic("bidMetricsRows")(bidMetricsRows.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListBidMetricsResponse]
  }
}

