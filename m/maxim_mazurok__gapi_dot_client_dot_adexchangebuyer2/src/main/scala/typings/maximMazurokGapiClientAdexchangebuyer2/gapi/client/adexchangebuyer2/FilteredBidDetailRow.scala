package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilteredBidDetailRow extends StObject {
  
  /** The number of bids with the specified detail. */
  var bidCount: js.UndefOr[MetricValue] = js.undefined
  
  /** The ID of the detail, can be numeric or text. The associated value can be looked up in the dictionary file corresponding to the DetailType in the response message. */
  var detail: js.UndefOr[String] = js.undefined
  
  /**
    * Note: this field will be deprecated, use "detail" field instead. When "detail" field represents an integer value, this field is populated as the same integer value "detail" field
    * represents, otherwise this field will be 0. The ID of the detail. The associated value can be looked up in the dictionary file corresponding to the DetailType in the response
    * message.
    */
  var detailId: js.UndefOr[Double] = js.undefined
  
  /** The values of all dimensions associated with metric values in this row. */
  var rowDimensions: js.UndefOr[RowDimensions] = js.undefined
}
object FilteredBidDetailRow {
  
  inline def apply(): FilteredBidDetailRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilteredBidDetailRow]
  }
  
  extension [Self <: FilteredBidDetailRow](x: Self) {
    
    inline def setBidCount(value: MetricValue): Self = StObject.set(x, "bidCount", value.asInstanceOf[js.Any])
    
    inline def setBidCountUndefined: Self = StObject.set(x, "bidCount", js.undefined)
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailId(value: Double): Self = StObject.set(x, "detailId", value.asInstanceOf[js.Any])
    
    inline def setDetailIdUndefined: Self = StObject.set(x, "detailId", js.undefined)
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setRowDimensions(value: RowDimensions): Self = StObject.set(x, "rowDimensions", value.asInstanceOf[js.Any])
    
    inline def setRowDimensionsUndefined: Self = StObject.set(x, "rowDimensions", js.undefined)
  }
}
