package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The number of bids with the specified dimension values that did not win the
  * auction (either were filtered pre-auction or lost the auction), as
  * described by the specified creative status.
  */
@js.native
trait SchemaCreativeStatusRow extends js.Object {
  /**
    * The number of bids with the specified status.
    */
  var bidCount: js.UndefOr[SchemaMetricValue] = js.native
  /**
    * The ID of the creative status. See
    * [creative-status-codes](https://developers.google.com/authorized-buyers/rtb/downloads/creative-status-codes).
    */
  var creativeStatusId: js.UndefOr[Double] = js.native
  /**
    * The values of all dimensions associated with metric values in this row.
    */
  var rowDimensions: js.UndefOr[SchemaRowDimensions] = js.native
}

object SchemaCreativeStatusRow {
  @scala.inline
  def apply(
    bidCount: SchemaMetricValue = null,
    creativeStatusId: js.UndefOr[Double] = js.undefined,
    rowDimensions: SchemaRowDimensions = null
  ): SchemaCreativeStatusRow = {
    val __obj = js.Dynamic.literal()
    if (bidCount != null) __obj.updateDynamic("bidCount")(bidCount.asInstanceOf[js.Any])
    if (!js.isUndefined(creativeStatusId)) __obj.updateDynamic("creativeStatusId")(creativeStatusId.get.asInstanceOf[js.Any])
    if (rowDimensions != null) __obj.updateDynamic("rowDimensions")(rowDimensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreativeStatusRow]
  }
}

