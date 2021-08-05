package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details when multiple steps are run with the same configuration as a group.
  */
trait SchemaMultiStep extends StObject {
  
  /**
    * Unique int given to each step. Ranges from 0(inclusive) to total number
    * of steps(exclusive). The primary step is 0.
    */
  var multistepNumber: js.UndefOr[Double] = js.undefined
  
  /**
    * Present if it is a primary (original) step.
    */
  var primaryStep: js.UndefOr[SchemaPrimaryStep] = js.undefined
  
  /**
    * Step Id of the primary (original) step, which might be this step.
    */
  var primaryStepId: js.UndefOr[String] = js.undefined
}
object SchemaMultiStep {
  
  inline def apply(): SchemaMultiStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMultiStep]
  }
  
  extension [Self <: SchemaMultiStep](x: Self) {
    
    inline def setMultistepNumber(value: Double): Self = StObject.set(x, "multistepNumber", value.asInstanceOf[js.Any])
    
    inline def setMultistepNumberUndefined: Self = StObject.set(x, "multistepNumber", js.undefined)
    
    inline def setPrimaryStep(value: SchemaPrimaryStep): Self = StObject.set(x, "primaryStep", value.asInstanceOf[js.Any])
    
    inline def setPrimaryStepId(value: String): Self = StObject.set(x, "primaryStepId", value.asInstanceOf[js.Any])
    
    inline def setPrimaryStepIdUndefined: Self = StObject.set(x, "primaryStepId", js.undefined)
    
    inline def setPrimaryStepUndefined: Self = StObject.set(x, "primaryStep", js.undefined)
  }
}
