package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DroppableEvents extends js.Object {
  var activate: js.UndefOr[DroppableEvent] = js.native
  var create: js.UndefOr[DroppableEvent] = js.native
  var deactivate: js.UndefOr[DroppableEvent] = js.native
  var drop: js.UndefOr[DroppableEvent] = js.native
  var out: js.UndefOr[DroppableEvent] = js.native
  var over: js.UndefOr[DroppableEvent] = js.native
}

object DroppableEvents {
  @scala.inline
  def apply(): DroppableEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DroppableEvents]
  }
  @scala.inline
  implicit class DroppableEventsOps[Self <: DroppableEvents] (val x: Self) extends AnyVal {
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
    def setActivate(value: (/* event */ JQueryEventObject, /* ui */ DroppableEventUIParam) => Unit): Self = this.set("activate", js.Any.fromFunction2(value))
    @scala.inline
    def deleteActivate: Self = this.set("activate", js.undefined)
    @scala.inline
    def setCreate(value: (/* event */ JQueryEventObject, /* ui */ DroppableEventUIParam) => Unit): Self = this.set("create", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    @scala.inline
    def setDeactivate(value: (/* event */ JQueryEventObject, /* ui */ DroppableEventUIParam) => Unit): Self = this.set("deactivate", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDeactivate: Self = this.set("deactivate", js.undefined)
    @scala.inline
    def setDrop(value: (/* event */ JQueryEventObject, /* ui */ DroppableEventUIParam) => Unit): Self = this.set("drop", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDrop: Self = this.set("drop", js.undefined)
    @scala.inline
    def setOut(value: (/* event */ JQueryEventObject, /* ui */ DroppableEventUIParam) => Unit): Self = this.set("out", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOut: Self = this.set("out", js.undefined)
    @scala.inline
    def setOver(value: (/* event */ JQueryEventObject, /* ui */ DroppableEventUIParam) => Unit): Self = this.set("over", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOver: Self = this.set("over", js.undefined)
  }
  
}

