package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeocoderGeometry extends js.Object {
  var bounds: LatLngBounds
  var location: LatLng
  var location_type: GeocoderLocationType
  var viewport: LatLngBounds
}

object GeocoderGeometry {
  @scala.inline
  def apply(
    bounds: LatLngBounds,
    location: LatLng,
    location_type: GeocoderLocationType,
    viewport: LatLngBounds
  ): GeocoderGeometry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bounds")(bounds)
    __obj.updateDynamic("location")(location)
    __obj.updateDynamic("location_type")(location_type)
    __obj.updateDynamic("viewport")(viewport)
    __obj.asInstanceOf[GeocoderGeometry]
  }
}

