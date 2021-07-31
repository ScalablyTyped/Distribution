package typings.jestTypes.anon

import typings.jestTypes.circusMod.AsyncEvent
import typings.jestTypes.jestTypesStrings.hook_start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hook
  extends StObject
     with AsyncEvent {
  
  var hook: typings.jestTypes.circusMod.Hook
  
  var name: hook_start
}
object Hook {
  
  @scala.inline
  def apply(hook: typings.jestTypes.circusMod.Hook): Hook = {
    val __obj = js.Dynamic.literal(hook = hook.asInstanceOf[js.Any], name = "hook_start")
    __obj.asInstanceOf[Hook]
  }
  
  @scala.inline
  implicit class HookMutableBuilder[Self <: Hook] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHook(value: typings.jestTypes.circusMod.Hook): Self = StObject.set(x, "hook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: hook_start): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
