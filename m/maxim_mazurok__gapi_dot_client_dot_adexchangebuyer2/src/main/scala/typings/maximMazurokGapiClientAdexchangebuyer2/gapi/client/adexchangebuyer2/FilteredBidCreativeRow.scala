package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilteredBidCreativeRow extends js.Object {
  
  /** The number of bids with the specified creative. */
  var bidCount: js.UndefOr[MetricValue] = js.native
  
  /** The ID of the creative. */
  var creativeId: js.UndefOr[String] = js.native
  
  /** The values of all dimensions associated with metric values in this row. */
  var rowDimensions: js.UndefOr[RowDimensions] = js.native
}
object FilteredBidCreativeRow {
  
  @scala.inline
  def apply(): FilteredBidCreativeRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilteredBidCreativeRow]
  }
  
  @scala.inline
  implicit class FilteredBidCreativeRowOps[Self <: FilteredBidCreativeRow] (val x: Self) extends AnyVal {
    
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
    def setCreativeId(value: String): Self = this.set("creativeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeId: Self = this.set("creativeId", js.undefined)
    
    @scala.inline
    def setRowDimensions(value: RowDimensions): Self = this.set("rowDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowDimensions: Self = this.set("rowDimensions", js.undefined)
  }
}
