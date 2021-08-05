package typings.jestTypes.circusMod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hook extends StObject {
  
  var asyncError: Error
  
  def fn(): js.UndefOr[(js.Promise[js.UndefOr[Unit | js.Any]]) | Unit]
  def fn(done: typings.jestTypes.globalMod.DoneFn): js.UndefOr[(js.Promise[js.UndefOr[Unit | js.Any]]) | Unit]
  @JSName("fn")
  var fn_Original: HookFn
  
  var parent: DescribeBlock
  
  var timeout: js.UndefOr[Double | Null] = js.undefined
  
  var `type`: HookType
}
object Hook {
  
  inline def apply(
    asyncError: Error,
    fn: /* done */ js.UndefOr[typings.jestTypes.globalMod.DoneFn] => js.UndefOr[(js.Promise[js.UndefOr[Unit | js.Any]]) | Unit],
    parent: DescribeBlock,
    `type`: HookType
  ): Hook = {
    val __obj = js.Dynamic.literal(asyncError = asyncError.asInstanceOf[js.Any], fn = js.Any.fromFunction1(fn), parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hook]
  }
  
  extension [Self <: Hook](x: Self) {
    
    inline def setAsyncError(value: Error): Self = StObject.set(x, "asyncError", value.asInstanceOf[js.Any])
    
    inline def setFn(
      value: /* done */ js.UndefOr[typings.jestTypes.globalMod.DoneFn] => js.UndefOr[(js.Promise[js.UndefOr[Unit | js.Any]]) | Unit]
    ): Self = StObject.set(x, "fn", js.Any.fromFunction1(value))
    
    inline def setParent(value: DescribeBlock): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutNull: Self = StObject.set(x, "timeout", null)
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setType(value: HookType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
