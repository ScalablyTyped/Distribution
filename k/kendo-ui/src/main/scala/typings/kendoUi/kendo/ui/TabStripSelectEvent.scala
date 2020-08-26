package typings.kendoUi.kendo.ui

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabStripSelectEvent extends TabStripEvent {
  var contentElement: js.UndefOr[Element] = js.native
  var item: js.UndefOr[Element] = js.native
}

object TabStripSelectEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: TabStrip): TabStripSelectEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabStripSelectEvent]
  }
  @scala.inline
  implicit class TabStripSelectEventOps[Self <: TabStripSelectEvent] (val x: Self) extends AnyVal {
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
    def setContentElement(value: Element): Self = this.set("contentElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentElement: Self = this.set("contentElement", js.undefined)
    @scala.inline
    def setItem(value: Element): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
  }
  
}

