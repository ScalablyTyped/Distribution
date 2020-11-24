package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreativeStatusRow extends js.Object {
  
  /** The number of bids with the specified status. */
  var bidCount: js.UndefOr[MetricValue] = js.native
  
  /** The ID of the creative status. See [creative-status-codes](https://developers.google.com/authorized-buyers/rtb/downloads/creative-status-codes). */
  var creativeStatusId: js.UndefOr[Double] = js.native
  
  /** The values of all dimensions associated with metric values in this row. */
  var rowDimensions: js.UndefOr[RowDimensions] = js.native
}
object CreativeStatusRow {
  
  @scala.inline
  def apply(): CreativeStatusRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeStatusRow]
  }
  
  @scala.inline
  implicit class CreativeStatusRowOps[Self <: CreativeStatusRow] (val x: Self) extends AnyVal {
    
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
    def setBidCount(value: MetricValue): Self = this.set("bidCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBidCount: Self = this.set("bidCount", js.undefined)
    
    @scala.inline
    def setCreativeStatusId(value: Double): Self = this.set("creativeStatusId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeStatusId: Self = this.set("creativeStatusId", js.undefined)
    
    @scala.inline
    def setRowDimensions(value: RowDimensions): Self = this.set("rowDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowDimensions: Self = this.set("rowDimensions", js.undefined)
  }
}
