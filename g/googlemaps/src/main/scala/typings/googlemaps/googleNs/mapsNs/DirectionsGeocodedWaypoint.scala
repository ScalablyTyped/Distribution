package typings.googlemaps.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single geocoded waypoint.
  */
trait DirectionsGeocodedWaypoint extends js.Object {
  var partial_match: Boolean
  var place_id: String
  var types: js.Array[String]
}

object DirectionsGeocodedWaypoint {
  @scala.inline
  def apply(partial_match: Boolean, place_id: String, types: js.Array[String]): DirectionsGeocodedWaypoint = {
    val __obj = js.Dynamic.literal(partial_match = partial_match, place_id = place_id, types = types)
  
    __obj.asInstanceOf[DirectionsGeocodedWaypoint]
  }
}

