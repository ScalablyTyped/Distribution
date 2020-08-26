package typings.jquerymobile

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopupEvents extends js.Object {
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
  implicit class PopupEventsOps[Self <: PopupEvents] (val x: Self) extends AnyVal {
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
    def setPopupafterclose(value: (/* event */ Event, /* ui */ js.Any) => Unit): Self = this.set("popupafterclose", js.Any.fromFunction2(value))
    @scala.inline
    def deletePopupafterclose: Self = this.set("popupafterclose", js.undefined)
    @scala.inline
    def setPopupafteropen(value: (/* event */ Event, /* ui */ js.Any) => Unit): Self = this.set("popupafteropen", js.Any.fromFunction2(value))
    @scala.inline
    def deletePopupafteropen: Self = this.set("popupafteropen", js.undefined)
    @scala.inline
    def setPopupbeforeposition(value: (/* event */ Event, /* ui */ js.Any) => Unit): Self = this.set("popupbeforeposition", js.Any.fromFunction2(value))
    @scala.inline
    def deletePopupbeforeposition: Self = this.set("popupbeforeposition", js.undefined)
  }
  
}

