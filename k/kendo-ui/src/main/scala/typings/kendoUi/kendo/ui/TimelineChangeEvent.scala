package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.kendoUi.kendo.data.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimelineChangeEvent extends TimelineEvent {
  
  var dataItem: js.UndefOr[Model] = js.native
  
  var eventContainer: js.UndefOr[JQuery] = js.native
}
object TimelineChangeEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Timeline): TimelineChangeEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineChangeEvent]
  }
  
  @scala.inline
  implicit class TimelineChangeEventMutableBuilder[Self <: TimelineChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataItem(value: Model): Self = StObject.set(x, "dataItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataItemUndefined: Self = StObject.set(x, "dataItem", js.undefined)
    
    @scala.inline
    def setEventContainer(value: JQuery): Self = StObject.set(x, "eventContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventContainerUndefined: Self = StObject.set(x, "eventContainer", js.undefined)
  }
}
