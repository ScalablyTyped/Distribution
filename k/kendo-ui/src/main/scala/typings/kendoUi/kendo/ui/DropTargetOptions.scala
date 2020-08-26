package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropTargetOptions extends js.Object {
  var dragenter: js.UndefOr[js.Function1[/* e */ DropTargetDragenterEvent, Unit]] = js.native
  var dragleave: js.UndefOr[js.Function1[/* e */ DropTargetDragleaveEvent, Unit]] = js.native
  var drop: js.UndefOr[js.Function1[/* e */ DropTargetDropEvent, Unit]] = js.native
  var group: js.UndefOr[String] = js.native
}

object DropTargetOptions {
  @scala.inline
  def apply(): DropTargetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropTargetOptions]
  }
  @scala.inline
  implicit class DropTargetOptionsOps[Self <: DropTargetOptions] (val x: Self) extends AnyVal {
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
    def setDragenter(value: /* e */ DropTargetDragenterEvent => Unit): Self = this.set("dragenter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDragenter: Self = this.set("dragenter", js.undefined)
    @scala.inline
    def setDragleave(value: /* e */ DropTargetDragleaveEvent => Unit): Self = this.set("dragleave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDragleave: Self = this.set("dragleave", js.undefined)
    @scala.inline
    def setDrop(value: /* e */ DropTargetDropEvent => Unit): Self = this.set("drop", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDrop: Self = this.set("drop", js.undefined)
    @scala.inline
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
  }
  
}

