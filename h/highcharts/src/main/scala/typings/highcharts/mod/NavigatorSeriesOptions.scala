package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigatorSeriesOptions extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * (Highstock, Gantt) Sets the fill color of the navigator series.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  
  /**
    * (Highstock) Unless data is explicitly defined, the data is borrowed from
    * the first series in the chart.
    */
  var data: js.UndefOr[js.Array[Double | (js.Array[Double | String | Null]) | js.Object | Null]] = js.undefined
  
  /**
    * (Highstock) Data grouping options for the navigator series.
    */
  var dataGrouping: js.UndefOr[DataGroupingOptionsObject] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Data label options for the
    * navigator series. Data labels are disabled by default on the navigator
    * series.
    */
  var dataLabels: js.UndefOr[NavigatorSeriesDataLabelsOptions | js.Array[NavigatorSeriesDataLabelsOptions]] = js.undefined
  
  /**
    * (Highstock, Gantt) The fill opacity of the navigator series.
    */
  var fillOpacity: js.UndefOr[Double] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * (Highstock, Gantt) Line color for the navigator series. Allows setting
    * the color while disallowing the default candlestick setting.
    */
  var lineColor: js.UndefOr[ColorString | Null] = js.undefined
  
  /**
    * (Highstock, Gantt) The pixel line width of the navigator series.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  
  var marker: js.UndefOr[NavigatorSeriesMarkerOptions] = js.undefined
  
  /**
    * (Highstock) Since Highstock v8, default value is the same as default
    * `pointRange` defined for a specific type (e.g. `null` for column type).
    *
    * In Highstock version < 8, defaults to 0.
    */
  var pointRange: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * (Highstock, Gantt) The threshold option. Setting it to 0 will make the
    * default navigator area series draw its area from the 0 value and up.
    */
  var threshold: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * (Highstock, Gantt) The type of the navigator series.
    *
    * Heads up: In column-type navigator, zooming is limited to at least one
    * point with its `pointRange`.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object NavigatorSeriesOptions {
  
  @scala.inline
  def apply(): NavigatorSeriesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigatorSeriesOptions]
  }
  
  @scala.inline
  implicit class NavigatorSeriesOptionsMutableBuilder[Self <: NavigatorSeriesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setData(value: js.Array[Double | (js.Array[Double | String | Null]) | js.Object | Null]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataGrouping(value: DataGroupingOptionsObject): Self = StObject.set(x, "dataGrouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataGroupingUndefined: Self = StObject.set(x, "dataGrouping", js.undefined)
    
    @scala.inline
    def setDataLabels(value: NavigatorSeriesDataLabelsOptions | js.Array[NavigatorSeriesDataLabelsOptions]): Self = StObject.set(x, "dataLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataLabelsUndefined: Self = StObject.set(x, "dataLabels", js.undefined)
    
    @scala.inline
    def setDataLabelsVarargs(value: NavigatorSeriesDataLabelsOptions*): Self = StObject.set(x, "dataLabels", js.Array(value :_*))
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: (Double | (js.Array[Double | String | Null]) | js.Object | Null)*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLineColor(value: ColorString): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineColorNull: Self = StObject.set(x, "lineColor", null)
    
    @scala.inline
    def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    @scala.inline
    def setMarker(value: NavigatorSeriesMarkerOptions): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    @scala.inline
    def setPointRange(value: Double): Self = StObject.set(x, "pointRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointRangeNull: Self = StObject.set(x, "pointRange", null)
    
    @scala.inline
    def setPointRangeUndefined: Self = StObject.set(x, "pointRange", js.undefined)
    
    @scala.inline
    def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdNull: Self = StObject.set(x, "threshold", null)
    
    @scala.inline
    def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
