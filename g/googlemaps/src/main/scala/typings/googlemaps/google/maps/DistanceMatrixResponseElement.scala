package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single element of a response to a {@link DistanceMatrixService} request, which contains the duration and
  * distance from one origin to one destination.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixResponseElement Maps JavaScript API}
  */
trait DistanceMatrixResponseElement extends StObject {
  
  /**
    * The distance for this origin-destination pairing. This property may be undefined as the distance may be
    * unknown.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixResponseElement.distance Maps JavaScript API}
    */
  var distance: Distance
  
  /**
    * The duration for this origin-destination pairing. This property may be undefined as the duration may be
    * unknown.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixResponseElement.duration Maps JavaScript API}
    */
  var duration: Duration
  
  /**
    * The duration for this origin-destination pairing, taking into account the traffic conditions indicated by the
    * `trafficModel` property. This property may be undefined as the duration may be unknown. Only available to
    * Premium Plan customers when {@link DistanceMatrixRequest#drivingOptions drivingOptions} is defined when
    * making the request.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixResponseElement.duration_in_traffic Maps JavaScript API}
    */
  var duration_in_traffic: Duration
  
  /**
    * The total fare for this origin-destination pairing. Only applicable to transit requests.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixResponseElement.fare Maps JavaScript API}
    */
  var fare: TransitFare
  
  /**
    * The status of this particular origin-destination pairing.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixResponseElement.status Maps JavaScript API}
    */
  var status: DistanceMatrixElementStatus
}
object DistanceMatrixResponseElement {
  
  inline def apply(
    distance: Distance,
    duration: Duration,
    duration_in_traffic: Duration,
    fare: TransitFare,
    status: DistanceMatrixElementStatus
  ): DistanceMatrixResponseElement = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], duration_in_traffic = duration_in_traffic.asInstanceOf[js.Any], fare = fare.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistanceMatrixResponseElement]
  }
  
  extension [Self <: DistanceMatrixResponseElement](x: Self) {
    
    inline def setDistance(value: Distance): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Duration): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDuration_in_traffic(value: Duration): Self = StObject.set(x, "duration_in_traffic", value.asInstanceOf[js.Any])
    
    inline def setFare(value: TransitFare): Self = StObject.set(x, "fare", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: DistanceMatrixElementStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
