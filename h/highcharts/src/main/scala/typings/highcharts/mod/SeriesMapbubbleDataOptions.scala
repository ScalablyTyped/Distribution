package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeriesMapbubbleDataOptions extends StObject {
  
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
    * (Highmaps) The geometry of a point.
    *
    * To achieve a better separation between the structure and the data, it is
    * recommended to use `mapData` to define the geometry instead of defining
    * it on the data points themselves.
    *
    * The geometry object is compatible to that of a `feature` in geoJSON, so
    * features of geoJSON can be passed directly into the `data`, optionally
    * after first filtering and processing it.
    */
  var geometry: js.UndefOr[js.Object | SeriesMapbubbleDataGeometryOptions] = js.undefined
  
  /**
    * (Highmaps) An id for the point. This can be used after render time to get
    * a pointer to the point object through `chart.get()`.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * (Highmaps) The name of the point as shown in the legend, tooltip,
    * dataLabel etc.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * (Highmaps) While the `x` and `y` values of the bubble are determined by
    * the underlying map, the `z` indicates the actual value that gives the
    * size of the bubble.
    */
  var z: js.UndefOr[Double | Null] = js.undefined
}
object SeriesMapbubbleDataOptions {
  
  inline def apply(): SeriesMapbubbleDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesMapbubbleDataOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SeriesMapbubbleDataOptions] (val x: Self) extends AnyVal {
    
    inline def setColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDataLabels(value: DataLabelsOptions): Self = StObject.set(x, "dataLabels", value.asInstanceOf[js.Any])
    
    inline def setDataLabelsUndefined: Self = StObject.set(x, "dataLabels", js.undefined)
    
    inline def setDrilldown(value: String): Self = StObject.set(x, "drilldown", value.asInstanceOf[js.Any])
    
    inline def setDrilldownUndefined: Self = StObject.set(x, "drilldown", js.undefined)
    
    inline def setEvents(value: PointEventsOptionsObject): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setGeometry(value: js.Object | SeriesMapbubbleDataGeometryOptions): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    inline def setZNull: Self = StObject.set(x, "z", null)
    
    inline def setZUndefined: Self = StObject.set(x, "z", js.undefined)
  }
}
