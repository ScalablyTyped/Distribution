package typings.jestConfig.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilePathRootDir extends js.Object {
  var filePath: String
  var rootDir: String
}

object FilePathRootDir {
  @scala.inline
  def apply(filePath: String, rootDir: String): FilePathRootDir = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePathRootDir]
  }
}

