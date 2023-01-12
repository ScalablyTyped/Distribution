package typings.jestTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunResult extends StObject {
  
  var testResults: TestResults
  
  var unhandledErrors: js.Array[FormattedError]
}
object RunResult {
  
  inline def apply(testResults: TestResults, unhandledErrors: js.Array[FormattedError]): RunResult = {
    val __obj = js.Dynamic.literal(testResults = testResults.asInstanceOf[js.Any], unhandledErrors = unhandledErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RunResult] (val x: Self) extends AnyVal {
    
    inline def setTestResults(value: TestResults): Self = StObject.set(x, "testResults", value.asInstanceOf[js.Any])
    
    inline def setTestResultsVarargs(value: TestResult2*): Self = StObject.set(x, "testResults", js.Array(value*))
    
    inline def setUnhandledErrors(value: js.Array[FormattedError]): Self = StObject.set(x, "unhandledErrors", value.asInstanceOf[js.Any])
    
    inline def setUnhandledErrorsVarargs(value: FormattedError*): Self = StObject.set(x, "unhandledErrors", js.Array(value*))
  }
}
