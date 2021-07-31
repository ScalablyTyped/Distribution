package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorExecuteEvent
  extends StObject
     with EditorEvent {
  
  var command: js.UndefOr[js.Any] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object EditorExecuteEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Editor_): EditorExecuteEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorExecuteEvent]
  }
  
  @scala.inline
  implicit class EditorExecuteEventMutableBuilder[Self <: EditorExecuteEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommand(value: js.Any): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
