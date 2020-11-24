package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoalData extends js.Object {
  
  /** URL of the page where this goal was completed. */
  var goalCompletionLocation: js.UndefOr[String] = js.native
  
  /** Total number of goal completions in this activity. */
  var goalCompletions: js.UndefOr[String] = js.native
  
  /** This identifies the goal as configured for the profile. */
  var goalIndex: js.UndefOr[Double] = js.native
  
  /** Name of the goal. */
  var goalName: js.UndefOr[String] = js.native
  
  /** URL of the page one step prior to the goal completion. */
  var goalPreviousStep1: js.UndefOr[String] = js.native
  
  /** URL of the page two steps prior to the goal completion. */
  var goalPreviousStep2: js.UndefOr[String] = js.native
  
  /** URL of the page three steps prior to the goal completion. */
  var goalPreviousStep3: js.UndefOr[String] = js.native
  
  /** Value in this goal. */
  var goalValue: js.UndefOr[Double] = js.native
}
object GoalData {
  
  @scala.inline
  def apply(): GoalData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoalData]
  }
  
  @scala.inline
  implicit class GoalDataOps[Self <: GoalData] (val x: Self) extends AnyVal {
    
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
    def setGoalCompletionLocation(value: String): Self = this.set("goalCompletionLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoalCompletionLocation: Self = this.set("goalCompletionLocation", js.undefined)
    
    @scala.inline
    def setGoalCompletions(value: String): Self = this.set("goalCompletions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoalCompletions: Self = this.set("goalCompletions", js.undefined)
    
    @scala.inline
    def setGoalIndex(value: Double): Self = this.set("goalIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoalIndex: Self = this.set("goalIndex", js.undefined)
    
    @scala.inline
    def setGoalName(value: String): Self = this.set("goalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoalName: Self = this.set("goalName", js.undefined)
    
    @scala.inline
    def setGoalPreviousStep1(value: String): Self = this.set("goalPreviousStep1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoalPreviousStep1: Self = this.set("goalPreviousStep1", js.undefined)
    
    @scala.inline
    def setGoalPreviousStep2(value: String): Self = this.set("goalPreviousStep2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoalPreviousStep2: Self = this.set("goalPreviousStep2", js.undefined)
    
    @scala.inline
    def setGoalPreviousStep3(value: String): Self = this.set("goalPreviousStep3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoalPreviousStep3: Self = this.set("goalPreviousStep3", js.undefined)
    
    @scala.inline
    def setGoalValue(value: Double): Self = this.set("goalValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoalValue: Self = this.set("goalValue", js.undefined)
  }
}
