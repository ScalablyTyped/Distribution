package typings.jquerymobile

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextInputEvents extends StObject {
  
  var create: js.UndefOr[JQueryMobileEvent] = js.undefined
}
object TextInputEvents {
  
  @scala.inline
  def apply(): TextInputEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextInputEvents]
  }
  
  @scala.inline
  implicit class TextInputEventsMutableBuilder[Self <: TextInputEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: (/* event */ Event, /* ui */ js.Any) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
  }
}
