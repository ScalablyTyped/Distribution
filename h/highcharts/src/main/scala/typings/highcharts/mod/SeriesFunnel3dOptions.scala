package typings.highcharts.mod

import typings.highcharts.highchartsStrings.funnel3d
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.highcharts.mod.SeriesOptions because var conflicts: zIndex. Inlined id, index, legendIndex, mapData, name, stack, `type`, xAxis, yAxis */ trait SeriesFunnel3dOptions
  extends StObject
     with PlotFunnel3dOptions {
  
  /**
    * (Highcharts, Highmaps) The center of the series. By default, it is
    * centered in the middle of the plot area, so it fills the plot area
    * height.
    */
  var center: js.UndefOr[js.Array[Double | String]] = js.undefined
  
  /**
    * (Highcharts, Highmaps) The end angle of the pie in degrees where 0 is top
    * and 90 is right. Defaults to `startAngle` plus 360.
    */
  var endAngle: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts) If the total sum of the pie's values is 0, the series is
    * represented as an empty circle . The `fillColor` option defines the color
    * of that circle. Use pie.borderWidth to set the border thickness.
    */
  var fillColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) An id for the series. This can
    * be used after render time to get a pointer to the series object through
    * `chart.get()`.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highmaps) Equivalent to chart.ignoreHiddenSeries, this
    * option tells whether the series shall be redrawn as if the hidden point
    * were `null`.
    *
    * The default value changed from `false` to `true` with Highcharts 3.0.
    */
  var ignoreHiddenPoint: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The index of the series in the
    * chart, affecting the internal index in the `chart.series` array, the
    * visible Z index as well as the order in the legend.
    */
  var index: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highmaps) The size of the inner diameter for the pie. A size
    * greater than 0 renders a donut chart. Can be a percentage or pixel value.
    * Percentages are relative to the pie size. Pixel values are given as
    * integers. Setting overridden by thickness.
    *
    * Note: in Highcharts < 4.1.2, the percentage was relative to the plot
    * area, not the pie size.
    */
  var innerSize: js.UndefOr[Double | String] = js.undefined
  
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
    * (Highcharts, Highmaps) The minimum size for a pie in response to auto
    * margins. The pie will try to shrink to make room for data labels in side
    * the plot area, but only to this size.
    */
  var minSize: js.UndefOr[Double | String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The name of the series as shown
    * in the legend, tooltip etc.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highmaps) The diameter of the pie relative to the plot area.
    * Can be a percentage or pixel value. Pixel values are given as integers.
    * The default behaviour (as of 3.0) is to scale to the plot area and give
    * room for data labels within the plot area. slicedOffset is also included
    * in the default size calculation. As a consequence, the size of the pie
    * may vary when points are updated and data labels more around. In that
    * case it is best to set a fixed value, for example `"75%"`.
    */
  var size: js.UndefOr[Double | String | Null] = js.undefined
  
  /**
    * (Highcharts, Highmaps) If a point is sliced, moved out from the center,
    * how many pixels should it be moved?.
    */
  var slicedOffset: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock) This option allows grouping series in a stacked
    * chart. The stack option can be a string or anything else, as long as the
    * grouped series' stack options match each other after conversion into a
    * string.
    */
  var stack: js.UndefOr[Double | String] = js.undefined
  
  /**
    * (Highcharts, Highmaps) The start angle of the pie slices in degrees where
    * 0 is top and 90 right.
    */
  var startAngle: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts) Thickness describing the ring size for a donut type chart,
    * overriding innerSize.
    */
  var thickness: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) This property is only in
    * TypeScript non-optional and might be `undefined` in series objects from
    * unknown sources.
    */
  var `type`: String | funnel3d
  
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
object SeriesFunnel3dOptions {
  
  inline def apply(`type`: String | funnel3d): SeriesFunnel3dOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesFunnel3dOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SeriesFunnel3dOptions] (val x: Self) extends AnyVal {
    
    inline def setCenter(value: js.Array[Double | String]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setCenterVarargs(value: (Double | String)*): Self = StObject.set(x, "center", js.Array(value*))
    
    inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    inline def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
    
    inline def setFillColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIgnoreHiddenPoint(value: Boolean): Self = StObject.set(x, "ignoreHiddenPoint", value.asInstanceOf[js.Any])
    
    inline def setIgnoreHiddenPointUndefined: Self = StObject.set(x, "ignoreHiddenPoint", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setInnerSize(value: Double | String): Self = StObject.set(x, "innerSize", value.asInstanceOf[js.Any])
    
    inline def setInnerSizeUndefined: Self = StObject.set(x, "innerSize", js.undefined)
    
    inline def setLegendIndex(value: Double): Self = StObject.set(x, "legendIndex", value.asInstanceOf[js.Any])
    
    inline def setLegendIndexUndefined: Self = StObject.set(x, "legendIndex", js.undefined)
    
    inline def setMapData(value: GeoJSON | TopoJSON | js.Array[SeriesMapDataOptions]): Self = StObject.set(x, "mapData", value.asInstanceOf[js.Any])
    
    inline def setMapDataUndefined: Self = StObject.set(x, "mapData", js.undefined)
    
    inline def setMapDataVarargs(value: SeriesMapDataOptions*): Self = StObject.set(x, "mapData", js.Array(value*))
    
    inline def setMinSize(value: Double | String): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    
    inline def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSize(value: Double | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeNull: Self = StObject.set(x, "size", null)
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSlicedOffset(value: Double): Self = StObject.set(x, "slicedOffset", value.asInstanceOf[js.Any])
    
    inline def setSlicedOffsetUndefined: Self = StObject.set(x, "slicedOffset", js.undefined)
    
    inline def setStack(value: Double | String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    inline def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
    
    inline def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    inline def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
    
    inline def setType(value: String | funnel3d): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setXAxis(value: Double | String): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
    
    inline def setXAxisUndefined: Self = StObject.set(x, "xAxis", js.undefined)
    
    inline def setYAxis(value: Double | String): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
    
    inline def setYAxisUndefined: Self = StObject.set(x, "yAxis", js.undefined)
  }
}
