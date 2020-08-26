package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.TreeListModel
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeListDropEvent extends TreeListEvent {
  var destination: js.UndefOr[TreeListModel] = js.native
  var dropTarget: js.UndefOr[Element] = js.native
  var setValid: js.UndefOr[Boolean] = js.native
  var source: js.UndefOr[TreeListModel] = js.native
  var valid: js.UndefOr[Boolean] = js.native
}

object TreeListDropEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: TreeList): TreeListDropEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeListDropEvent]
  }
  @scala.inline
  implicit class TreeListDropEventOps[Self <: TreeListDropEvent] (val x: Self) extends AnyVal {
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
    def setDestination(value: TreeListModel): Self = this.set("destination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    @scala.inline
    def setDropTarget(value: Element): Self = this.set("dropTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropTarget: Self = this.set("dropTarget", js.undefined)
    @scala.inline
    def setSetValid(value: Boolean): Self = this.set("setValid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetValid: Self = this.set("setValid", js.undefined)
    @scala.inline
    def setSource(value: TreeListModel): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setValid(value: Boolean): Self = this.set("valid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValid: Self = this.set("valid", js.undefined)
  }
  
}

