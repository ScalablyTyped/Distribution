package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Effects //////////////////////////////////////////////////
trait EffectOptions extends StObject {
  
  var complete: js.Function
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var easing: js.UndefOr[String] = js.undefined
  
  var effect: String
}
object EffectOptions {
  
  inline def apply(complete: js.Function, effect: String): EffectOptions = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any])
    __obj.asInstanceOf[EffectOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EffectOptions] (val x: Self) extends AnyVal {
    
    inline def setComplete(value: js.Function): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setEffect(value: String): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
  }
}
