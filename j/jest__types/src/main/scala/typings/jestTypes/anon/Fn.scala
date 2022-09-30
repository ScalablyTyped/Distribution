package typings.jestTypes.anon

import typings.jestTypes.jestTypesStrings.add_hook
import typings.jestTypes.mod.HookFn2
import typings.jestTypes.mod.HookType
import typings.jestTypes.mod.SyncEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fn
  extends StObject
     with SyncEvent {
  
  var asyncError: js.Error
  
  var fn: HookFn2
  
  var hookType: HookType
  
  var name: add_hook
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object Fn {
  
  inline def apply(asyncError: js.Error, fn: HookFn2, hookType: HookType): Fn = {
    val __obj = js.Dynamic.literal(asyncError = asyncError.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any], hookType = hookType.asInstanceOf[js.Any], name = "add_hook")
    __obj.asInstanceOf[Fn]
  }
  
  extension [Self <: Fn](x: Self) {
    
    inline def setAsyncError(value: js.Error): Self = StObject.set(x, "asyncError", value.asInstanceOf[js.Any])
    
    inline def setFn(value: HookFn2): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setHookType(value: HookType): Self = StObject.set(x, "hookType", value.asInstanceOf[js.Any])
    
    inline def setName(value: add_hook): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
