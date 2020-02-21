package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileManagerMessagesDialogs extends js.Object {
  var deleteConfirm: js.UndefOr[FileManagerMessagesDialogsDeleteConfirm] = js.undefined
  var moveConfirm: js.UndefOr[FileManagerMessagesDialogsMoveConfirm] = js.undefined
  var renamePrompt: js.UndefOr[FileManagerMessagesDialogsRenamePrompt] = js.undefined
  var upload: js.UndefOr[FileManagerMessagesDialogsUpload] = js.undefined
}

object FileManagerMessagesDialogs {
  @scala.inline
  def apply(
    deleteConfirm: FileManagerMessagesDialogsDeleteConfirm = null,
    moveConfirm: FileManagerMessagesDialogsMoveConfirm = null,
    renamePrompt: FileManagerMessagesDialogsRenamePrompt = null,
    upload: FileManagerMessagesDialogsUpload = null
  ): FileManagerMessagesDialogs = {
    val __obj = js.Dynamic.literal()
    if (deleteConfirm != null) __obj.updateDynamic("deleteConfirm")(deleteConfirm.asInstanceOf[js.Any])
    if (moveConfirm != null) __obj.updateDynamic("moveConfirm")(moveConfirm.asInstanceOf[js.Any])
    if (renamePrompt != null) __obj.updateDynamic("renamePrompt")(renamePrompt.asInstanceOf[js.Any])
    if (upload != null) __obj.updateDynamic("upload")(upload.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileManagerMessagesDialogs]
  }
}

