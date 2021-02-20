package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolBarCloseEvent extends ToolBarEvent {
  
  var SplitButton: js.UndefOr[JQuery] = js.native
}
object ToolBarCloseEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: ToolBar): ToolBarCloseEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolBarCloseEvent]
  }
  
  @scala.inline
  implicit class ToolBarCloseEventMutableBuilder[Self <: ToolBarCloseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSplitButton(value: JQuery): Self = StObject.set(x, "SplitButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplitButtonUndefined: Self = StObject.set(x, "SplitButton", js.undefined)
  }
}
