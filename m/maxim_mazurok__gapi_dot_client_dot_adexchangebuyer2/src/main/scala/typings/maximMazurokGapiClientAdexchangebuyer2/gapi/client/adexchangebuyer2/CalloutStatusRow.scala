package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalloutStatusRow extends StObject {
  
  /** The ID of the callout status. See [callout-status-codes](https://developers.google.com/authorized-buyers/rtb/downloads/callout-status-codes). */
  var calloutStatusId: js.UndefOr[Double] = js.native
  
  /** The number of impressions for which there was a bid request or bid response with the specified callout status. */
  var impressionCount: js.UndefOr[MetricValue] = js.native
  
  /** The values of all dimensions associated with metric values in this row. */
  var rowDimensions: js.UndefOr[RowDimensions] = js.native
}
object CalloutStatusRow {
  
  @scala.inline
  def apply(): CalloutStatusRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalloutStatusRow]
  }
  
  @scala.inline
  implicit class CalloutStatusRowMutableBuilder[Self <: CalloutStatusRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalloutStatusId(value: Double): Self = StObject.set(x, "calloutStatusId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalloutStatusIdUndefined: Self = StObject.set(x, "calloutStatusId", js.undefined)
    
    @scala.inline
    def setImpressionCount(value: MetricValue): Self = StObject.set(x, "impressionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpressionCountUndefined: Self = StObject.set(x, "impressionCount", js.undefined)
    
    @scala.inline
    def setRowDimensions(value: RowDimensions): Self = StObject.set(x, "rowDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowDimensionsUndefined: Self = StObject.set(x, "rowDimensions", js.undefined)
  }
}
