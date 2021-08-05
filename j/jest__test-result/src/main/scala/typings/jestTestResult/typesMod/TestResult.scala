package typings.jestTestResult.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.istanbulLibCoverage.mod.CoverageMapData
import typings.jestConsole.typesMod.ConsoleBuffer
import typings.jestConsole.typesMod.LogEntry
import typings.jestTestResult.anon.Added
import typings.jestTestResult.anon.End
import typings.jestTypes.configMod.DisplayName
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestResult extends StObject {
  
  var console: js.UndefOr[ConsoleBuffer] = js.undefined
  
  var coverage: js.UndefOr[CoverageMapData] = js.undefined
  
  var displayName: js.UndefOr[DisplayName] = js.undefined
  
  var failureMessage: js.UndefOr[String | Null] = js.undefined
  
  var leaks: Boolean
  
  var memoryUsage: js.UndefOr[Bytes] = js.undefined
  
  var numFailingTests: Double
  
  var numPassingTests: Double
  
  var numPendingTests: Double
  
  var numTodoTests: Double
  
  var openHandles: js.Array[Error]
  
  var perfStats: End
  
  var skipped: Boolean
  
  var snapshot: Added
  
  var sourceMaps: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var testExecError: js.UndefOr[SerializableError] = js.undefined
  
  var testFilePath: String
  
  var testResults: js.Array[AssertionResult]
}
object TestResult {
  
  inline def apply(
    leaks: Boolean,
    numFailingTests: Double,
    numPassingTests: Double,
    numPendingTests: Double,
    numTodoTests: Double,
    openHandles: js.Array[Error],
    perfStats: End,
    skipped: Boolean,
    snapshot: Added,
    testFilePath: String,
    testResults: js.Array[AssertionResult]
  ): TestResult = {
    val __obj = js.Dynamic.literal(leaks = leaks.asInstanceOf[js.Any], numFailingTests = numFailingTests.asInstanceOf[js.Any], numPassingTests = numPassingTests.asInstanceOf[js.Any], numPendingTests = numPendingTests.asInstanceOf[js.Any], numTodoTests = numTodoTests.asInstanceOf[js.Any], openHandles = openHandles.asInstanceOf[js.Any], perfStats = perfStats.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any], testFilePath = testFilePath.asInstanceOf[js.Any], testResults = testResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResult]
  }
  
  extension [Self <: TestResult](x: Self) {
    
    inline def setConsole(value: ConsoleBuffer): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
    
    inline def setConsoleUndefined: Self = StObject.set(x, "console", js.undefined)
    
    inline def setConsoleVarargs(value: LogEntry*): Self = StObject.set(x, "console", js.Array(value :_*))
    
    inline def setCoverage(value: CoverageMapData): Self = StObject.set(x, "coverage", value.asInstanceOf[js.Any])
    
    inline def setCoverageUndefined: Self = StObject.set(x, "coverage", js.undefined)
    
    inline def setDisplayName(value: DisplayName): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFailureMessage(value: String): Self = StObject.set(x, "failureMessage", value.asInstanceOf[js.Any])
    
    inline def setFailureMessageNull: Self = StObject.set(x, "failureMessage", null)
    
    inline def setFailureMessageUndefined: Self = StObject.set(x, "failureMessage", js.undefined)
    
    inline def setLeaks(value: Boolean): Self = StObject.set(x, "leaks", value.asInstanceOf[js.Any])
    
    inline def setMemoryUsage(value: Bytes): Self = StObject.set(x, "memoryUsage", value.asInstanceOf[js.Any])
    
    inline def setMemoryUsageUndefined: Self = StObject.set(x, "memoryUsage", js.undefined)
    
    inline def setNumFailingTests(value: Double): Self = StObject.set(x, "numFailingTests", value.asInstanceOf[js.Any])
    
    inline def setNumPassingTests(value: Double): Self = StObject.set(x, "numPassingTests", value.asInstanceOf[js.Any])
    
    inline def setNumPendingTests(value: Double): Self = StObject.set(x, "numPendingTests", value.asInstanceOf[js.Any])
    
    inline def setNumTodoTests(value: Double): Self = StObject.set(x, "numTodoTests", value.asInstanceOf[js.Any])
    
    inline def setOpenHandles(value: js.Array[Error]): Self = StObject.set(x, "openHandles", value.asInstanceOf[js.Any])
    
    inline def setOpenHandlesVarargs(value: Error*): Self = StObject.set(x, "openHandles", js.Array(value :_*))
    
    inline def setPerfStats(value: End): Self = StObject.set(x, "perfStats", value.asInstanceOf[js.Any])
    
    inline def setSkipped(value: Boolean): Self = StObject.set(x, "skipped", value.asInstanceOf[js.Any])
    
    inline def setSnapshot(value: Added): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    inline def setSourceMaps(value: StringDictionary[String]): Self = StObject.set(x, "sourceMaps", value.asInstanceOf[js.Any])
    
    inline def setSourceMapsUndefined: Self = StObject.set(x, "sourceMaps", js.undefined)
    
    inline def setTestExecError(value: SerializableError): Self = StObject.set(x, "testExecError", value.asInstanceOf[js.Any])
    
    inline def setTestExecErrorUndefined: Self = StObject.set(x, "testExecError", js.undefined)
    
    inline def setTestFilePath(value: String): Self = StObject.set(x, "testFilePath", value.asInstanceOf[js.Any])
    
    inline def setTestResults(value: js.Array[AssertionResult]): Self = StObject.set(x, "testResults", value.asInstanceOf[js.Any])
    
    inline def setTestResultsVarargs(value: AssertionResult*): Self = StObject.set(x, "testResults", js.Array(value :_*))
  }
}
