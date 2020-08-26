package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBoxDragEvent extends ListBoxEvent {
  var dataItems: js.UndefOr[js.Any] = js.native
  var draggableEvent: js.UndefOr[js.Any] = js.native
  var items: js.UndefOr[JQuery] = js.native
}

object ListBoxDragEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: ListBox): ListBoxDragEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBoxDragEvent]
  }
  @scala.inline
  implicit class ListBoxDragEventOps[Self <: ListBoxDragEvent] (val x: Self) extends AnyVal {
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
    def setDataItems(value: js.Any): Self = this.set("dataItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataItems: Self = this.set("dataItems", js.undefined)
    @scala.inline
    def setDraggableEvent(value: js.Any): Self = this.set("draggableEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggableEvent: Self = this.set("draggableEvent", js.undefined)
    @scala.inline
    def setItems(value: JQuery): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
  
}

