package typings.mapboxGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transition extends StObject {
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
}
object Transition {
  
  @scala.inline
  def apply(): Transition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Transition]
  }
  
  @scala.inline
  implicit class TransitionMutableBuilder[Self <: Transition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
  }
}
