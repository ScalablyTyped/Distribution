package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoalSetData extends StObject {
  
  /**
    * All the goals that were reached in the current activity.
    */
  var goals: js.UndefOr[js.Array[SchemaGoalData]] = js.undefined
}
object SchemaGoalSetData {
  
  inline def apply(): SchemaGoalSetData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoalSetData]
  }
  
  extension [Self <: SchemaGoalSetData](x: Self) {
    
    inline def setGoals(value: js.Array[SchemaGoalData]): Self = StObject.set(x, "goals", value.asInstanceOf[js.Any])
    
    inline def setGoalsUndefined: Self = StObject.set(x, "goals", js.undefined)
    
    inline def setGoalsVarargs(value: SchemaGoalData*): Self = StObject.set(x, "goals", js.Array(value*))
  }
}
