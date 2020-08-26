package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuEvents extends js.Object {
  var blur: js.UndefOr[MenuEvent] = js.native
  var create: js.UndefOr[MenuEvent] = js.native
  var focus: js.UndefOr[MenuEvent] = js.native
  var select: js.UndefOr[MenuEvent] = js.native
}

object MenuEvents {
  @scala.inline
  def apply(): MenuEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuEvents]
  }
  @scala.inline
  implicit class MenuEventsOps[Self <: MenuEvents] (val x: Self) extends AnyVal {
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
    def setBlur(value: (/* event */ JQueryEventObject, /* ui */ MenuUIParams) => Unit): Self = this.set("blur", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBlur: Self = this.set("blur", js.undefined)
    @scala.inline
    def setCreate(value: (/* event */ JQueryEventObject, /* ui */ MenuUIParams) => Unit): Self = this.set("create", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    @scala.inline
    def setFocus(value: (/* event */ JQueryEventObject, /* ui */ MenuUIParams) => Unit): Self = this.set("focus", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    @scala.inline
    def setSelect(value: (/* event */ JQueryEventObject, /* ui */ MenuUIParams) => Unit): Self = this.set("select", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
  }
  
}

