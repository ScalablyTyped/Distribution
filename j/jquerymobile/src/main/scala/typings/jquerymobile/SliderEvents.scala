package typings.jquerymobile

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliderEvents extends StObject {
  
  var create: js.UndefOr[JQueryMobileEvent] = js.native
  
  var slidestart: js.UndefOr[JQueryMobileEvent] = js.native
  
  var slidestop: js.UndefOr[JQueryMobileEvent] = js.native
}
object SliderEvents {
  
  @scala.inline
  def apply(): SliderEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderEvents]
  }
  
  @scala.inline
  implicit class SliderEventsMutableBuilder[Self <: SliderEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: (/* event */ Event, /* ui */ js.Any) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    @scala.inline
    def setSlidestart(value: (/* event */ Event, /* ui */ js.Any) => Unit): Self = StObject.set(x, "slidestart", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSlidestartUndefined: Self = StObject.set(x, "slidestart", js.undefined)
    
    @scala.inline
    def setSlidestop(value: (/* event */ Event, /* ui */ js.Any) => Unit): Self = StObject.set(x, "slidestop", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSlidestopUndefined: Self = StObject.set(x, "slidestop", js.undefined)
  }
}
