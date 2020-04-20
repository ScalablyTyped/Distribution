package typings.jestConfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRootDir extends js.Object {
  var rootDir: String
  var testEnvironment: String
}

object AnonRootDir {
  @scala.inline
  def apply(rootDir: String, testEnvironment: String): AnonRootDir = {
    val __obj = js.Dynamic.literal(rootDir = rootDir.asInstanceOf[js.Any], testEnvironment = testEnvironment.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRootDir]
  }
}

