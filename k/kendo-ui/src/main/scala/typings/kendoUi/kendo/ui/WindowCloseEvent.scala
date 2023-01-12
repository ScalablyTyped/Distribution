package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowCloseEvent
  extends StObject
     with WindowEvent {
  
  var userTriggered: js.UndefOr[Boolean] = js.undefined
}
object WindowCloseEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Window): WindowCloseEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowCloseEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WindowCloseEvent] (val x: Self) extends AnyVal {
    
    inline def setUserTriggered(value: Boolean): Self = StObject.set(x, "userTriggered", value.asInstanceOf[js.Any])
    
    inline def setUserTriggeredUndefined: Self = StObject.set(x, "userTriggered", js.undefined)
  }
}
