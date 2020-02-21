package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileManagerDialogs extends js.Object {
  var deleteConfirm: js.UndefOr[js.Any] = js.undefined
  var moveConfirm: js.UndefOr[js.Any] = js.undefined
  var renamePrompt: js.UndefOr[js.Any] = js.undefined
  var upload: js.UndefOr[js.Any] = js.undefined
}

object FileManagerDialogs {
  @scala.inline
  def apply(
    deleteConfirm: js.Any = null,
    moveConfirm: js.Any = null,
    renamePrompt: js.Any = null,
    upload: js.Any = null
  ): FileManagerDialogs = {
    val __obj = js.Dynamic.literal()
    if (deleteConfirm != null) __obj.updateDynamic("deleteConfirm")(deleteConfirm.asInstanceOf[js.Any])
    if (moveConfirm != null) __obj.updateDynamic("moveConfirm")(moveConfirm.asInstanceOf[js.Any])
    if (renamePrompt != null) __obj.updateDynamic("renamePrompt")(renamePrompt.asInstanceOf[js.Any])
    if (upload != null) __obj.updateDynamic("upload")(upload.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileManagerDialogs]
  }
}

