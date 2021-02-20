package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigatorXAxisPlotBandsOptions extends StObject {
  
  /**
    * (Highstock) Flag to decide if plotBand should be rendered across all
    * panes.
    */
  var acrossPanes: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Border color for the plot band. Also
    * requires `borderWidth` to be set.
    */
  var borderColor: js.UndefOr[ColorString] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Border width for the plot band. Also
    * requires `borderColor` to be set.
    */
  var borderWidth: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) A custom class name, in addition to the
    * default `highcharts-plot-band`, to apply to each individual band.
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) The color of the plot band.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) An object defining mouse events for the
    * plot band. Supported properties are `click`, `mouseover`, `mouseout`,
    * `mousemove`.
    */
  var events: js.UndefOr[NavigatorXAxisPlotBandsEventsOptions] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) The start position of the plot band in
    * axis units.
    */
  var from: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) An id used for identifying the plot band
    * in Axis.removePlotBand.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Text labels for the plot bands
    */
  var label: js.UndefOr[NavigatorXAxisPlotBandsLabelOptions] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) The end position of the plot band in axis
    * units.
    */
  var to: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) The z index of the plot band within the
    * chart, relative to other elements. Using the same z index as another
    * element may give unpredictable results, as the last rendered element will
    * be on top. Values from 0 to 20 make sense.
    */
  var zIndex: js.UndefOr[Double] = js.native
}
object NavigatorXAxisPlotBandsOptions {
  
  @scala.inline
  def apply(): NavigatorXAxisPlotBandsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigatorXAxisPlotBandsOptions]
  }
  
  @scala.inline
  implicit class NavigatorXAxisPlotBandsOptionsMutableBuilder[Self <: NavigatorXAxisPlotBandsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcrossPanes(value: Boolean): Self = StObject.set(x, "acrossPanes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcrossPanesUndefined: Self = StObject.set(x, "acrossPanes", js.undefined)
    
    @scala.inline
    def setBorderColor(value: ColorString): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setEvents(value: NavigatorXAxisPlotBandsEventsOptions): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLabel(value: NavigatorXAxisPlotBandsLabelOptions): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
