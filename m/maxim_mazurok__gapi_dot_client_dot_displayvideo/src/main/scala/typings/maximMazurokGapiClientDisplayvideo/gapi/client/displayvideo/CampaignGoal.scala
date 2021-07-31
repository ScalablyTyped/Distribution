package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CampaignGoal extends StObject {
  
  /** Required. The type of the campaign goal. */
  var campaignGoalType: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The performance goal of the campaign. Acceptable values for performance_goal_type are: * `PERFORMANCE_GOAL_TYPE_CPM` * `PERFORMANCE_GOAL_TYPE_CPC` *
    * `PERFORMANCE_GOAL_TYPE_CPA` * `PERFORMANCE_GOAL_TYPE_CPIAVC` * `PERFORMANCE_GOAL_TYPE_CTR` * `PERFORMANCE_GOAL_TYPE_VIEWABILITY` * `PERFORMANCE_GOAL_TYPE_OTHER`
    */
  var performanceGoal: js.UndefOr[PerformanceGoal] = js.undefined
}
object CampaignGoal {
  
  @scala.inline
  def apply(): CampaignGoal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CampaignGoal]
  }
  
  @scala.inline
  implicit class CampaignGoalMutableBuilder[Self <: CampaignGoal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCampaignGoalType(value: String): Self = StObject.set(x, "campaignGoalType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCampaignGoalTypeUndefined: Self = StObject.set(x, "campaignGoalType", js.undefined)
    
    @scala.inline
    def setPerformanceGoal(value: PerformanceGoal): Self = StObject.set(x, "performanceGoal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformanceGoalUndefined: Self = StObject.set(x, "performanceGoal", js.undefined)
  }
}
