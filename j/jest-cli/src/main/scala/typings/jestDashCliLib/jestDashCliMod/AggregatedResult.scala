package typings
package jestDashCliLib.jestDashCliMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AggregatedResult extends AggregatedResultWithoutCoverage {
  var coverageMap: js.UndefOr[CoverageMap] = js.undefined
}

object AggregatedResult {
  @scala.inline
  def apply(
    numFailedTestSuites: scala.Double,
    numFailedTests: scala.Double,
    numPassedTestSuites: scala.Double,
    numPassedTests: scala.Double,
    numPendingTestSuites: scala.Double,
    numPendingTests: scala.Double,
    numRuntimeErrorTestSuites: scala.Double,
    numTodoTests: scala.Double,
    numTotalTestSuites: scala.Double,
    numTotalTests: scala.Double,
    openHandles: js.Array[stdLib.Error],
    snapshot: SnapshotSummary,
    startTime: scala.Double,
    success: scala.Boolean,
    testResults: js.Array[TestResult],
    wasInterrupted: scala.Boolean,
    coverageMap: CoverageMap = null
  ): AggregatedResult = {
    val __obj = js.Dynamic.literal(numFailedTestSuites = numFailedTestSuites, numFailedTests = numFailedTests, numPassedTestSuites = numPassedTestSuites, numPassedTests = numPassedTests, numPendingTestSuites = numPendingTestSuites, numPendingTests = numPendingTests, numRuntimeErrorTestSuites = numRuntimeErrorTestSuites, numTodoTests = numTodoTests, numTotalTestSuites = numTotalTestSuites, numTotalTests = numTotalTests, openHandles = openHandles, snapshot = snapshot, startTime = startTime, success = success, testResults = testResults, wasInterrupted = wasInterrupted)
    if (coverageMap != null) __obj.updateDynamic("coverageMap")(coverageMap)
    __obj.asInstanceOf[AggregatedResult]
  }
}

