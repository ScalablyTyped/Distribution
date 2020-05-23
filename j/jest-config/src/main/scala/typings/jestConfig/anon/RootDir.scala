package typings.jestConfig.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RootDir extends js.Object {
  var rootDir: String
  var testEnvironment: String
}

object RootDir {
  @scala.inline
  def apply(rootDir: String, testEnvironment: String): RootDir = {
    val __obj = js.Dynamic.literal(rootDir = rootDir.asInstanceOf[js.Any], testEnvironment = testEnvironment.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootDir]
  }
}

