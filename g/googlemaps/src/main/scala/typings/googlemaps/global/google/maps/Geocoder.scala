package typings.googlemaps.global.google.maps

import typings.googlemaps.google.maps.GeocoderRequest
import typings.googlemaps.google.maps.GeocoderResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/***** Services *****/
@JSGlobal("google.maps.Geocoder")
@js.native
class Geocoder ()
  extends typings.googlemaps.google.maps.Geocoder {
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

