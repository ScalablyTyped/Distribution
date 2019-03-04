package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionsGeocodedWaypoint extends js.Object {
  var partial_match: scala.Boolean
  var place_id: java.lang.String
  var types: js.Array[java.lang.String]
}

object DirectionsGeocodedWaypoint {
  @scala.inline
  def apply(partial_match: scala.Boolean, place_id: java.lang.String, types: js.Array[java.lang.String]): DirectionsGeocodedWaypoint = {
    val __obj = js.Dynamic.literal(partial_match = partial_match, place_id = place_id, types = types)
  
    __obj.asInstanceOf[DirectionsGeocodedWaypoint]
  }
}

