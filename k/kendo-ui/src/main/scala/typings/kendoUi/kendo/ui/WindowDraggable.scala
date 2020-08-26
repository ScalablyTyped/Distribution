package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowDraggable extends js.Object {
  var axis: js.UndefOr[String] = js.native
  var containment: js.UndefOr[js.Any | String] = js.native
  var dragHandle: js.UndefOr[js.Any | String] = js.native
}

object WindowDraggable {
  @scala.inline
  def apply(): WindowDraggable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowDraggable]
  }
  @scala.inline
  implicit class WindowDraggableOps[Self <: WindowDraggable] (val x: Self) extends AnyVal {
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
    def setAxis(value: String): Self = this.set("axis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    @scala.inline
    def setContainment(value: js.Any | String): Self = this.set("containment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainment: Self = this.set("containment", js.undefined)
    @scala.inline
    def setDragHandle(value: js.Any | String): Self = this.set("dragHandle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragHandle: Self = this.set("dragHandle", js.undefined)
  }
  
}

