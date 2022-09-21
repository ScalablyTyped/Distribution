package typings.highcharts.mod

import typings.highcharts.highchartsStrings.organization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.highcharts.mod.SeriesOptions because var conflicts: zIndex. Inlined id, index, legendIndex, mapData, name, stack, `type`, xAxis, yAxis */ trait SeriesOrganizationOptions
  extends StObject
     with PlotOrganizationOptions {
  
  /**
    * (Highcharts) An array of data points for the series. For the
    * `organization` series type, points can be given in the following way:
    *
    * An array of objects with named values. The following snippet shows only a
    * few settings, see the complete options set below. If the total number of
    * data points exceeds the series' turboThreshold, this option is not
    * available. (see online documentation for example)
    */
  var data: js.UndefOr[js.Array[SeriesSankeyPointOptionsObject]] = js.undefined
  
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
    * (Highcharts) A collection of options for the individual nodes. The nodes
    * in an org chart are auto-generated instances of `Highcharts.Point`, but
    * options can be applied here and linked by the `id`.
    */
  var nodes: js.UndefOr[js.Array[SeriesSankeyNodesOptionsObject]] = js.undefined
  
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
  var `type`: String | organization
  
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
object SeriesOrganizationOptions {
  
  inline def apply(`type`: String | organization): SeriesOrganizationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesOrganizationOptions]
  }
  
  extension [Self <: SeriesOrganizationOptions](x: Self) {
    
    inline def setData(value: js.Array[SeriesSankeyPointOptionsObject]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: SeriesSankeyPointOptionsObject*): Self = StObject.set(x, "data", js.Array(value*))
    
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
    
    inline def setNodes(value: js.Array[SeriesSankeyNodesOptionsObject]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    inline def setNodesVarargs(value: SeriesSankeyNodesOptionsObject*): Self = StObject.set(x, "nodes", js.Array(value*))
    
    inline def setStack(value: Double | String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    inline def setType(value: String | organization): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setXAxis(value: Double | String): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
    
    inline def setXAxisUndefined: Self = StObject.set(x, "xAxis", js.undefined)
    
    inline def setYAxis(value: Double | String): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
    
    inline def setYAxisUndefined: Self = StObject.set(x, "yAxis", js.undefined)
  }
}
