package typings.jestDashCli.jestDashCliMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AggregatedResult extends AggregatedResultWithoutCoverage {
  var coverageMap: js.UndefOr[CoverageMap] = js.undefined
}

object AggregatedResult {
  @scala.inline
  def apply(
    numFailedTestSuites: Double,
    numFailedTests: Double,
    numPassedTestSuites: Double,
    numPassedTests: Double,
    numPendingTestSuites: Double,
    numPendingTests: Double,
    numRuntimeErrorTestSuites: Double,
    numTodoTests: Double,
    numTotalTestSuites: Double,
    numTotalTests: Double,
    openHandles: js.Array[Error],
    snapshot: SnapshotSummary,
    startTime: Double,
    success: Boolean,
    testResults: js.Array[TestResult],
    wasInterrupted: Boolean,
    coverageMap: CoverageMap = null
  ): AggregatedResult = {
    val __obj = js.Dynamic.literal(numFailedTestSuites = numFailedTestSuites, numFailedTests = numFailedTests, numPassedTestSuites = numPassedTestSuites, numPassedTests = numPassedTests, numPendingTestSuites = numPendingTestSuites, numPendingTests = numPendingTests, numRuntimeErrorTestSuites = numRuntimeErrorTestSuites, numTodoTests = numTodoTests, numTotalTestSuites = numTotalTestSuites, numTotalTests = numTotalTests, openHandles = openHandles, snapshot = snapshot, startTime = startTime, success = success, testResults = testResults, wasInterrupted = wasInterrupted)
    if (coverageMap != null) __obj.updateDynamic("coverageMap")(coverageMap)
    __obj.asInstanceOf[AggregatedResult]
  }
}

