package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The number of filtered bids with the specified dimension values that have
  * the specified creative.
  */
@js.native
trait SchemaFilteredBidCreativeRow extends js.Object {
  /**
    * The number of bids with the specified creative.
    */
  var bidCount: js.UndefOr[SchemaMetricValue] = js.native
  /**
    * The ID of the creative.
    */
  var creativeId: js.UndefOr[String] = js.native
  /**
    * The values of all dimensions associated with metric values in this row.
    */
  var rowDimensions: js.UndefOr[SchemaRowDimensions] = js.native
}

object SchemaFilteredBidCreativeRow {
  @scala.inline
  def apply(
    bidCount: SchemaMetricValue = null,
    creativeId: String = null,
    rowDimensions: SchemaRowDimensions = null
  ): SchemaFilteredBidCreativeRow = {
    val __obj = js.Dynamic.literal()
    if (bidCount != null) __obj.updateDynamic("bidCount")(bidCount.asInstanceOf[js.Any])
    if (creativeId != null) __obj.updateDynamic("creativeId")(creativeId.asInstanceOf[js.Any])
    if (rowDimensions != null) __obj.updateDynamic("rowDimensions")(rowDimensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFilteredBidCreativeRow]
  }
}

