package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeriesMappointDataGeometryOptions extends StObject {
  
  /**
    * (Highmaps) The geometry coordinates in terms of `[longitude, latitude]`.
    */
  var coordinates: js.UndefOr[LonLatArray] = js.undefined
  
  /**
    * (Highmaps) The geometry type, which in case of the `mappoint` series is
    * always `Point`.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SeriesMappointDataGeometryOptions {
  
  inline def apply(): SeriesMappointDataGeometryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesMappointDataGeometryOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SeriesMappointDataGeometryOptions] (val x: Self) extends AnyVal {
    
    inline def setCoordinates(value: LonLatArray): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesUndefined: Self = StObject.set(x, "coordinates", js.undefined)
    
    inline def setCoordinatesVarargs(value: Double*): Self = StObject.set(x, "coordinates", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
