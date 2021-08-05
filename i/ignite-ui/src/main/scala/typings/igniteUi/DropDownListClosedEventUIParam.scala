package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropDownListClosedEventUIParam extends StObject {
  
  /**
    * Gets a reference to the editor container.
    */
  var editor: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets a reference to the editable input.
    */
  var editorInput: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets a reference to the list container.
    */
  var list: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets a reference to the editor.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object DropDownListClosedEventUIParam {
  
  inline def apply(): DropDownListClosedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropDownListClosedEventUIParam]
  }
  
  extension [Self <: DropDownListClosedEventUIParam](x: Self) {
    
    inline def setEditor(value: js.Any): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    inline def setEditorInput(value: js.Any): Self = StObject.set(x, "editorInput", value.asInstanceOf[js.Any])
    
    inline def setEditorInputUndefined: Self = StObject.set(x, "editorInput", js.undefined)
    
    inline def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
    
    inline def setList(value: js.Any): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
