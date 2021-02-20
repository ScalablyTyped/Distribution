package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BidMetricsRow extends StObject {
  
  /** The number of bids that Ad Exchange received from the buyer. */
  var bids: js.UndefOr[MetricValue] = js.native
  
  /** The number of bids that were permitted to compete in the auction. */
  var bidsInAuction: js.UndefOr[MetricValue] = js.native
  
  /** The number of bids for which the buyer was billed. */
  var billedImpressions: js.UndefOr[MetricValue] = js.native
  
  /** The number of bids that won the auction. */
  var impressionsWon: js.UndefOr[MetricValue] = js.native
  
  /** The number of bids for which the corresponding impression was measurable for viewability (as defined by Active View). */
  var measurableImpressions: js.UndefOr[MetricValue] = js.native
  
  /** The number of bids that won the auction and also won the mediation waterfall (if any). */
  var reachedQueries: js.UndefOr[MetricValue] = js.native
  
  /** The values of all dimensions associated with metric values in this row. */
  var rowDimensions: js.UndefOr[RowDimensions] = js.native
  
  /** The number of bids for which the corresponding impression was viewable (as defined by Active View). */
  var viewableImpressions: js.UndefOr[MetricValue] = js.native
}
object BidMetricsRow {
  
  @scala.inline
  def apply(): BidMetricsRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BidMetricsRow]
  }
  
  @scala.inline
  implicit class BidMetricsRowMutableBuilder[Self <: BidMetricsRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBids(value: MetricValue): Self = StObject.set(x, "bids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBidsInAuction(value: MetricValue): Self = StObject.set(x, "bidsInAuction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBidsInAuctionUndefined: Self = StObject.set(x, "bidsInAuction", js.undefined)
    
    @scala.inline
    def setBidsUndefined: Self = StObject.set(x, "bids", js.undefined)
    
    @scala.inline
    def setBilledImpressions(value: MetricValue): Self = StObject.set(x, "billedImpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBilledImpressionsUndefined: Self = StObject.set(x, "billedImpressions", js.undefined)
    
    @scala.inline
    def setImpressionsWon(value: MetricValue): Self = StObject.set(x, "impressionsWon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpressionsWonUndefined: Self = StObject.set(x, "impressionsWon", js.undefined)
    
    @scala.inline
    def setMeasurableImpressions(value: MetricValue): Self = StObject.set(x, "measurableImpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasurableImpressionsUndefined: Self = StObject.set(x, "measurableImpressions", js.undefined)
    
    @scala.inline
    def setReachedQueries(value: MetricValue): Self = StObject.set(x, "reachedQueries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReachedQueriesUndefined: Self = StObject.set(x, "reachedQueries", js.undefined)
    
    @scala.inline
    def setRowDimensions(value: RowDimensions): Self = StObject.set(x, "rowDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowDimensionsUndefined: Self = StObject.set(x, "rowDimensions", js.undefined)
    
    @scala.inline
    def setViewableImpressions(value: MetricValue): Self = StObject.set(x, "viewableImpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewableImpressionsUndefined: Self = StObject.set(x, "viewableImpressions", js.undefined)
  }
}
