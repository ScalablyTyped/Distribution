package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationAnnotationsEventsOptions extends StObject {
  
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
    * (Highcharts, Highstock, Highmaps, Gantt) Event callback when annotation
    * is removed from the chart.
    */
  var remove: js.UndefOr[EventCallbackFunction[Annotation]] = js.undefined
}
object NavigationAnnotationsEventsOptions {
  
  @scala.inline
  def apply(): NavigationAnnotationsEventsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationAnnotationsEventsOptions]
  }
  
  @scala.inline
  implicit class NavigationAnnotationsEventsOptionsMutableBuilder[Self <: NavigationAnnotationsEventsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: EventCallbackFunction[Annotation]): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    @scala.inline
    def setAfterUpdate(value: EventCallbackFunction[Annotation]): Self = StObject.set(x, "afterUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterUpdateUndefined: Self = StObject.set(x, "afterUpdate", js.undefined)
    
    @scala.inline
    def setRemove(value: EventCallbackFunction[Annotation]): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
  }
}
