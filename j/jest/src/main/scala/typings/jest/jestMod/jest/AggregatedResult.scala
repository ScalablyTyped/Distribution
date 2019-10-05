package typings.jest.jestMod.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AggregatedResult extends js.Object {
  var coverageMap: js.UndefOr[Maybe[CoverageMap]] = js.undefined
  var numFailedTestSuites: Double
  var numFailedTests: Double
  var numPassedTestSuites: Double
  var numPassedTests: Double
  var numPendingTestSuites: Double
  var numPendingTests: Double
  var numRuntimeErrorTestSuites: Double
  var numTodoTests: Double
  var numTotalTestSuites: Double
  var numTotalTests: Double
  var snapshot: SnapshotSummary
  var startTime: Double
  var success: Boolean
  var testResults: js.Array[TestResult]
  var wasInterrupted: Boolean
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
    snapshot: SnapshotSummary,
    startTime: Double,
    success: Boolean,
    testResults: js.Array[TestResult],
    wasInterrupted: Boolean,
    coverageMap: Maybe[CoverageMap] = null
  ): AggregatedResult = {
    val __obj = js.Dynamic.literal(numFailedTestSuites = numFailedTestSuites, numFailedTests = numFailedTests, numPassedTestSuites = numPassedTestSuites, numPassedTests = numPassedTests, numPendingTestSuites = numPendingTestSuites, numPendingTests = numPendingTests, numRuntimeErrorTestSuites = numRuntimeErrorTestSuites, numTodoTests = numTodoTests, numTotalTestSuites = numTotalTestSuites, numTotalTests = numTotalTests, snapshot = snapshot, startTime = startTime, success = success, testResults = testResults, wasInterrupted = wasInterrupted)
    if (coverageMap != null) __obj.updateDynamic("coverageMap")(coverageMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregatedResult]
  }
}

