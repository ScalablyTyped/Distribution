package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineCollapseEvent
  extends StObject
     with TimelineEvent {
  
  var dataItem: js.UndefOr[Model] = js.undefined
}
object TimelineCollapseEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Timeline): TimelineCollapseEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineCollapseEvent]
  }
  
  extension [Self <: TimelineCollapseEvent](x: Self) {
    
    inline def setDataItem(value: Model): Self = StObject.set(x, "dataItem", value.asInstanceOf[js.Any])
    
    inline def setDataItemUndefined: Self = StObject.set(x, "dataItem", js.undefined)
  }
}
