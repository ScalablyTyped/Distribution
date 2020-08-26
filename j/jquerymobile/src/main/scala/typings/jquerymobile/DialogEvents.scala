package typings.jquerymobile

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogEvents extends js.Object {
  var create: js.UndefOr[JQueryMobileEvent] = js.native
}

object DialogEvents {
  @scala.inline
  def apply(): DialogEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogEvents]
  }
  @scala.inline
  implicit class DialogEventsOps[Self <: DialogEvents] (val x: Self) extends AnyVal {
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
  }
  
}

