package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MouseoutEventUIParam extends StObject {
  
  /**
    * Gets a reference to the editor input field.
    */
  var editorInput: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets a reference to the event target.
    */
  var element: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets a reference to the event object of the browser.
    */
  var originalEvent: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets a reference to the editor.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object MouseoutEventUIParam {
  
  inline def apply(): MouseoutEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MouseoutEventUIParam]
  }
  
  extension [Self <: MouseoutEventUIParam](x: Self) {
    
    inline def setEditorInput(value: Any): Self = StObject.set(x, "editorInput", value.asInstanceOf[js.Any])
    
    inline def setEditorInputUndefined: Self = StObject.set(x, "editorInput", js.undefined)
    
    inline def setElement(value: Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setOriginalEvent(value: Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
