package typings
package jestDashCliLib.jestDashCliMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AggregatedResultWithoutCoverage extends js.Object {
  var numFailedTestSuites: scala.Double
  var numFailedTests: scala.Double
  var numPassedTestSuites: scala.Double
  var numPassedTests: scala.Double
  var numPendingTestSuites: scala.Double
  var numPendingTests: scala.Double
  var numRuntimeErrorTestSuites: scala.Double
  var numTodoTests: scala.Double
  var numTotalTestSuites: scala.Double
  var numTotalTests: scala.Double
  var openHandles: js.Array[stdLib.Error]
  var snapshot: SnapshotSummary
  var startTime: scala.Double
  var success: scala.Boolean
  var testResults: js.Array[TestResult]
  var wasInterrupted: scala.Boolean
}

object AggregatedResultWithoutCoverage {
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
    wasInterrupted: scala.Boolean
  ): AggregatedResultWithoutCoverage = {
    val __obj = js.Dynamic.literal(numFailedTestSuites = numFailedTestSuites, numFailedTests = numFailedTests, numPassedTestSuites = numPassedTestSuites, numPassedTests = numPassedTests, numPendingTestSuites = numPendingTestSuites, numPendingTests = numPendingTests, numRuntimeErrorTestSuites = numRuntimeErrorTestSuites, numTodoTests = numTodoTests, numTotalTestSuites = numTotalTestSuites, numTotalTests = numTotalTests, openHandles = openHandles, snapshot = snapshot, startTime = startTime, success = success, testResults = testResults, wasInterrupted = wasInterrupted)
  
    __obj.asInstanceOf[AggregatedResultWithoutCoverage]
  }
}

