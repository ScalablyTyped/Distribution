package typings.jestMessageUtil.mod

import typings.jestMessageUtil.PickProjectConfigrootDirt
import typings.jestTestResult.typesMod.AssertionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-message-util", "formatResultsErrors")
@js.native
object formatResultsErrors extends js.Object {
  def apply(
    testResults: js.Array[AssertionResult],
    config: PickProjectConfigrootDirt,
    options: StackTraceOptions
  ): String | Null = js.native
  def apply(
    testResults: js.Array[AssertionResult],
    config: PickProjectConfigrootDirt,
    options: StackTraceOptions,
    testPath: String
  ): String | Null = js.native
}

