package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DirectionsStep extends js.Object {
  var distance: Distance
  var duration: Duration
  var end_location: LatLng
  var instructions: java.lang.String
  var path: js.Array[LatLng]
  var start_location: LatLng
  var steps: DirectionsStep
  var transit: TransitDetails
  var travel_mode: TravelMode
}

