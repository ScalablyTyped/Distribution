package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineExpandEvent
  extends StObject
     with TimelineEvent {
  
  var dataItem: js.UndefOr[Model] = js.undefined
}
object TimelineExpandEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Timeline): TimelineExpandEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineExpandEvent]
  }
  
  @scala.inline
  implicit class TimelineExpandEventMutableBuilder[Self <: TimelineExpandEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataItem(value: Model): Self = StObject.set(x, "dataItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataItemUndefined: Self = StObject.set(x, "dataItem", js.undefined)
  }
}
