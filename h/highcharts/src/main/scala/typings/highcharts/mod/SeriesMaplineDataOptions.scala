package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeriesMaplineDataOptions extends StObject {
  
  /**
    * (Highmaps) Individual color for the point. By default the color is either
    * used to denote the value, or pulled from the global `colors` array.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  
  /**
    * (Highmaps) Individual data label for each point. The options are the same
    * as the ones for plotOptions.series.dataLabels.
    */
  var dataLabels: js.UndefOr[DataLabelsOptions] = js.undefined
  
  /**
    * (Highmaps) The `id` of a series in the drilldown.series array to use for
    * a drilldown for this point.
    */
  var drilldown: js.UndefOr[String] = js.undefined
  
  /**
    * (Highmaps) Individual point events
    */
  var events: js.UndefOr[PointEventsOptionsObject] = js.undefined
  
  /**
    * (Highmaps) For map and mapline series types, the geometry of a point.
    *
    * To achieve a better separation between the structure and the data, it is
    * recommended to use `mapData` to define the geometry instead of defining
    * it on the data points themselves.
    *
    * The geometry object is compatible to that of a `feature` in geoJSON, so
    * features of geoJSON can be passed directly into the `data`, optionally
    * after first filtering and processing it.
    */
  var geometry: js.UndefOr[js.Object | SeriesMaplineDataGeometryOptions] = js.undefined
  
  /**
    * (Highmaps) An id for the point. This can be used after render time to get
    * a pointer to the point object through `chart.get()`.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * (Highmaps) When data labels are laid out on a map, Highmaps runs a
    * simplified algorithm to detect collision. When two labels collide, the
    * one with the lowest rank is hidden. By default the rank is computed from
    * the area.
    */
  var labelrank: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highmaps) The relative mid point of an area, used to place the data
    * label. Ranges from 0 to 1\. When `mapData` is used, middleX can be
    * defined there.
    */
  var middleX: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highmaps) The relative mid point of an area, used to place the data
    * label. Ranges from 0 to 1\. When `mapData` is used, middleY can be
    * defined there.
    */
  var middleY: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highmaps) The name of the point as shown in the legend, tooltip,
    * dataLabel etc.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * (Highmaps) For map and mapline series types, the SVG path for the shape.
    * For compatibily with old IE, not all SVG path definitions are supported,
    * but M, L and C operators are safe.
    *
    * To achieve a better separation between the structure and the data, it is
    * recommended to use `mapData` to define that paths instead of defining
    * them on the data points themselves.
    *
    * For providing true geographical shapes based on longitude and latitude,
    * use the `geometry` option instead.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * (Highmaps) The numeric value of the data point.
    */
  var value: js.UndefOr[Double | Null] = js.undefined
}
object SeriesMaplineDataOptions {
  
  inline def apply(): SeriesMaplineDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesMaplineDataOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SeriesMaplineDataOptions] (val x: Self) extends AnyVal {
    
    inline def setColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDataLabels(value: DataLabelsOptions): Self = StObject.set(x, "dataLabels", value.asInstanceOf[js.Any])
    
    inline def setDataLabelsUndefined: Self = StObject.set(x, "dataLabels", js.undefined)
    
    inline def setDrilldown(value: String): Self = StObject.set(x, "drilldown", value.asInstanceOf[js.Any])
    
    inline def setDrilldownUndefined: Self = StObject.set(x, "drilldown", js.undefined)
    
    inline def setEvents(value: PointEventsOptionsObject): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setGeometry(value: js.Object | SeriesMaplineDataGeometryOptions): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLabelrank(value: Double): Self = StObject.set(x, "labelrank", value.asInstanceOf[js.Any])
    
    inline def setLabelrankUndefined: Self = StObject.set(x, "labelrank", js.undefined)
    
    inline def setMiddleX(value: Double): Self = StObject.set(x, "middleX", value.asInstanceOf[js.Any])
    
    inline def setMiddleXUndefined: Self = StObject.set(x, "middleX", js.undefined)
    
    inline def setMiddleY(value: Double): Self = StObject.set(x, "middleY", value.asInstanceOf[js.Any])
    
    inline def setMiddleYUndefined: Self = StObject.set(x, "middleY", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
