package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueChangingEventUIParam extends StObject {
  
  /**
    * Gets the editor input.
    */
  var editorInput: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets the editor's new value. The argument type might differ depending on the editor type.
    */
  var newValue: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets the editor's old value. The argument type might differ depending on the editor type.
    */
  var oldValue: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets a reference to the editor.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object ValueChangingEventUIParam {
  
  @scala.inline
  def apply(): ValueChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueChangingEventUIParam]
  }
  
  @scala.inline
  implicit class ValueChangingEventUIParamMutableBuilder[Self <: ValueChangingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEditorInput(value: js.Any): Self = StObject.set(x, "editorInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditorInputUndefined: Self = StObject.set(x, "editorInput", js.undefined)
    
    @scala.inline
    def setNewValue(value: js.Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
    
    @scala.inline
    def setOldValue(value: js.Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
