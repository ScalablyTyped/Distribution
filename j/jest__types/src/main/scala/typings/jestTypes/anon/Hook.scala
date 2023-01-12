package typings.jestTypes.anon

import typings.jestTypes.jestTypesStrings.hook_start
import typings.jestTypes.mod.AsyncEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hook
  extends StObject
     with AsyncEvent {
  
  var hook: typings.jestTypes.mod.Hook
  
  var name: hook_start
}
object Hook {
  
  inline def apply(hook: typings.jestTypes.mod.Hook): Hook = {
    val __obj = js.Dynamic.literal(hook = hook.asInstanceOf[js.Any], name = "hook_start")
    __obj.asInstanceOf[Hook]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Hook] (val x: Self) extends AnyVal {
    
    inline def setHook(value: typings.jestTypes.mod.Hook): Self = StObject.set(x, "hook", value.asInstanceOf[js.Any])
    
    inline def setName(value: hook_start): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
