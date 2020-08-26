package typings.jquerymobile

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollapsibleEvents extends js.Object {
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
  implicit class CollapsibleEventsOps[Self <: CollapsibleEvents] (val x: Self) extends AnyVal {
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
    def setCollapse(value: (/* event */ Event, /* ui */ js.Any) => Unit): Self = this.set("collapse", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCollapse: Self = this.set("collapse", js.undefined)
    @scala.inline
    def setCreate(value: (/* event */ Event, /* ui */ js.Any) => Unit): Self = this.set("create", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    @scala.inline
    def setExpand(value: (/* event */ Event, /* ui */ js.Any) => Unit): Self = this.set("expand", js.Any.fromFunction2(value))
    @scala.inline
    def deleteExpand: Self = this.set("expand", js.undefined)
  }
  
}

