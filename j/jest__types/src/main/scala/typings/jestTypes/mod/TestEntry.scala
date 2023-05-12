package typings.jestTypes.mod

import typings.jestTypes.jestTypesStrings.test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestEntry extends StObject {
  
  var asyncError: Exception
  
  var concurrent: Boolean
  
  var duration: js.UndefOr[Double | Null] = js.undefined
  
  var errors: js.Array[TestError]
  
  var failing: Boolean
  
  var fn: TestFn2
  
  var invocations: Double
  
  var mode: TestMode
  
  var name: TestName2
  
  var numPassingAsserts: Double
  
  var parent: DescribeBlock
  
  var retryReasons: js.Array[TestError]
  
  var seenDone: Boolean
  
  var startedAt: js.UndefOr[Double | Null] = js.undefined
  
  var status: js.UndefOr[TestStatus | Null] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var `type`: test
}
object TestEntry {
  
  inline def apply(
    asyncError: Exception,
    concurrent: Boolean,
    errors: js.Array[TestError],
    failing: Boolean,
    fn: TestFn2,
    invocations: Double,
    mode: TestMode,
    name: TestName2,
    numPassingAsserts: Double,
    parent: DescribeBlock,
    retryReasons: js.Array[TestError],
    seenDone: Boolean
  ): TestEntry = {
    val __obj = js.Dynamic.literal(asyncError = asyncError.asInstanceOf[js.Any], concurrent = concurrent.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], failing = failing.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any], invocations = invocations.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], numPassingAsserts = numPassingAsserts.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], retryReasons = retryReasons.asInstanceOf[js.Any], seenDone = seenDone.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("test")
    __obj.asInstanceOf[TestEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestEntry] (val x: Self) extends AnyVal {
    
    inline def setAsyncError(value: Exception): Self = StObject.set(x, "asyncError", value.asInstanceOf[js.Any])
    
    inline def setConcurrent(value: Boolean): Self = StObject.set(x, "concurrent", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationNull: Self = StObject.set(x, "duration", null)
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setErrors(value: js.Array[TestError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: TestError*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setFailing(value: Boolean): Self = StObject.set(x, "failing", value.asInstanceOf[js.Any])
    
    inline def setFn(value: TestFn2): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setInvocations(value: Double): Self = StObject.set(x, "invocations", value.asInstanceOf[js.Any])
    
    inline def setMode(value: TestMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setName(value: TestName2): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNumPassingAsserts(value: Double): Self = StObject.set(x, "numPassingAsserts", value.asInstanceOf[js.Any])
    
    inline def setParent(value: DescribeBlock): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setRetryReasons(value: js.Array[TestError]): Self = StObject.set(x, "retryReasons", value.asInstanceOf[js.Any])
    
    inline def setRetryReasonsVarargs(value: TestError*): Self = StObject.set(x, "retryReasons", js.Array(value*))
    
    inline def setSeenDone(value: Boolean): Self = StObject.set(x, "seenDone", value.asInstanceOf[js.Any])
    
    inline def setStartedAt(value: Double): Self = StObject.set(x, "startedAt", value.asInstanceOf[js.Any])
    
    inline def setStartedAtNull: Self = StObject.set(x, "startedAt", null)
    
    inline def setStartedAtUndefined: Self = StObject.set(x, "startedAt", js.undefined)
    
    inline def setStatus(value: TestStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setType(value: test): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
