package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartZoomingOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Set a key to hold when dragging
    * to zoom the chart. This is useful to avoid zooming while moving points.
    * Should be set different than chart.panKey.
    */
  var key: js.UndefOr[OptionsKeyValue] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The mouse wheel zoom is a
    * feature included in Highcharts Stock, but is also available for
    * Highcharts Core as a module. Zooming with the mouse wheel is enabled by
    * default. It can be disabled by setting this option to `false`.
    */
  var mouseWheel: js.UndefOr[Boolean | js.Object | ChartZoomingMouseWheelOptions] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) Equivalent to type, but for multitouch
    * gestures only. By default, the `pinchType` is the same as the `type`
    * setting. However, pinching can be enabled separately in some cases, for
    * example in stock charts where a mouse drag pans the chart, while pinching
    * is enabled. When tooltip.followTouchMove is true, pinchType only applies
    * to two-finger touches.
    */
  var pinchType: js.UndefOr[OptionsPinchTypeValue] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The button that appears after a
    * selection zoom, allowing the user to reset zoom.
    */
  var resetButton: js.UndefOr[ChartZoomingResetButtonOptions] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) Enables zooming by a single touch, in
    * combination with chart.zooming.type. When enabled, two-finger pinch will
    * still work as set up by [chart.zooming.pinchType]
    * (#chart.zooming.pinchType). However, `singleTouch` will interfere with
    * touch-dragging the chart to read the tooltip. And especially when
    * vertical zooming is enabled, it will make it hard to scroll vertically on
    * the page.
    */
  var singleTouch: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) Decides in what dimensions the user can
    * zoom by dragging the mouse. Can be one of `x`, `y` or `xy`.
    */
  var `type`: js.UndefOr[OptionsChartZoomingTypeValue] = js.undefined
}
object ChartZoomingOptions {
  
  inline def apply(): ChartZoomingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartZoomingOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartZoomingOptions] (val x: Self) extends AnyVal {
    
    inline def setKey(value: OptionsKeyValue): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setMouseWheel(value: Boolean | js.Object | ChartZoomingMouseWheelOptions): Self = StObject.set(x, "mouseWheel", value.asInstanceOf[js.Any])
    
    inline def setMouseWheelUndefined: Self = StObject.set(x, "mouseWheel", js.undefined)
    
    inline def setPinchType(value: OptionsPinchTypeValue): Self = StObject.set(x, "pinchType", value.asInstanceOf[js.Any])
    
    inline def setPinchTypeUndefined: Self = StObject.set(x, "pinchType", js.undefined)
    
    inline def setResetButton(value: ChartZoomingResetButtonOptions): Self = StObject.set(x, "resetButton", value.asInstanceOf[js.Any])
    
    inline def setResetButtonUndefined: Self = StObject.set(x, "resetButton", js.undefined)
    
    inline def setSingleTouch(value: Boolean): Self = StObject.set(x, "singleTouch", value.asInstanceOf[js.Any])
    
    inline def setSingleTouchUndefined: Self = StObject.set(x, "singleTouch", js.undefined)
    
    inline def setType(value: OptionsChartZoomingTypeValue): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
