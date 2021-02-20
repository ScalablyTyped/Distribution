package typings.jestTypes.anon

import typings.jestTypes.circusMod.AsyncEvent
import typings.jestTypes.jestTypesStrings.hook_start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hook extends AsyncEvent {
  
  var hook: typings.jestTypes.circusMod.Hook = js.native
  
  var name: hook_start = js.native
}
object Hook {
  
  @scala.inline
  def apply(hook: typings.jestTypes.circusMod.Hook, name: hook_start): Hook = {
    val __obj = js.Dynamic.literal(hook = hook.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
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
