package typings.jestDashMessageDashUtil.jestDashMessageDashUtilMod

import typings.atJestTestDashResult.buildTypesMod.AssertionResult
import typings.atJestTypes.buildConfigMod.ProjectConfig
import typings.jestDashMessageDashUtil.jestDashMessageDashUtilStrings.rootDir
import typings.jestDashMessageDashUtil.jestDashMessageDashUtilStrings.testMatch
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

