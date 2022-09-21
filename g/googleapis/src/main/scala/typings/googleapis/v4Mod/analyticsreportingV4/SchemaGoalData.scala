package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoalData extends StObject {
  
  /**
    * URL of the page where this goal was completed.
    */
  var goalCompletionLocation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Total number of goal completions in this activity.
    */
  var goalCompletions: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This identifies the goal as configured for the profile.
    */
  var goalIndex: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Name of the goal.
    */
  var goalName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URL of the page one step prior to the goal completion.
    */
  var goalPreviousStep1: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URL of the page two steps prior to the goal completion.
    */
  var goalPreviousStep2: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URL of the page three steps prior to the goal completion.
    */
  var goalPreviousStep3: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Value in this goal.
    */
  var goalValue: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoalData {
  
  inline def apply(): SchemaGoalData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoalData]
  }
  
  extension [Self <: SchemaGoalData](x: Self) {
    
    inline def setGoalCompletionLocation(value: String): Self = StObject.set(x, "goalCompletionLocation", value.asInstanceOf[js.Any])
    
    inline def setGoalCompletionLocationNull: Self = StObject.set(x, "goalCompletionLocation", null)
    
    inline def setGoalCompletionLocationUndefined: Self = StObject.set(x, "goalCompletionLocation", js.undefined)
    
    inline def setGoalCompletions(value: String): Self = StObject.set(x, "goalCompletions", value.asInstanceOf[js.Any])
    
    inline def setGoalCompletionsNull: Self = StObject.set(x, "goalCompletions", null)
    
    inline def setGoalCompletionsUndefined: Self = StObject.set(x, "goalCompletions", js.undefined)
    
    inline def setGoalIndex(value: Double): Self = StObject.set(x, "goalIndex", value.asInstanceOf[js.Any])
    
    inline def setGoalIndexNull: Self = StObject.set(x, "goalIndex", null)
    
    inline def setGoalIndexUndefined: Self = StObject.set(x, "goalIndex", js.undefined)
    
    inline def setGoalName(value: String): Self = StObject.set(x, "goalName", value.asInstanceOf[js.Any])
    
    inline def setGoalNameNull: Self = StObject.set(x, "goalName", null)
    
    inline def setGoalNameUndefined: Self = StObject.set(x, "goalName", js.undefined)
    
    inline def setGoalPreviousStep1(value: String): Self = StObject.set(x, "goalPreviousStep1", value.asInstanceOf[js.Any])
    
    inline def setGoalPreviousStep1Null: Self = StObject.set(x, "goalPreviousStep1", null)
    
    inline def setGoalPreviousStep1Undefined: Self = StObject.set(x, "goalPreviousStep1", js.undefined)
    
    inline def setGoalPreviousStep2(value: String): Self = StObject.set(x, "goalPreviousStep2", value.asInstanceOf[js.Any])
    
    inline def setGoalPreviousStep2Null: Self = StObject.set(x, "goalPreviousStep2", null)
    
    inline def setGoalPreviousStep2Undefined: Self = StObject.set(x, "goalPreviousStep2", js.undefined)
    
    inline def setGoalPreviousStep3(value: String): Self = StObject.set(x, "goalPreviousStep3", value.asInstanceOf[js.Any])
    
    inline def setGoalPreviousStep3Null: Self = StObject.set(x, "goalPreviousStep3", null)
    
    inline def setGoalPreviousStep3Undefined: Self = StObject.set(x, "goalPreviousStep3", js.undefined)
    
    inline def setGoalValue(value: Double): Self = StObject.set(x, "goalValue", value.asInstanceOf[js.Any])
    
    inline def setGoalValueNull: Self = StObject.set(x, "goalValue", null)
    
    inline def setGoalValueUndefined: Self = StObject.set(x, "goalValue", js.undefined)
  }
}
