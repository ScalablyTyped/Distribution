package typings.jqueryFileupload

import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryFileUploadChangeObject extends js.Object {
  var fileInput: js.UndefOr[JQuery] = js.undefined
  var fileInputClone: js.UndefOr[JQuery] = js.undefined
  var files: js.Array[File]
  var form: js.UndefOr[JQuery] = js.undefined
  var originalFiles: js.Array[File]
}

object JQueryFileUploadChangeObject {
  @scala.inline
  def apply(
    files: js.Array[File],
    originalFiles: js.Array[File],
    fileInput: JQuery = null,
    fileInputClone: JQuery = null,
    form: JQuery = null
  ): JQueryFileUploadChangeObject = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], originalFiles = originalFiles.asInstanceOf[js.Any])
    if (fileInput != null) __obj.updateDynamic("fileInput")(fileInput.asInstanceOf[js.Any])
    if (fileInputClone != null) __obj.updateDynamic("fileInputClone")(fileInputClone.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryFileUploadChangeObject]
  }
}

