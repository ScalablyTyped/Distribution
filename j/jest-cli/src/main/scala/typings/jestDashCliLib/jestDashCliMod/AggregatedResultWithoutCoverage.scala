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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("numFailedTestSuites")(numFailedTestSuites)
    __obj.updateDynamic("numFailedTests")(numFailedTests)
    __obj.updateDynamic("numPassedTestSuites")(numPassedTestSuites)
    __obj.updateDynamic("numPassedTests")(numPassedTests)
    __obj.updateDynamic("numPendingTestSuites")(numPendingTestSuites)
    __obj.updateDynamic("numPendingTests")(numPendingTests)
    __obj.updateDynamic("numRuntimeErrorTestSuites")(numRuntimeErrorTestSuites)
    __obj.updateDynamic("numTodoTests")(numTodoTests)
    __obj.updateDynamic("numTotalTestSuites")(numTotalTestSuites)
    __obj.updateDynamic("numTotalTests")(numTotalTests)
    __obj.updateDynamic("openHandles")(openHandles)
    __obj.updateDynamic("snapshot")(snapshot)
    __obj.updateDynamic("startTime")(startTime)
    __obj.updateDynamic("success")(success)
    __obj.updateDynamic("testResults")(testResults)
    __obj.updateDynamic("wasInterrupted")(wasInterrupted)
    __obj.asInstanceOf[AggregatedResultWithoutCoverage]
  }
}

