package typings.hardSourceWebpackPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDirectories extends js.Object {
  var directories: js.Array[String]
  var files: js.Array[String]
  var root: String
}

object AnonDirectories {
  @scala.inline
  def apply(directories: js.Array[String], files: js.Array[String], root: String): AnonDirectories = {
    val __obj = js.Dynamic.literal(directories = directories.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDirectories]
  }
}

