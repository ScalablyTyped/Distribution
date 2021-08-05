package typings.jquerymobile

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollapsibleSetEvents extends StObject {
  
  var create: js.UndefOr[JQueryMobileEvent] = js.undefined
}
object CollapsibleSetEvents {
  
  inline def apply(): CollapsibleSetEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollapsibleSetEvents]
  }
  
  extension [Self <: CollapsibleSetEvents](x: Self) {
    
    inline def setCreate(value: (/* event */ Event, /* ui */ js.Any) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
  }
}
