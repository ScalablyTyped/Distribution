package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/***** Services *****/
trait Geocoder extends StObject {
  
  def geocode(
    request: GeocoderRequest,
    callback: js.Function2[/* results */ js.Array[GeocoderResult], /* status */ GeocoderStatus, Unit]
  ): Unit
}
object Geocoder {
  
  inline def apply(
    geocode: (GeocoderRequest, js.Function2[/* results */ js.Array[GeocoderResult], /* status */ GeocoderStatus, Unit]) => Unit
  ): Geocoder = {
    val __obj = js.Dynamic.literal(geocode = js.Any.fromFunction2(geocode))
    __obj.asInstanceOf[Geocoder]
  }
  
  extension [Self <: Geocoder](x: Self) {
    
    inline def setGeocode(
      value: (GeocoderRequest, js.Function2[/* results */ js.Array[GeocoderResult], /* status */ GeocoderStatus, Unit]) => Unit
    ): Self = StObject.set(x, "geocode", js.Any.fromFunction2(value))
  }
}
