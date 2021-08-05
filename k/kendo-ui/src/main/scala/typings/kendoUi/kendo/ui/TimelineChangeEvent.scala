package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.kendoUi.kendo.data.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineChangeEvent
  extends StObject
     with TimelineEvent {
  
  var dataItem: js.UndefOr[Model] = js.undefined
  
  var eventContainer: js.UndefOr[JQuery] = js.undefined
}
object TimelineChangeEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Timeline): TimelineChangeEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineChangeEvent]
  }
  
  extension [Self <: TimelineChangeEvent](x: Self) {
    
    inline def setDataItem(value: Model): Self = StObject.set(x, "dataItem", value.asInstanceOf[js.Any])
    
    inline def setDataItemUndefined: Self = StObject.set(x, "dataItem", js.undefined)
    
    inline def setEventContainer(value: JQuery): Self = StObject.set(x, "eventContainer", value.asInstanceOf[js.Any])
    
    inline def setEventContainerUndefined: Self = StObject.set(x, "eventContainer", js.undefined)
  }
}
