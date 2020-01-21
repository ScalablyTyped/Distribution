package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The set of metrics that are measured in numbers of impressions,
  * representing how many impressions with the specified dimension values were
  * considered eligible at each stage of the bidding funnel.
  */
@js.native
trait SchemaImpressionMetricsRow extends js.Object {
  /**
    * The number of impressions available to the buyer on Ad Exchange. In some
    * cases this value may be unavailable.
    */
  var availableImpressions: js.UndefOr[SchemaMetricValue] = js.native
  /**
    * The number of impressions for which Ad Exchange sent the buyer a bid
    * request.
    */
  var bidRequests: js.UndefOr[SchemaMetricValue] = js.native
  /**
    * The number of impressions that match the buyer&#39;s inventory
    * pretargeting.
    */
  var inventoryMatches: js.UndefOr[SchemaMetricValue] = js.native
  /**
    * The number of impressions for which Ad Exchange received a response from
    * the buyer that contained at least one applicable bid.
    */
  var responsesWithBids: js.UndefOr[SchemaMetricValue] = js.native
  /**
    * The values of all dimensions associated with metric values in this row.
    */
  var rowDimensions: js.UndefOr[SchemaRowDimensions] = js.native
  /**
    * The number of impressions for which the buyer successfully sent a
    * response to Ad Exchange.
    */
  var successfulResponses: js.UndefOr[SchemaMetricValue] = js.native
}

object SchemaImpressionMetricsRow {
  @scala.inline
  def apply(
    availableImpressions: SchemaMetricValue = null,
    bidRequests: SchemaMetricValue = null,
    inventoryMatches: SchemaMetricValue = null,
    responsesWithBids: SchemaMetricValue = null,
    rowDimensions: SchemaRowDimensions = null,
    successfulResponses: SchemaMetricValue = null
  ): SchemaImpressionMetricsRow = {
    val __obj = js.Dynamic.literal()
    if (availableImpressions != null) __obj.updateDynamic("availableImpressions")(availableImpressions.asInstanceOf[js.Any])
    if (bidRequests != null) __obj.updateDynamic("bidRequests")(bidRequests.asInstanceOf[js.Any])
    if (inventoryMatches != null) __obj.updateDynamic("inventoryMatches")(inventoryMatches.asInstanceOf[js.Any])
    if (responsesWithBids != null) __obj.updateDynamic("responsesWithBids")(responsesWithBids.asInstanceOf[js.Any])
    if (rowDimensions != null) __obj.updateDynamic("rowDimensions")(rowDimensions.asInstanceOf[js.Any])
    if (successfulResponses != null) __obj.updateDynamic("successfulResponses")(successfulResponses.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaImpressionMetricsRow]
  }
}

