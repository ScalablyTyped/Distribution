package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueChangingEventUIParam extends StObject {
  
  /**
    * Gets the editor input.
    */
  var editorInput: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets the editor's new value. The argument type might differ depending on the editor type.
    */
  var newValue: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets the editor's old value. The argument type might differ depending on the editor type.
    */
  var oldValue: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets a reference to the editor.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object ValueChangingEventUIParam {
  
  inline def apply(): ValueChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueChangingEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValueChangingEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setEditorInput(value: Any): Self = StObject.set(x, "editorInput", value.asInstanceOf[js.Any])
    
    inline def setEditorInputUndefined: Self = StObject.set(x, "editorInput", js.undefined)
    
    inline def setNewValue(value: Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
    
    inline def setOldValue(value: Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
