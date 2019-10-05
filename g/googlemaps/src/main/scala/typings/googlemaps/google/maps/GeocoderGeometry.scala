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
    val __obj = js.Dynamic.literal(bounds = bounds, location = location, location_type = location_type, viewport = viewport)
  
    __obj.asInstanceOf[GeocoderGeometry]
  }
}

