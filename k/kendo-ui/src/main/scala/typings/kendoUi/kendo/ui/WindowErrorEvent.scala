package typings.kendoUi.kendo.ui

import typings.kendoUi.JQueryXHR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowErrorEvent
  extends StObject
     with WindowEvent {
  
  var status: js.UndefOr[String] = js.undefined
  
  var xhr: js.UndefOr[JQueryXHR] = js.undefined
}
object WindowErrorEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Window): WindowErrorEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowErrorEvent]
  }
  
  extension [Self <: WindowErrorEvent](x: Self) {
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setXhr(value: JQueryXHR): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
    
    inline def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
  }
}
