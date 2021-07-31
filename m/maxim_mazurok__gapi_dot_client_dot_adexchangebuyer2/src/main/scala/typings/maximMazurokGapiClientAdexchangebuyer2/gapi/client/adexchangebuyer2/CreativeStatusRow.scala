package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreativeStatusRow extends StObject {
  
  /** The number of bids with the specified status. */
  var bidCount: js.UndefOr[MetricValue] = js.undefined
  
  /** The ID of the creative status. See [creative-status-codes](https://developers.google.com/authorized-buyers/rtb/downloads/creative-status-codes). */
  var creativeStatusId: js.UndefOr[Double] = js.undefined
  
  /** The values of all dimensions associated with metric values in this row. */
  var rowDimensions: js.UndefOr[RowDimensions] = js.undefined
}
object CreativeStatusRow {
  
  @scala.inline
  def apply(): CreativeStatusRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeStatusRow]
  }
  
  @scala.inline
  implicit class CreativeStatusRowMutableBuilder[Self <: CreativeStatusRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBidCount(value: MetricValue): Self = StObject.set(x, "bidCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBidCountUndefined: Self = StObject.set(x, "bidCount", js.undefined)
    
    @scala.inline
    def setCreativeStatusId(value: Double): Self = StObject.set(x, "creativeStatusId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeStatusIdUndefined: Self = StObject.set(x, "creativeStatusId", js.undefined)
    
    @scala.inline
    def setRowDimensions(value: RowDimensions): Self = StObject.set(x, "rowDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowDimensionsUndefined: Self = StObject.set(x, "rowDimensions", js.undefined)
  }
}
