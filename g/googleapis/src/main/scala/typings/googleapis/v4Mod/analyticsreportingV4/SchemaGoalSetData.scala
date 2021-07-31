package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a set of goals that were reached in an activity.
  */
trait SchemaGoalSetData extends StObject {
  
  /**
    * All the goals that were reached in the current activity.
    */
  var goals: js.UndefOr[js.Array[SchemaGoalData]] = js.undefined
}
object SchemaGoalSetData {
  
  @scala.inline
  def apply(): SchemaGoalSetData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoalSetData]
  }
  
  @scala.inline
  implicit class SchemaGoalSetDataMutableBuilder[Self <: SchemaGoalSetData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGoals(value: js.Array[SchemaGoalData]): Self = StObject.set(x, "goals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoalsUndefined: Self = StObject.set(x, "goals", js.undefined)
    
    @scala.inline
    def setGoalsVarargs(value: SchemaGoalData*): Self = StObject.set(x, "goals", js.Array(value :_*))
  }
}
