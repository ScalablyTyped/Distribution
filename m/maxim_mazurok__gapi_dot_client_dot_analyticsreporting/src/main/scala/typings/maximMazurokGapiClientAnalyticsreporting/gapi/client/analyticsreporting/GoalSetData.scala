package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoalSetData extends StObject {
  
  /** All the goals that were reached in the current activity. */
  var goals: js.UndefOr[js.Array[GoalData]] = js.undefined
}
object GoalSetData {
  
  @scala.inline
  def apply(): GoalSetData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoalSetData]
  }
  
  @scala.inline
  implicit class GoalSetDataMutableBuilder[Self <: GoalSetData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGoals(value: js.Array[GoalData]): Self = StObject.set(x, "goals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoalsUndefined: Self = StObject.set(x, "goals", js.undefined)
    
    @scala.inline
    def setGoalsVarargs(value: GoalData*): Self = StObject.set(x, "goals", js.Array(value :_*))
  }
}
