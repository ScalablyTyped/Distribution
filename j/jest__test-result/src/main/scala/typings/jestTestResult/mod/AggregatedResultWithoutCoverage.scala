package typings.jestTestResult.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregatedResultWithoutCoverage extends StObject {
  
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
  
  var openHandles: js.Array[js.Error]
  
  var runExecError: js.UndefOr[SerializableError] = js.undefined
  
  var snapshot: SnapshotSummary
  
  var startTime: Double
  
  var success: Boolean
  
  var testResults: js.Array[TestResult]
  
  var wasInterrupted: Boolean
}
object AggregatedResultWithoutCoverage {
  
  inline def apply(
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
    openHandles: js.Array[js.Error],
    snapshot: SnapshotSummary,
    startTime: Double,
    success: Boolean,
    testResults: js.Array[TestResult],
    wasInterrupted: Boolean
  ): AggregatedResultWithoutCoverage = {
    val __obj = js.Dynamic.literal(numFailedTestSuites = numFailedTestSuites.asInstanceOf[js.Any], numFailedTests = numFailedTests.asInstanceOf[js.Any], numPassedTestSuites = numPassedTestSuites.asInstanceOf[js.Any], numPassedTests = numPassedTests.asInstanceOf[js.Any], numPendingTestSuites = numPendingTestSuites.asInstanceOf[js.Any], numPendingTests = numPendingTests.asInstanceOf[js.Any], numRuntimeErrorTestSuites = numRuntimeErrorTestSuites.asInstanceOf[js.Any], numTodoTests = numTodoTests.asInstanceOf[js.Any], numTotalTestSuites = numTotalTestSuites.asInstanceOf[js.Any], numTotalTests = numTotalTests.asInstanceOf[js.Any], openHandles = openHandles.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], testResults = testResults.asInstanceOf[js.Any], wasInterrupted = wasInterrupted.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregatedResultWithoutCoverage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregatedResultWithoutCoverage] (val x: Self) extends AnyVal {
    
    inline def setNumFailedTestSuites(value: Double): Self = StObject.set(x, "numFailedTestSuites", value.asInstanceOf[js.Any])
    
    inline def setNumFailedTests(value: Double): Self = StObject.set(x, "numFailedTests", value.asInstanceOf[js.Any])
    
    inline def setNumPassedTestSuites(value: Double): Self = StObject.set(x, "numPassedTestSuites", value.asInstanceOf[js.Any])
    
    inline def setNumPassedTests(value: Double): Self = StObject.set(x, "numPassedTests", value.asInstanceOf[js.Any])
    
    inline def setNumPendingTestSuites(value: Double): Self = StObject.set(x, "numPendingTestSuites", value.asInstanceOf[js.Any])
    
    inline def setNumPendingTests(value: Double): Self = StObject.set(x, "numPendingTests", value.asInstanceOf[js.Any])
    
    inline def setNumRuntimeErrorTestSuites(value: Double): Self = StObject.set(x, "numRuntimeErrorTestSuites", value.asInstanceOf[js.Any])
    
    inline def setNumTodoTests(value: Double): Self = StObject.set(x, "numTodoTests", value.asInstanceOf[js.Any])
    
    inline def setNumTotalTestSuites(value: Double): Self = StObject.set(x, "numTotalTestSuites", value.asInstanceOf[js.Any])
    
    inline def setNumTotalTests(value: Double): Self = StObject.set(x, "numTotalTests", value.asInstanceOf[js.Any])
    
    inline def setOpenHandles(value: js.Array[js.Error]): Self = StObject.set(x, "openHandles", value.asInstanceOf[js.Any])
    
    inline def setOpenHandlesVarargs(value: js.Error*): Self = StObject.set(x, "openHandles", js.Array(value*))
    
    inline def setRunExecError(value: SerializableError): Self = StObject.set(x, "runExecError", value.asInstanceOf[js.Any])
    
    inline def setRunExecErrorUndefined: Self = StObject.set(x, "runExecError", js.undefined)
    
    inline def setSnapshot(value: SnapshotSummary): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setTestResults(value: js.Array[TestResult]): Self = StObject.set(x, "testResults", value.asInstanceOf[js.Any])
    
    inline def setTestResultsVarargs(value: TestResult*): Self = StObject.set(x, "testResults", js.Array(value*))
    
    inline def setWasInterrupted(value: Boolean): Self = StObject.set(x, "wasInterrupted", value.asInstanceOf[js.Any])
  }
}
