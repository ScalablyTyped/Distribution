package typings.atJestTestDashResult.buildTypesMod

import typings.istanbulDashLibDashCoverage.istanbulDashLibDashCoverageMod.CoverageMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormattedTestResults extends js.Object {
  var coverageMap: js.UndefOr[CoverageMap | Null] = js.undefined
  var numFailedTestSuites: Double
  var numFailedTests: Double
  var numPassedTestSuites: Double
  var numPassedTests: Double
  var numPendingTestSuites: Double
  var numPendingTests: Double
  var numRuntimeErrorTestSuites: Double
  var numTotalTestSuites: Double
  var numTotalTests: Double
  var snapshot: SnapshotSummary
  var startTime: Double
  var success: Boolean
  var testResults: js.Array[FormattedTestResult]
  var wasInterrupted: Boolean
}

object FormattedTestResults {
  @scala.inline
  def apply(
    numFailedTestSuites: Double,
    numFailedTests: Double,
    numPassedTestSuites: Double,
    numPassedTests: Double,
    numPendingTestSuites: Double,
    numPendingTests: Double,
    numRuntimeErrorTestSuites: Double,
    numTotalTestSuites: Double,
    numTotalTests: Double,
    snapshot: SnapshotSummary,
    startTime: Double,
    success: Boolean,
    testResults: js.Array[FormattedTestResult],
    wasInterrupted: Boolean,
    coverageMap: CoverageMap = null
  ): FormattedTestResults = {
    val __obj = js.Dynamic.literal(numFailedTestSuites = numFailedTestSuites, numFailedTests = numFailedTests, numPassedTestSuites = numPassedTestSuites, numPassedTests = numPassedTests, numPendingTestSuites = numPendingTestSuites, numPendingTests = numPendingTests, numRuntimeErrorTestSuites = numRuntimeErrorTestSuites, numTotalTestSuites = numTotalTestSuites, numTotalTests = numTotalTests, snapshot = snapshot, startTime = startTime, success = success, testResults = testResults, wasInterrupted = wasInterrupted)
    if (coverageMap != null) __obj.updateDynamic("coverageMap")(coverageMap)
    __obj.asInstanceOf[FormattedTestResults]
  }
}

