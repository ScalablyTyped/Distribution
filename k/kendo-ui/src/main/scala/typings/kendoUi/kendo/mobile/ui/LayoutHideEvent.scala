package typings.kendoUi.kendo.mobile.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayoutHideEvent
  extends StObject
     with LayoutEvent {
  
  var layout: js.UndefOr[JQuery] = js.undefined
  
  var view: js.UndefOr[JQuery] = js.undefined
}
object LayoutHideEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Layout): LayoutHideEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutHideEvent]
  }
  
  @scala.inline
  implicit class LayoutHideEventMutableBuilder[Self <: LayoutHideEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayout(value: JQuery): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setView(value: JQuery): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
