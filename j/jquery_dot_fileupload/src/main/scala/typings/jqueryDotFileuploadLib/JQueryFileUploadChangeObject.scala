package typings
package jqueryDotFileuploadLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryFileUploadChangeObject extends js.Object {
  var fileInput: js.UndefOr[JQuery] = js.undefined
  var fileInputClone: js.UndefOr[JQuery] = js.undefined
  var files: js.Array[stdLib.File]
  var form: js.UndefOr[JQuery] = js.undefined
  var originalFiles: js.Array[stdLib.File]
}

object JQueryFileUploadChangeObject {
  @scala.inline
  def apply(
    files: js.Array[stdLib.File],
    originalFiles: js.Array[stdLib.File],
    fileInput: JQuery = null,
    fileInputClone: JQuery = null,
    form: JQuery = null
  ): JQueryFileUploadChangeObject = {
    val __obj = js.Dynamic.literal(files = files, originalFiles = originalFiles)
    if (fileInput != null) __obj.updateDynamic("fileInput")(fileInput)
    if (fileInputClone != null) __obj.updateDynamic("fileInputClone")(fileInputClone)
    if (form != null) __obj.updateDynamic("form")(form)
    __obj.asInstanceOf[JQueryFileUploadChangeObject]
  }
}

