package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMaximizeSpendBidStrategy extends StObject {
  
  /**
    * The ID of the Custom Bidding Algorithm used by this strategy. Only applicable when performance_goal_type is set to `BIDDING_STRATEGY_PERFORMANCE_GOAL_TYPE_CUSTOM_ALGO`.
    */
  var customBiddingAlgorithmId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The maximum average CPM that may be bid, in micros of the advertiser's currency. Must be greater than or equal to a billable unit of the given currency. For example, 1500000 represents 1.5 standard units of the currency.
    */
  var maxAverageCpmBidAmountMicros: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The type of the performance goal that the bidding strategy tries to minimize while spending the full budget. `BIDDING_STRATEGY_PERFORMANCE_GOAL_TYPE_VIEWABLE_CPM` is not supported for this strategy.
    */
  var performanceGoalType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the strategy takes deal floor prices into account.
    */
  var raiseBidForDeals: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaMaximizeSpendBidStrategy {
  
  inline def apply(): SchemaMaximizeSpendBidStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMaximizeSpendBidStrategy]
  }
  
  extension [Self <: SchemaMaximizeSpendBidStrategy](x: Self) {
    
    inline def setCustomBiddingAlgorithmId(value: String): Self = StObject.set(x, "customBiddingAlgorithmId", value.asInstanceOf[js.Any])
    
    inline def setCustomBiddingAlgorithmIdNull: Self = StObject.set(x, "customBiddingAlgorithmId", null)
    
    inline def setCustomBiddingAlgorithmIdUndefined: Self = StObject.set(x, "customBiddingAlgorithmId", js.undefined)
    
    inline def setMaxAverageCpmBidAmountMicros(value: String): Self = StObject.set(x, "maxAverageCpmBidAmountMicros", value.asInstanceOf[js.Any])
    
    inline def setMaxAverageCpmBidAmountMicrosNull: Self = StObject.set(x, "maxAverageCpmBidAmountMicros", null)
    
    inline def setMaxAverageCpmBidAmountMicrosUndefined: Self = StObject.set(x, "maxAverageCpmBidAmountMicros", js.undefined)
    
    inline def setPerformanceGoalType(value: String): Self = StObject.set(x, "performanceGoalType", value.asInstanceOf[js.Any])
    
    inline def setPerformanceGoalTypeNull: Self = StObject.set(x, "performanceGoalType", null)
    
    inline def setPerformanceGoalTypeUndefined: Self = StObject.set(x, "performanceGoalType", js.undefined)
    
    inline def setRaiseBidForDeals(value: Boolean): Self = StObject.set(x, "raiseBidForDeals", value.asInstanceOf[js.Any])
    
    inline def setRaiseBidForDealsNull: Self = StObject.set(x, "raiseBidForDeals", null)
    
    inline def setRaiseBidForDealsUndefined: Self = StObject.set(x, "raiseBidForDeals", js.undefined)
  }
}
