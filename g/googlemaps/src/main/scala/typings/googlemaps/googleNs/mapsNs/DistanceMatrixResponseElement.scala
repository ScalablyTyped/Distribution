package typings.googlemaps.googleNs.mapsNs

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
    val __obj = js.Dynamic.literal(distance = distance, duration = duration, duration_in_traffic = duration_in_traffic, fare = fare, status = status)
  
    __obj.asInstanceOf[DistanceMatrixResponseElement]
  }
}

