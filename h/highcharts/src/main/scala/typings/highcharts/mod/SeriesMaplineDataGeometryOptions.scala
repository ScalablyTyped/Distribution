package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeriesMaplineDataGeometryOptions extends StObject {
  
  /**
    * (Highmaps) The geometry coordinates in terms of arrays of `[longitude,
    * latitude]`, or a two dimensional array of the same. The dimensionality
    * must comply with the `type`.
    */
  var coordinates: js.UndefOr[js.Array[js.Array[LonLatArray] | LonLatArray]] = js.undefined
  
  /**
    * (Highmaps) The geometry type. Can be one of `LineString`, `Polygon`,
    * `MultiLineString` or `MultiPolygon`.
    */
  var `type`: js.UndefOr[MapGeometryTypeValue] = js.undefined
}
object SeriesMaplineDataGeometryOptions {
  
  inline def apply(): SeriesMaplineDataGeometryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesMaplineDataGeometryOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SeriesMaplineDataGeometryOptions] (val x: Self) extends AnyVal {
    
    inline def setCoordinates(value: js.Array[js.Array[LonLatArray] | LonLatArray]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesUndefined: Self = StObject.set(x, "coordinates", js.undefined)
    
    inline def setCoordinatesVarargs(value: (js.Array[LonLatArray] | LonLatArray)*): Self = StObject.set(x, "coordinates", js.Array(value*))
    
    inline def setType(value: MapGeometryTypeValue): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
