package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MouseoverEventUIParam extends StObject {
  
  /**
    * Gets a reference to the editor input field.
    */
  var editorInput: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets a reference to the event target.
    */
  var element: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets a reference to the event object of the browser.
    */
  var originalEvent: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets a reference to the editor.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object MouseoverEventUIParam {
  
  @scala.inline
  def apply(): MouseoverEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MouseoverEventUIParam]
  }
  
  @scala.inline
  implicit class MouseoverEventUIParamMutableBuilder[Self <: MouseoverEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEditorInput(value: js.Any): Self = StObject.set(x, "editorInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditorInputUndefined: Self = StObject.set(x, "editorInput", js.undefined)
    
    @scala.inline
    def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setOriginalEvent(value: js.Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
