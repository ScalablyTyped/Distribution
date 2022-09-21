package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIndividualOutcome extends StObject {
  
  /**
    * Unique int given to each step. Ranges from 0(inclusive) to total number of steps(exclusive). The primary step is 0.
    */
  var multistepNumber: js.UndefOr[Double | Null] = js.undefined
  
  var outcomeSummary: js.UndefOr[String | Null] = js.undefined
  
  /**
    * How long it took for this step to run.
    */
  var runDuration: js.UndefOr[SchemaDuration] = js.undefined
  
  var stepId: js.UndefOr[String | Null] = js.undefined
}
object SchemaIndividualOutcome {
  
  inline def apply(): SchemaIndividualOutcome = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIndividualOutcome]
  }
  
  extension [Self <: SchemaIndividualOutcome](x: Self) {
    
    inline def setMultistepNumber(value: Double): Self = StObject.set(x, "multistepNumber", value.asInstanceOf[js.Any])
    
    inline def setMultistepNumberNull: Self = StObject.set(x, "multistepNumber", null)
    
    inline def setMultistepNumberUndefined: Self = StObject.set(x, "multistepNumber", js.undefined)
    
    inline def setOutcomeSummary(value: String): Self = StObject.set(x, "outcomeSummary", value.asInstanceOf[js.Any])
    
    inline def setOutcomeSummaryNull: Self = StObject.set(x, "outcomeSummary", null)
    
    inline def setOutcomeSummaryUndefined: Self = StObject.set(x, "outcomeSummary", js.undefined)
    
    inline def setRunDuration(value: SchemaDuration): Self = StObject.set(x, "runDuration", value.asInstanceOf[js.Any])
    
    inline def setRunDurationUndefined: Self = StObject.set(x, "runDuration", js.undefined)
    
    inline def setStepId(value: String): Self = StObject.set(x, "stepId", value.asInstanceOf[js.Any])
    
    inline def setStepIdNull: Self = StObject.set(x, "stepId", null)
    
    inline def setStepIdUndefined: Self = StObject.set(x, "stepId", js.undefined)
  }
}
