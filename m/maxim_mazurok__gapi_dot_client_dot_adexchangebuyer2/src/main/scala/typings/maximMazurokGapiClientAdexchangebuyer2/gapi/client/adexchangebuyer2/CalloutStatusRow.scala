package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalloutStatusRow extends StObject {
  
  /** The ID of the callout status. See [callout-status-codes](https://developers.google.com/authorized-buyers/rtb/downloads/callout-status-codes). */
  var calloutStatusId: js.UndefOr[Double] = js.undefined
  
  /** The number of impressions for which there was a bid request or bid response with the specified callout status. */
  var impressionCount: js.UndefOr[MetricValue] = js.undefined
  
  /** The values of all dimensions associated with metric values in this row. */
  var rowDimensions: js.UndefOr[RowDimensions] = js.undefined
}
object CalloutStatusRow {
  
  inline def apply(): CalloutStatusRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalloutStatusRow]
  }
  
  extension [Self <: CalloutStatusRow](x: Self) {
    
    inline def setCalloutStatusId(value: Double): Self = StObject.set(x, "calloutStatusId", value.asInstanceOf[js.Any])
    
    inline def setCalloutStatusIdUndefined: Self = StObject.set(x, "calloutStatusId", js.undefined)
    
    inline def setImpressionCount(value: MetricValue): Self = StObject.set(x, "impressionCount", value.asInstanceOf[js.Any])
    
    inline def setImpressionCountUndefined: Self = StObject.set(x, "impressionCount", js.undefined)
    
    inline def setRowDimensions(value: RowDimensions): Self = StObject.set(x, "rowDimensions", value.asInstanceOf[js.Any])
    
    inline def setRowDimensionsUndefined: Self = StObject.set(x, "rowDimensions", js.undefined)
  }
}
