package typings.hardSourceWebpackPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Directories extends js.Object {
  var directories: js.Array[String]
  var files: js.Array[String]
  var root: String
}

object Directories {
  @scala.inline
  def apply(directories: js.Array[String], files: js.Array[String], root: String): Directories = {
    val __obj = js.Dynamic.literal(directories = directories.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Directories]
  }
}

