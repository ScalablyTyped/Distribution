package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DirectionsStatus extends js.Object

@JSGlobal("google.maps.DirectionsStatus")
@js.native
object DirectionsStatus extends js.Object {
  @js.native
  sealed trait INVALID_REQUEST
    extends googlemapsLib.googleNs.mapsNs.DirectionsStatus
  
  @js.native
  sealed trait MAX_WAYPOINTS_EXCEEDED
    extends googlemapsLib.googleNs.mapsNs.DirectionsStatus
  
  @js.native
  sealed trait NOT_FOUND
    extends googlemapsLib.googleNs.mapsNs.DirectionsStatus
  
  @js.native
  sealed trait OK
    extends googlemapsLib.googleNs.mapsNs.DirectionsStatus
  
  @js.native
  sealed trait OVER_QUERY_LIMIT
    extends googlemapsLib.googleNs.mapsNs.DirectionsStatus
  
  @js.native
  sealed trait REQUEST_DENIED
    extends googlemapsLib.googleNs.mapsNs.DirectionsStatus
  
  @js.native
  sealed trait UNKNOWN_ERROR
    extends googlemapsLib.googleNs.mapsNs.DirectionsStatus
  
  @js.native
  sealed trait ZERO_RESULTS
    extends googlemapsLib.googleNs.mapsNs.DirectionsStatus
  
  /* 0 */ val INVALID_REQUEST: INVALID_REQUEST with scala.Double = js.native
  /* 1 */ val MAX_WAYPOINTS_EXCEEDED: MAX_WAYPOINTS_EXCEEDED with scala.Double = js.native
  /* 2 */ val NOT_FOUND: NOT_FOUND with scala.Double = js.native
  /* 3 */ val OK: OK with scala.Double = js.native
  /* 4 */ val OVER_QUERY_LIMIT: OVER_QUERY_LIMIT with scala.Double = js.native
  /* 5 */ val REQUEST_DENIED: REQUEST_DENIED with scala.Double = js.native
  /* 6 */ val UNKNOWN_ERROR: UNKNOWN_ERROR with scala.Double = js.native
  /* 7 */ val ZERO_RESULTS: ZERO_RESULTS with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[googlemapsLib.googleNs.mapsNs.DirectionsStatus with scala.Double] = js.native
}

