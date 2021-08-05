package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxisCurrentDateIndicatorOptions extends StObject {
  
  /**
    * (Highstock) Flag to decide if plotLine should be rendered across all
    * panes.
    */
  var acrossPanes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Gantt) A custom class name, in addition to the default
    * `highcharts-plot-line`, to apply to each individual line.
    */
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * (Gantt) The color of the line.
    */
  var color: js.UndefOr[ColorString] = js.undefined
  
  /**
    * (Gantt) The dashing or dot style for the plot line. For possible values
    * see this overview.
    */
  var dashStyle: js.UndefOr[DashStyleValue] = js.undefined
  
  /**
    * (Gantt) An object defining mouse events for the plot line. Supported
    * properties are `click`, `mouseover`, `mouseout`, `mousemove`.
    */
  var events: js.UndefOr[
    ColorAxisCurrentDateIndicatorEventsOptions | NavigatorXAxisCurrentDateIndicatorEventsOptions | XAxisCurrentDateIndicatorEventsOptions | ZAxisCurrentDateIndicatorEventsOptions
  ] = js.undefined
  
  /**
    * (Gantt) An id used for identifying the plot line in Axis.removePlotLine.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * (Gantt) Text labels for the plot bands
    */
  var label: js.UndefOr[
    ColorAxisCurrentDateIndicatorLabelOptions | NavigatorXAxisCurrentDateIndicatorLabelOptions | XAxisCurrentDateIndicatorLabelOptions | ZAxisCurrentDateIndicatorLabelOptions
  ] = js.undefined
  
  /**
    * (Gantt) The width or thickness of the plot line.
    */
  var width: js.UndefOr[Double] = js.undefined
  
  /**
    * (Gantt) The z index of the plot line within the chart.
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}
object AxisCurrentDateIndicatorOptions {
  
  inline def apply(): AxisCurrentDateIndicatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisCurrentDateIndicatorOptions]
  }
  
  extension [Self <: AxisCurrentDateIndicatorOptions](x: Self) {
    
    inline def setAcrossPanes(value: Boolean): Self = StObject.set(x, "acrossPanes", value.asInstanceOf[js.Any])
    
    inline def setAcrossPanesUndefined: Self = StObject.set(x, "acrossPanes", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setColor(value: ColorString): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDashStyle(value: DashStyleValue): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
    
    inline def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
    
    inline def setEvents(
      value: ColorAxisCurrentDateIndicatorEventsOptions | NavigatorXAxisCurrentDateIndicatorEventsOptions | XAxisCurrentDateIndicatorEventsOptions | ZAxisCurrentDateIndicatorEventsOptions
    ): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLabel(
      value: ColorAxisCurrentDateIndicatorLabelOptions | NavigatorXAxisCurrentDateIndicatorLabelOptions | XAxisCurrentDateIndicatorLabelOptions | ZAxisCurrentDateIndicatorLabelOptions
    ): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
