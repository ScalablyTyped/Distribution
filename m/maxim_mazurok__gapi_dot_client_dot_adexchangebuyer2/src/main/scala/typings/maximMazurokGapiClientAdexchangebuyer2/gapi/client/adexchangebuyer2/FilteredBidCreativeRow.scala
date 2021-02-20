package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilteredBidCreativeRow extends StObject {
  
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
  implicit class FilteredBidCreativeRowMutableBuilder[Self <: FilteredBidCreativeRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBidCount(value: MetricValue): Self = StObject.set(x, "bidCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBidCountUndefined: Self = StObject.set(x, "bidCount", js.undefined)
    
    @scala.inline
    def setCreativeId(value: String): Self = StObject.set(x, "creativeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeIdUndefined: Self = StObject.set(x, "creativeId", js.undefined)
    
    @scala.inline
    def setRowDimensions(value: RowDimensions): Self = StObject.set(x, "rowDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowDimensionsUndefined: Self = StObject.set(x, "rowDimensions", js.undefined)
  }
}
