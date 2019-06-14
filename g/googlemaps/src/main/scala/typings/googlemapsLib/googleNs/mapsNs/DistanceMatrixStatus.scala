package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DistanceMatrixStatus extends js.Object

@JSGlobal("google.maps.DistanceMatrixStatus")
@js.native
object DistanceMatrixStatus extends js.Object {
  @js.native
  sealed trait INVALID_REQUEST
    extends googlemapsLib.googleNs.mapsNs.DistanceMatrixStatus
  
  @js.native
  sealed trait MAX_DIMENSIONS_EXCEEDED
    extends googlemapsLib.googleNs.mapsNs.DistanceMatrixStatus
  
  @js.native
  sealed trait MAX_ELEMENTS_EXCEEDED
    extends googlemapsLib.googleNs.mapsNs.DistanceMatrixStatus
  
  @js.native
  sealed trait OK
    extends googlemapsLib.googleNs.mapsNs.DistanceMatrixStatus
  
  @js.native
  sealed trait OVER_QUERY_LIMIT
    extends googlemapsLib.googleNs.mapsNs.DistanceMatrixStatus
  
  @js.native
  sealed trait REQUEST_DENIED
    extends googlemapsLib.googleNs.mapsNs.DistanceMatrixStatus
  
  @js.native
  sealed trait UNKNOWN_ERROR
    extends googlemapsLib.googleNs.mapsNs.DistanceMatrixStatus
  
  /* 0 */ val INVALID_REQUEST: INVALID_REQUEST with scala.Double = js.native
  /* 1 */ val MAX_DIMENSIONS_EXCEEDED: MAX_DIMENSIONS_EXCEEDED with scala.Double = js.native
  /* 2 */ val MAX_ELEMENTS_EXCEEDED: MAX_ELEMENTS_EXCEEDED with scala.Double = js.native
  /* 3 */ val OK: OK with scala.Double = js.native
  /* 4 */ val OVER_QUERY_LIMIT: OVER_QUERY_LIMIT with scala.Double = js.native
  /* 5 */ val REQUEST_DENIED: REQUEST_DENIED with scala.Double = js.native
  /* 6 */ val UNKNOWN_ERROR: UNKNOWN_ERROR with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[googlemapsLib.googleNs.mapsNs.DistanceMatrixStatus with scala.Double] = js.native
}

