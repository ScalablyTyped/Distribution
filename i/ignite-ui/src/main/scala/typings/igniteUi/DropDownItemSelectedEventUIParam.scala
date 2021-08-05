package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropDownItemSelectedEventUIParam extends StObject {
  
  /**
    * Gets a reference to the editable input.
    */
  var editorInput: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets a reference to the list item which is selected.
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
object DropDownItemSelectedEventUIParam {
  
  inline def apply(): DropDownItemSelectedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropDownItemSelectedEventUIParam]
  }
  
  extension [Self <: DropDownItemSelectedEventUIParam](x: Self) {
    
    inline def setEditorInput(value: js.Any): Self = StObject.set(x, "editorInput", value.asInstanceOf[js.Any])
    
    inline def setEditorInputUndefined: Self = StObject.set(x, "editorInput", js.undefined)
    
    inline def setItem(value: js.Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setList(value: js.Any): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
