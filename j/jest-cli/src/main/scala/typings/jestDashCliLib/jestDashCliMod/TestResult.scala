package typings
package jestDashCliLib.jestDashCliMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestResult extends js.Object {
  var console: js.UndefOr[ConsoleBuffer] = js.undefined
  var coverage: js.UndefOr[RawCoverage] = js.undefined
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  var failureMessage: js.UndefOr[java.lang.String] = js.undefined
  var leaks: scala.Boolean
  var memoryUsage: js.UndefOr[scala.Double] = js.undefined
  var numFailingTests: scala.Double
  var numPassingTests: scala.Double
  var numPendingTests: scala.Double
  var openHandles: js.Array[stdLib.Error]
  var perfStats: jestDashCliLib.Anon_End
  var skipped: scala.Boolean
  var snapshot: jestDashCliLib.Anon_Added
  var sourceMaps: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var testExecError: js.UndefOr[SerializableError] = js.undefined
  var testFilePath: java.lang.String
  var testResults: js.Array[AssertionResult]
}

object TestResult {
  @scala.inline
  def apply(
    leaks: scala.Boolean,
    numFailingTests: scala.Double,
    numPassingTests: scala.Double,
    numPendingTests: scala.Double,
    openHandles: js.Array[stdLib.Error],
    perfStats: jestDashCliLib.Anon_End,
    skipped: scala.Boolean,
    snapshot: jestDashCliLib.Anon_Added,
    sourceMaps: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    testFilePath: java.lang.String,
    testResults: js.Array[AssertionResult],
    console: ConsoleBuffer = null,
    coverage: RawCoverage = null,
    displayName: java.lang.String = null,
    failureMessage: java.lang.String = null,
    memoryUsage: scala.Int | scala.Double = null,
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

