package typings.jestTestResult.typesMod

import typings.istanbulLibCoverage.mod.CoverageMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormattedTestResults extends js.Object {
  var coverageMap: js.UndefOr[CoverageMap | Null] = js.native
  var numFailedTestSuites: Double = js.native
  var numFailedTests: Double = js.native
  var numPassedTestSuites: Double = js.native
  var numPassedTests: Double = js.native
  var numPendingTestSuites: Double = js.native
  var numPendingTests: Double = js.native
  var numRuntimeErrorTestSuites: Double = js.native
  var numTotalTestSuites: Double = js.native
  var numTotalTests: Double = js.native
  var snapshot: SnapshotSummary = js.native
  var startTime: Double = js.native
  var success: Boolean = js.native
  var testResults: js.Array[FormattedTestResult] = js.native
  var wasInterrupted: Boolean = js.native
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
    wasInterrupted: Boolean
  ): FormattedTestResults = {
    val __obj = js.Dynamic.literal(numFailedTestSuites = numFailedTestSuites.asInstanceOf[js.Any], numFailedTests = numFailedTests.asInstanceOf[js.Any], numPassedTestSuites = numPassedTestSuites.asInstanceOf[js.Any], numPassedTests = numPassedTests.asInstanceOf[js.Any], numPendingTestSuites = numPendingTestSuites.asInstanceOf[js.Any], numPendingTests = numPendingTests.asInstanceOf[js.Any], numRuntimeErrorTestSuites = numRuntimeErrorTestSuites.asInstanceOf[js.Any], numTotalTestSuites = numTotalTestSuites.asInstanceOf[js.Any], numTotalTests = numTotalTests.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], testResults = testResults.asInstanceOf[js.Any], wasInterrupted = wasInterrupted.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormattedTestResults]
  }
  @scala.inline
  implicit class FormattedTestResultsOps[Self <: FormattedTestResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNumFailedTestSuites(value: Double): Self = this.set("numFailedTestSuites", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumFailedTests(value: Double): Self = this.set("numFailedTests", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumPassedTestSuites(value: Double): Self = this.set("numPassedTestSuites", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumPassedTests(value: Double): Self = this.set("numPassedTests", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumPendingTestSuites(value: Double): Self = this.set("numPendingTestSuites", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumPendingTests(value: Double): Self = this.set("numPendingTests", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumRuntimeErrorTestSuites(value: Double): Self = this.set("numRuntimeErrorTestSuites", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumTotalTestSuites(value: Double): Self = this.set("numTotalTestSuites", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumTotalTests(value: Double): Self = this.set("numTotalTests", value.asInstanceOf[js.Any])
    @scala.inline
    def setSnapshot(value: SnapshotSummary): Self = this.set("snapshot", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartTime(value: Double): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestResultsVarargs(value: FormattedTestResult*): Self = this.set("testResults", js.Array(value :_*))
    @scala.inline
    def setTestResults(value: js.Array[FormattedTestResult]): Self = this.set("testResults", value.asInstanceOf[js.Any])
    @scala.inline
    def setWasInterrupted(value: Boolean): Self = this.set("wasInterrupted", value.asInstanceOf[js.Any])
    @scala.inline
    def setCoverageMap(value: CoverageMap): Self = this.set("coverageMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoverageMap: Self = this.set("coverageMap", js.undefined)
    @scala.inline
    def setCoverageMapNull: Self = this.set("coverageMap", null)
  }
  
}

