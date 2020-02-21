package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileManagerMessagesDialogsUpload extends js.Object {
  var clear: js.UndefOr[String] = js.undefined
  var done: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object FileManagerMessagesDialogsUpload {
  @scala.inline
  def apply(clear: String = null, done: String = null, title: String = null): FileManagerMessagesDialogsUpload = {
    val __obj = js.Dynamic.literal()
    if (clear != null) __obj.updateDynamic("clear")(clear.asInstanceOf[js.Any])
    if (done != null) __obj.updateDynamic("done")(done.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileManagerMessagesDialogsUpload]
  }
}

