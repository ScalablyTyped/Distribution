package typings.jestMessageUtil.mod

import typings.jestMessageUtil.jestMessageUtilStrings.rootDir
import typings.jestMessageUtil.jestMessageUtilStrings.testMatch
import typings.jestTypes.configMod.ProjectConfig
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-message-util", "formatStackTrace")
@js.native
object formatStackTrace extends js.Object {
  def apply(stack: String, config: Pick[ProjectConfig, rootDir | testMatch], options: StackTraceOptions): String = js.native
  def apply(
    stack: String,
    config: Pick[ProjectConfig, rootDir | testMatch],
    options: StackTraceOptions,
    testPath: String
  ): String = js.native
}

