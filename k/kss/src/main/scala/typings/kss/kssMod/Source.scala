package typings.kss.kssMod

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
    val __obj = js.Dynamic.literal(filename = filename, line = line, path = path)
  
    __obj.asInstanceOf[Source]
  }
}

