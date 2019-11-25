package typings.atJestTestDashResult.buildTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.atJestConsole.buildTypesMod.ConsoleBuffer
import typings.atJestTestDashResult.Anon_Added
import typings.atJestTestDashResult.Anon_End
import typings.atJestTypes.buildConfigMod.DisplayName
import typings.istanbulDashLibDashCoverage.istanbulDashLibDashCoverageMod.CoverageMapData
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestResult extends js.Object {
  var console: js.UndefOr[ConsoleBuffer] = js.undefined
  var coverage: js.UndefOr[CoverageMapData] = js.undefined
  var displayName: js.UndefOr[DisplayName] = js.undefined
  var failureMessage: js.UndefOr[String | Null] = js.undefined
  var leaks: Boolean
  var memoryUsage: js.UndefOr[Bytes] = js.undefined
  var numFailingTests: Double
  var numPassingTests: Double
  var numPendingTests: Double
  var numTodoTests: Double
  var openHandles: js.Array[Error]
  var perfStats: Anon_End
  var skipped: Boolean
  var snapshot: Anon_Added
  var sourceMaps: js.UndefOr[StringDictionary[String]] = js.undefined
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
    numTodoTests: Double,
    openHandles: js.Array[Error],
    perfStats: Anon_End,
    skipped: Boolean,
    snapshot: Anon_Added,
    testFilePath: String,
    testResults: js.Array[AssertionResult],
    console: ConsoleBuffer = null,
    coverage: CoverageMapData = null,
    displayName: DisplayName = null,
    failureMessage: String = null,
    memoryUsage: Int | Double = null,
    sourceMaps: StringDictionary[String] = null,
    testExecError: SerializableError = null
  ): TestResult = {
    val __obj = js.Dynamic.literal(leaks = leaks.asInstanceOf[js.Any], numFailingTests = numFailingTests.asInstanceOf[js.Any], numPassingTests = numPassingTests.asInstanceOf[js.Any], numPendingTests = numPendingTests.asInstanceOf[js.Any], numTodoTests = numTodoTests.asInstanceOf[js.Any], openHandles = openHandles.asInstanceOf[js.Any], perfStats = perfStats.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any], testFilePath = testFilePath.asInstanceOf[js.Any], testResults = testResults.asInstanceOf[js.Any])
    if (console != null) __obj.updateDynamic("console")(console.asInstanceOf[js.Any])
    if (coverage != null) __obj.updateDynamic("coverage")(coverage.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (failureMessage != null) __obj.updateDynamic("failureMessage")(failureMessage.asInstanceOf[js.Any])
    if (memoryUsage != null) __obj.updateDynamic("memoryUsage")(memoryUsage.asInstanceOf[js.Any])
    if (sourceMaps != null) __obj.updateDynamic("sourceMaps")(sourceMaps.asInstanceOf[js.Any])
    if (testExecError != null) __obj.updateDynamic("testExecError")(testExecError.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResult]
  }
}

