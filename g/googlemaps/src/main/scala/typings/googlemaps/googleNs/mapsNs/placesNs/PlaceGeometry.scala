package typings.googlemaps.googleNs.mapsNs.placesNs

import typings.googlemaps.googleNs.mapsNs.LatLng
import typings.googlemaps.googleNs.mapsNs.LatLngBounds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaceGeometry extends js.Object {
  var location: LatLng
  var viewport: LatLngBounds
}

object PlaceGeometry {
  @scala.inline
  def apply(location: LatLng, viewport: LatLngBounds): PlaceGeometry = {
    val __obj = js.Dynamic.literal(location = location, viewport = viewport)
  
    __obj.asInstanceOf[PlaceGeometry]
  }
}

