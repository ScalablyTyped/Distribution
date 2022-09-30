package typings.jestTestResult.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailedAssertion extends StObject {
  
  var actual: js.UndefOr[Any] = js.undefined
  
  var error: js.UndefOr[Any] = js.undefined
  
  var expected: js.UndefOr[Any] = js.undefined
  
  var isNot: js.UndefOr[Boolean] = js.undefined
  
  var matcherName: js.UndefOr[String] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var pass: js.UndefOr[Boolean] = js.undefined
  
  var passed: js.UndefOr[Boolean] = js.undefined
  
  var stack: js.UndefOr[String] = js.undefined
}
object FailedAssertion {
  
  inline def apply(): FailedAssertion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailedAssertion]
  }
  
  extension [Self <: FailedAssertion](x: Self) {
    
    inline def setActual(value: Any): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
    
    inline def setActualUndefined: Self = StObject.set(x, "actual", js.undefined)
    
    inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setExpected(value: Any): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
    
    inline def setExpectedUndefined: Self = StObject.set(x, "expected", js.undefined)
    
    inline def setIsNot(value: Boolean): Self = StObject.set(x, "isNot", value.asInstanceOf[js.Any])
    
    inline def setIsNotUndefined: Self = StObject.set(x, "isNot", js.undefined)
    
    inline def setMatcherName(value: String): Self = StObject.set(x, "matcherName", value.asInstanceOf[js.Any])
    
    inline def setMatcherNameUndefined: Self = StObject.set(x, "matcherName", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setPass(value: Boolean): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
    
    inline def setPassUndefined: Self = StObject.set(x, "pass", js.undefined)
    
    inline def setPassed(value: Boolean): Self = StObject.set(x, "passed", value.asInstanceOf[js.Any])
    
    inline def setPassedUndefined: Self = StObject.set(x, "passed", js.undefined)
    
    inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
  }
}
