package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait YAxisEventsOptions extends StObject {
  
  /**
    * (Highcharts, Gantt) An event fired after the breaks have rendered.
    */
  var afterBreaks: js.UndefOr[AxisEventCallbackFunction] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) As opposed to the `setExtremes`
    * event, this event fires after the final min and max values are computed
    * and corrected for `minRange`.
    *
    * Fires when the minimum and maximum is set for the axis, either by calling
    * the `.setExtremes()` method or by selecting an area in the chart. One
    * parameter, `event`, is passed to the function, containing common event
    * information.
    *
    * The new user set minimum and maximum values can be found by `event.min`
    * and `event.max`. These reflect the axis minimum and maximum in axis
    * values. The actual data extremes are found in `event.dataMin` and
    * `event.dataMax`.
    */
  var afterSetExtremes: js.UndefOr[AxisSetExtremesEventCallbackFunction] = js.undefined
  
  /**
    * (Highcharts, Gantt) An event fired when a break from this axis occurs on
    * a point.
    */
  var pointBreak: js.UndefOr[AxisPointBreakEventCallbackFunction] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) An event fired when a point falls inside a
    * break from this axis.
    */
  var pointInBreak: js.UndefOr[AxisPointBreakEventCallbackFunction] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Fires when the minimum and
    * maximum is set for the axis, either by calling the `.setExtremes()`
    * method or by selecting an area in the chart. One parameter, `event`, is
    * passed to the function, containing common event information.
    *
    * The new user set minimum and maximum values can be found by `event.min`
    * and `event.max`. These reflect the axis minimum and maximum in data
    * values. When an axis is zoomed all the way out from the "Reset zoom"
    * button, `event.min` and `event.max` are null, and the new extremes are
    * set based on `this.dataMin` and `this.dataMax`.
    */
  var setExtremes: js.UndefOr[AxisSetExtremesEventCallbackFunction] = js.undefined
}
object YAxisEventsOptions {
  
  inline def apply(): YAxisEventsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YAxisEventsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: YAxisEventsOptions] (val x: Self) extends AnyVal {
    
    inline def setAfterBreaks(value: AxisEventCallbackFunction): Self = StObject.set(x, "afterBreaks", value.asInstanceOf[js.Any])
    
    inline def setAfterBreaksUndefined: Self = StObject.set(x, "afterBreaks", js.undefined)
    
    inline def setAfterSetExtremes(value: AxisSetExtremesEventCallbackFunction): Self = StObject.set(x, "afterSetExtremes", value.asInstanceOf[js.Any])
    
    inline def setAfterSetExtremesUndefined: Self = StObject.set(x, "afterSetExtremes", js.undefined)
    
    inline def setPointBreak(value: AxisPointBreakEventCallbackFunction): Self = StObject.set(x, "pointBreak", value.asInstanceOf[js.Any])
    
    inline def setPointBreakUndefined: Self = StObject.set(x, "pointBreak", js.undefined)
    
    inline def setPointInBreak(value: AxisPointBreakEventCallbackFunction): Self = StObject.set(x, "pointInBreak", value.asInstanceOf[js.Any])
    
    inline def setPointInBreakUndefined: Self = StObject.set(x, "pointInBreak", js.undefined)
    
    inline def setSetExtremes(value: AxisSetExtremesEventCallbackFunction): Self = StObject.set(x, "setExtremes", value.asInstanceOf[js.Any])
    
    inline def setSetExtremesUndefined: Self = StObject.set(x, "setExtremes", js.undefined)
  }
}
