package typings.jscodeshift.srcCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileInfo extends js.Object {
  /** The absolute path to the current file. */
  var path: String
  /** The source code of the current file. */
  var source: String
}

object FileInfo {
  @scala.inline
  def apply(path: String, source: String): FileInfo = {
    val __obj = js.Dynamic.literal(path = path, source = source)
  
    __obj.asInstanceOf[FileInfo]
  }
}

