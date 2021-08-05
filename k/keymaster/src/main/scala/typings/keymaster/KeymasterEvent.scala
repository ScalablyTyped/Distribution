package typings.keymaster

import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeymasterEvent extends StObject {
  
  var key: String
  
  def method(keyboardEvent: KeyboardEvent, keymasterEvent: KeymasterEvent): Unit
  @JSName("method")
  var method_Original: KeyHandler
  
  var mods: js.Array[Double]
  
  var scope: String
  
  var shortcut: String
}
object KeymasterEvent {
  
  inline def apply(
    key: String,
    method: (/* keyboardEvent */ KeyboardEvent, /* keymasterEvent */ KeymasterEvent) => Unit,
    mods: js.Array[Double],
    scope: String,
    shortcut: String
  ): KeymasterEvent = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], method = js.Any.fromFunction2(method), mods = mods.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], shortcut = shortcut.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeymasterEvent]
  }
  
  extension [Self <: KeymasterEvent](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: (/* keyboardEvent */ KeyboardEvent, /* keymasterEvent */ KeymasterEvent) => Unit): Self = StObject.set(x, "method", js.Any.fromFunction2(value))
    
    inline def setMods(value: js.Array[Double]): Self = StObject.set(x, "mods", value.asInstanceOf[js.Any])
    
    inline def setModsVarargs(value: Double*): Self = StObject.set(x, "mods", js.Array(value :_*))
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setShortcut(value: String): Self = StObject.set(x, "shortcut", value.asInstanceOf[js.Any])
  }
}
