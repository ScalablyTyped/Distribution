package typings.jest.mod.jest

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatcherState extends StObject {
  
  var assertionCalls: Double
  
  var currentTestName: String
  
  var expand: Boolean
  
  var expectedAssertionsNumber: Double
  
  var isExpectingAssertions: js.UndefOr[Boolean] = js.undefined
  
  var suppressedErrors: js.Array[Error]
  
  var testPath: String
}
object MatcherState {
  
  inline def apply(
    assertionCalls: Double,
    currentTestName: String,
    expand: Boolean,
    expectedAssertionsNumber: Double,
    suppressedErrors: js.Array[Error],
    testPath: String
  ): MatcherState = {
    val __obj = js.Dynamic.literal(assertionCalls = assertionCalls.asInstanceOf[js.Any], currentTestName = currentTestName.asInstanceOf[js.Any], expand = expand.asInstanceOf[js.Any], expectedAssertionsNumber = expectedAssertionsNumber.asInstanceOf[js.Any], suppressedErrors = suppressedErrors.asInstanceOf[js.Any], testPath = testPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatcherState]
  }
  
  extension [Self <: MatcherState](x: Self) {
    
    inline def setAssertionCalls(value: Double): Self = StObject.set(x, "assertionCalls", value.asInstanceOf[js.Any])
    
    inline def setCurrentTestName(value: String): Self = StObject.set(x, "currentTestName", value.asInstanceOf[js.Any])
    
    inline def setExpand(value: Boolean): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    inline def setExpectedAssertionsNumber(value: Double): Self = StObject.set(x, "expectedAssertionsNumber", value.asInstanceOf[js.Any])
    
    inline def setIsExpectingAssertions(value: Boolean): Self = StObject.set(x, "isExpectingAssertions", value.asInstanceOf[js.Any])
    
    inline def setIsExpectingAssertionsUndefined: Self = StObject.set(x, "isExpectingAssertions", js.undefined)
    
    inline def setSuppressedErrors(value: js.Array[Error]): Self = StObject.set(x, "suppressedErrors", value.asInstanceOf[js.Any])
    
    inline def setSuppressedErrorsVarargs(value: Error*): Self = StObject.set(x, "suppressedErrors", js.Array(value :_*))
    
    inline def setTestPath(value: String): Self = StObject.set(x, "testPath", value.asInstanceOf[js.Any])
  }
}
