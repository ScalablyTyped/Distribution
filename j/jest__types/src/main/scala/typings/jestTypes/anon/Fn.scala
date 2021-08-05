package typings.jestTypes.anon

import typings.jestTypes.circusMod.HookFn
import typings.jestTypes.circusMod.HookType
import typings.jestTypes.circusMod.SyncEvent
import typings.jestTypes.globalMod.DoneFn
import typings.jestTypes.jestTypesStrings.add_hook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fn
  extends StObject
     with SyncEvent {
  
  var asyncError: typings.std.Error
  
  def fn(): js.UndefOr[(js.Promise[js.UndefOr[Unit | js.Any]]) | Unit]
  def fn(done: DoneFn): js.UndefOr[(js.Promise[js.UndefOr[Unit | js.Any]]) | Unit]
  @JSName("fn")
  var fn_Original: HookFn
  
  var hookType: HookType
  
  var name: add_hook
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object Fn {
  
  inline def apply(
    asyncError: typings.std.Error,
    fn: /* done */ js.UndefOr[DoneFn] => js.UndefOr[(js.Promise[js.UndefOr[Unit | js.Any]]) | Unit],
    hookType: HookType
  ): Fn = {
    val __obj = js.Dynamic.literal(asyncError = asyncError.asInstanceOf[js.Any], fn = js.Any.fromFunction1(fn), hookType = hookType.asInstanceOf[js.Any], name = "add_hook")
    __obj.asInstanceOf[Fn]
  }
  
  extension [Self <: Fn](x: Self) {
    
    inline def setAsyncError(value: typings.std.Error): Self = StObject.set(x, "asyncError", value.asInstanceOf[js.Any])
    
    inline def setFn(value: /* done */ js.UndefOr[DoneFn] => js.UndefOr[(js.Promise[js.UndefOr[Unit | js.Any]]) | Unit]): Self = StObject.set(x, "fn", js.Any.fromFunction1(value))
    
    inline def setHookType(value: HookType): Self = StObject.set(x, "hookType", value.asInstanceOf[js.Any])
    
    inline def setName(value: add_hook): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
