package typings.gorillaEngine.GorillaEngine.UI

import typings.gorillaEngine.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyboardFocus extends StObject {
  
  var keyboardFocus: `0`
}
object KeyboardFocus {
  
  inline def apply(keyboardFocus: `0`): KeyboardFocus = {
    val __obj = js.Dynamic.literal(keyboardFocus = keyboardFocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardFocus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyboardFocus] (val x: Self) extends AnyVal {
    
    inline def setKeyboardFocus(value: `0`): Self = StObject.set(x, "keyboardFocus", value.asInstanceOf[js.Any])
  }
}
