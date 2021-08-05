package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StepperSelectEvent
  extends StObject
     with StepperActivateEvent {
  
  def isDefaultPrevented(): Boolean
  
  var preventDefault: js.Function
}
object StepperSelectEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function): StepperSelectEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepperSelectEvent]
  }
  
  extension [Self <: StepperSelectEvent](x: Self) {
    
    inline def setIsDefaultPrevented(value: () => Boolean): Self = StObject.set(x, "isDefaultPrevented", js.Any.fromFunction0(value))
    
    inline def setPreventDefault(value: js.Function): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
  }
}
