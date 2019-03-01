package typings
package jqueryDotFileuploadLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryFileUploadFilesObject extends js.Object {
  var files: js.Array[stdLib.File]
}

object JQueryFileUploadFilesObject {
  @scala.inline
  def apply(files: js.Array[stdLib.File]): JQueryFileUploadFilesObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("files")(files)
    __obj.asInstanceOf[JQueryFileUploadFilesObject]
  }
}

