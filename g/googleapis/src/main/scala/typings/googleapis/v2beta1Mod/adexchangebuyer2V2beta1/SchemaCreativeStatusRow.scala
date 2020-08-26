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
  def apply(): SchemaCreativeStatusRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeStatusRow]
  }
  @scala.inline
  implicit class SchemaCreativeStatusRowOps[Self <: SchemaCreativeStatusRow] (val x: Self) extends AnyVal {
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
    def setCreativeStatusId(value: Double): Self = this.set("creativeStatusId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreativeStatusId: Self = this.set("creativeStatusId", js.undefined)
    @scala.inline
    def setRowDimensions(value: SchemaRowDimensions): Self = this.set("rowDimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowDimensions: Self = this.set("rowDimensions", js.undefined)
  }
  
}

