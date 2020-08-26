package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The number of filtered bids with the specified dimension values, among
  * those filtered due to the requested filtering reason (i.e. creative
  * status), that have the specified detail.
  */
@js.native
trait SchemaFilteredBidDetailRow extends js.Object {
  /**
    * The number of bids with the specified detail.
    */
  var bidCount: js.UndefOr[SchemaMetricValue] = js.native
  /**
    * The ID of the detail. The associated value can be looked up in the
    * dictionary file corresponding to the DetailType in the response message.
    */
  var detailId: js.UndefOr[Double] = js.native
  /**
    * The values of all dimensions associated with metric values in this row.
    */
  var rowDimensions: js.UndefOr[SchemaRowDimensions] = js.native
}

object SchemaFilteredBidDetailRow {
  @scala.inline
  def apply(): SchemaFilteredBidDetailRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFilteredBidDetailRow]
  }
  @scala.inline
  implicit class SchemaFilteredBidDetailRowOps[Self <: SchemaFilteredBidDetailRow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBidCount(value: SchemaMetricValue): Self = this.set("bidCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBidCount: Self = this.set("bidCount", js.undefined)
    @scala.inline
    def setDetailId(value: Double): Self = this.set("detailId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetailId: Self = this.set("detailId", js.undefined)
    @scala.inline
    def setRowDimensions(value: SchemaRowDimensions): Self = this.set("rowDimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowDimensions: Self = this.set("rowDimensions", js.undefined)
  }
  
}

