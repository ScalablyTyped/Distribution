package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The number of winning bids with the specified dimension values for which
  * the buyer was not billed, as described by the specified status.
  */
@js.native
trait SchemaNonBillableWinningBidStatusRow extends js.Object {
  /**
    * The number of bids with the specified status.
    */
  var bidCount: js.UndefOr[SchemaMetricValue] = js.native
  /**
    * The values of all dimensions associated with metric values in this row.
    */
  var rowDimensions: js.UndefOr[SchemaRowDimensions] = js.native
  /**
    * The status specifying why the winning bids were not billed.
    */
  var status: js.UndefOr[String] = js.native
}

object SchemaNonBillableWinningBidStatusRow {
  @scala.inline
  def apply(
    bidCount: SchemaMetricValue = null,
    rowDimensions: SchemaRowDimensions = null,
    status: String = null
  ): SchemaNonBillableWinningBidStatusRow = {
    val __obj = js.Dynamic.literal()
    if (bidCount != null) __obj.updateDynamic("bidCount")(bidCount.asInstanceOf[js.Any])
    if (rowDimensions != null) __obj.updateDynamic("rowDimensions")(rowDimensions.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNonBillableWinningBidStatusRow]
  }
}

