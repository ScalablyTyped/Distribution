package typings.jestTestResult.typesMod

import typings.istanbulLibCoverage.mod.CoverageMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormattedTestResults extends StObject {
  
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
  
  inline def apply(
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
  
  extension [Self <: FormattedTestResults](x: Self) {
    
    inline def setCoverageMap(value: CoverageMap): Self = StObject.set(x, "coverageMap", value.asInstanceOf[js.Any])
    
    inline def setCoverageMapNull: Self = StObject.set(x, "coverageMap", null)
    
    inline def setCoverageMapUndefined: Self = StObject.set(x, "coverageMap", js.undefined)
    
    inline def setNumFailedTestSuites(value: Double): Self = StObject.set(x, "numFailedTestSuites", value.asInstanceOf[js.Any])
    
    inline def setNumFailedTests(value: Double): Self = StObject.set(x, "numFailedTests", value.asInstanceOf[js.Any])
    
    inline def setNumPassedTestSuites(value: Double): Self = StObject.set(x, "numPassedTestSuites", value.asInstanceOf[js.Any])
    
    inline def setNumPassedTests(value: Double): Self = StObject.set(x, "numPassedTests", value.asInstanceOf[js.Any])
    
    inline def setNumPendingTestSuites(value: Double): Self = StObject.set(x, "numPendingTestSuites", value.asInstanceOf[js.Any])
    
    inline def setNumPendingTests(value: Double): Self = StObject.set(x, "numPendingTests", value.asInstanceOf[js.Any])
    
    inline def setNumRuntimeErrorTestSuites(value: Double): Self = StObject.set(x, "numRuntimeErrorTestSuites", value.asInstanceOf[js.Any])
    
    inline def setNumTotalTestSuites(value: Double): Self = StObject.set(x, "numTotalTestSuites", value.asInstanceOf[js.Any])
    
    inline def setNumTotalTests(value: Double): Self = StObject.set(x, "numTotalTests", value.asInstanceOf[js.Any])
    
    inline def setSnapshot(value: SnapshotSummary): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setTestResults(value: js.Array[FormattedTestResult]): Self = StObject.set(x, "testResults", value.asInstanceOf[js.Any])
    
    inline def setTestResultsVarargs(value: FormattedTestResult*): Self = StObject.set(x, "testResults", js.Array(value :_*))
    
    inline def setWasInterrupted(value: Boolean): Self = StObject.set(x, "wasInterrupted", value.asInstanceOf[js.Any])
  }
}
