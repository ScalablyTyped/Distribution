package typings.highcharts.mod

import typings.highcharts.highchartsStrings.pictorial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.highcharts.mod.SeriesOptions because var conflicts: zIndex. Inlined id, index, legendIndex, mapData, name, stack, `type`, xAxis, yAxis */ trait SeriesPictorialOptions
  extends StObject
     with PlotPictorialOptions {
  
  /**
    * Not available
    */
  var borderRadius: Unit
  
  /**
    * Not available
    */
  var centerInCategory: Unit
  
  /**
    * (Highcharts) An array of data points for the series. For the `pictorial`
    * series type, points can be given in the following ways:
    *
    * 1. An array of arrays with 2 values. In this case, the values correspond
    * to `x,y`. If the first value is a string, it is applied as the name of
    * the point, and the `x` value is inferred. The `x` value can also be
    * omitted, in which case the inner arrays should be of length 2. Then the
    * `x` value is automatically calculated, either starting at 0 and
    * incremented by 1, or from `pointStart` and `pointInterval` given in the
    * series options. (see online documentation for example)
    *
    * 2. An array of objects with named values. The following snippet shows
    * only a few settings, see the complete options set below. If the total
    * number of data points exceeds the series' turboThreshold, this option is
    * not available. (see online documentation for example)
    */
  var data: js.UndefOr[
    js.Array[
      (js.Tuple2[Double | String, Double]) | (js.Tuple3[Double | String, Double, Double]) | PointOptionsObject
    ]
  ] = js.undefined
  
  /**
    * Not available
    */
  var dataAsColumns: Unit
  
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
    * (Highmaps) An array of objects containing a `geometry` or `path`
    * definition and optionally additional properties to join in the `data` as
    * per the `joinBy` option. GeoJSON and TopoJSON structures can also be
    * passed directly into `mapData`.
    */
  var mapData: js.UndefOr[GeoJSON | TopoJSON | js.Array[SeriesMapDataOptions]] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The name of the series as shown
    * in the legend, tooltip etc.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts) The paths include options describing the point image.
    */
  var paths: js.UndefOr[js.Array[SeriesPictorialPathsOptionsObject]] = js.undefined
  
  /**
    * (Highcharts, Highstock) This option allows grouping series in a stacked
    * chart. The stack option can be a string or anything else, as long as the
    * grouped series' stack options match each other after conversion into a
    * string.
    */
  var stack: js.UndefOr[Double | String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) This property is only in
    * TypeScript non-optional and might be `undefined` in series objects from
    * unknown sources.
    */
  var `type`: String | pictorial
  
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
object SeriesPictorialOptions {
  
  inline def apply(
    borderRadius: Unit,
    centerInCategory: Unit,
    dataAsColumns: Unit,
    dataParser: Unit,
    dataURL: Unit,
    `type`: String | pictorial
  ): SeriesPictorialOptions = {
    val __obj = js.Dynamic.literal(borderRadius = borderRadius.asInstanceOf[js.Any], centerInCategory = centerInCategory.asInstanceOf[js.Any], dataAsColumns = dataAsColumns.asInstanceOf[js.Any], dataParser = dataParser.asInstanceOf[js.Any], dataURL = dataURL.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesPictorialOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SeriesPictorialOptions] (val x: Self) extends AnyVal {
    
    inline def setBorderRadius(value: Unit): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setCenterInCategory(value: Unit): Self = StObject.set(x, "centerInCategory", value.asInstanceOf[js.Any])
    
    inline def setData(
      value: js.Array[
          (js.Tuple2[Double | String, Double]) | (js.Tuple3[Double | String, Double, Double]) | PointOptionsObject
        ]
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataAsColumns(value: Unit): Self = StObject.set(x, "dataAsColumns", value.asInstanceOf[js.Any])
    
    inline def setDataParser(value: Unit): Self = StObject.set(x, "dataParser", value.asInstanceOf[js.Any])
    
    inline def setDataURL(value: Unit): Self = StObject.set(x, "dataURL", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(
      value: ((js.Tuple2[Double | String, Double]) | (js.Tuple3[Double | String, Double, Double]) | PointOptionsObject)*
    ): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setLegendIndex(value: Double): Self = StObject.set(x, "legendIndex", value.asInstanceOf[js.Any])
    
    inline def setLegendIndexUndefined: Self = StObject.set(x, "legendIndex", js.undefined)
    
    inline def setMapData(value: GeoJSON | TopoJSON | js.Array[SeriesMapDataOptions]): Self = StObject.set(x, "mapData", value.asInstanceOf[js.Any])
    
    inline def setMapDataUndefined: Self = StObject.set(x, "mapData", js.undefined)
    
    inline def setMapDataVarargs(value: SeriesMapDataOptions*): Self = StObject.set(x, "mapData", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPaths(value: js.Array[SeriesPictorialPathsOptionsObject]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    inline def setPathsVarargs(value: SeriesPictorialPathsOptionsObject*): Self = StObject.set(x, "paths", js.Array(value*))
    
    inline def setStack(value: Double | String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    inline def setType(value: String | pictorial): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setXAxis(value: Double | String): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
    
    inline def setXAxisUndefined: Self = StObject.set(x, "xAxis", js.undefined)
    
    inline def setYAxis(value: Double | String): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
    
    inline def setYAxisUndefined: Self = StObject.set(x, "yAxis", js.undefined)
  }
}
