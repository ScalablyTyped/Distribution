package typings.highcharts.mod

import typings.highcharts.highchartsStrings.drilldown
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrilldownEventObject extends StObject {
  
  /**
    * If a category label was clicked, which index.
    */
  var category: js.UndefOr[Double] = js.undefined
  
  /**
    * The original browser event (usually click) that triggered the drilldown.
    */
  var originalEvent: js.UndefOr[Event] = js.undefined
  
  /**
    * The originating point.
    */
  var point: Point
  
  /**
    * If a category label was clicked, this array holds all points
    * corresponding to the category. Otherwise it is set to false.
    */
  var points: js.UndefOr[Boolean | js.Array[Point]] = js.undefined
  
  /**
    * Prevents the default behaviour of the event.
    */
  var preventDefault: js.Function
  
  /**
    * Options for the new series. If the event is utilized for async drilldown,
    * the seriesOptions are not added, but rather loaded async.
    */
  var seriesOptions: js.UndefOr[SeriesOptionsType] = js.undefined
  
  /**
    * The event target.
    */
  var target: Chart_
  
  /**
    * The event type.
    */
  var `type`: drilldown
}
object DrilldownEventObject {
  
  inline def apply(point: Point, preventDefault: js.Function, target: Chart_): DrilldownEventObject = {
    val __obj = js.Dynamic.literal(point = point.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("drilldown")
    __obj.asInstanceOf[DrilldownEventObject]
  }
  
  extension [Self <: DrilldownEventObject](x: Self) {
    
    inline def setCategory(value: Double): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setOriginalEvent(value: Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    
    inline def setPoint(value: Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setPoints(value: Boolean | js.Array[Point]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    inline def setPointsVarargs(value: Point*): Self = StObject.set(x, "points", js.Array(value*))
    
    inline def setPreventDefault(value: js.Function): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    inline def setSeriesOptions(value: SeriesOptionsType): Self = StObject.set(x, "seriesOptions", value.asInstanceOf[js.Any])
    
    inline def setSeriesOptionsUndefined: Self = StObject.set(x, "seriesOptions", js.undefined)
    
    inline def setTarget(value: Chart_): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setType(value: drilldown): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
