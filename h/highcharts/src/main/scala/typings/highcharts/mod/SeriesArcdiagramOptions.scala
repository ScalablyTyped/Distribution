package typings.highcharts.mod

import typings.highcharts.highchartsStrings.arcdiagram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.highcharts.mod.SeriesOptions because var conflicts: zIndex. Inlined id, index, legendIndex, mapData, name, stack, `type`, xAxis, yAxis */ trait SeriesArcdiagramOptions
  extends StObject
     with PlotArcdiagramOptions {
  
  /**
    * Not available
    */
  var centerInCategory: Unit
  
  /**
    * Not available
    */
  var curveFactor: Unit
  
  /**
    * (Highcharts) An array of data points for the series. For the `arcdiagram`
    * series type, points can be given in the following way:
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
    * (Highcharts) The radius of the link arc. If not set, series renders a
    * semi-circle between the nodes, except when overflowing the edge of the
    * plot area, in which case an arc touching the edge is rendered. If
    * `linkRadius` is set, an arc extending to the given value is rendered.
    */
  var linkRadius: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts) The global link weight. If not set, width is calculated per
    * link, depending on the weight value.
    */
  var linkWeight: js.UndefOr[Double] = js.undefined
  
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
    * (Highcharts) A collection of options for the individual nodes. The nodes
    * in an arc diagram are auto-generated instances of `Highcharts.Point`, but
    * options can be applied here and linked by the `id`.
    */
  var nodes: js.UndefOr[js.Array[SeriesSankeyNodesOptionsObject]] = js.undefined
  
  /**
    * (Highcharts) The offset of an arc diagram nodes column in relation to the
    * `plotArea`. The offset equal to 50% places nodes in the center of a
    * chart. By default the series is placed so that the biggest node is
    * touching the bottom border of the `plotArea`.
    */
  var offset: js.UndefOr[String] = js.undefined
  
  /**
    * Not available
    */
  var stack: js.UndefOr[Double | String | Unit]
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) This property is only in
    * TypeScript non-optional and might be `undefined` in series objects from
    * unknown sources.
    */
  var `type`: String | arcdiagram
  
  /**
    * Not available
    */
  var xAxis: js.UndefOr[Double | String | Unit]
  
  /**
    * Not available
    */
  var yAxis: js.UndefOr[Double | String | Unit]
}
object SeriesArcdiagramOptions {
  
  inline def apply(centerInCategory: Unit, curveFactor: Unit, nodePadding: Unit, `type`: String | arcdiagram): SeriesArcdiagramOptions = {
    val __obj = js.Dynamic.literal(centerInCategory = centerInCategory.asInstanceOf[js.Any], curveFactor = curveFactor.asInstanceOf[js.Any], nodePadding = nodePadding.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesArcdiagramOptions]
  }
  
  extension [Self <: SeriesArcdiagramOptions](x: Self) {
    
    inline def setCenterInCategory(value: Unit): Self = StObject.set(x, "centerInCategory", value.asInstanceOf[js.Any])
    
    inline def setCurveFactor(value: Unit): Self = StObject.set(x, "curveFactor", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Array[SeriesSankeyPointOptionsObject]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: SeriesSankeyPointOptionsObject*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setLegendIndex(value: Double): Self = StObject.set(x, "legendIndex", value.asInstanceOf[js.Any])
    
    inline def setLegendIndexUndefined: Self = StObject.set(x, "legendIndex", js.undefined)
    
    inline def setLinkRadius(value: Double): Self = StObject.set(x, "linkRadius", value.asInstanceOf[js.Any])
    
    inline def setLinkRadiusUndefined: Self = StObject.set(x, "linkRadius", js.undefined)
    
    inline def setLinkWeight(value: Double): Self = StObject.set(x, "linkWeight", value.asInstanceOf[js.Any])
    
    inline def setLinkWeightUndefined: Self = StObject.set(x, "linkWeight", js.undefined)
    
    inline def setMapData(value: GeoJSON | TopoJSON | js.Array[SeriesMapDataOptions]): Self = StObject.set(x, "mapData", value.asInstanceOf[js.Any])
    
    inline def setMapDataUndefined: Self = StObject.set(x, "mapData", js.undefined)
    
    inline def setMapDataVarargs(value: SeriesMapDataOptions*): Self = StObject.set(x, "mapData", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNodePadding(value: Unit): Self = StObject.set(x, "nodePadding", value.asInstanceOf[js.Any])
    
    inline def setNodes(value: js.Array[SeriesSankeyNodesOptionsObject]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    inline def setNodesVarargs(value: SeriesSankeyNodesOptionsObject*): Self = StObject.set(x, "nodes", js.Array(value*))
    
    inline def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setStack(value: Double | String | Unit): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    inline def setType(value: String | arcdiagram): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setXAxis(value: Double | String | Unit): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
    
    inline def setXAxisUndefined: Self = StObject.set(x, "xAxis", js.undefined)
    
    inline def setYAxis(value: Double | String | Unit): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
    
    inline def setYAxisUndefined: Self = StObject.set(x, "yAxis", js.undefined)
  }
}
