package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropTargetAreaOptions extends js.Object {
  var dragenter: js.UndefOr[js.Function1[/* e */ DropTargetAreaDragenterEvent, Unit]] = js.native
  var dragleave: js.UndefOr[js.Function1[/* e */ DropTargetAreaDragleaveEvent, Unit]] = js.native
  var drop: js.UndefOr[js.Function1[/* e */ DropTargetAreaDropEvent, Unit]] = js.native
  var filter: js.UndefOr[String] = js.native
  var group: js.UndefOr[String] = js.native
}

object DropTargetAreaOptions {
  @scala.inline
  def apply(): DropTargetAreaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropTargetAreaOptions]
  }
  @scala.inline
  implicit class DropTargetAreaOptionsOps[Self <: DropTargetAreaOptions] (val x: Self) extends AnyVal {
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
    def setDragenter(value: /* e */ DropTargetAreaDragenterEvent => Unit): Self = this.set("dragenter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDragenter: Self = this.set("dragenter", js.undefined)
    @scala.inline
    def setDragleave(value: /* e */ DropTargetAreaDragleaveEvent => Unit): Self = this.set("dragleave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDragleave: Self = this.set("dragleave", js.undefined)
    @scala.inline
    def setDrop(value: /* e */ DropTargetAreaDropEvent => Unit): Self = this.set("drop", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDrop: Self = this.set("drop", js.undefined)
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
  }
  
}

