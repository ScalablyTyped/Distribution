package typings.googlemaps.googleNs.mapsNs

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
  
  /* 0 */ val INVALID_REQUEST: typings.googlemaps.googleNs.mapsNs.DistanceMatrixStatus.INVALID_REQUEST with Double = js.native
  /* 1 */ val MAX_DIMENSIONS_EXCEEDED: typings.googlemaps.googleNs.mapsNs.DistanceMatrixStatus.MAX_DIMENSIONS_EXCEEDED with Double = js.native
  /* 2 */ val MAX_ELEMENTS_EXCEEDED: typings.googlemaps.googleNs.mapsNs.DistanceMatrixStatus.MAX_ELEMENTS_EXCEEDED with Double = js.native
  /* 3 */ val OK: typings.googlemaps.googleNs.mapsNs.DistanceMatrixStatus.OK with Double = js.native
  /* 4 */ val OVER_QUERY_LIMIT: typings.googlemaps.googleNs.mapsNs.DistanceMatrixStatus.OVER_QUERY_LIMIT with Double = js.native
  /* 5 */ val REQUEST_DENIED: typings.googlemaps.googleNs.mapsNs.DistanceMatrixStatus.REQUEST_DENIED with Double = js.native
  /* 6 */ val UNKNOWN_ERROR: typings.googlemaps.googleNs.mapsNs.DistanceMatrixStatus.UNKNOWN_ERROR with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DistanceMatrixStatus with Double] = js.native
}

