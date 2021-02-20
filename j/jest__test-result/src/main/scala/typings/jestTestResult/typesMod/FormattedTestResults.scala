package typings.jestTestResult.typesMod

import typings.istanbulLibCoverage.mod.CoverageMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormattedTestResults extends StObject {
  
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
  implicit class FormattedTestResultsMutableBuilder[Self <: FormattedTestResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoverageMap(value: CoverageMap): Self = StObject.set(x, "coverageMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoverageMapNull: Self = StObject.set(x, "coverageMap", null)
    
    @scala.inline
    def setCoverageMapUndefined: Self = StObject.set(x, "coverageMap", js.undefined)
    
    @scala.inline
    def setNumFailedTestSuites(value: Double): Self = StObject.set(x, "numFailedTestSuites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumFailedTests(value: Double): Self = StObject.set(x, "numFailedTests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumPassedTestSuites(value: Double): Self = StObject.set(x, "numPassedTestSuites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumPassedTests(value: Double): Self = StObject.set(x, "numPassedTests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumPendingTestSuites(value: Double): Self = StObject.set(x, "numPendingTestSuites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumPendingTests(value: Double): Self = StObject.set(x, "numPendingTests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumRuntimeErrorTestSuites(value: Double): Self = StObject.set(x, "numRuntimeErrorTestSuites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumTotalTestSuites(value: Double): Self = StObject.set(x, "numTotalTestSuites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumTotalTests(value: Double): Self = StObject.set(x, "numTotalTests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshot(value: SnapshotSummary): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestResults(value: js.Array[FormattedTestResult]): Self = StObject.set(x, "testResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestResultsVarargs(value: FormattedTestResult*): Self = StObject.set(x, "testResults", js.Array(value :_*))
    
    @scala.inline
    def setWasInterrupted(value: Boolean): Self = StObject.set(x, "wasInterrupted", value.asInstanceOf[js.Any])
  }
}
