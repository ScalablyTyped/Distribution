package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Effects //////////////////////////////////////////////////
@js.native
trait EffectOptions extends StObject {
  
  var complete: js.Function = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var easing: js.UndefOr[String] = js.native
  
  var effect: String = js.native
}
object EffectOptions {
  
  @scala.inline
  def apply(complete: js.Function, effect: String): EffectOptions = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any])
    __obj.asInstanceOf[EffectOptions]
  }
  
  @scala.inline
  implicit class EffectOptionsMutableBuilder[Self <: EffectOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: js.Function): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    @scala.inline
    def setEffect(value: String): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
  }
}
