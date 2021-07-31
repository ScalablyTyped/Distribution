package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NonBillableWinningBidStatusRow extends StObject {
  
  /** The number of bids with the specified status. */
  var bidCount: js.UndefOr[MetricValue] = js.undefined
  
  /** The values of all dimensions associated with metric values in this row. */
  var rowDimensions: js.UndefOr[RowDimensions] = js.undefined
  
  /** The status specifying why the winning bids were not billed. */
  var status: js.UndefOr[String] = js.undefined
}
object NonBillableWinningBidStatusRow {
  
  @scala.inline
  def apply(): NonBillableWinningBidStatusRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NonBillableWinningBidStatusRow]
  }
  
  @scala.inline
  implicit class NonBillableWinningBidStatusRowMutableBuilder[Self <: NonBillableWinningBidStatusRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBidCount(value: MetricValue): Self = StObject.set(x, "bidCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBidCountUndefined: Self = StObject.set(x, "bidCount", js.undefined)
    
    @scala.inline
    def setRowDimensions(value: RowDimensions): Self = StObject.set(x, "rowDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowDimensionsUndefined: Self = StObject.set(x, "rowDimensions", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
