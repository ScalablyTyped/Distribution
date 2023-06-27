package typings.k6.experimentalBrowserMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyboardModifierOptions extends StObject {
  
  /**
    * `Alt`, `Control`, `Meta` or `Shift` modifiers keys pressed during the action.
    * If not specified, currently pressed modifiers are used.
    */
  var modifiers: js.UndefOr[js.Array[KeyboardModifier]] = js.undefined
}
object KeyboardModifierOptions {
  
  inline def apply(): KeyboardModifierOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyboardModifierOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyboardModifierOptions] (val x: Self) extends AnyVal {
    
    inline def setModifiers(value: js.Array[KeyboardModifier]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
    
    inline def setModifiersVarargs(value: KeyboardModifier*): Self = StObject.set(x, "modifiers", js.Array(value*))
  }
}
