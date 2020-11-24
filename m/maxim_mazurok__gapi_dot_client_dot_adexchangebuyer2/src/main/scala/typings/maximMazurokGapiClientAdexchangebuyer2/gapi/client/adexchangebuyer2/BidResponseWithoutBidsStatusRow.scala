package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BidResponseWithoutBidsStatusRow extends js.Object {
  
  /** The number of impressions for which there was a bid response with the specified status. */
  var impressionCount: js.UndefOr[MetricValue] = js.native
  
  /** The values of all dimensions associated with metric values in this row. */
  var rowDimensions: js.UndefOr[RowDimensions] = js.native
  
  /** The status specifying why the bid responses were considered to have no applicable bids. */
  var status: js.UndefOr[String] = js.native
}
object BidResponseWithoutBidsStatusRow {
  
  @scala.inline
  def apply(): BidResponseWithoutBidsStatusRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BidResponseWithoutBidsStatusRow]
  }
  
  @scala.inline
  implicit class BidResponseWithoutBidsStatusRowOps[Self <: BidResponseWithoutBidsStatusRow] (val x: Self) extends AnyVal {
    
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
    def setImpressionCount(value: MetricValue): Self = this.set("impressionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImpressionCount: Self = this.set("impressionCount", js.undefined)
    
    @scala.inline
    def setRowDimensions(value: RowDimensions): Self = this.set("rowDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowDimensions: Self = this.set("rowDimensions", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
