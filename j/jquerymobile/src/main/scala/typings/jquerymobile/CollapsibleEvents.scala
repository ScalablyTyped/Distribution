package typings.jquerymobile

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollapsibleEvents extends StObject {
  
  var collapse: js.UndefOr[JQueryMobileEvent] = js.undefined
  
  var create: js.UndefOr[JQueryMobileEvent] = js.undefined
  
  var expand: js.UndefOr[JQueryMobileEvent] = js.undefined
}
object CollapsibleEvents {
  
  inline def apply(): CollapsibleEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollapsibleEvents]
  }
  
  extension [Self <: CollapsibleEvents](x: Self) {
    
    inline def setCollapse(value: (/* event */ Event, /* ui */ js.Any) => Unit): Self = StObject.set(x, "collapse", js.Any.fromFunction2(value))
    
    inline def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
    
    inline def setCreate(value: (/* event */ Event, /* ui */ js.Any) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    inline def setExpand(value: (/* event */ Event, /* ui */ js.Any) => Unit): Self = StObject.set(x, "expand", js.Any.fromFunction2(value))
    
    inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
  }
}
