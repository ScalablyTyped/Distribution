package typings.jquerymobile

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollapsibleEvents extends StObject {
  
  var collapse: js.UndefOr[JQueryMobileEvent] = js.native
  
  var create: js.UndefOr[JQueryMobileEvent] = js.native
  
  var expand: js.UndefOr[JQueryMobileEvent] = js.native
}
object CollapsibleEvents {
  
  @scala.inline
  def apply(): CollapsibleEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollapsibleEvents]
  }
  
  @scala.inline
  implicit class CollapsibleEventsMutableBuilder[Self <: CollapsibleEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollapse(value: (/* event */ Event, /* ui */ js.Any) => Unit): Self = StObject.set(x, "collapse", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
    
    @scala.inline
    def setCreate(value: (/* event */ Event, /* ui */ js.Any) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    @scala.inline
    def setExpand(value: (/* event */ Event, /* ui */ js.Any) => Unit): Self = StObject.set(x, "expand", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
  }
}
