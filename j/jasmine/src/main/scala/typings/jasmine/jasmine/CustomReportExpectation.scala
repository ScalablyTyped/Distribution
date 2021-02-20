package typings.jasmine.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomReportExpectation extends StObject {
  
  var matcherName: String = js.native
  
  var message: String = js.native
  
  var passed: Boolean = js.native
  
  var stack: String = js.native
}
object CustomReportExpectation {
  
  @scala.inline
  def apply(matcherName: String, message: String, passed: Boolean, stack: String): CustomReportExpectation = {
    val __obj = js.Dynamic.literal(matcherName = matcherName.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], passed = passed.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomReportExpectation]
  }
  
  @scala.inline
  implicit class CustomReportExpectationMutableBuilder[Self <: CustomReportExpectation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMatcherName(value: String): Self = StObject.set(x, "matcherName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassed(value: Boolean): Self = StObject.set(x, "passed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
  }
}
