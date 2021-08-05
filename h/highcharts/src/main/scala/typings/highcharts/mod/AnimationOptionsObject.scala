package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationOptionsObject extends StObject {
  
  /**
    * A callback function to exectute when the animation finishes.
    */
  var complete: js.UndefOr[js.Function] = js.undefined
  
  /**
    * The animation defer in milliseconds.
    */
  var defer: js.UndefOr[Double] = js.undefined
  
  /**
    * The animation duration in milliseconds.
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * The name of an easing function as defined on the `Math` object.
    */
  var easing: js.UndefOr[String | js.Function] = js.undefined
  
  /**
    * A callback function to execute on each step of each attribute or CSS
    * property that's being animated. The first argument contains information
    * about the animation and progress.
    */
  var step: js.UndefOr[js.Function] = js.undefined
}
object AnimationOptionsObject {
  
  inline def apply(): AnimationOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationOptionsObject]
  }
  
  extension [Self <: AnimationOptionsObject](x: Self) {
    
    inline def setComplete(value: js.Function): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    inline def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEasing(value: String | js.Function): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setStep(value: js.Function): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
