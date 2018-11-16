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
  
  val INVALID_REQUEST: INVALID_REQUEST with java.lang.String = js.native
  val MAX_DIMENSIONS_EXCEEDED: MAX_DIMENSIONS_EXCEEDED with java.lang.String = js.native
  val MAX_ELEMENTS_EXCEEDED: MAX_ELEMENTS_EXCEEDED with java.lang.String = js.native
  val OK: OK with java.lang.String = js.native
  val OVER_QUERY_LIMIT: OVER_QUERY_LIMIT with java.lang.String = js.native
  val REQUEST_DENIED: REQUEST_DENIED with java.lang.String = js.native
  val UNKNOWN_ERROR: UNKNOWN_ERROR with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[googlemapsLib.googleNs.mapsNs.DistanceMatrixStatus with java.lang.String] = js.native
}

