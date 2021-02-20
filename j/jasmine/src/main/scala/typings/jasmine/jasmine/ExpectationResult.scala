package typings.jasmine.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpectationResult extends Result {
  
  var actual: js.Any = js.native
  
  var expected: js.Any = js.native
  
  var matcherName: String = js.native
  
  var message: String = js.native
  
  def passed(): Boolean = js.native
  
  var trace: Trace = js.native
}
object ExpectationResult {
  
  @scala.inline
  def apply(
    actual: js.Any,
    expected: js.Any,
    matcherName: String,
    message: String,
    passed: () => Boolean,
    trace: Trace,
    `type`: String
  ): ExpectationResult = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any], matcherName = matcherName.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], passed = js.Any.fromFunction0(passed), trace = trace.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpectationResult]
  }
  
  @scala.inline
  implicit class ExpectationResultMutableBuilder[Self <: ExpectationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActual(value: js.Any): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpected(value: js.Any): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatcherName(value: String): Self = StObject.set(x, "matcherName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassed(value: () => Boolean): Self = StObject.set(x, "passed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTrace(value: Trace): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
  }
}
