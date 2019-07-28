package typings.jestDashCli.jestDashCliMod

import org.scalablytyped.runtime.StringDictionary
import typings.jestDashCli.Anon_Added
import typings.jestDashCli.Anon_End
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestResult extends js.Object {
  var console: js.UndefOr[ConsoleBuffer] = js.undefined
  var coverage: js.UndefOr[RawCoverage] = js.undefined
  var displayName: js.UndefOr[String] = js.undefined
  var failureMessage: js.UndefOr[String] = js.undefined
  var leaks: Boolean
  var memoryUsage: js.UndefOr[Double] = js.undefined
  var numFailingTests: Double
  var numPassingTests: Double
  var numPendingTests: Double
  var openHandles: js.Array[Error]
  var perfStats: Anon_End
  var skipped: Boolean
  var snapshot: Anon_Added
  var sourceMaps: StringDictionary[String]
  var testExecError: js.UndefOr[SerializableError] = js.undefined
  var testFilePath: String
  var testResults: js.Array[AssertionResult]
}

object TestResult {
  @scala.inline
  def apply(
    leaks: Boolean,
    numFailingTests: Double,
    numPassingTests: Double,
    numPendingTests: Double,
    openHandles: js.Array[Error],
    perfStats: Anon_End,
    skipped: Boolean,
    snapshot: Anon_Added,
    sourceMaps: StringDictionary[String],
    testFilePath: String,
    testResults: js.Array[AssertionResult],
    console: ConsoleBuffer = null,
    coverage: RawCoverage = null,
    displayName: String = null,
    failureMessage: String = null,
    memoryUsage: Int | Double = null,
    testExecError: SerializableError = null
  ): TestResult = {
    val __obj = js.Dynamic.literal(leaks = leaks, numFailingTests = numFailingTests, numPassingTests = numPassingTests, numPendingTests = numPendingTests, openHandles = openHandles, perfStats = perfStats, skipped = skipped, snapshot = snapshot, sourceMaps = sourceMaps, testFilePath = testFilePath, testResults = testResults)
    if (console != null) __obj.updateDynamic("console")(console)
    if (coverage != null) __obj.updateDynamic("coverage")(coverage)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (failureMessage != null) __obj.updateDynamic("failureMessage")(failureMessage)
    if (memoryUsage != null) __obj.updateDynamic("memoryUsage")(memoryUsage.asInstanceOf[js.Any])
    if (testExecError != null) __obj.updateDynamic("testExecError")(testExecError)
    __obj.asInstanceOf[TestResult]
  }
}

