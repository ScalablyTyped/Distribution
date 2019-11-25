package typings.googlemaps.google.maps

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
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], duration_in_traffic = duration_in_traffic.asInstanceOf[js.Any], fare = fare.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DistanceMatrixResponseElement]
  }
}

