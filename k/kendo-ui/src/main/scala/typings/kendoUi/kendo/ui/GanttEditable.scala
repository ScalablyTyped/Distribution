package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GanttEditable extends js.Object {
  var confirmation: js.UndefOr[Boolean] = js.native
  var create: js.UndefOr[Boolean] = js.native
  var dependencyCreate: js.UndefOr[Boolean] = js.native
  var dependencyDestroy: js.UndefOr[Boolean] = js.native
  var destroy: js.UndefOr[Boolean] = js.native
  var dragPercentComplete: js.UndefOr[Boolean] = js.native
  var move: js.UndefOr[Boolean] = js.native
  var reorder: js.UndefOr[Boolean] = js.native
  var resize: js.UndefOr[Boolean] = js.native
  var template: js.UndefOr[String | js.Function] = js.native
  var update: js.UndefOr[Boolean] = js.native
}

object GanttEditable {
  @scala.inline
  def apply(): GanttEditable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GanttEditable]
  }
  @scala.inline
  implicit class GanttEditableOps[Self <: GanttEditable] (val x: Self) extends AnyVal {
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
    def setConfirmation(value: Boolean): Self = this.set("confirmation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfirmation: Self = this.set("confirmation", js.undefined)
    @scala.inline
    def setCreate(value: Boolean): Self = this.set("create", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    @scala.inline
    def setDependencyCreate(value: Boolean): Self = this.set("dependencyCreate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDependencyCreate: Self = this.set("dependencyCreate", js.undefined)
    @scala.inline
    def setDependencyDestroy(value: Boolean): Self = this.set("dependencyDestroy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDependencyDestroy: Self = this.set("dependencyDestroy", js.undefined)
    @scala.inline
    def setDestroy(value: Boolean): Self = this.set("destroy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setDragPercentComplete(value: Boolean): Self = this.set("dragPercentComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragPercentComplete: Self = this.set("dragPercentComplete", js.undefined)
    @scala.inline
    def setMove(value: Boolean): Self = this.set("move", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMove: Self = this.set("move", js.undefined)
    @scala.inline
    def setReorder(value: Boolean): Self = this.set("reorder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReorder: Self = this.set("reorder", js.undefined)
    @scala.inline
    def setResize(value: Boolean): Self = this.set("resize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    @scala.inline
    def setTemplate(value: String | js.Function): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setUpdate(value: Boolean): Self = this.set("update", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
  
}

