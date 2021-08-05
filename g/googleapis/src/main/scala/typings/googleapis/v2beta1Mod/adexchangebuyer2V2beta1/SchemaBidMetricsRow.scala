package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The set of metrics that are measured in numbers of bids, representing how
  * many bids with the specified dimension values were considered eligible at
  * each stage of the bidding funnel;
  */
trait SchemaBidMetricsRow extends StObject {
  
  /**
    * The number of bids that Ad Exchange received from the buyer.
    */
  var bids: js.UndefOr[SchemaMetricValue] = js.undefined
  
  /**
    * The number of bids that were permitted to compete in the auction.
    */
  var bidsInAuction: js.UndefOr[SchemaMetricValue] = js.undefined
  
  /**
    * The number of bids for which the buyer was billed.
    */
  var billedImpressions: js.UndefOr[SchemaMetricValue] = js.undefined
  
  /**
    * The number of bids that won an impression.
    */
  var impressionsWon: js.UndefOr[SchemaMetricValue] = js.undefined
  
  /**
    * The number of bids for which the corresponding impression was measurable
    * for viewability (as defined by Active View).
    */
  var measurableImpressions: js.UndefOr[SchemaMetricValue] = js.undefined
  
  /**
    * The values of all dimensions associated with metric values in this row.
    */
  var rowDimensions: js.UndefOr[SchemaRowDimensions] = js.undefined
  
  /**
    * The number of bids for which the corresponding impression was viewable
    * (as defined by Active View).
    */
  var viewableImpressions: js.UndefOr[SchemaMetricValue] = js.undefined
}
object SchemaBidMetricsRow {
  
  inline def apply(): SchemaBidMetricsRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBidMetricsRow]
  }
  
  extension [Self <: SchemaBidMetricsRow](x: Self) {
    
    inline def setBids(value: SchemaMetricValue): Self = StObject.set(x, "bids", value.asInstanceOf[js.Any])
    
    inline def setBidsInAuction(value: SchemaMetricValue): Self = StObject.set(x, "bidsInAuction", value.asInstanceOf[js.Any])
    
    inline def setBidsInAuctionUndefined: Self = StObject.set(x, "bidsInAuction", js.undefined)
    
    inline def setBidsUndefined: Self = StObject.set(x, "bids", js.undefined)
    
    inline def setBilledImpressions(value: SchemaMetricValue): Self = StObject.set(x, "billedImpressions", value.asInstanceOf[js.Any])
    
    inline def setBilledImpressionsUndefined: Self = StObject.set(x, "billedImpressions", js.undefined)
    
    inline def setImpressionsWon(value: SchemaMetricValue): Self = StObject.set(x, "impressionsWon", value.asInstanceOf[js.Any])
    
    inline def setImpressionsWonUndefined: Self = StObject.set(x, "impressionsWon", js.undefined)
    
    inline def setMeasurableImpressions(value: SchemaMetricValue): Self = StObject.set(x, "measurableImpressions", value.asInstanceOf[js.Any])
    
    inline def setMeasurableImpressionsUndefined: Self = StObject.set(x, "measurableImpressions", js.undefined)
    
    inline def setRowDimensions(value: SchemaRowDimensions): Self = StObject.set(x, "rowDimensions", value.asInstanceOf[js.Any])
    
    inline def setRowDimensionsUndefined: Self = StObject.set(x, "rowDimensions", js.undefined)
    
    inline def setViewableImpressions(value: SchemaMetricValue): Self = StObject.set(x, "viewableImpressions", value.asInstanceOf[js.Any])
    
    inline def setViewableImpressionsUndefined: Self = StObject.set(x, "viewableImpressions", js.undefined)
  }
}
