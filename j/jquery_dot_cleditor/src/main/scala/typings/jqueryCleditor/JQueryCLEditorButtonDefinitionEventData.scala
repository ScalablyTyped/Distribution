package typings.jqueryCleditor

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryCLEditorButtonDefinitionEventData extends StObject {
  
  var button: HTMLElement = js.native
  
  var buttonName: String = js.native
  
  var command: String = js.native
  
  var editor: CLEditor = js.native
  
  var popup: HTMLElement = js.native
  
  var popupName: String = js.native
  
  var useCSS: Boolean = js.native
  
  var value: js.Any = js.native
}
object JQueryCLEditorButtonDefinitionEventData {
  
  @scala.inline
  def apply(
    button: HTMLElement,
    buttonName: String,
    command: String,
    editor: CLEditor,
    popup: HTMLElement,
    popupName: String,
    useCSS: Boolean,
    value: js.Any
  ): JQueryCLEditorButtonDefinitionEventData = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], buttonName = buttonName.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], popupName = popupName.asInstanceOf[js.Any], useCSS = useCSS.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryCLEditorButtonDefinitionEventData]
  }
  
  @scala.inline
  implicit class JQueryCLEditorButtonDefinitionEventDataMutableBuilder[Self <: JQueryCLEditorButtonDefinitionEventData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButton(value: HTMLElement): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonName(value: String): Self = StObject.set(x, "buttonName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditor(value: CLEditor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopup(value: HTMLElement): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupName(value: String): Self = StObject.set(x, "popupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseCSS(value: Boolean): Self = StObject.set(x, "useCSS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
