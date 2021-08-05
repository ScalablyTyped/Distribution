package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link LatLngLiteral}.
  */
trait ReadonlyLatLngLiteral extends StObject {
  
  /**
    * @see {@link LatLngLiteral#lat}
    */
  val lat: Double
  
  /**
    * @see {@link LatLngLiteral#lng}
    */
  val lng: Double
}
object ReadonlyLatLngLiteral {
  
  inline def apply(lat: Double, lng: Double): ReadonlyLatLngLiteral = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyLatLngLiteral]
  }
  
  extension [Self <: ReadonlyLatLngLiteral](x: Self) {
    
    inline def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
    
    inline def setLng(value: Double): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
  }
}
