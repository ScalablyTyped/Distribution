package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeriesMapbubbleDataGeometryOptions extends StObject {
  
  /**
    * (Highmaps) The geometry coordinates in terms of `[longitude, latitude]`.
    */
  var coordinates: js.UndefOr[LonLatArray] = js.undefined
  
  /**
    * (Highmaps) The geometry type, which in case of the `mappoint` series is
    * always `Point`.
    */
  var `type`: js.UndefOr[typings.highcharts.highchartsStrings.Point] = js.undefined
}
object SeriesMapbubbleDataGeometryOptions {
  
  inline def apply(): SeriesMapbubbleDataGeometryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesMapbubbleDataGeometryOptions]
  }
  
  extension [Self <: SeriesMapbubbleDataGeometryOptions](x: Self) {
    
    inline def setCoordinates(value: LonLatArray): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesUndefined: Self = StObject.set(x, "coordinates", js.undefined)
    
    inline def setCoordinatesVarargs(value: Double*): Self = StObject.set(x, "coordinates", js.Array(value*))
    
    inline def setType(value: typings.highcharts.highchartsStrings.Point): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
