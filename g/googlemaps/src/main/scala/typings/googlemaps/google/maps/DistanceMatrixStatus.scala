package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DistanceMatrixStatus extends js.Object
/**
  * The top-level status about the request in general returned by the {@link DistanceMatrixService} upon completion
  * of a distance matrix request. Specify these by value, or by using the constant's name.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixStatus Maps JavaScript API}
  */
@JSGlobal("google.maps.DistanceMatrixStatus")
@js.native
object DistanceMatrixStatus extends js.Object {
  
  /**
    * The provided request was invalid.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixStatus.INVALID_REQUEST Maps JavaScript API}
    */
  @js.native
  sealed trait INVALID_REQUEST extends DistanceMatrixStatus
  
  /**
    * The request contains more than 25 origins, or more than 25 destinations.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixStatus.MAX_DIMENSIONS_EXCEEDED Maps JavaScript API}
    */
  @js.native
  sealed trait MAX_DIMENSIONS_EXCEEDED extends DistanceMatrixStatus
  
  /**
    * The product of origins and destinations exceeds the per-query limit.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixStatus.MAX_ELEMENTS_EXCEEDED Maps JavaScript API}
    */
  @js.native
  sealed trait MAX_ELEMENTS_EXCEEDED extends DistanceMatrixStatus
  
  /**
    * The response contains a valid result.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixStatus.OK Maps JavaScript API}
    */
  @js.native
  sealed trait OK extends DistanceMatrixStatus
  
  /**
    * Too many elements have been requested within the allowed time period. The request should succeed if you try
    * again after some time.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixStatus.OVER_QUERY_LIMIT Maps JavaScript API}
    */
  @js.native
  sealed trait OVER_QUERY_LIMIT extends DistanceMatrixStatus
  
  /**
    * The service denied use of the Distance Matrix service by your web page.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixStatus.REQUEST_DENIED Maps JavaScript API}
    */
  @js.native
  sealed trait REQUEST_DENIED extends DistanceMatrixStatus
  
  /**
    * A Distance Matrix request could not be processed due to a server error. The request may succeed if you try
    * again.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixStatus.UNKNOWN_ERROR Maps JavaScript API}
    */
  @js.native
  sealed trait UNKNOWN_ERROR extends DistanceMatrixStatus
}
