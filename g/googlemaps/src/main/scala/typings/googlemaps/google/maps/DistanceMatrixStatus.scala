package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DistanceMatrixStatus extends js.Object

@JSGlobal("google.maps.DistanceMatrixStatus")
@js.native
object DistanceMatrixStatus extends js.Object {
  @js.native
  sealed trait INVALID_REQUEST extends DistanceMatrixStatus
  
  @js.native
  sealed trait MAX_DIMENSIONS_EXCEEDED extends DistanceMatrixStatus
  
  @js.native
  sealed trait MAX_ELEMENTS_EXCEEDED extends DistanceMatrixStatus
  
  @js.native
  sealed trait OK extends DistanceMatrixStatus
  
  @js.native
  sealed trait OVER_QUERY_LIMIT extends DistanceMatrixStatus
  
  @js.native
  sealed trait REQUEST_DENIED extends DistanceMatrixStatus
  
  @js.native
  sealed trait UNKNOWN_ERROR extends DistanceMatrixStatus
  
  /* "INVALID_REQUEST" */ val INVALID_REQUEST: typings.googlemaps.google.maps.DistanceMatrixStatus.INVALID_REQUEST with String = js.native
  /* "MAX_DIMENSIONS_EXCEEDED" */ val MAX_DIMENSIONS_EXCEEDED: typings.googlemaps.google.maps.DistanceMatrixStatus.MAX_DIMENSIONS_EXCEEDED with String = js.native
  /* "MAX_ELEMENTS_EXCEEDED" */ val MAX_ELEMENTS_EXCEEDED: typings.googlemaps.google.maps.DistanceMatrixStatus.MAX_ELEMENTS_EXCEEDED with String = js.native
  /* "OK" */ val OK: typings.googlemaps.google.maps.DistanceMatrixStatus.OK with String = js.native
  /* "OVER_QUERY_LIMIT" */ val OVER_QUERY_LIMIT: typings.googlemaps.google.maps.DistanceMatrixStatus.OVER_QUERY_LIMIT with String = js.native
  /* "REQUEST_DENIED" */ val REQUEST_DENIED: typings.googlemaps.google.maps.DistanceMatrixStatus.REQUEST_DENIED with String = js.native
  /* "UNKNOWN_ERROR" */ val UNKNOWN_ERROR: typings.googlemaps.google.maps.DistanceMatrixStatus.UNKNOWN_ERROR with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DistanceMatrixStatus with String] = js.native
}

