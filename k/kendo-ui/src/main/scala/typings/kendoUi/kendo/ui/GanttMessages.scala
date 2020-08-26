package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GanttMessages extends js.Object {
  var actions: js.UndefOr[GanttMessagesActions] = js.native
  var cancel: js.UndefOr[String] = js.native
  var deleteDependencyConfirmation: js.UndefOr[String] = js.native
  var deleteDependencyWindowTitle: js.UndefOr[String] = js.native
  var deleteTaskConfirmation: js.UndefOr[String] = js.native
  var deleteTaskWindowTitle: js.UndefOr[String] = js.native
  var destroy: js.UndefOr[String] = js.native
  var editor: js.UndefOr[GanttMessagesEditor] = js.native
  var save: js.UndefOr[String] = js.native
  var views: js.UndefOr[GanttMessagesViews] = js.native
}

object GanttMessages {
  @scala.inline
  def apply(): GanttMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GanttMessages]
  }
  @scala.inline
  implicit class GanttMessagesOps[Self <: GanttMessages] (val x: Self) extends AnyVal {
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
    def setActions(value: GanttMessagesActions): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    @scala.inline
    def setCancel(value: String): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setDeleteDependencyConfirmation(value: String): Self = this.set("deleteDependencyConfirmation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteDependencyConfirmation: Self = this.set("deleteDependencyConfirmation", js.undefined)
    @scala.inline
    def setDeleteDependencyWindowTitle(value: String): Self = this.set("deleteDependencyWindowTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteDependencyWindowTitle: Self = this.set("deleteDependencyWindowTitle", js.undefined)
    @scala.inline
    def setDeleteTaskConfirmation(value: String): Self = this.set("deleteTaskConfirmation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteTaskConfirmation: Self = this.set("deleteTaskConfirmation", js.undefined)
    @scala.inline
    def setDeleteTaskWindowTitle(value: String): Self = this.set("deleteTaskWindowTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteTaskWindowTitle: Self = this.set("deleteTaskWindowTitle", js.undefined)
    @scala.inline
    def setDestroy(value: String): Self = this.set("destroy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setEditor(value: GanttMessagesEditor): Self = this.set("editor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditor: Self = this.set("editor", js.undefined)
    @scala.inline
    def setSave(value: String): Self = this.set("save", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSave: Self = this.set("save", js.undefined)
    @scala.inline
    def setViews(value: GanttMessagesViews): Self = this.set("views", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViews: Self = this.set("views", js.undefined)
  }
  
}

