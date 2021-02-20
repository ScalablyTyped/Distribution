package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The set of metrics that are measured in numbers of bids, representing how
  * many bids with the specified dimension values were considered eligible at
  * each stage of the bidding funnel;
  */
@js.native
trait SchemaBidMetricsRow extends StObject {
  
  /**
    * The number of bids that Ad Exchange received from the buyer.
    */
  var bids: js.UndefOr[SchemaMetricValue] = js.native
  
  /**
    * The number of bids that were permitted to compete in the auction.
    */
  var bidsInAuction: js.UndefOr[SchemaMetricValue] = js.native
  
  /**
    * The number of bids for which the buyer was billed.
    */
  var billedImpressions: js.UndefOr[SchemaMetricValue] = js.native
  
  /**
    * The number of bids that won an impression.
    */
  var impressionsWon: js.UndefOr[SchemaMetricValue] = js.native
  
  /**
    * The number of bids for which the corresponding impression was measurable
    * for viewability (as defined by Active View).
    */
  var measurableImpressions: js.UndefOr[SchemaMetricValue] = js.native
  
  /**
    * The values of all dimensions associated with metric values in this row.
    */
  var rowDimensions: js.UndefOr[SchemaRowDimensions] = js.native
  
  /**
    * The number of bids for which the corresponding impression was viewable
    * (as defined by Active View).
    */
  var viewableImpressions: js.UndefOr[SchemaMetricValue] = js.native
}
object SchemaBidMetricsRow {
  
  @scala.inline
  def apply(): SchemaBidMetricsRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBidMetricsRow]
  }
  
  @scala.inline
  implicit class SchemaBidMetricsRowMutableBuilder[Self <: SchemaBidMetricsRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBids(value: SchemaMetricValue): Self = StObject.set(x, "bids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBidsInAuction(value: SchemaMetricValue): Self = StObject.set(x, "bidsInAuction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBidsInAuctionUndefined: Self = StObject.set(x, "bidsInAuction", js.undefined)
    
    @scala.inline
    def setBidsUndefined: Self = StObject.set(x, "bids", js.undefined)
    
    @scala.inline
    def setBilledImpressions(value: SchemaMetricValue): Self = StObject.set(x, "billedImpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBilledImpressionsUndefined: Self = StObject.set(x, "billedImpressions", js.undefined)
    
    @scala.inline
    def setImpressionsWon(value: SchemaMetricValue): Self = StObject.set(x, "impressionsWon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpressionsWonUndefined: Self = StObject.set(x, "impressionsWon", js.undefined)
    
    @scala.inline
    def setMeasurableImpressions(value: SchemaMetricValue): Self = StObject.set(x, "measurableImpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasurableImpressionsUndefined: Self = StObject.set(x, "measurableImpressions", js.undefined)
    
    @scala.inline
    def setRowDimensions(value: SchemaRowDimensions): Self = StObject.set(x, "rowDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowDimensionsUndefined: Self = StObject.set(x, "rowDimensions", js.undefined)
    
    @scala.inline
    def setViewableImpressions(value: SchemaMetricValue): Self = StObject.set(x, "viewableImpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewableImpressionsUndefined: Self = StObject.set(x, "viewableImpressions", js.undefined)
  }
}
