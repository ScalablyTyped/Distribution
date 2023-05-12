package typings.jestTypes.mod

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
  
  var maxConcurrency: Double
  
  var originalGlobalErrorHandlers: js.UndefOr[GlobalErrorHandlers] = js.undefined
  
  var parentProcess: Process | Null
  
  var randomize: js.UndefOr[Boolean] = js.undefined
  
  var rootDescribeBlock: DescribeBlock
  
  var seed: Double
  
  var testNamePattern: js.UndefOr[js.RegExp | Null] = js.undefined
  
  var testTimeout: Double
  
  var unhandledErrors: js.Array[Exception]
}
object State {
  
  inline def apply(
    currentDescribeBlock: DescribeBlock,
    hasFocusedTests: Boolean,
    hasStarted: Boolean,
    includeTestLocationInResult: Boolean,
    maxConcurrency: Double,
    rootDescribeBlock: DescribeBlock,
    seed: Double,
    testTimeout: Double,
    unhandledErrors: js.Array[Exception]
  ): State = {
    val __obj = js.Dynamic.literal(currentDescribeBlock = currentDescribeBlock.asInstanceOf[js.Any], hasFocusedTests = hasFocusedTests.asInstanceOf[js.Any], hasStarted = hasStarted.asInstanceOf[js.Any], includeTestLocationInResult = includeTestLocationInResult.asInstanceOf[js.Any], maxConcurrency = maxConcurrency.asInstanceOf[js.Any], rootDescribeBlock = rootDescribeBlock.asInstanceOf[js.Any], seed = seed.asInstanceOf[js.Any], testTimeout = testTimeout.asInstanceOf[js.Any], unhandledErrors = unhandledErrors.asInstanceOf[js.Any], parentProcess = null)
    __obj.asInstanceOf[State]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: State] (val x: Self) extends AnyVal {
    
    inline def setCurrentDescribeBlock(value: DescribeBlock): Self = StObject.set(x, "currentDescribeBlock", value.asInstanceOf[js.Any])
    
    inline def setCurrentlyRunningTest(value: TestEntry): Self = StObject.set(x, "currentlyRunningTest", value.asInstanceOf[js.Any])
    
    inline def setCurrentlyRunningTestNull: Self = StObject.set(x, "currentlyRunningTest", null)
    
    inline def setCurrentlyRunningTestUndefined: Self = StObject.set(x, "currentlyRunningTest", js.undefined)
    
    inline def setExpand(value: Boolean): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    inline def setHasFocusedTests(value: Boolean): Self = StObject.set(x, "hasFocusedTests", value.asInstanceOf[js.Any])
    
    inline def setHasStarted(value: Boolean): Self = StObject.set(x, "hasStarted", value.asInstanceOf[js.Any])
    
    inline def setIncludeTestLocationInResult(value: Boolean): Self = StObject.set(x, "includeTestLocationInResult", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrency(value: Double): Self = StObject.set(x, "maxConcurrency", value.asInstanceOf[js.Any])
    
    inline def setOriginalGlobalErrorHandlers(value: GlobalErrorHandlers): Self = StObject.set(x, "originalGlobalErrorHandlers", value.asInstanceOf[js.Any])
    
    inline def setOriginalGlobalErrorHandlersUndefined: Self = StObject.set(x, "originalGlobalErrorHandlers", js.undefined)
    
    inline def setParentProcess(value: Process): Self = StObject.set(x, "parentProcess", value.asInstanceOf[js.Any])
    
    inline def setParentProcessNull: Self = StObject.set(x, "parentProcess", null)
    
    inline def setRandomize(value: Boolean): Self = StObject.set(x, "randomize", value.asInstanceOf[js.Any])
    
    inline def setRandomizeUndefined: Self = StObject.set(x, "randomize", js.undefined)
    
    inline def setRootDescribeBlock(value: DescribeBlock): Self = StObject.set(x, "rootDescribeBlock", value.asInstanceOf[js.Any])
    
    inline def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
    
    inline def setTestNamePattern(value: js.RegExp): Self = StObject.set(x, "testNamePattern", value.asInstanceOf[js.Any])
    
    inline def setTestNamePatternNull: Self = StObject.set(x, "testNamePattern", null)
    
    inline def setTestNamePatternUndefined: Self = StObject.set(x, "testNamePattern", js.undefined)
    
    inline def setTestTimeout(value: Double): Self = StObject.set(x, "testTimeout", value.asInstanceOf[js.Any])
    
    inline def setUnhandledErrors(value: js.Array[Exception]): Self = StObject.set(x, "unhandledErrors", value.asInstanceOf[js.Any])
    
    inline def setUnhandledErrorsVarargs(value: Exception*): Self = StObject.set(x, "unhandledErrors", js.Array(value*))
  }
}
