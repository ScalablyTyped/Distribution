package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileManagerMessages extends js.Object {
  var dialogs: js.UndefOr[FileManagerMessagesDialogs] = js.undefined
  var previewPane: js.UndefOr[FileManagerMessagesPreviewPane] = js.undefined
  var toolbar: js.UndefOr[FileManagerMessagesToolbar] = js.undefined
  var views: js.UndefOr[FileManagerMessagesViews] = js.undefined
}

object FileManagerMessages {
  @scala.inline
  def apply(
    dialogs: FileManagerMessagesDialogs = null,
    previewPane: FileManagerMessagesPreviewPane = null,
    toolbar: FileManagerMessagesToolbar = null,
    views: FileManagerMessagesViews = null
  ): FileManagerMessages = {
    val __obj = js.Dynamic.literal()
    if (dialogs != null) __obj.updateDynamic("dialogs")(dialogs.asInstanceOf[js.Any])
    if (previewPane != null) __obj.updateDynamic("previewPane")(previewPane.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    if (views != null) __obj.updateDynamic("views")(views.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileManagerMessages]
  }
}

