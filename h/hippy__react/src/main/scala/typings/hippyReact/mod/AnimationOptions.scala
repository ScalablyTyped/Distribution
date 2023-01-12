package typings.hippyReact.mod

import typings.hippyReact.hippyReactStrings.`ease-in-out`
import typings.hippyReact.hippyReactStrings.`ease-in`
import typings.hippyReact.hippyReactStrings.`ease-out`
import typings.hippyReact.hippyReactStrings.bezier
import typings.hippyReact.hippyReactStrings.deg
import typings.hippyReact.hippyReactStrings.ease
import typings.hippyReact.hippyReactStrings.in
import typings.hippyReact.hippyReactStrings.inOut
import typings.hippyReact.hippyReactStrings.linear
import typings.hippyReact.hippyReactStrings.loop
import typings.hippyReact.hippyReactStrings.out
import typings.hippyReact.hippyReactStrings.timing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationOptions extends StObject {
  
  // TODO: fill more options
  /**
    * Delay starting time
    */
  var delay: js.UndefOr[Double] = js.undefined
  
  // TODO: fill more options
  /**
    * Animation start position
    */
  var direction: js.UndefOr[AnimationDirection] = js.undefined
  
  /**
    * Animation execution time
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  var inputRange: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Timeline mode of animation
    */
  var mode: js.UndefOr[timing] = js.undefined
  
  var outputRange: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Animation repeat times, use 'loop' to be always repeating.
    */
  var repeatCount: js.UndefOr[Double | loop] = js.undefined
  
  /**
    * Initial value at `Animation` start
    */
  var startValue: js.UndefOr[AnimationValue] = js.undefined
  
  /**
    * Animation interpolation type
    */
  var timingFunction: js.UndefOr[
    linear | ease | bezier | in | `ease-in` | out | `ease-out` | inOut | `ease-in-out`
  ] = js.undefined
  
  /**
    * End value when `Animation` end.
    */
  var toValue: js.UndefOr[AnimationValue] = js.undefined
  
  /**
    * Value type, leave it blank in most case, except use rotate/color related
    * animation, set it to be 'deg' or 'color'.
    */
  var valueType: js.UndefOr[deg] = js.undefined
}
object AnimationOptions {
  
  inline def apply(): AnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnimationOptions] (val x: Self) extends AnyVal {
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDirection(value: AnimationDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setInputRange(value: js.Array[Any]): Self = StObject.set(x, "inputRange", value.asInstanceOf[js.Any])
    
    inline def setInputRangeUndefined: Self = StObject.set(x, "inputRange", js.undefined)
    
    inline def setInputRangeVarargs(value: Any*): Self = StObject.set(x, "inputRange", js.Array(value*))
    
    inline def setMode(value: timing): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOutputRange(value: js.Array[Any]): Self = StObject.set(x, "outputRange", value.asInstanceOf[js.Any])
    
    inline def setOutputRangeUndefined: Self = StObject.set(x, "outputRange", js.undefined)
    
    inline def setOutputRangeVarargs(value: Any*): Self = StObject.set(x, "outputRange", js.Array(value*))
    
    inline def setRepeatCount(value: Double | loop): Self = StObject.set(x, "repeatCount", value.asInstanceOf[js.Any])
    
    inline def setRepeatCountUndefined: Self = StObject.set(x, "repeatCount", js.undefined)
    
    inline def setStartValue(value: AnimationValue): Self = StObject.set(x, "startValue", value.asInstanceOf[js.Any])
    
    inline def setStartValueUndefined: Self = StObject.set(x, "startValue", js.undefined)
    
    inline def setTimingFunction(value: linear | ease | bezier | in | `ease-in` | out | `ease-out` | inOut | `ease-in-out`): Self = StObject.set(x, "timingFunction", value.asInstanceOf[js.Any])
    
    inline def setTimingFunctionUndefined: Self = StObject.set(x, "timingFunction", js.undefined)
    
    inline def setToValue(value: AnimationValue): Self = StObject.set(x, "toValue", value.asInstanceOf[js.Any])
    
    inline def setToValueUndefined: Self = StObject.set(x, "toValue", js.undefined)
    
    inline def setValueType(value: deg): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
    
    inline def setValueTypeUndefined: Self = StObject.set(x, "valueType", js.undefined)
  }
}
