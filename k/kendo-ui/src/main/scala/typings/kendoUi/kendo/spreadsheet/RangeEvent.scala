package typings.kendoUi.kendo.spreadsheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangeEvent extends StObject {
  
  def isDefaultPrevented(): Boolean
  
  var preventDefault: js.Function
  
  var sender: Range
}
object RangeEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Range): RangeEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RangeEvent] (val x: Self) extends AnyVal {
    
    inline def setIsDefaultPrevented(value: () => Boolean): Self = StObject.set(x, "isDefaultPrevented", js.Any.fromFunction0(value))
    
    inline def setPreventDefault(value: js.Function): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Range): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
