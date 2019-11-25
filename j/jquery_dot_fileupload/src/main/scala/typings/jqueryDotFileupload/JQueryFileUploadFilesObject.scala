package typings.jqueryDotFileupload

import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryFileUploadFilesObject extends js.Object {
  var files: js.Array[File]
}

object JQueryFileUploadFilesObject {
  @scala.inline
  def apply(files: js.Array[File]): JQueryFileUploadFilesObject = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JQueryFileUploadFilesObject]
  }
}

