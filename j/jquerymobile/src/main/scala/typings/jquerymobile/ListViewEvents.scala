package typings.jquerymobile

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListViewEvents extends StObject {
  
  var create: js.UndefOr[JQueryMobileEvent] = js.undefined
}
object ListViewEvents {
  
  inline def apply(): ListViewEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListViewEvents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListViewEvents] (val x: Self) extends AnyVal {
    
    inline def setCreate(value: (/* event */ Event, /* ui */ Any) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
  }
}
