package typings.kendoUi.kendo.mobile.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SplitViewShowEvent
  extends StObject
     with SplitViewEvent {
  
  var view: js.UndefOr[JQuery] = js.undefined
}
object SplitViewShowEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: SplitView): SplitViewShowEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitViewShowEvent]
  }
  
  @scala.inline
  implicit class SplitViewShowEventMutableBuilder[Self <: SplitViewShowEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setView(value: JQuery): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
