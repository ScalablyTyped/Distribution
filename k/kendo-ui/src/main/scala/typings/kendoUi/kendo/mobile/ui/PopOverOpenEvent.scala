package typings.kendoUi.kendo.mobile.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopOverOpenEvent
  extends StObject
     with PopOverEvent {
  
  var target: js.UndefOr[JQuery] = js.undefined
}
object PopOverOpenEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: PopOver): PopOverOpenEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopOverOpenEvent]
  }
  
  @scala.inline
  implicit class PopOverOpenEventMutableBuilder[Self <: PopOverOpenEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTarget(value: JQuery): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
