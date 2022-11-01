package typings.highcharts.mod

import typings.highcharts.highchartsStrings.treegraph
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.highcharts.mod.SeriesOptions because var conflicts: zIndex. Inlined id, index, legendIndex, mapData, name, stack, `type`, xAxis, yAxis */ trait SeriesTreegraphOptions
  extends StObject
     with PlotTreegraphOptions {
  
  /**
    * Not available
    */
  var allowDrillToNode: Unit
  
  /**
    * Not available
    */
  var centerInCategory: Unit
  
  /**
    * Not available
    */
  var curveFactor: Unit
  
  /**
    * (Highcharts) An array of data points for the series. For the `treegraph`
    * series type, points can be given in the following ways:
    *
    * 1. The array of arrays, with `keys` property, which defines how the
    * fields in array should be interpretated (see online documentation for
    * example)js data: [{ id: 'Category1' }, { id: 'Category1', parent:
    * 'Category2', }] ```
    */
  var data: js.UndefOr[js.Array[PointOptionsObject]] = js.undefined
  
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
    * Not available
    */
  var layout: Unit
  
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
    * Not available
    */
  var nodePadding: Unit
  
  /**
    * Not available
    */
  var stack: js.UndefOr[Double | String | Unit]
  
  /**
    * Not available
    */
  var traverseUpButton: Unit
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) This property is only in
    * TypeScript non-optional and might be `undefined` in series objects from
    * unknown sources.
    */
  var `type`: String | treegraph
  
  /**
    * Not available
    */
  var xAxis: js.UndefOr[Double | String | Unit]
  
  /**
    * Not available
    */
  var yAxis: js.UndefOr[Double | String | Unit]
}
object SeriesTreegraphOptions {
  
  inline def apply(
    allowDrillToNode: Unit,
    centerInCategory: Unit,
    curveFactor: Unit,
    layout: Unit,
    nodePadding: Unit,
    traverseUpButton: Unit,
    `type`: String | treegraph
  ): SeriesTreegraphOptions = {
    val __obj = js.Dynamic.literal(allowDrillToNode = allowDrillToNode.asInstanceOf[js.Any], centerInCategory = centerInCategory.asInstanceOf[js.Any], curveFactor = curveFactor.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], nodePadding = nodePadding.asInstanceOf[js.Any], traverseUpButton = traverseUpButton.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesTreegraphOptions]
  }
  
  extension [Self <: SeriesTreegraphOptions](x: Self) {
    
    inline def setAllowDrillToNode(value: Unit): Self = StObject.set(x, "allowDrillToNode", value.asInstanceOf[js.Any])
    
    inline def setCenterInCategory(value: Unit): Self = StObject.set(x, "centerInCategory", value.asInstanceOf[js.Any])
    
    inline def setCurveFactor(value: Unit): Self = StObject.set(x, "curveFactor", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Array[PointOptionsObject]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: PointOptionsObject*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setLayout(value: Unit): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLegendIndex(value: Double): Self = StObject.set(x, "legendIndex", value.asInstanceOf[js.Any])
    
    inline def setLegendIndexUndefined: Self = StObject.set(x, "legendIndex", js.undefined)
    
    inline def setMapData(value: GeoJSON | TopoJSON | js.Array[SeriesMapDataOptions]): Self = StObject.set(x, "mapData", value.asInstanceOf[js.Any])
    
    inline def setMapDataUndefined: Self = StObject.set(x, "mapData", js.undefined)
    
    inline def setMapDataVarargs(value: SeriesMapDataOptions*): Self = StObject.set(x, "mapData", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNodePadding(value: Unit): Self = StObject.set(x, "nodePadding", value.asInstanceOf[js.Any])
    
    inline def setStack(value: Double | String | Unit): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    inline def setTraverseUpButton(value: Unit): Self = StObject.set(x, "traverseUpButton", value.asInstanceOf[js.Any])
    
    inline def setType(value: String | treegraph): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setXAxis(value: Double | String | Unit): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
    
    inline def setXAxisUndefined: Self = StObject.set(x, "xAxis", js.undefined)
    
    inline def setYAxis(value: Double | String | Unit): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
    
    inline def setYAxisUndefined: Self = StObject.set(x, "yAxis", js.undefined)
  }
}
