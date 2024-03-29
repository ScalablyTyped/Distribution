package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaImpressionMetricsRow extends StObject {
  
  /**
    * The number of impressions available to the buyer on Ad Exchange. In some cases this value may be unavailable.
    */
  var availableImpressions: js.UndefOr[SchemaMetricValue] = js.undefined
  
  /**
    * The number of impressions for which Ad Exchange sent the buyer a bid request.
    */
  var bidRequests: js.UndefOr[SchemaMetricValue] = js.undefined
  
  /**
    * The number of impressions that match the buyer's inventory pretargeting.
    */
  var inventoryMatches: js.UndefOr[SchemaMetricValue] = js.undefined
  
  /**
    * The number of impressions for which Ad Exchange received a response from the buyer that contained at least one applicable bid.
    */
  var responsesWithBids: js.UndefOr[SchemaMetricValue] = js.undefined
  
  /**
    * The values of all dimensions associated with metric values in this row.
    */
  var rowDimensions: js.UndefOr[SchemaRowDimensions] = js.undefined
  
  /**
    * The number of impressions for which the buyer successfully sent a response to Ad Exchange.
    */
  var successfulResponses: js.UndefOr[SchemaMetricValue] = js.undefined
}
object SchemaImpressionMetricsRow {
  
  inline def apply(): SchemaImpressionMetricsRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImpressionMetricsRow]
  }
  
  extension [Self <: SchemaImpressionMetricsRow](x: Self) {
    
    inline def setAvailableImpressions(value: SchemaMetricValue): Self = StObject.set(x, "availableImpressions", value.asInstanceOf[js.Any])
    
    inline def setAvailableImpressionsUndefined: Self = StObject.set(x, "availableImpressions", js.undefined)
    
    inline def setBidRequests(value: SchemaMetricValue): Self = StObject.set(x, "bidRequests", value.asInstanceOf[js.Any])
    
    inline def setBidRequestsUndefined: Self = StObject.set(x, "bidRequests", js.undefined)
    
    inline def setInventoryMatches(value: SchemaMetricValue): Self = StObject.set(x, "inventoryMatches", value.asInstanceOf[js.Any])
    
    inline def setInventoryMatchesUndefined: Self = StObject.set(x, "inventoryMatches", js.undefined)
    
    inline def setResponsesWithBids(value: SchemaMetricValue): Self = StObject.set(x, "responsesWithBids", value.asInstanceOf[js.Any])
    
    inline def setResponsesWithBidsUndefined: Self = StObject.set(x, "responsesWithBids", js.undefined)
    
    inline def setRowDimensions(value: SchemaRowDimensions): Self = StObject.set(x, "rowDimensions", value.asInstanceOf[js.Any])
    
    inline def setRowDimensionsUndefined: Self = StObject.set(x, "rowDimensions", js.undefined)
    
    inline def setSuccessfulResponses(value: SchemaMetricValue): Self = StObject.set(x, "successfulResponses", value.asInstanceOf[js.Any])
    
    inline def setSuccessfulResponsesUndefined: Self = StObject.set(x, "successfulResponses", js.undefined)
  }
}
