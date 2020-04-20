package typings.kss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Source extends js.Object {
  /** The name of the file. */
  var filename: String
  /** The line number where the KSS comment is found. */
  var line: Double
  /** The full path of the file. */
  var path: String
}

object Source {
  @scala.inline
  def apply(filename: String, line: Double, path: String): Source = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
}

