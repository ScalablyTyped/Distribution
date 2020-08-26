package typings.kendoUi.kendo.mobile.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BadgeChangeEvent extends BadgeEvent {
  var newValue: js.UndefOr[String | Double] = js.native
  var oldValue: js.UndefOr[String | Double] = js.native
}

object BadgeChangeEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Badge): BadgeChangeEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadgeChangeEvent]
  }
  @scala.inline
  implicit class BadgeChangeEventOps[Self <: BadgeChangeEvent] (val x: Self) extends AnyVal {
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
    def setNewValue(value: String | Double): Self = this.set("newValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewValue: Self = this.set("newValue", js.undefined)
    @scala.inline
    def setOldValue(value: String | Double): Self = this.set("oldValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldValue: Self = this.set("oldValue", js.undefined)
  }
  
}

