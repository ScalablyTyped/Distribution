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
  
  val INVALID_REQUEST: INVALID_REQUEST with java.lang.String = js.native
  val MAX_WAYPOINTS_EXCEEDED: MAX_WAYPOINTS_EXCEEDED with java.lang.String = js.native
  val NOT_FOUND: NOT_FOUND with java.lang.String = js.native
  val OK: OK with java.lang.String = js.native
  val OVER_QUERY_LIMIT: OVER_QUERY_LIMIT with java.lang.String = js.native
  val REQUEST_DENIED: REQUEST_DENIED with java.lang.String = js.native
  val UNKNOWN_ERROR: UNKNOWN_ERROR with java.lang.String = js.native
  val ZERO_RESULTS: ZERO_RESULTS with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[googlemapsLib.googleNs.mapsNs.DirectionsStatus with java.lang.String] = js.native
}

