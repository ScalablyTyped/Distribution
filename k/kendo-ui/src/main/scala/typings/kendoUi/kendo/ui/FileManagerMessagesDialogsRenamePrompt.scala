package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileManagerMessagesDialogsRenamePrompt extends js.Object {
  var cancel: js.UndefOr[String] = js.undefined
  var close: js.UndefOr[String] = js.undefined
  var content: js.UndefOr[String] = js.undefined
  var okText: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object FileManagerMessagesDialogsRenamePrompt {
  @scala.inline
  def apply(
    cancel: String = null,
    close: String = null,
    content: String = null,
    okText: String = null,
    title: String = null
  ): FileManagerMessagesDialogsRenamePrompt = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (okText != null) __obj.updateDynamic("okText")(okText.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileManagerMessagesDialogsRenamePrompt]
  }
}

