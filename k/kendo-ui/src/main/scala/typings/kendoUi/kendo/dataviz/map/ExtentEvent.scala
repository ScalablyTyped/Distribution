package typings.kendoUi.kendo.dataviz.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtentEvent extends StObject {
  
  def isDefaultPrevented(): Boolean
  
  var preventDefault: js.Function
  
  var sender: Extent
}
object ExtentEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Extent): ExtentEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtentEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtentEvent] (val x: Self) extends AnyVal {
    
    inline def setIsDefaultPrevented(value: () => Boolean): Self = StObject.set(x, "isDefaultPrevented", js.Any.fromFunction0(value))
    
    inline def setPreventDefault(value: js.Function): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Extent): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
