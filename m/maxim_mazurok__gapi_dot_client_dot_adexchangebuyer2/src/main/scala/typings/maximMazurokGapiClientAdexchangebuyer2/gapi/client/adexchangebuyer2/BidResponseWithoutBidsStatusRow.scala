package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BidResponseWithoutBidsStatusRow extends StObject {
  
  /** The number of impressions for which there was a bid response with the specified status. */
  var impressionCount: js.UndefOr[MetricValue] = js.undefined
  
  /** The values of all dimensions associated with metric values in this row. */
  var rowDimensions: js.UndefOr[RowDimensions] = js.undefined
  
  /** The status specifying why the bid responses were considered to have no applicable bids. */
  var status: js.UndefOr[String] = js.undefined
}
object BidResponseWithoutBidsStatusRow {
  
  @scala.inline
  def apply(): BidResponseWithoutBidsStatusRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BidResponseWithoutBidsStatusRow]
  }
  
  @scala.inline
  implicit class BidResponseWithoutBidsStatusRowMutableBuilder[Self <: BidResponseWithoutBidsStatusRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImpressionCount(value: MetricValue): Self = StObject.set(x, "impressionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpressionCountUndefined: Self = StObject.set(x, "impressionCount", js.undefined)
    
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
