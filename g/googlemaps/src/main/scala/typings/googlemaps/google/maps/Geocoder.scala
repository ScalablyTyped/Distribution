package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/***** Services *****/
@js.native
trait Geocoder extends js.Object {
  def geocode(
    request: GeocoderRequest,
    callback: js.Function2[/* results */ js.Array[GeocoderResult], /* status */ GeocoderStatus, Unit]
  ): Unit = js.native
}

object Geocoder {
  @scala.inline
  def apply(
    geocode: (GeocoderRequest, js.Function2[/* results */ js.Array[GeocoderResult], /* status */ GeocoderStatus, Unit]) => Unit
  ): Geocoder = {
    val __obj = js.Dynamic.literal(geocode = js.Any.fromFunction2(geocode))
    __obj.asInstanceOf[Geocoder]
  }
  @scala.inline
  implicit class GeocoderOps[Self <: Geocoder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGeocode(
      value: (GeocoderRequest, js.Function2[/* results */ js.Array[GeocoderResult], /* status */ GeocoderStatus, Unit]) => Unit
    ): Self = this.set("geocode", js.Any.fromFunction2(value))
  }
  
}

