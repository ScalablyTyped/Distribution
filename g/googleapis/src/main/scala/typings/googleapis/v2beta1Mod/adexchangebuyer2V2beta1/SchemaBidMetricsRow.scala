package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The set of metrics that are measured in numbers of bids, representing how
  * many bids with the specified dimension values were considered eligible at
  * each stage of the bidding funnel;
  */
@js.native
trait SchemaBidMetricsRow extends js.Object {
  /**
    * The number of bids that Ad Exchange received from the buyer.
    */
  var bids: js.UndefOr[SchemaMetricValue] = js.native
  /**
    * The number of bids that were permitted to compete in the auction.
    */
  var bidsInAuction: js.UndefOr[SchemaMetricValue] = js.native
  /**
    * The number of bids for which the buyer was billed.
    */
  var billedImpressions: js.UndefOr[SchemaMetricValue] = js.native
  /**
    * The number of bids that won an impression.
    */
  var impressionsWon: js.UndefOr[SchemaMetricValue] = js.native
  /**
    * The number of bids for which the corresponding impression was measurable
    * for viewability (as defined by Active View).
    */
  var measurableImpressions: js.UndefOr[SchemaMetricValue] = js.native
  /**
    * The values of all dimensions associated with metric values in this row.
    */
  var rowDimensions: js.UndefOr[SchemaRowDimensions] = js.native
  /**
    * The number of bids for which the corresponding impression was viewable
    * (as defined by Active View).
    */
  var viewableImpressions: js.UndefOr[SchemaMetricValue] = js.native
}

object SchemaBidMetricsRow {
  @scala.inline
  def apply(
    bids: SchemaMetricValue = null,
    bidsInAuction: SchemaMetricValue = null,
    billedImpressions: SchemaMetricValue = null,
    impressionsWon: SchemaMetricValue = null,
    measurableImpressions: SchemaMetricValue = null,
    rowDimensions: SchemaRowDimensions = null,
    viewableImpressions: SchemaMetricValue = null
  ): SchemaBidMetricsRow = {
    val __obj = js.Dynamic.literal()
    if (bids != null) __obj.updateDynamic("bids")(bids.asInstanceOf[js.Any])
    if (bidsInAuction != null) __obj.updateDynamic("bidsInAuction")(bidsInAuction.asInstanceOf[js.Any])
    if (billedImpressions != null) __obj.updateDynamic("billedImpressions")(billedImpressions.asInstanceOf[js.Any])
    if (impressionsWon != null) __obj.updateDynamic("impressionsWon")(impressionsWon.asInstanceOf[js.Any])
    if (measurableImpressions != null) __obj.updateDynamic("measurableImpressions")(measurableImpressions.asInstanceOf[js.Any])
    if (rowDimensions != null) __obj.updateDynamic("rowDimensions")(rowDimensions.asInstanceOf[js.Any])
    if (viewableImpressions != null) __obj.updateDynamic("viewableImpressions")(viewableImpressions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBidMetricsRow]
  }
}

