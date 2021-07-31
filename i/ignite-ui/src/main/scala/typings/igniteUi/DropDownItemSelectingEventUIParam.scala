package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropDownItemSelectingEventUIParam extends StObject {
  
  /**
    * Gets a reference to the editor container.
    */
  var editor: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets a reference to the editable input.
    */
  var editorInput: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets a reference to the list item which is about to be selected.
    */
  var item: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets a reference to the list container.
    */
  var list: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets a reference to the editor.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object DropDownItemSelectingEventUIParam {
  
  @scala.inline
  def apply(): DropDownItemSelectingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropDownItemSelectingEventUIParam]
  }
  
  @scala.inline
  implicit class DropDownItemSelectingEventUIParamMutableBuilder[Self <: DropDownItemSelectingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEditor(value: js.Any): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditorInput(value: js.Any): Self = StObject.set(x, "editorInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditorInputUndefined: Self = StObject.set(x, "editorInput", js.undefined)
    
    @scala.inline
    def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
    
    @scala.inline
    def setItem(value: js.Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    @scala.inline
    def setList(value: js.Any): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListUndefined: Self = StObject.set(x, "list", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
