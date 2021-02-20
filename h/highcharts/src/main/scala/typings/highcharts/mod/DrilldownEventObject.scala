package typings.highcharts.mod

import typings.highcharts.highchartsStrings.drilldown
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrilldownEventObject extends StObject {
  
  /**
    * If a category label was clicked, which index.
    */
  var category: js.UndefOr[Double] = js.native
  
  /**
    * The original browser event (usually click) that triggered the drilldown.
    */
  var originalEvent: js.UndefOr[Event] = js.native
  
  /**
    * The originating point.
    */
  var point: Point = js.native
  
  /**
    * If a category label was clicked, this array holds all points
    * corresponding to the category. Otherwise it is set to false.
    */
  var points: js.UndefOr[Boolean | js.Array[Point]] = js.native
  
  /**
    * Prevents the default behaviour of the event.
    */
  var preventDefault: js.Function = js.native
  
  /**
    * Options for the new series. If the event is utilized for async drilldown,
    * the seriesOptions are not added, but rather loaded async.
    */
  var seriesOptions: js.UndefOr[SeriesOptionsType] = js.native
  
  /**
    * The event target.
    */
  var target: Chart_ = js.native
  
  /**
    * The event type.
    */
  var `type`: drilldown = js.native
}
object DrilldownEventObject {
  
  @scala.inline
  def apply(point: Point, preventDefault: js.Function, target: Chart_, `type`: drilldown): DrilldownEventObject = {
    val __obj = js.Dynamic.literal(point = point.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrilldownEventObject]
  }
  
  @scala.inline
  implicit class DrilldownEventObjectMutableBuilder[Self <: DrilldownEventObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: Double): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setOriginalEvent(value: Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    
    @scala.inline
    def setPoint(value: Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoints(value: Boolean | js.Array[Point]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    @scala.inline
    def setPointsVarargs(value: Point*): Self = StObject.set(x, "points", js.Array(value :_*))
    
    @scala.inline
    def setPreventDefault(value: js.Function): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesOptions(value: SeriesOptionsType): Self = StObject.set(x, "seriesOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesOptionsUndefined: Self = StObject.set(x, "seriesOptions", js.undefined)
    
    @scala.inline
    def setTarget(value: Chart_): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: drilldown): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
