package typings.jestTestResult.typesMod

import typings.istanbulLibCoverage.mod.CoverageMap
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @jest/test-result.@jest/test-result/build/types.AggregatedResultWithoutCoverage & {  coverageMap :istanbul-lib-coverage.istanbul-lib-coverage.CoverageMap | null | undefined} */
@js.native
trait AggregatedResult extends StObject {
  
  var coverageMap: js.UndefOr[CoverageMap | Null] = js.native
  
  var numFailedTestSuites: Double = js.native
  
  var numFailedTests: Double = js.native
  
  var numPassedTestSuites: Double = js.native
  
  var numPassedTests: Double = js.native
  
  var numPendingTestSuites: Double = js.native
  
  var numPendingTests: Double = js.native
  
  var numRuntimeErrorTestSuites: Double = js.native
  
  var numTodoTests: Double = js.native
  
  var numTotalTestSuites: Double = js.native
  
  var numTotalTests: Double = js.native
  
  var openHandles: js.Array[Error] = js.native
  
  var snapshot: SnapshotSummary = js.native
  
  var startTime: Double = js.native
  
  var success: Boolean = js.native
  
  var testResults: js.Array[TestResult] = js.native
  
  var wasInterrupted: Boolean = js.native
}
object AggregatedResult {
  
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
  ): AggregatedResult = {
    val __obj = js.Dynamic.literal(numFailedTestSuites = numFailedTestSuites.asInstanceOf[js.Any], numFailedTests = numFailedTests.asInstanceOf[js.Any], numPassedTestSuites = numPassedTestSuites.asInstanceOf[js.Any], numPassedTests = numPassedTests.asInstanceOf[js.Any], numPendingTestSuites = numPendingTestSuites.asInstanceOf[js.Any], numPendingTests = numPendingTests.asInstanceOf[js.Any], numRuntimeErrorTestSuites = numRuntimeErrorTestSuites.asInstanceOf[js.Any], numTodoTests = numTodoTests.asInstanceOf[js.Any], numTotalTestSuites = numTotalTestSuites.asInstanceOf[js.Any], numTotalTests = numTotalTests.asInstanceOf[js.Any], openHandles = openHandles.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], testResults = testResults.asInstanceOf[js.Any], wasInterrupted = wasInterrupted.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregatedResult]
  }
  
  @scala.inline
  implicit class AggregatedResultMutableBuilder[Self <: AggregatedResult] (val x: Self) extends AnyVal {
    
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
    def setNumTodoTests(value: Double): Self = StObject.set(x, "numTodoTests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumTotalTestSuites(value: Double): Self = StObject.set(x, "numTotalTestSuites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumTotalTests(value: Double): Self = StObject.set(x, "numTotalTests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenHandles(value: js.Array[Error]): Self = StObject.set(x, "openHandles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenHandlesVarargs(value: Error*): Self = StObject.set(x, "openHandles", js.Array(value :_*))
    
    @scala.inline
    def setSnapshot(value: SnapshotSummary): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestResults(value: js.Array[TestResult]): Self = StObject.set(x, "testResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestResultsVarargs(value: TestResult*): Self = StObject.set(x, "testResults", js.Array(value :_*))
    
    @scala.inline
    def setWasInterrupted(value: Boolean): Self = StObject.set(x, "wasInterrupted", value.asInstanceOf[js.Any])
  }
}
