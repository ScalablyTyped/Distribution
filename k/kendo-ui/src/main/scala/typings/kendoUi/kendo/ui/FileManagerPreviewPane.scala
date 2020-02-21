package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileManagerPreviewPane extends js.Object {
  var metaFields: js.UndefOr[js.Any] = js.undefined
  var multipleFilesTemplate: js.UndefOr[String | js.Function] = js.undefined
  var noFileTemplate: js.UndefOr[String | js.Function] = js.undefined
  var singleFileTemplate: js.UndefOr[String | js.Function] = js.undefined
}

object FileManagerPreviewPane {
  @scala.inline
  def apply(
    metaFields: js.Any = null,
    multipleFilesTemplate: String | js.Function = null,
    noFileTemplate: String | js.Function = null,
    singleFileTemplate: String | js.Function = null
  ): FileManagerPreviewPane = {
    val __obj = js.Dynamic.literal()
    if (metaFields != null) __obj.updateDynamic("metaFields")(metaFields.asInstanceOf[js.Any])
    if (multipleFilesTemplate != null) __obj.updateDynamic("multipleFilesTemplate")(multipleFilesTemplate.asInstanceOf[js.Any])
    if (noFileTemplate != null) __obj.updateDynamic("noFileTemplate")(noFileTemplate.asInstanceOf[js.Any])
    if (singleFileTemplate != null) __obj.updateDynamic("singleFileTemplate")(singleFileTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileManagerPreviewPane]
  }
}

