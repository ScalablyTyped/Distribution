package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single element of a response to a {@link DistanceMatrixService} request, which contains the duration and
  * distance from one origin to one destination.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixResponseElement Maps JavaScript API}
  */
@js.native
trait DistanceMatrixResponseElement extends js.Object {
  
  /**
    * The distance for this origin-destination pairing. This property may be undefined as the distance may be
    * unknown.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixResponseElement.distance Maps JavaScript API}
    */
  var distance: Distance = js.native
  
  /**
    * The duration for this origin-destination pairing. This property may be undefined as the duration may be
    * unknown.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixResponseElement.duration Maps JavaScript API}
    */
  var duration: Duration = js.native
  
  /**
    * The duration for this origin-destination pairing, taking into account the traffic conditions indicated by the
    * `trafficModel` property. This property may be undefined as the duration may be unknown. Only available to
    * Premium Plan customers when {@link DistanceMatrixRequest#drivingOptions drivingOptions} is defined when
    * making the request.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixResponseElement.duration_in_traffic Maps JavaScript API}
    */
  var duration_in_traffic: Duration = js.native
  
  /**
    * The total fare for this origin-destination pairing. Only applicable to transit requests.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixResponseElement.fare Maps JavaScript API}
    */
  var fare: TransitFare = js.native
  
  /**
    * The status of this particular origin-destination pairing.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixResponseElement.status Maps JavaScript API}
    */
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
