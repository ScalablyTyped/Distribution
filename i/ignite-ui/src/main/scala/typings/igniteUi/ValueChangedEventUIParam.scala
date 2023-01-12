package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueChangedEventUIParam extends StObject {
  
  /**
    * Gets the editor input.
    */
  var editorInput: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets the value entered from the user after internal formatting. The argument type might differ depending on the editor type.
    */
  var newValue: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets the value entered from the user before internal formatting. The argument type might differ depending on the editor type.
    */
  var originalValue: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets a reference to the editor.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object ValueChangedEventUIParam {
  
  inline def apply(): ValueChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueChangedEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValueChangedEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setEditorInput(value: Any): Self = StObject.set(x, "editorInput", value.asInstanceOf[js.Any])
    
    inline def setEditorInputUndefined: Self = StObject.set(x, "editorInput", js.undefined)
    
    inline def setNewValue(value: Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
    
    inline def setOriginalValue(value: Any): Self = StObject.set(x, "originalValue", value.asInstanceOf[js.Any])
    
    inline def setOriginalValueUndefined: Self = StObject.set(x, "originalValue", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
