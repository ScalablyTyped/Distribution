package typings.jestConfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilePathRootDir extends js.Object {
  var filePath: String
  var rootDir: String
}

object AnonFilePathRootDir {
  @scala.inline
  def apply(filePath: String, rootDir: String): AnonFilePathRootDir = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFilePathRootDir]
  }
}

