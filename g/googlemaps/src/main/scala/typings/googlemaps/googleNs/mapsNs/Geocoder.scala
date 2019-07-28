package typings.googlemaps.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/***** Services *****/
@JSGlobal("google.maps.Geocoder")
@js.native
class Geocoder () extends js.Object {
  def geocode(
    request: GeocoderRequest,
    callback: js.Function2[/* results */ js.Array[GeocoderResult], /* status */ GeocoderStatus, Unit]
  ): Unit = js.native
}

