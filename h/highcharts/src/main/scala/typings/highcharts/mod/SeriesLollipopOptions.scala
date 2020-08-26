package typings.highcharts.mod

import typings.highcharts.highchartsStrings.lollipop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.highcharts.mod.SeriesOptions because var conflicts: zIndex. Inlined id, index, legendIndex, mapData, name, stack, `type`, xAxis, yAxis */ @js.native
trait SeriesLollipopOptions extends PlotLollipopOptions {
  /**
    * (Highcharts, Highstock) An array of data points for the series. For the
    * `lollipop` series type, points can be given in the following ways:
    *
    * 1. An array of numerical values. In this case, the numerical values will
    * be interpreted as `y` options. The `x` values will be automatically
    * calculated, either starting at 0 and incremented by 1, or from
    * `pointStart` and `pointInterval` given in the series options. If the axis
    * has categories, these will be used. Example: (see online documentation
    * for example)
    *
    * 2. An array of arrays with 2 values. In this case, the values correspond
    * to `x,y`. If the first value is a string, it is applied as the name of
    * the point, and the `x` value is inferred. (see online documentation for
    * example)
    *
    * 3. An array of objects with named values. The following snippet shows
    * only a few settings, see the complete options set below. If the total
    * number of data points exceeds the series' turboThreshold, this option is
    * not available. (see online documentation for example)
    */
  var data: js.UndefOr[
    js.Array[Double | (js.Tuple2[Double | String, Double | Null]) | Null | PointOptionsObject]
  ] = js.native
  /**
    * Not available
    */
  var fillColor: js.UndefOr[scala.Nothing] = js.native
  /**
    * Not available
    */
  var fillOpacity: js.UndefOr[scala.Nothing] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) An id for the series. This can
    * be used after render time to get a pointer to the series object through
    * `chart.get()`.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The index of the series in the
    * chart, affecting the internal index in the `chart.series` array, the
    * visible Z index as well as the order in the legend.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The sequential index of the
    * series in the legend.
    */
  var legendIndex: js.UndefOr[Double] = js.native
  /**
    * Not available
    */
  var lowColor: js.UndefOr[scala.Nothing] = js.native
  /**
    * (Highmaps) A map data object containing a `path` definition and
    * optionally additional properties to join in the data as per the `joinBy`
    * option.
    */
  var mapData: js.UndefOr[js.Array[SeriesMapDataOptions] | js.Any] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The name of the series as shown
    * in the legend, tooltip etc.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Not available
    */
  var stack: js.UndefOr[Double | String] = js.native
  /**
    * Not available
    */
  var trackByArea: js.UndefOr[scala.Nothing] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) This property is only in
    * TypeScript non-optional and might be `undefined` in series objects from
    * unknown sources.
    */
  var `type`: String | lollipop = js.native
  /**
    * (Highcharts, Highstock) When using dual or multiple x axes, this number
    * defines which xAxis the particular series is connected to. It refers to
    * either the axis id or the index of the axis in the xAxis array, with 0
    * being the first.
    */
  var xAxis: js.UndefOr[Double | String] = js.native
  /**
    * (Highcharts, Highstock) When using dual or multiple y axes, this number
    * defines which yAxis the particular series is connected to. It refers to
    * either the axis id or the index of the axis in the yAxis array, with 0
    * being the first.
    */
  var yAxis: js.UndefOr[Double | String] = js.native
}

object SeriesLollipopOptions {
  @scala.inline
  def apply(`type`: String | lollipop): SeriesLollipopOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesLollipopOptions]
  }
  @scala.inline
  implicit class SeriesLollipopOptionsOps[Self <: SeriesLollipopOptions] (val x: Self) extends AnyVal {
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
    def setType(value: String | lollipop): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataVarargs(value: (Double | (js.Tuple2[Double | String, Double | Null]) | Null | PointOptionsObject)*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[Double | (js.Tuple2[Double | String, Double | Null]) | Null | PointOptionsObject]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setLegendIndex(value: Double): Self = this.set("legendIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegendIndex: Self = this.set("legendIndex", js.undefined)
    @scala.inline
    def setMapDataVarargs(value: SeriesMapDataOptions*): Self = this.set("mapData", js.Array(value :_*))
    @scala.inline
    def setMapData(value: js.Array[SeriesMapDataOptions] | js.Any): Self = this.set("mapData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapData: Self = this.set("mapData", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setStack(value: Double | scala.Nothing | String): Self = this.set("stack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
    @scala.inline
    def setXAxis(value: Double | String): Self = this.set("xAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXAxis: Self = this.set("xAxis", js.undefined)
    @scala.inline
    def setYAxis(value: Double | String): Self = this.set("yAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYAxis: Self = this.set("yAxis", js.undefined)
  }
  
}

