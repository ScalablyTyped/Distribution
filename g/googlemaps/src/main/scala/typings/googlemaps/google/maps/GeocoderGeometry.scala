package typings.googlemaps.google.maps

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
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], location_type = location_type.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocoderGeometry]
  }
}

