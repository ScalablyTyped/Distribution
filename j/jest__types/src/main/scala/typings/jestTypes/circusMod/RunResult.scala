package typings.jestTypes.circusMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunResult extends StObject {
  
  var testResults: TestResults
  
  var unhandledErrors: js.Array[FormattedError]
}
object RunResult {
  
  @scala.inline
  def apply(testResults: TestResults, unhandledErrors: js.Array[FormattedError]): RunResult = {
    val __obj = js.Dynamic.literal(testResults = testResults.asInstanceOf[js.Any], unhandledErrors = unhandledErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunResult]
  }
  
  @scala.inline
  implicit class RunResultMutableBuilder[Self <: RunResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTestResults(value: TestResults): Self = StObject.set(x, "testResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestResultsVarargs(value: TestResult*): Self = StObject.set(x, "testResults", js.Array(value :_*))
    
    @scala.inline
    def setUnhandledErrors(value: js.Array[FormattedError]): Self = StObject.set(x, "unhandledErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnhandledErrorsVarargs(value: FormattedError*): Self = StObject.set(x, "unhandledErrors", js.Array(value :_*))
  }
}
