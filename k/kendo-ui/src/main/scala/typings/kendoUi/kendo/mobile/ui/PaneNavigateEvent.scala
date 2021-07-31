package typings.kendoUi.kendo.mobile.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaneNavigateEvent
  extends StObject
     with PaneEvent {
  
  var url: js.UndefOr[JQuery] = js.undefined
}
object PaneNavigateEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Pane): PaneNavigateEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaneNavigateEvent]
  }
  
  @scala.inline
  implicit class PaneNavigateEventMutableBuilder[Self <: PaneNavigateEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: JQuery): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
