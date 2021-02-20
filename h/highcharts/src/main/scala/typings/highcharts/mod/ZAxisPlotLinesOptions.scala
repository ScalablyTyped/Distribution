package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZAxisPlotLinesOptions extends AxisPlotLinesOptions {
  
  /**
    * (Highstock) Flag to decide if plotLine should be rendered across all
    * panes.
    */
  var acrossPanes: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) A custom class name, in addition to the
    * default `highcharts-plot-line`, to apply to each individual line.
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) The color of the line.
    */
  var color: js.UndefOr[ColorString] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) The dashing or dot style for the plot
    * line. For possible values see this overview.
    */
  var dashStyle: js.UndefOr[DashStyleValue] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) An object defining mouse events for the
    * plot line. Supported properties are `click`, `mouseover`, `mouseout`,
    * `mousemove`.
    */
  var events: js.UndefOr[ZAxisPlotLinesEventsOptions] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) An id used for identifying the plot line
    * in Axis.removePlotLine.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Text labels for the plot bands
    */
  var label: js.UndefOr[ZAxisPlotLinesLabelOptions] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) The position of the line in axis units.
    */
  var value: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) The width or thickness of the plot line.
    */
  var width: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) The z index of the plot line within the
    * chart.
    */
  var zIndex: js.UndefOr[Double] = js.native
}
object ZAxisPlotLinesOptions {
  
  @scala.inline
  def apply(): ZAxisPlotLinesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZAxisPlotLinesOptions]
  }
  
  @scala.inline
  implicit class ZAxisPlotLinesOptionsMutableBuilder[Self <: ZAxisPlotLinesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcrossPanes(value: Boolean): Self = StObject.set(x, "acrossPanes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcrossPanesUndefined: Self = StObject.set(x, "acrossPanes", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setColor(value: ColorString): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDashStyle(value: DashStyleValue): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
    
    @scala.inline
    def setEvents(value: ZAxisPlotLinesEventsOptions): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLabel(value: ZAxisPlotLinesLabelOptions): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
