package typings.googlemaps.google.maps.visualization

import typings.googlemaps.google.maps.LatLng
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WeightedLocation extends js.Object {
  var location: LatLng
  var weight: Double
}

object WeightedLocation {
  @scala.inline
  def apply(location: LatLng, weight: Double): WeightedLocation = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeightedLocation]
  }
}

