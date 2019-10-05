package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DirectionsStatus extends js.Object

@JSGlobal("google.maps.DirectionsStatus")
@js.native
object DirectionsStatus extends js.Object {
  @js.native
  sealed trait INVALID_REQUEST extends DirectionsStatus
  
  @js.native
  sealed trait MAX_WAYPOINTS_EXCEEDED extends DirectionsStatus
  
  @js.native
  sealed trait NOT_FOUND extends DirectionsStatus
  
  @js.native
  sealed trait OK extends DirectionsStatus
  
  @js.native
  sealed trait OVER_QUERY_LIMIT extends DirectionsStatus
  
  @js.native
  sealed trait REQUEST_DENIED extends DirectionsStatus
  
  @js.native
  sealed trait UNKNOWN_ERROR extends DirectionsStatus
  
  @js.native
  sealed trait ZERO_RESULTS extends DirectionsStatus
  
  /* 0 */ val INVALID_REQUEST: typings.googlemaps.google.maps.DirectionsStatus.INVALID_REQUEST with Double = js.native
  /* 1 */ val MAX_WAYPOINTS_EXCEEDED: typings.googlemaps.google.maps.DirectionsStatus.MAX_WAYPOINTS_EXCEEDED with Double = js.native
  /* 2 */ val NOT_FOUND: typings.googlemaps.google.maps.DirectionsStatus.NOT_FOUND with Double = js.native
  /* 3 */ val OK: typings.googlemaps.google.maps.DirectionsStatus.OK with Double = js.native
  /* 4 */ val OVER_QUERY_LIMIT: typings.googlemaps.google.maps.DirectionsStatus.OVER_QUERY_LIMIT with Double = js.native
  /* 5 */ val REQUEST_DENIED: typings.googlemaps.google.maps.DirectionsStatus.REQUEST_DENIED with Double = js.native
  /* 6 */ val UNKNOWN_ERROR: typings.googlemaps.google.maps.DirectionsStatus.UNKNOWN_ERROR with Double = js.native
  /* 7 */ val ZERO_RESULTS: typings.googlemaps.google.maps.DirectionsStatus.ZERO_RESULTS with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DirectionsStatus with Double] = js.native
}

