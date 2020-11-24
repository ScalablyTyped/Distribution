package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CampaignGoal extends js.Object {
  
  /** Required. The type of the campaign goal. */
  var campaignGoalType: js.UndefOr[String] = js.native
  
  /**
    * Required. The performance goal of the campaign. Acceptable values for performance_goal_type are: * `PERFORMANCE_GOAL_TYPE_CPM` * `PERFORMANCE_GOAL_TYPE_CPC` *
    * `PERFORMANCE_GOAL_TYPE_CPA` * `PERFORMANCE_GOAL_TYPE_CPIAVC` * `PERFORMANCE_GOAL_TYPE_CTR` * `PERFORMANCE_GOAL_TYPE_VIEWABILITY` * `PERFORMANCE_GOAL_TYPE_OTHER`
    */
  var performanceGoal: js.UndefOr[PerformanceGoal] = js.native
}
object CampaignGoal {
  
  @scala.inline
  def apply(): CampaignGoal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CampaignGoal]
  }
  
  @scala.inline
  implicit class CampaignGoalOps[Self <: CampaignGoal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCampaignGoalType(value: String): Self = this.set("campaignGoalType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCampaignGoalType: Self = this.set("campaignGoalType", js.undefined)
    
    @scala.inline
    def setPerformanceGoal(value: PerformanceGoal): Self = this.set("performanceGoal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformanceGoal: Self = this.set("performanceGoal", js.undefined)
  }
}
