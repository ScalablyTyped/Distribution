package typings.jestTestResult.typesMod

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
    val __obj = js.Dynamic.literal(numFailedTestSuites = numFailedTestSuites.asInstanceOf[js.Any], numFailedTests = numFailedTests.asInstanceOf[js.Any], numPassedTestSuites = numPassedTestSuites.asInstanceOf[js.Any], numPassedTests = numPassedTests.asInstanceOf[js.Any], numPendingTestSuites = numPendingTestSuites.asInstanceOf[js.Any], numPendingTests = numPendingTests.asInstanceOf[js.Any], numRuntimeErrorTestSuites = numRuntimeErrorTestSuites.asInstanceOf[js.Any], numTodoTests = numTodoTests.asInstanceOf[js.Any], numTotalTestSuites = numTotalTestSuites.asInstanceOf[js.Any], numTotalTests = numTotalTests.asInstanceOf[js.Any], openHandles = openHandles.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], testResults = testResults.asInstanceOf[js.Any], wasInterrupted = wasInterrupted.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregatedResultWithoutCoverage]
  }
}

