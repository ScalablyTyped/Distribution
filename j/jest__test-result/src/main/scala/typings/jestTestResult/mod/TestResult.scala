package typings.jestTestResult.mod

import typings.istanbulLibCoverage.mod.CoverageMapData
import typings.jestConsole.mod.ConsoleBuffer
import typings.jestConsole.mod.LogEntry
import typings.jestTestResult.anon.Added
import typings.jestTestResult.anon.CodeTransformResult
import typings.jestTestResult.anon.End
import typings.jestTypes.mod.DisplayName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestResult extends StObject {
  
  var console: js.UndefOr[ConsoleBuffer] = js.undefined
  
  var coverage: js.UndefOr[CoverageMapData] = js.undefined
  
  var displayName: js.UndefOr[DisplayName] = js.undefined
  
  var failureMessage: js.UndefOr[String | Null] = js.undefined
  
  var leaks: Boolean
  
  var memoryUsage: js.UndefOr[Double] = js.undefined
  
  var numFailingTests: Double
  
  var numPassingTests: Double
  
  var numPendingTests: Double
  
  var numTodoTests: Double
  
  var openHandles: js.Array[js.Error]
  
  var perfStats: End
  
  var skipped: Boolean
  
  var snapshot: Added
  
  var testExecError: js.UndefOr[SerializableError] = js.undefined
  
  var testFilePath: String
  
  var testResults: js.Array[AssertionResult]
  
  var v8Coverage: js.UndefOr[V8CoverageResult] = js.undefined
}
object TestResult {
  
  inline def apply(
    leaks: Boolean,
    numFailingTests: Double,
    numPassingTests: Double,
    numPendingTests: Double,
    numTodoTests: Double,
    openHandles: js.Array[js.Error],
    perfStats: End,
    skipped: Boolean,
    snapshot: Added,
    testFilePath: String,
    testResults: js.Array[AssertionResult]
  ): TestResult = {
    val __obj = js.Dynamic.literal(leaks = leaks.asInstanceOf[js.Any], numFailingTests = numFailingTests.asInstanceOf[js.Any], numPassingTests = numPassingTests.asInstanceOf[js.Any], numPendingTests = numPendingTests.asInstanceOf[js.Any], numTodoTests = numTodoTests.asInstanceOf[js.Any], openHandles = openHandles.asInstanceOf[js.Any], perfStats = perfStats.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any], testFilePath = testFilePath.asInstanceOf[js.Any], testResults = testResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestResult] (val x: Self) extends AnyVal {
    
    inline def setConsole(value: ConsoleBuffer): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
    
    inline def setConsoleUndefined: Self = StObject.set(x, "console", js.undefined)
    
    inline def setConsoleVarargs(value: LogEntry*): Self = StObject.set(x, "console", js.Array(value*))
    
    inline def setCoverage(value: CoverageMapData): Self = StObject.set(x, "coverage", value.asInstanceOf[js.Any])
    
    inline def setCoverageUndefined: Self = StObject.set(x, "coverage", js.undefined)
    
    inline def setDisplayName(value: DisplayName): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFailureMessage(value: String): Self = StObject.set(x, "failureMessage", value.asInstanceOf[js.Any])
    
    inline def setFailureMessageNull: Self = StObject.set(x, "failureMessage", null)
    
    inline def setFailureMessageUndefined: Self = StObject.set(x, "failureMessage", js.undefined)
    
    inline def setLeaks(value: Boolean): Self = StObject.set(x, "leaks", value.asInstanceOf[js.Any])
    
    inline def setMemoryUsage(value: Double): Self = StObject.set(x, "memoryUsage", value.asInstanceOf[js.Any])
    
    inline def setMemoryUsageUndefined: Self = StObject.set(x, "memoryUsage", js.undefined)
    
    inline def setNumFailingTests(value: Double): Self = StObject.set(x, "numFailingTests", value.asInstanceOf[js.Any])
    
    inline def setNumPassingTests(value: Double): Self = StObject.set(x, "numPassingTests", value.asInstanceOf[js.Any])
    
    inline def setNumPendingTests(value: Double): Self = StObject.set(x, "numPendingTests", value.asInstanceOf[js.Any])
    
    inline def setNumTodoTests(value: Double): Self = StObject.set(x, "numTodoTests", value.asInstanceOf[js.Any])
    
    inline def setOpenHandles(value: js.Array[js.Error]): Self = StObject.set(x, "openHandles", value.asInstanceOf[js.Any])
    
    inline def setOpenHandlesVarargs(value: js.Error*): Self = StObject.set(x, "openHandles", js.Array(value*))
    
    inline def setPerfStats(value: End): Self = StObject.set(x, "perfStats", value.asInstanceOf[js.Any])
    
    inline def setSkipped(value: Boolean): Self = StObject.set(x, "skipped", value.asInstanceOf[js.Any])
    
    inline def setSnapshot(value: Added): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    inline def setTestExecError(value: SerializableError): Self = StObject.set(x, "testExecError", value.asInstanceOf[js.Any])
    
    inline def setTestExecErrorUndefined: Self = StObject.set(x, "testExecError", js.undefined)
    
    inline def setTestFilePath(value: String): Self = StObject.set(x, "testFilePath", value.asInstanceOf[js.Any])
    
    inline def setTestResults(value: js.Array[AssertionResult]): Self = StObject.set(x, "testResults", value.asInstanceOf[js.Any])
    
    inline def setTestResultsVarargs(value: AssertionResult*): Self = StObject.set(x, "testResults", js.Array(value*))
    
    inline def setV8Coverage(value: V8CoverageResult): Self = StObject.set(x, "v8Coverage", value.asInstanceOf[js.Any])
    
    inline def setV8CoverageUndefined: Self = StObject.set(x, "v8Coverage", js.undefined)
    
    inline def setV8CoverageVarargs(value: CodeTransformResult*): Self = StObject.set(x, "v8Coverage", js.Array(value*))
  }
}
