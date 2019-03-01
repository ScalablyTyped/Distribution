package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistanceMatrixResponseElement extends js.Object {
  var distance: Distance
  var duration: Duration
  var duration_in_traffic: Duration
  var fare: TransitFare
  var status: DistanceMatrixElementStatus
}

object DistanceMatrixResponseElement {
  @scala.inline
  def apply(
    distance: Distance,
    duration: Duration,
    duration_in_traffic: Duration,
    fare: TransitFare,
    status: DistanceMatrixElementStatus
  ): DistanceMatrixResponseElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("distance")(distance)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("duration_in_traffic")(duration_in_traffic)
    __obj.updateDynamic("fare")(fare)
    __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[DistanceMatrixResponseElement]
  }
}

