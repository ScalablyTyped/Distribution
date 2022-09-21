package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StepperOption extends StObject {
  
  var direction: js.UndefOr[Double] = js.undefined
  
  var pins: Any
  
  var rpm: js.UndefOr[Double] = js.undefined
  
  var stepsPerRev: Double
  
  var `type`: Double
}
object StepperOption {
  
  inline def apply(pins: Any, stepsPerRev: Double, `type`: Double): StepperOption = {
    val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any], stepsPerRev = stepsPerRev.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepperOption]
  }
  
  extension [Self <: StepperOption](x: Self) {
    
    inline def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setPins(value: Any): Self = StObject.set(x, "pins", value.asInstanceOf[js.Any])
    
    inline def setRpm(value: Double): Self = StObject.set(x, "rpm", value.asInstanceOf[js.Any])
    
    inline def setRpmUndefined: Self = StObject.set(x, "rpm", js.undefined)
    
    inline def setStepsPerRev(value: Double): Self = StObject.set(x, "stepsPerRev", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
