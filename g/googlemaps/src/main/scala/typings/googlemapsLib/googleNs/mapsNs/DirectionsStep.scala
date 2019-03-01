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

object DirectionsStep {
  @scala.inline
  def apply(
    distance: Distance,
    duration: Duration,
    end_location: LatLng,
    instructions: java.lang.String,
    path: js.Array[LatLng],
    start_location: LatLng,
    steps: DirectionsStep,
    transit: TransitDetails,
    travel_mode: TravelMode
  ): DirectionsStep = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("distance")(distance)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("end_location")(end_location)
    __obj.updateDynamic("instructions")(instructions)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("start_location")(start_location)
    __obj.updateDynamic("steps")(steps)
    __obj.updateDynamic("transit")(transit)
    __obj.updateDynamic("travel_mode")(travel_mode)
    __obj.asInstanceOf[DirectionsStep]
  }
}

