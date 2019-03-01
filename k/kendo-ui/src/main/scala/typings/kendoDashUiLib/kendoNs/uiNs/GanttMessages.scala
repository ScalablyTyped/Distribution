package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttMessages extends js.Object {
  var actions: js.UndefOr[GanttMessagesActions] = js.undefined
  var cancel: js.UndefOr[java.lang.String] = js.undefined
  var deleteDependencyConfirmation: js.UndefOr[java.lang.String] = js.undefined
  var deleteDependencyWindowTitle: js.UndefOr[java.lang.String] = js.undefined
  var deleteTaskConfirmation: js.UndefOr[java.lang.String] = js.undefined
  var deleteTaskWindowTitle: js.UndefOr[java.lang.String] = js.undefined
  var destroy: js.UndefOr[java.lang.String] = js.undefined
  var editor: js.UndefOr[GanttMessagesEditor] = js.undefined
  var save: js.UndefOr[java.lang.String] = js.undefined
  var views: js.UndefOr[GanttMessagesViews] = js.undefined
}

object GanttMessages {
  @scala.inline
  def apply(
    actions: GanttMessagesActions = null,
    cancel: java.lang.String = null,
    deleteDependencyConfirmation: java.lang.String = null,
    deleteDependencyWindowTitle: java.lang.String = null,
    deleteTaskConfirmation: java.lang.String = null,
    deleteTaskWindowTitle: java.lang.String = null,
    destroy: java.lang.String = null,
    editor: GanttMessagesEditor = null,
    save: java.lang.String = null,
    views: GanttMessagesViews = null
  ): GanttMessages = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (deleteDependencyConfirmation != null) __obj.updateDynamic("deleteDependencyConfirmation")(deleteDependencyConfirmation)
    if (deleteDependencyWindowTitle != null) __obj.updateDynamic("deleteDependencyWindowTitle")(deleteDependencyWindowTitle)
    if (deleteTaskConfirmation != null) __obj.updateDynamic("deleteTaskConfirmation")(deleteTaskConfirmation)
    if (deleteTaskWindowTitle != null) __obj.updateDynamic("deleteTaskWindowTitle")(deleteTaskWindowTitle)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (editor != null) __obj.updateDynamic("editor")(editor)
    if (save != null) __obj.updateDynamic("save")(save)
    if (views != null) __obj.updateDynamic("views")(views)
    __obj.asInstanceOf[GanttMessages]
  }
}

