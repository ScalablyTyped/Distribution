package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaNonBillableWinningBidStatusRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNonBillableWinningBidStatusRow]
  }
  
  @scala.inline
  implicit class SchemaNonBillableWinningBidStatusRowOps[Self <: SchemaNonBillableWinningBidStatusRow] (val x: Self) extends AnyVal {
    
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
    def setRowDimensions(value: SchemaRowDimensions): Self = this.set("rowDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowDimensions: Self = this.set("rowDimensions", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
