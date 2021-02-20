package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationOptionsObject extends StObject {
  
  /**
    * A callback function to exectute when the animation finishes.
    */
  var complete: js.UndefOr[js.Function] = js.native
  
  /**
    * The animation defer in milliseconds.
    */
  var defer: js.UndefOr[Double] = js.native
  
  /**
    * The animation duration in milliseconds.
    */
  var duration: js.UndefOr[Double] = js.native
  
  /**
    * The name of an easing function as defined on the `Math` object.
    */
  var easing: js.UndefOr[String | js.Function] = js.native
  
  /**
    * A callback function to execute on each step of each attribute or CSS
    * property that's being animated. The first argument contains information
    * about the animation and progress.
    */
  var step: js.UndefOr[js.Function] = js.native
}
object AnimationOptionsObject {
  
  @scala.inline
  def apply(): AnimationOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationOptionsObject]
  }
  
  @scala.inline
  implicit class AnimationOptionsObjectMutableBuilder[Self <: AnimationOptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: js.Function): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setEasing(value: String | js.Function): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    @scala.inline
    def setStep(value: js.Function): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
