package typings.jestTestResult.typesMod

import typings.jestTestResult.jestTestResultStrings.failed
import typings.jestTestResult.jestTestResultStrings.passed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormattedTestResult extends StObject {
  
  var assertionResults: js.Array[FormattedAssertionResult] = js.native
  
  var coverage: js.Any = js.native
  
  var endTime: Double = js.native
  
  var message: String = js.native
  
  var name: String = js.native
  
  var startTime: Double = js.native
  
  var status: failed | passed = js.native
  
  var summary: String = js.native
}
object FormattedTestResult {
  
  @scala.inline
  def apply(
    assertionResults: js.Array[FormattedAssertionResult],
    coverage: js.Any,
    endTime: Double,
    message: String,
    name: String,
    startTime: Double,
    status: failed | passed,
    summary: String
  ): FormattedTestResult = {
    val __obj = js.Dynamic.literal(assertionResults = assertionResults.asInstanceOf[js.Any], coverage = coverage.asInstanceOf[js.Any], endTime = endTime.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormattedTestResult]
  }
  
  @scala.inline
  implicit class FormattedTestResultMutableBuilder[Self <: FormattedTestResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssertionResults(value: js.Array[FormattedAssertionResult]): Self = StObject.set(x, "assertionResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssertionResultsVarargs(value: FormattedAssertionResult*): Self = StObject.set(x, "assertionResults", js.Array(value :_*))
    
    @scala.inline
    def setCoverage(value: js.Any): Self = StObject.set(x, "coverage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTime(value: Double): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: failed | passed): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
  }
}
