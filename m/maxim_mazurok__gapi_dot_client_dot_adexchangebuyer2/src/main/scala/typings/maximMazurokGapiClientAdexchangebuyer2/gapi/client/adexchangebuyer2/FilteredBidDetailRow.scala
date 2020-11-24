package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilteredBidDetailRow extends js.Object {
  
  /** The number of bids with the specified detail. */
  var bidCount: js.UndefOr[MetricValue] = js.native
  
  /** The ID of the detail, can be numeric or text. The associated value can be looked up in the dictionary file corresponding to the DetailType in the response message. */
  var detail: js.UndefOr[String] = js.native
  
  /**
    * Note: this field will be deprecated, use "detail" field instead. When "detail" field represents an integer value, this field is populated as the same integer value "detail" field
    * represents, otherwise this field will be 0. The ID of the detail. The associated value can be looked up in the dictionary file corresponding to the DetailType in the response
    * message.
    */
  var detailId: js.UndefOr[Double] = js.native
  
  /** The values of all dimensions associated with metric values in this row. */
  var rowDimensions: js.UndefOr[RowDimensions] = js.native
}
object FilteredBidDetailRow {
  
  @scala.inline
  def apply(): FilteredBidDetailRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilteredBidDetailRow]
  }
  
  @scala.inline
  implicit class FilteredBidDetailRowOps[Self <: FilteredBidDetailRow] (val x: Self) extends AnyVal {
    
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
    def setDetail(value: String): Self = this.set("detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetail: Self = this.set("detail", js.undefined)
    
    @scala.inline
    def setDetailId(value: Double): Self = this.set("detailId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetailId: Self = this.set("detailId", js.undefined)
    
    @scala.inline
    def setRowDimensions(value: RowDimensions): Self = this.set("rowDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowDimensions: Self = this.set("rowDimensions", js.undefined)
  }
}
