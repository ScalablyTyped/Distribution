package typings.googlemaps.global.google.maps

import typings.googlemaps.google.maps.GeocoderRequest
import typings.googlemaps.google.maps.GeocoderResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/***** Services *****/
@JSGlobal("google.maps.Geocoder")
@js.native
class Geocoder ()
  extends StObject
     with typings.googlemaps.google.maps.Geocoder {
  
  /* CompleteClass */
  override def geocode(
    request: GeocoderRequest,
    callback: js.Function2[
      /* results */ js.Array[GeocoderResult], 
      /* status */ typings.googlemaps.google.maps.GeocoderStatus, 
      Unit
    ]
  ): Unit = js.native
}
