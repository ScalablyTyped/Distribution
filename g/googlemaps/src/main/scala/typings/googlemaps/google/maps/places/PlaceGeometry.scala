package typings.googlemaps.google.maps.places

import typings.googlemaps.google.maps.LatLng
import typings.googlemaps.google.maps.LatLngBounds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TODO add BusinessStatus https://developers.google.com/maps/documentation/javascript/reference/places-service#BusinessStatus
trait PlaceGeometry extends js.Object {
  var location: LatLng
  var viewport: LatLngBounds
}

object PlaceGeometry {
  @scala.inline
  def apply(location: LatLng, viewport: LatLngBounds): PlaceGeometry = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceGeometry]
  }
}

