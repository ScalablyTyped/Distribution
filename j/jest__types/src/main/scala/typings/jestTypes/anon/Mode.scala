package typings.jestTypes.anon

import typings.jestTypes.circusMod.SyncEvent
import typings.jestTypes.circusMod.TestFn
import typings.jestTypes.circusMod.TestMode
import typings.jestTypes.circusMod.TestName
import typings.jestTypes.globalMod.DoneFn
import typings.jestTypes.jestTypesStrings.add_test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mode
  extends StObject
     with SyncEvent {
  
  var asyncError: typings.std.Error
  
  def fn(): js.UndefOr[(js.Promise[js.UndefOr[Unit | js.Any]]) | Unit]
  def fn(done: DoneFn): js.UndefOr[(js.Promise[js.UndefOr[Unit | js.Any]]) | Unit]
  @JSName("fn")
  var fn_Original: TestFn
  
  var mode: js.UndefOr[TestMode] = js.undefined
  
  var name: add_test
  
  var testName: TestName
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object Mode {
  
  inline def apply(
    asyncError: typings.std.Error,
    fn: /* done */ js.UndefOr[DoneFn] => js.UndefOr[(js.Promise[js.UndefOr[Unit | js.Any]]) | Unit],
    testName: TestName
  ): Mode = {
    val __obj = js.Dynamic.literal(asyncError = asyncError.asInstanceOf[js.Any], fn = js.Any.fromFunction1(fn), name = "add_test", testName = testName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mode]
  }
  
  extension [Self <: Mode](x: Self) {
    
    inline def setAsyncError(value: typings.std.Error): Self = StObject.set(x, "asyncError", value.asInstanceOf[js.Any])
    
    inline def setFn(value: /* done */ js.UndefOr[DoneFn] => js.UndefOr[(js.Promise[js.UndefOr[Unit | js.Any]]) | Unit]): Self = StObject.set(x, "fn", js.Any.fromFunction1(value))
    
    inline def setMode(value: TestMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setName(value: add_test): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTestName(value: TestName): Self = StObject.set(x, "testName", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
