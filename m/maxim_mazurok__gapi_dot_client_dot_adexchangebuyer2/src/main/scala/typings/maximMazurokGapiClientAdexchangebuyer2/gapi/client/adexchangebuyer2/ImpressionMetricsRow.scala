package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImpressionMetricsRow extends StObject {
  
  /** The number of impressions available to the buyer on Ad Exchange. In some cases this value may be unavailable. */
  var availableImpressions: js.UndefOr[MetricValue] = js.native
  
  /** The number of impressions for which Ad Exchange sent the buyer a bid request. */
  var bidRequests: js.UndefOr[MetricValue] = js.native
  
  /** The number of impressions that match the buyer's inventory pretargeting. */
  var inventoryMatches: js.UndefOr[MetricValue] = js.native
  
  /** The number of impressions for which Ad Exchange received a response from the buyer that contained at least one applicable bid. */
  var responsesWithBids: js.UndefOr[MetricValue] = js.native
  
  /** The values of all dimensions associated with metric values in this row. */
  var rowDimensions: js.UndefOr[RowDimensions] = js.native
  
  /** The number of impressions for which the buyer successfully sent a response to Ad Exchange. */
  var successfulResponses: js.UndefOr[MetricValue] = js.native
}
object ImpressionMetricsRow {
  
  @scala.inline
  def apply(): ImpressionMetricsRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImpressionMetricsRow]
  }
  
  @scala.inline
  implicit class ImpressionMetricsRowMutableBuilder[Self <: ImpressionMetricsRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailableImpressions(value: MetricValue): Self = StObject.set(x, "availableImpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableImpressionsUndefined: Self = StObject.set(x, "availableImpressions", js.undefined)
    
    @scala.inline
    def setBidRequests(value: MetricValue): Self = StObject.set(x, "bidRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBidRequestsUndefined: Self = StObject.set(x, "bidRequests", js.undefined)
    
    @scala.inline
    def setInventoryMatches(value: MetricValue): Self = StObject.set(x, "inventoryMatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInventoryMatchesUndefined: Self = StObject.set(x, "inventoryMatches", js.undefined)
    
    @scala.inline
    def setResponsesWithBids(value: MetricValue): Self = StObject.set(x, "responsesWithBids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsesWithBidsUndefined: Self = StObject.set(x, "responsesWithBids", js.undefined)
    
    @scala.inline
    def setRowDimensions(value: RowDimensions): Self = StObject.set(x, "rowDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowDimensionsUndefined: Self = StObject.set(x, "rowDimensions", js.undefined)
    
    @scala.inline
    def setSuccessfulResponses(value: MetricValue): Self = StObject.set(x, "successfulResponses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessfulResponsesUndefined: Self = StObject.set(x, "successfulResponses", js.undefined)
  }
}
