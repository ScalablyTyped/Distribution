package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationsEventsOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Event callback when annotation
    * is added to the chart.
    */
  var add: js.UndefOr[EventCallbackFunction[Annotation]] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Event callback when annotation
    * is updated (e.g. drag and droppped or resized by control points).
    */
  var afterUpdate: js.UndefOr[EventCallbackFunction[Annotation]] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Fires when the annotation is
    * clicked.
    */
  var click: js.UndefOr[EventCallbackFunction[Annotation]] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Event callback when annotation
    * is removed from the chart.
    */
  var remove: js.UndefOr[EventCallbackFunction[Annotation]] = js.undefined
}
object AnnotationsEventsOptions {
  
  inline def apply(): AnnotationsEventsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsEventsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnnotationsEventsOptions] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: EventCallbackFunction[Annotation]): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setAfterUpdate(value: EventCallbackFunction[Annotation]): Self = StObject.set(x, "afterUpdate", value.asInstanceOf[js.Any])
    
    inline def setAfterUpdateUndefined: Self = StObject.set(x, "afterUpdate", js.undefined)
    
    inline def setClick(value: EventCallbackFunction[Annotation]): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    inline def setRemove(value: EventCallbackFunction[Annotation]): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
  }
}
