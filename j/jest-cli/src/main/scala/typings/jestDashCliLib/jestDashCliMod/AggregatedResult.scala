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
    if (coverageMap != null) __obj.updateDynamic("coverageMap")(coverageMap)
    __obj.asInstanceOf[AggregatedResult]
  }
}

