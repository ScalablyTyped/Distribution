package typings
package jscodeshiftLib.srcCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileInfo extends js.Object {
  /** The absolute path to the current file. */
  var path: java.lang.String
  /** The source code of the current file. */
  var source: java.lang.String
}

object FileInfo {
  @scala.inline
  def apply(path: java.lang.String, source: java.lang.String): FileInfo = {
    val __obj = js.Dynamic.literal(path = path, source = source)
  
    __obj.asInstanceOf[FileInfo]
  }
}

