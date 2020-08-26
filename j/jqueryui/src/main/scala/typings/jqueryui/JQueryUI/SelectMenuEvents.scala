package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectMenuEvents extends js.Object {
  var change: js.UndefOr[SelectMenuEvent] = js.native
  var close: js.UndefOr[SelectMenuEvent] = js.native
  var create: js.UndefOr[SelectMenuEvent] = js.native
  var focus: js.UndefOr[SelectMenuEvent] = js.native
  var open: js.UndefOr[SelectMenuEvent] = js.native
  var select: js.UndefOr[SelectMenuEvent] = js.native
}

object SelectMenuEvents {
  @scala.inline
  def apply(): SelectMenuEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectMenuEvents]
  }
  @scala.inline
  implicit class SelectMenuEventsOps[Self <: SelectMenuEvents] (val x: Self) extends AnyVal {
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
    def setChange(value: (/* event */ JQueryEventObject, /* ui */ SelectMenuUIParams) => Unit): Self = this.set("change", js.Any.fromFunction2(value))
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    @scala.inline
    def setClose(value: (/* event */ JQueryEventObject, /* ui */ SelectMenuUIParams) => Unit): Self = this.set("close", js.Any.fromFunction2(value))
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    @scala.inline
    def setCreate(value: (/* event */ JQueryEventObject, /* ui */ SelectMenuUIParams) => Unit): Self = this.set("create", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    @scala.inline
    def setFocus(value: (/* event */ JQueryEventObject, /* ui */ SelectMenuUIParams) => Unit): Self = this.set("focus", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    @scala.inline
    def setOpen(value: (/* event */ JQueryEventObject, /* ui */ SelectMenuUIParams) => Unit): Self = this.set("open", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setSelect(value: (/* event */ JQueryEventObject, /* ui */ SelectMenuUIParams) => Unit): Self = this.set("select", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
  }
  
}

