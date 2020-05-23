package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/***** Services *****/
trait Geocoder extends js.Object {
  def geocode(
    request: GeocoderRequest,
    callback: js.Function2[/* results */ js.Array[GeocoderResult], /* status */ GeocoderStatus, Unit]
  ): Unit
}

object Geocoder {
  @scala.inline
  def apply(
    geocode: (GeocoderRequest, js.Function2[/* results */ js.Array[GeocoderResult], /* status */ GeocoderStatus, Unit]) => Unit
  ): Geocoder = {
    val __obj = js.Dynamic.literal(geocode = js.Any.fromFunction2(geocode))
    __obj.asInstanceOf[Geocoder]
  }
}

