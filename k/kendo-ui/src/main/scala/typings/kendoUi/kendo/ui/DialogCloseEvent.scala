package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogCloseEvent
  extends StObject
     with DialogEvent {
  
  var userTriggered: js.UndefOr[Boolean] = js.undefined
}
object DialogCloseEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Dialog): DialogCloseEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogCloseEvent]
  }
  
  @scala.inline
  implicit class DialogCloseEventMutableBuilder[Self <: DialogCloseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserTriggered(value: Boolean): Self = StObject.set(x, "userTriggered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserTriggeredUndefined: Self = StObject.set(x, "userTriggered", js.undefined)
  }
}
