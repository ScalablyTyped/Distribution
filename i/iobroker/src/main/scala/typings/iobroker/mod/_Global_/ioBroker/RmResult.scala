package typings.iobroker.mod._Global_.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the return values of rm */
trait RmResult extends js.Object {
  /** The name of the deleted file or directory */
  var file: String
  /** Whether the deleted object was a directory or a file */
  var isDir: Boolean
  /** The parent directory of the deleted file or directory */
  var path: String
}

object RmResult {
  @scala.inline
  def apply(file: String, isDir: Boolean, path: String): RmResult = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], isDir = isDir.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RmResult]
  }
}

