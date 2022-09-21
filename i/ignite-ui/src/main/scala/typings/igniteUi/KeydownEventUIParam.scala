package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeydownEventUIParam extends StObject {
  
  /**
    * Gets a reference to the editor input field.
    */
  var editorInput: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets a reference to the event target.
    */
  var element: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets the value of the keyCode.
    */
  var key: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets a reference to the editor.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object KeydownEventUIParam {
  
  inline def apply(): KeydownEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeydownEventUIParam]
  }
  
  extension [Self <: KeydownEventUIParam](x: Self) {
    
    inline def setEditorInput(value: Any): Self = StObject.set(x, "editorInput", value.asInstanceOf[js.Any])
    
    inline def setEditorInputUndefined: Self = StObject.set(x, "editorInput", js.undefined)
    
    inline def setElement(value: Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
