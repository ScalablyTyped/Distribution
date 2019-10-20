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
  
  /* "INVALID_REQUEST" */ val INVALID_REQUEST: typings.googlemaps.google.maps.DirectionsStatus.INVALID_REQUEST with String = js.native
  /* "MAX_WAYPOINTS_EXCEEDED" */ val MAX_WAYPOINTS_EXCEEDED: typings.googlemaps.google.maps.DirectionsStatus.MAX_WAYPOINTS_EXCEEDED with String = js.native
  /* "NOT_FOUND" */ val NOT_FOUND: typings.googlemaps.google.maps.DirectionsStatus.NOT_FOUND with String = js.native
  /* "OK" */ val OK: typings.googlemaps.google.maps.DirectionsStatus.OK with String = js.native
  /* "OVER_QUERY_LIMIT" */ val OVER_QUERY_LIMIT: typings.googlemaps.google.maps.DirectionsStatus.OVER_QUERY_LIMIT with String = js.native
  /* "REQUEST_DENIED" */ val REQUEST_DENIED: typings.googlemaps.google.maps.DirectionsStatus.REQUEST_DENIED with String = js.native
  /* "UNKNOWN_ERROR" */ val UNKNOWN_ERROR: typings.googlemaps.google.maps.DirectionsStatus.UNKNOWN_ERROR with String = js.native
  /* "ZERO_RESULTS" */ val ZERO_RESULTS: typings.googlemaps.google.maps.DirectionsStatus.ZERO_RESULTS with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DirectionsStatus with String] = js.native
}

