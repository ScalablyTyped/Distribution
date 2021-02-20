package typings.jest.mod.jest

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatcherState extends StObject {
  
  var assertionCalls: Double = js.native
  
  var currentTestName: String = js.native
  
  var expand: Boolean = js.native
  
  var expectedAssertionsNumber: Double = js.native
  
  var isExpectingAssertions: js.UndefOr[Boolean] = js.native
  
  var suppressedErrors: js.Array[Error] = js.native
  
  var testPath: String = js.native
}
object MatcherState {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class MatcherStateMutableBuilder[Self <: MatcherState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssertionCalls(value: Double): Self = StObject.set(x, "assertionCalls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTestName(value: String): Self = StObject.set(x, "currentTestName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpand(value: Boolean): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedAssertionsNumber(value: Double): Self = StObject.set(x, "expectedAssertionsNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExpectingAssertions(value: Boolean): Self = StObject.set(x, "isExpectingAssertions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExpectingAssertionsUndefined: Self = StObject.set(x, "isExpectingAssertions", js.undefined)
    
    @scala.inline
    def setSuppressedErrors(value: js.Array[Error]): Self = StObject.set(x, "suppressedErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressedErrorsVarargs(value: Error*): Self = StObject.set(x, "suppressedErrors", js.Array(value :_*))
    
    @scala.inline
    def setTestPath(value: String): Self = StObject.set(x, "testPath", value.asInstanceOf[js.Any])
  }
}
