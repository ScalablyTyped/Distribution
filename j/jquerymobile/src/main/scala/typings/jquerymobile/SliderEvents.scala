package typings.jquerymobile

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliderEvents extends js.Object {
  
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
  implicit class SliderEventsOps[Self <: SliderEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreate(value: (/* event */ Event, /* ui */ js.Any) => Unit): Self = this.set("create", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    
    @scala.inline
    def setSlidestart(value: (/* event */ Event, /* ui */ js.Any) => Unit): Self = this.set("slidestart", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSlidestart: Self = this.set("slidestart", js.undefined)
    
    @scala.inline
    def setSlidestop(value: (/* event */ Event, /* ui */ js.Any) => Unit): Self = this.set("slidestop", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSlidestop: Self = this.set("slidestop", js.undefined)
  }
}
