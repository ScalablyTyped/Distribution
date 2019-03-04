package typings
package googlemapsLib.googleNs.mapsNs.placesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaceGeometry extends js.Object {
  var location: googlemapsLib.googleNs.mapsNs.LatLng
  var viewport: googlemapsLib.googleNs.mapsNs.LatLngBounds
}

object PlaceGeometry {
  @scala.inline
  def apply(
    location: googlemapsLib.googleNs.mapsNs.LatLng,
    viewport: googlemapsLib.googleNs.mapsNs.LatLngBounds
  ): PlaceGeometry = {
    val __obj = js.Dynamic.literal(location = location, viewport = viewport)
  
    __obj.asInstanceOf[PlaceGeometry]
  }
}

