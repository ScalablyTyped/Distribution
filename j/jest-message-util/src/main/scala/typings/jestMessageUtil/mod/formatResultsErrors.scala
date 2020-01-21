package typings.jestMessageUtil.mod

import typings.jestMessageUtil.jestMessageUtilStrings.rootDir
import typings.jestMessageUtil.jestMessageUtilStrings.testMatch
import typings.jestTestResult.typesMod.AssertionResult
import typings.jestTypes.configMod.ProjectConfig
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-message-util", "formatResultsErrors")
@js.native
object formatResultsErrors extends js.Object {
  def apply(
    testResults: js.Array[AssertionResult],
    config: Pick[ProjectConfig, rootDir | testMatch],
    options: StackTraceOptions
  ): String | Null = js.native
  def apply(
    testResults: js.Array[AssertionResult],
    config: Pick[ProjectConfig, rootDir | testMatch],
    options: StackTraceOptions,
    testPath: String
  ): String | Null = js.native
}

