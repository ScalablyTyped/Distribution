package typings.jquerymobile

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectMenuEvents extends StObject {
  
  var create: js.UndefOr[JQueryMobileEvent] = js.undefined
}
object SelectMenuEvents {
  
  inline def apply(): SelectMenuEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectMenuEvents]
  }
  
  extension [Self <: SelectMenuEvents](x: Self) {
    
    inline def setCreate(value: (/* event */ Event, /* ui */ js.Any) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
  }
}
