package typings.jestTypes.circusMod

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait State extends StObject {
  
  var currentDescribeBlock: DescribeBlock
  
  var currentlyRunningTest: js.UndefOr[TestEntry | Null] = js.undefined
  
  var expand: js.UndefOr[Boolean] = js.undefined
  
  var hasFocusedTests: Boolean
  
  var hasStarted: Boolean
  
  var includeTestLocationInResult: Boolean
  
  var originalGlobalErrorHandlers: js.UndefOr[GlobalErrorHandlers] = js.undefined
  
  var parentProcess: Process | Null
  
  var rootDescribeBlock: DescribeBlock
  
  var testNamePattern: js.UndefOr[RegExp | Null] = js.undefined
  
  var testTimeout: Double
  
  var unhandledErrors: js.Array[Exception]
}
object State {
  
  @scala.inline
  def apply(
    currentDescribeBlock: DescribeBlock,
    hasFocusedTests: Boolean,
    hasStarted: Boolean,
    includeTestLocationInResult: Boolean,
    rootDescribeBlock: DescribeBlock,
    testTimeout: Double,
    unhandledErrors: js.Array[Exception]
  ): State = {
    val __obj = js.Dynamic.literal(currentDescribeBlock = currentDescribeBlock.asInstanceOf[js.Any], hasFocusedTests = hasFocusedTests.asInstanceOf[js.Any], hasStarted = hasStarted.asInstanceOf[js.Any], includeTestLocationInResult = includeTestLocationInResult.asInstanceOf[js.Any], rootDescribeBlock = rootDescribeBlock.asInstanceOf[js.Any], testTimeout = testTimeout.asInstanceOf[js.Any], unhandledErrors = unhandledErrors.asInstanceOf[js.Any], parentProcess = null)
    __obj.asInstanceOf[State]
  }
  
  @scala.inline
  implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentDescribeBlock(value: DescribeBlock): Self = StObject.set(x, "currentDescribeBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentlyRunningTest(value: TestEntry): Self = StObject.set(x, "currentlyRunningTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentlyRunningTestNull: Self = StObject.set(x, "currentlyRunningTest", null)
    
    @scala.inline
    def setCurrentlyRunningTestUndefined: Self = StObject.set(x, "currentlyRunningTest", js.undefined)
    
    @scala.inline
    def setExpand(value: Boolean): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    @scala.inline
    def setHasFocusedTests(value: Boolean): Self = StObject.set(x, "hasFocusedTests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasStarted(value: Boolean): Self = StObject.set(x, "hasStarted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeTestLocationInResult(value: Boolean): Self = StObject.set(x, "includeTestLocationInResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalGlobalErrorHandlers(value: GlobalErrorHandlers): Self = StObject.set(x, "originalGlobalErrorHandlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalGlobalErrorHandlersUndefined: Self = StObject.set(x, "originalGlobalErrorHandlers", js.undefined)
    
    @scala.inline
    def setParentProcess(value: Process): Self = StObject.set(x, "parentProcess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentProcessNull: Self = StObject.set(x, "parentProcess", null)
    
    @scala.inline
    def setRootDescribeBlock(value: DescribeBlock): Self = StObject.set(x, "rootDescribeBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestNamePattern(value: RegExp): Self = StObject.set(x, "testNamePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestNamePatternNull: Self = StObject.set(x, "testNamePattern", null)
    
    @scala.inline
    def setTestNamePatternUndefined: Self = StObject.set(x, "testNamePattern", js.undefined)
    
    @scala.inline
    def setTestTimeout(value: Double): Self = StObject.set(x, "testTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnhandledErrors(value: js.Array[Exception]): Self = StObject.set(x, "unhandledErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnhandledErrorsVarargs(value: Exception*): Self = StObject.set(x, "unhandledErrors", js.Array(value :_*))
  }
}
