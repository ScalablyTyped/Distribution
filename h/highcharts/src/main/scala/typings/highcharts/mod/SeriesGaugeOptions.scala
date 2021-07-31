package typings.highcharts.mod

import typings.highcharts.highchartsStrings.gauge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.highcharts.mod.SeriesOptions because var conflicts: zIndex. Inlined id, index, legendIndex, mapData, name, stack, `type`, xAxis, yAxis */ trait SeriesGaugeOptions
  extends StObject
     with PlotGaugeOptions {
  
  /**
    * (Highcharts) An array of data points for the series. For the `gauge`
    * series type, points can be given in the following ways:
    *
    * 1. An array of numerical values. In this case, the numerical values will
    * be interpreted as `y` options. Example: (see online documentation for
    * example)
    *
    * 2. An array of objects with named values. The following snippet shows
    * only a few settings, see the complete options set below. If the total
    * number of data points exceeds the series' turboThreshold, this option is
    * not available. (see online documentation for example)
    *
    * The typical gauge only contains a single data value.
    */
  var data: js.UndefOr[js.Array[Double | Null | PointOptionsObject]] = js.undefined
  
  /**
    * Not available
    */
  var dataParser: Unit
  
  /**
    * Not available
    */
  var dataURL: Unit
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) An id for the series. This can
    * be used after render time to get a pointer to the series object through
    * `chart.get()`.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The index of the series in the
    * chart, affecting the internal index in the `chart.series` array, the
    * visible Z index as well as the order in the legend.
    */
  var index: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The sequential index of the
    * series in the legend.
    */
  var legendIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highmaps) A map data object containing a `path` definition and
    * optionally additional properties to join in the data as per the `joinBy`
    * option.
    */
  var mapData: js.UndefOr[js.Array[SeriesMapDataOptions] | js.Any] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The name of the series as shown
    * in the legend, tooltip etc.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Not available
    */
  var stack: js.UndefOr[Double | String | Unit]
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) This property is only in
    * TypeScript non-optional and might be `undefined` in series objects from
    * unknown sources.
    */
  var `type`: String | gauge
  
  /**
    * (Highcharts, Highstock) When using dual or multiple x axes, this number
    * defines which xAxis the particular series is connected to. It refers to
    * either the axis id or the index of the axis in the xAxis array, with 0
    * being the first.
    */
  var xAxis: js.UndefOr[Double | String] = js.undefined
  
  /**
    * (Highcharts, Highstock) When using dual or multiple y axes, this number
    * defines which yAxis the particular series is connected to. It refers to
    * either the axis id or the index of the axis in the yAxis array, with 0
    * being the first.
    */
  var yAxis: js.UndefOr[Double | String] = js.undefined
}
object SeriesGaugeOptions {
  
  @scala.inline
  def apply(dataParser: Unit, dataURL: Unit, `type`: String | gauge): SeriesGaugeOptions = {
    val __obj = js.Dynamic.literal(dataParser = dataParser.asInstanceOf[js.Any], dataURL = dataURL.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesGaugeOptions]
  }
  
  @scala.inline
  implicit class SeriesGaugeOptionsMutableBuilder[Self <: SeriesGaugeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[Double | Null | PointOptionsObject]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataParser(value: Unit): Self = StObject.set(x, "dataParser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataURL(value: Unit): Self = StObject.set(x, "dataURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: (Double | Null | PointOptionsObject)*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setLegendIndex(value: Double): Self = StObject.set(x, "legendIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendIndexUndefined: Self = StObject.set(x, "legendIndex", js.undefined)
    
    @scala.inline
    def setMapData(value: js.Array[SeriesMapDataOptions] | js.Any): Self = StObject.set(x, "mapData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapDataUndefined: Self = StObject.set(x, "mapData", js.undefined)
    
    @scala.inline
    def setMapDataVarargs(value: SeriesMapDataOptions*): Self = StObject.set(x, "mapData", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setStack(value: Double | String | Unit): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    @scala.inline
    def setType(value: String | gauge): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxis(value: Double | String): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisUndefined: Self = StObject.set(x, "xAxis", js.undefined)
    
    @scala.inline
    def setYAxis(value: Double | String): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisUndefined: Self = StObject.set(x, "yAxis", js.undefined)
  }
}
