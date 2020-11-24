package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigatorSeriesOptions extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  /**
    * (Highstock, Gantt) Sets the fill color of the navigator series.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highstock) Unless data is explicitly defined, the data is borrowed from
    * the first series in the chart.
    */
  var data: js.UndefOr[js.Array[Double | (js.Array[Double | String | Null]) | js.Object | Null]] = js.native
  
  /**
    * (Highstock) Data grouping options for the navigator series.
    */
  var dataGrouping: js.UndefOr[DataGroupingOptionsObject] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Data label options for the
    * navigator series. Data labels are disabled by default on the navigator
    * series.
    */
  var dataLabels: js.UndefOr[NavigatorSeriesDataLabelsOptions | js.Array[NavigatorSeriesDataLabelsOptions]] = js.native
  
  /**
    * (Highstock, Gantt) The fill opacity of the navigator series.
    */
  var fillOpacity: js.UndefOr[Double] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  /**
    * (Highstock, Gantt) Line color for the navigator series. Allows setting
    * the color while disallowing the default candlestick setting.
    */
  var lineColor: js.UndefOr[ColorString | Null] = js.native
  
  /**
    * (Highstock, Gantt) The pixel line width of the navigator series.
    */
  var lineWidth: js.UndefOr[Double] = js.native
  
  var marker: js.UndefOr[NavigatorSeriesMarkerOptions] = js.native
  
  /**
    * (Highstock) Since Highstock v8, default value is the same as default
    * `pointRange` defined for a specific type (e.g. `null` for column type).
    *
    * In Highstock version < 8, defaults to 0.
    */
  var pointRange: js.UndefOr[Double | Null] = js.native
  
  /**
    * (Highstock, Gantt) The threshold option. Setting it to 0 will make the
    * default navigator area series draw its area from the 0 value and up.
    */
  var threshold: js.UndefOr[Double | Null] = js.native
  
  /**
    * (Highstock, Gantt) The type of the navigator series.
    *
    * Heads up: In column-type navigator, zooming is limited to at least one
    * point with its `pointRange`.
    */
  var `type`: js.UndefOr[String] = js.native
}
object NavigatorSeriesOptions {
  
  @scala.inline
  def apply(): NavigatorSeriesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigatorSeriesOptions]
  }
  
  @scala.inline
  implicit class NavigatorSeriesOptionsOps[Self <: NavigatorSeriesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: (Double | (js.Array[Double | String | Null]) | js.Object | Null)*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[Double | (js.Array[Double | String | Null]) | js.Object | Null]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDataGrouping(value: DataGroupingOptionsObject): Self = this.set("dataGrouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataGrouping: Self = this.set("dataGrouping", js.undefined)
    
    @scala.inline
    def setDataLabelsVarargs(value: NavigatorSeriesDataLabelsOptions*): Self = this.set("dataLabels", js.Array(value :_*))
    
    @scala.inline
    def setDataLabels(value: NavigatorSeriesDataLabelsOptions | js.Array[NavigatorSeriesDataLabelsOptions]): Self = this.set("dataLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataLabels: Self = this.set("dataLabels", js.undefined)
    
    @scala.inline
    def setFillOpacity(value: Double): Self = this.set("fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillOpacity: Self = this.set("fillOpacity", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLineColor(value: ColorString): Self = this.set("lineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineColor: Self = this.set("lineColor", js.undefined)
    
    @scala.inline
    def setLineColorNull: Self = this.set("lineColor", null)
    
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
    
    @scala.inline
    def setMarker(value: NavigatorSeriesMarkerOptions): Self = this.set("marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
    
    @scala.inline
    def setPointRange(value: Double): Self = this.set("pointRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointRange: Self = this.set("pointRange", js.undefined)
    
    @scala.inline
    def setPointRangeNull: Self = this.set("pointRange", null)
    
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
    
    @scala.inline
    def setThresholdNull: Self = this.set("threshold", null)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
