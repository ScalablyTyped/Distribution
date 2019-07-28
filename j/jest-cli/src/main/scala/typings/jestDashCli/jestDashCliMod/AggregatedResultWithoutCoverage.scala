package typings.jestDashCli.jestDashCliMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AggregatedResultWithoutCoverage extends js.Object {
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
  var openHandles: js.Array[Error]
  var snapshot: SnapshotSummary
  var startTime: Double
  var success: Boolean
  var testResults: js.Array[TestResult]
  var wasInterrupted: Boolean
}

object AggregatedResultWithoutCoverage {
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
    wasInterrupted: Boolean
  ): AggregatedResultWithoutCoverage = {
    val __obj = js.Dynamic.literal(numFailedTestSuites = numFailedTestSuites, numFailedTests = numFailedTests, numPassedTestSuites = numPassedTestSuites, numPassedTests = numPassedTests, numPendingTestSuites = numPendingTestSuites, numPendingTests = numPendingTests, numRuntimeErrorTestSuites = numRuntimeErrorTestSuites, numTodoTests = numTodoTests, numTotalTestSuites = numTotalTestSuites, numTotalTests = numTotalTests, openHandles = openHandles, snapshot = snapshot, startTime = startTime, success = success, testResults = testResults, wasInterrupted = wasInterrupted)
  
    __obj.asInstanceOf[AggregatedResultWithoutCoverage]
  }
}

