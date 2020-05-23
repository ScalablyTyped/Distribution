package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  var contents: String
  def copy(path: String): File
  def write(data: String): File
}

object File {
  @scala.inline
  def apply(contents: String, copy: String => File, write: String => File): File = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], copy = js.Any.fromFunction1(copy), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[File]
  }
}

