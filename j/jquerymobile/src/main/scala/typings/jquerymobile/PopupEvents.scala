package typings.jquerymobile

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopupEvents extends StObject {
  
  var popupafterclose: js.UndefOr[JQueryMobileEvent] = js.native
  
  var popupafteropen: js.UndefOr[JQueryMobileEvent] = js.native
  
  var popupbeforeposition: js.UndefOr[JQueryMobileEvent] = js.native
}
object PopupEvents {
  
  @scala.inline
  def apply(): PopupEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopupEvents]
  }
  
  @scala.inline
  implicit class PopupEventsMutableBuilder[Self <: PopupEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPopupafterclose(value: (/* event */ Event, /* ui */ js.Any) => Unit): Self = StObject.set(x, "popupafterclose", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPopupaftercloseUndefined: Self = StObject.set(x, "popupafterclose", js.undefined)
    
    @scala.inline
    def setPopupafteropen(value: (/* event */ Event, /* ui */ js.Any) => Unit): Self = StObject.set(x, "popupafteropen", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPopupafteropenUndefined: Self = StObject.set(x, "popupafteropen", js.undefined)
    
    @scala.inline
    def setPopupbeforeposition(value: (/* event */ Event, /* ui */ js.Any) => Unit): Self = StObject.set(x, "popupbeforeposition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPopupbeforepositionUndefined: Self = StObject.set(x, "popupbeforeposition", js.undefined)
  }
}
