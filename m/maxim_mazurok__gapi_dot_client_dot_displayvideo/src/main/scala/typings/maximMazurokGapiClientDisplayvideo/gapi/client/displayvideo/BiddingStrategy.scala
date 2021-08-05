package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BiddingStrategy extends StObject {
  
  /** A strategy that uses a fixed bid price. */
  var fixedBid: js.UndefOr[FixedBidStrategy] = js.undefined
  
  /**
    * A strategy that automatically adjusts the bid to optimize to your performance goal while spending the full budget. At insertion order level, the markup_type of line items cannot be
    * set to `PARTNER_REVENUE_MODEL_MARKUP_TYPE_CPM`. In addition, when performance_goal_type is one of: * `BIDDING_STRATEGY_PERFORMANCE_GOAL_TYPE_CPA` *
    * `BIDDING_STRATEGY_PERFORMANCE_GOAL_TYPE_CPC` * `BIDDING_STRATEGY_PERFORMANCE_GOAL_TYPE_AV_VIEWED` , the line_item_type of the insertion order line items must be either: *
    * `LINE_ITEM_TYPE_DISPLAY_DEFAULT` * `LINE_ITEM_TYPE_VIDEO_DEFAULT` , and when performance_goal_type is either: * `BIDDING_STRATEGY_PERFORMANCE_GOAL_TYPE_CIVA` *
    * `BIDDING_STRATEGY_PERFORMANCE_GOAL_TYPE_IVO_TEN` the line_item_type of the insertion order line items must be `LINE_ITEM_TYPE_VIDEO_DEFAULT`.
    */
  var maximizeSpendAutoBid: js.UndefOr[MaximizeSpendBidStrategy] = js.undefined
  
  /** A strategy that automatically adjusts the bid to meet or beat a specified performance goal. It is to be used only for a line item entity. */
  var performanceGoalAutoBid: js.UndefOr[PerformanceGoalBidStrategy] = js.undefined
}
object BiddingStrategy {
  
  inline def apply(): BiddingStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BiddingStrategy]
  }
  
  extension [Self <: BiddingStrategy](x: Self) {
    
    inline def setFixedBid(value: FixedBidStrategy): Self = StObject.set(x, "fixedBid", value.asInstanceOf[js.Any])
    
    inline def setFixedBidUndefined: Self = StObject.set(x, "fixedBid", js.undefined)
    
    inline def setMaximizeSpendAutoBid(value: MaximizeSpendBidStrategy): Self = StObject.set(x, "maximizeSpendAutoBid", value.asInstanceOf[js.Any])
    
    inline def setMaximizeSpendAutoBidUndefined: Self = StObject.set(x, "maximizeSpendAutoBid", js.undefined)
    
    inline def setPerformanceGoalAutoBid(value: PerformanceGoalBidStrategy): Self = StObject.set(x, "performanceGoalAutoBid", value.asInstanceOf[js.Any])
    
    inline def setPerformanceGoalAutoBidUndefined: Self = StObject.set(x, "performanceGoalAutoBid", js.undefined)
  }
}
