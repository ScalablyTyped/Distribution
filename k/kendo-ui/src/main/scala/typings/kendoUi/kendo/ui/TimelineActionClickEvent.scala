package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.kendoUi.kendo.data.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineActionClickEvent
  extends StObject
     with TimelineEvent {
  
  var dataItem: js.UndefOr[Model] = js.undefined
  
  var element: js.UndefOr[JQuery] = js.undefined
}
object TimelineActionClickEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Timeline): TimelineActionClickEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineActionClickEvent]
  }
  
  @scala.inline
  implicit class TimelineActionClickEventMutableBuilder[Self <: TimelineActionClickEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataItem(value: Model): Self = StObject.set(x, "dataItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataItemUndefined: Self = StObject.set(x, "dataItem", js.undefined)
    
    @scala.inline
    def setElement(value: JQuery): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
  }
}
