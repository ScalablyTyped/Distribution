package typings.jasmine.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomReportExpectation extends StObject {
  
  var matcherName: String
  
  var message: String
  
  var passed: Boolean
  
  var stack: String
}
object CustomReportExpectation {
  
  inline def apply(matcherName: String, message: String, passed: Boolean, stack: String): CustomReportExpectation = {
    val __obj = js.Dynamic.literal(matcherName = matcherName.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], passed = passed.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomReportExpectation]
  }
  
  extension [Self <: CustomReportExpectation](x: Self) {
    
    inline def setMatcherName(value: String): Self = StObject.set(x, "matcherName", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setPassed(value: Boolean): Self = StObject.set(x, "passed", value.asInstanceOf[js.Any])
    
    inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
  }
}
