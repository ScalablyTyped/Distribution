package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoalSetData extends StObject {
  
  /** All the goals that were reached in the current activity. */
  var goals: js.UndefOr[js.Array[GoalData]] = js.undefined
}
object GoalSetData {
  
  inline def apply(): GoalSetData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoalSetData]
  }
  
  extension [Self <: GoalSetData](x: Self) {
    
    inline def setGoals(value: js.Array[GoalData]): Self = StObject.set(x, "goals", value.asInstanceOf[js.Any])
    
    inline def setGoalsUndefined: Self = StObject.set(x, "goals", js.undefined)
    
    inline def setGoalsVarargs(value: GoalData*): Self = StObject.set(x, "goals", js.Array(value*))
  }
}
