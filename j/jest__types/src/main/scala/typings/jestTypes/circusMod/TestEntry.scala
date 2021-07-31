package typings.jestTypes.circusMod

import typings.jestTypes.jestTypesStrings.test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestEntry extends StObject {
  
  var asyncError: Exception
  
  var duration: js.UndefOr[Double | Null] = js.undefined
  
  var errors: js.Array[TestError]
  
  def fn(): js.UndefOr[(js.Promise[js.UndefOr[Unit | js.Any]]) | Unit]
  def fn(done: typings.jestTypes.globalMod.DoneFn): js.UndefOr[(js.Promise[js.UndefOr[Unit | js.Any]]) | Unit]
  @JSName("fn")
  var fn_Original: TestFn
  
  var invocations: Double
  
  var mode: TestMode
  
  var name: TestName
  
  var parent: DescribeBlock
  
  var startedAt: js.UndefOr[Double | Null] = js.undefined
  
  var status: js.UndefOr[TestStatus | Null] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var `type`: test
}
object TestEntry {
  
  @scala.inline
  def apply(
    asyncError: Exception,
    errors: js.Array[TestError],
    fn: /* done */ js.UndefOr[typings.jestTypes.globalMod.DoneFn] => js.UndefOr[(js.Promise[js.UndefOr[Unit | js.Any]]) | Unit],
    invocations: Double,
    mode: TestMode,
    name: TestName,
    parent: DescribeBlock
  ): TestEntry = {
    val __obj = js.Dynamic.literal(asyncError = asyncError.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], fn = js.Any.fromFunction1(fn), invocations = invocations.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("test")
    __obj.asInstanceOf[TestEntry]
  }
  
  @scala.inline
  implicit class TestEntryMutableBuilder[Self <: TestEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsyncError(value: Exception): Self = StObject.set(x, "asyncError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationNull: Self = StObject.set(x, "duration", null)
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setErrors(value: js.Array[TestError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: TestError*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setFn(
      value: /* done */ js.UndefOr[typings.jestTypes.globalMod.DoneFn] => js.UndefOr[(js.Promise[js.UndefOr[Unit | js.Any]]) | Unit]
    ): Self = StObject.set(x, "fn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInvocations(value: Double): Self = StObject.set(x, "invocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: TestMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: TestName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: DescribeBlock): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedAt(value: Double): Self = StObject.set(x, "startedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedAtNull: Self = StObject.set(x, "startedAt", null)
    
    @scala.inline
    def setStartedAtUndefined: Self = StObject.set(x, "startedAt", js.undefined)
    
    @scala.inline
    def setStatus(value: TestStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = StObject.set(x, "status", null)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setType(value: test): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
