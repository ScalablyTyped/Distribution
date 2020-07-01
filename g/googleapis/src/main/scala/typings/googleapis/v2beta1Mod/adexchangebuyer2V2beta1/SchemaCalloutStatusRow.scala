package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The number of impressions with the specified dimension values where the
  * corresponding bid request or bid response was not successful, as described
  * by the specified callout status.
  */
@js.native
trait SchemaCalloutStatusRow extends js.Object {
  /**
    * The ID of the callout status. See
    * [callout-status-codes](https://developers.google.com/authorized-buyers/rtb/downloads/callout-status-codes).
    */
  var calloutStatusId: js.UndefOr[Double] = js.native
  /**
    * The number of impressions for which there was a bid request or bid
    * response with the specified callout status.
    */
  var impressionCount: js.UndefOr[SchemaMetricValue] = js.native
  /**
    * The values of all dimensions associated with metric values in this row.
    */
  var rowDimensions: js.UndefOr[SchemaRowDimensions] = js.native
}

object SchemaCalloutStatusRow {
  @scala.inline
  def apply(
    calloutStatusId: js.UndefOr[Double] = js.undefined,
    impressionCount: SchemaMetricValue = null,
    rowDimensions: SchemaRowDimensions = null
  ): SchemaCalloutStatusRow = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(calloutStatusId)) __obj.updateDynamic("calloutStatusId")(calloutStatusId.get.asInstanceOf[js.Any])
    if (impressionCount != null) __obj.updateDynamic("impressionCount")(impressionCount.asInstanceOf[js.Any])
    if (rowDimensions != null) __obj.updateDynamic("rowDimensions")(rowDimensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCalloutStatusRow]
  }
}

