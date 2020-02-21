package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileManagerMessagesPreviewPane extends js.Object {
  var created: js.UndefOr[String] = js.undefined
  var extension: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[String] = js.undefined
  var modified: js.UndefOr[String] = js.undefined
  var noFileSelected: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[String] = js.undefined
}

object FileManagerMessagesPreviewPane {
  @scala.inline
  def apply(
    created: String = null,
    extension: String = null,
    items: String = null,
    modified: String = null,
    noFileSelected: String = null,
    size: String = null
  ): FileManagerMessagesPreviewPane = {
    val __obj = js.Dynamic.literal()
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (modified != null) __obj.updateDynamic("modified")(modified.asInstanceOf[js.Any])
    if (noFileSelected != null) __obj.updateDynamic("noFileSelected")(noFileSelected.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileManagerMessagesPreviewPane]
  }
}

