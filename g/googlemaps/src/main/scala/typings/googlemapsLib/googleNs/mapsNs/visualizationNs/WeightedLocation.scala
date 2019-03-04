package typings
package googlemapsLib.googleNs.mapsNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WeightedLocation extends js.Object {
  var location: googlemapsLib.googleNs.mapsNs.LatLng
  var weight: scala.Double
}

object WeightedLocation {
  @scala.inline
  def apply(location: googlemapsLib.googleNs.mapsNs.LatLng, weight: scala.Double): WeightedLocation = {
    val __obj = js.Dynamic.literal(location = location, weight = weight)
  
    __obj.asInstanceOf[WeightedLocation]
  }
}

