package typings.jestTestResult.mod

import typings.jestTestResult.jestTestResultStrings.failed
import typings.jestTestResult.jestTestResultStrings.focused
import typings.jestTestResult.jestTestResultStrings.passed
import typings.jestTestResult.jestTestResultStrings.skipped
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormattedTestResult extends StObject {
  
  var assertionResults: js.Array[FormattedAssertionResult]
  
  var coverage: Any
  
  var endTime: Double
  
  var message: String
  
  var name: String
  
  var startTime: Double
  
  var status: failed | passed | skipped | focused
  
  var summary: String
}
object FormattedTestResult {
  
  inline def apply(
    assertionResults: js.Array[FormattedAssertionResult],
    coverage: Any,
    endTime: Double,
    message: String,
    name: String,
    startTime: Double,
    status: failed | passed | skipped | focused,
    summary: String
  ): FormattedTestResult = {
    val __obj = js.Dynamic.literal(assertionResults = assertionResults.asInstanceOf[js.Any], coverage = coverage.asInstanceOf[js.Any], endTime = endTime.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormattedTestResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormattedTestResult] (val x: Self) extends AnyVal {
    
    inline def setAssertionResults(value: js.Array[FormattedAssertionResult]): Self = StObject.set(x, "assertionResults", value.asInstanceOf[js.Any])
    
    inline def setAssertionResultsVarargs(value: FormattedAssertionResult*): Self = StObject.set(x, "assertionResults", js.Array(value*))
    
    inline def setCoverage(value: Any): Self = StObject.set(x, "coverage", value.asInstanceOf[js.Any])
    
    inline def setEndTime(value: Double): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: failed | passed | skipped | focused): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
  }
}
