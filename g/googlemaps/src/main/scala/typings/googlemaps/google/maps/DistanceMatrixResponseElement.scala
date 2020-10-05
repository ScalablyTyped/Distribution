package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistanceMatrixResponseElement extends js.Object {
  var distance: Distance = js.native
  var duration: Duration = js.native
  var duration_in_traffic: Duration = js.native
  var fare: TransitFare = js.native
  var status: DistanceMatrixElementStatus = js.native
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
  @scala.inline
  implicit class DistanceMatrixResponseElementOps[Self <: DistanceMatrixResponseElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDistance(value: Distance): Self = this.set("distance", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Duration): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration_in_traffic(value: Duration): Self = this.set("duration_in_traffic", value.asInstanceOf[js.Any])
    @scala.inline
    def setFare(value: TransitFare): Self = this.set("fare", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: DistanceMatrixElementStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

