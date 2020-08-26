package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogEvents extends js.Object {
  var beforeClose: js.UndefOr[DialogEvent] = js.native
  var close: js.UndefOr[DialogEvent] = js.native
  var create: js.UndefOr[DialogEvent] = js.native
  var drag: js.UndefOr[DialogEvent] = js.native
  var dragStart: js.UndefOr[DialogEvent] = js.native
  var dragStop: js.UndefOr[DialogEvent] = js.native
  var focus: js.UndefOr[DialogEvent] = js.native
  var open: js.UndefOr[DialogEvent] = js.native
  var resize: js.UndefOr[DialogEvent] = js.native
  var resizeStart: js.UndefOr[DialogEvent] = js.native
  var resizeStop: js.UndefOr[DialogEvent] = js.native
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
    def setBeforeClose(value: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Unit): Self = this.set("beforeClose", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBeforeClose: Self = this.set("beforeClose", js.undefined)
    @scala.inline
    def setClose(value: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Unit): Self = this.set("close", js.Any.fromFunction2(value))
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    @scala.inline
    def setCreate(value: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Unit): Self = this.set("create", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    @scala.inline
    def setDrag(value: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Unit): Self = this.set("drag", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDrag: Self = this.set("drag", js.undefined)
    @scala.inline
    def setDragStart(value: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Unit): Self = this.set("dragStart", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDragStart: Self = this.set("dragStart", js.undefined)
    @scala.inline
    def setDragStop(value: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Unit): Self = this.set("dragStop", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDragStop: Self = this.set("dragStop", js.undefined)
    @scala.inline
    def setFocus(value: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Unit): Self = this.set("focus", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    @scala.inline
    def setOpen(value: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Unit): Self = this.set("open", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setResize(value: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Unit): Self = this.set("resize", js.Any.fromFunction2(value))
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    @scala.inline
    def setResizeStart(value: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Unit): Self = this.set("resizeStart", js.Any.fromFunction2(value))
    @scala.inline
    def deleteResizeStart: Self = this.set("resizeStart", js.undefined)
    @scala.inline
    def setResizeStop(value: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Unit): Self = this.set("resizeStop", js.Any.fromFunction2(value))
    @scala.inline
    def deleteResizeStop: Self = this.set("resizeStop", js.undefined)
  }
  
}

