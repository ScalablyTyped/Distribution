package typings.htmlPdf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileInfo extends js.Object {
  var filename: String
}

object FileInfo {
  @scala.inline
  def apply(filename: String): FileInfo = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FileInfo]
  }
}

