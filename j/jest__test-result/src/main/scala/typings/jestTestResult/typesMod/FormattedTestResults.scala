package typings.jestTestResult.typesMod

import typings.istanbulLibCoverage.mod.CoverageMap
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
    coverageMap: js.UndefOr[Null | CoverageMap] = js.undefined
  ): FormattedTestResults = {
    val __obj = js.Dynamic.literal(numFailedTestSuites = numFailedTestSuites.asInstanceOf[js.Any], numFailedTests = numFailedTests.asInstanceOf[js.Any], numPassedTestSuites = numPassedTestSuites.asInstanceOf[js.Any], numPassedTests = numPassedTests.asInstanceOf[js.Any], numPendingTestSuites = numPendingTestSuites.asInstanceOf[js.Any], numPendingTests = numPendingTests.asInstanceOf[js.Any], numRuntimeErrorTestSuites = numRuntimeErrorTestSuites.asInstanceOf[js.Any], numTotalTestSuites = numTotalTestSuites.asInstanceOf[js.Any], numTotalTests = numTotalTests.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], testResults = testResults.asInstanceOf[js.Any], wasInterrupted = wasInterrupted.asInstanceOf[js.Any])
    if (!js.isUndefined(coverageMap)) __obj.updateDynamic("coverageMap")(coverageMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormattedTestResults]
  }
}

