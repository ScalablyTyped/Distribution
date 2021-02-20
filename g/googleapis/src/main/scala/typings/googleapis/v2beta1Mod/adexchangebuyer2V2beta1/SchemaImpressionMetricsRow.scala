package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The set of metrics that are measured in numbers of impressions,
  * representing how many impressions with the specified dimension values were
  * considered eligible at each stage of the bidding funnel.
  */
@js.native
trait SchemaImpressionMetricsRow extends StObject {
  
  /**
    * The number of impressions available to the buyer on Ad Exchange. In some
    * cases this value may be unavailable.
    */
  var availableImpressions: js.UndefOr[SchemaMetricValue] = js.native
  
  /**
    * The number of impressions for which Ad Exchange sent the buyer a bid
    * request.
    */
  var bidRequests: js.UndefOr[SchemaMetricValue] = js.native
  
  /**
    * The number of impressions that match the buyer&#39;s inventory
    * pretargeting.
    */
  var inventoryMatches: js.UndefOr[SchemaMetricValue] = js.native
  
  /**
    * The number of impressions for which Ad Exchange received a response from
    * the buyer that contained at least one applicable bid.
    */
  var responsesWithBids: js.UndefOr[SchemaMetricValue] = js.native
  
  /**
    * The values of all dimensions associated with metric values in this row.
    */
  var rowDimensions: js.UndefOr[SchemaRowDimensions] = js.native
  
  /**
    * The number of impressions for which the buyer successfully sent a
    * response to Ad Exchange.
    */
  var successfulResponses: js.UndefOr[SchemaMetricValue] = js.native
}
object SchemaImpressionMetricsRow {
  
  @scala.inline
  def apply(): SchemaImpressionMetricsRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImpressionMetricsRow]
  }
  
  @scala.inline
  implicit class SchemaImpressionMetricsRowMutableBuilder[Self <: SchemaImpressionMetricsRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailableImpressions(value: SchemaMetricValue): Self = StObject.set(x, "availableImpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableImpressionsUndefined: Self = StObject.set(x, "availableImpressions", js.undefined)
    
    @scala.inline
    def setBidRequests(value: SchemaMetricValue): Self = StObject.set(x, "bidRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBidRequestsUndefined: Self = StObject.set(x, "bidRequests", js.undefined)
    
    @scala.inline
    def setInventoryMatches(value: SchemaMetricValue): Self = StObject.set(x, "inventoryMatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInventoryMatchesUndefined: Self = StObject.set(x, "inventoryMatches", js.undefined)
    
    @scala.inline
    def setResponsesWithBids(value: SchemaMetricValue): Self = StObject.set(x, "responsesWithBids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsesWithBidsUndefined: Self = StObject.set(x, "responsesWithBids", js.undefined)
    
    @scala.inline
    def setRowDimensions(value: SchemaRowDimensions): Self = StObject.set(x, "rowDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowDimensionsUndefined: Self = StObject.set(x, "rowDimensions", js.undefined)
    
    @scala.inline
    def setSuccessfulResponses(value: SchemaMetricValue): Self = StObject.set(x, "successfulResponses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessfulResponsesUndefined: Self = StObject.set(x, "successfulResponses", js.undefined)
  }
}
