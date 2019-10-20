package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ElevationStatus extends js.Object

@JSGlobal("google.maps.ElevationStatus")
@js.native
object ElevationStatus extends js.Object {
  @js.native
  sealed trait INVALID_REQUEST extends ElevationStatus
  
  @js.native
  sealed trait OK extends ElevationStatus
  
  @js.native
  sealed trait OVER_QUERY_LIMIT extends ElevationStatus
  
  @js.native
  sealed trait REQUEST_DENIED extends ElevationStatus
  
  @js.native
  sealed trait UNKNOWN_ERROR extends ElevationStatus
  
  /* "INVALID_REQUEST" */ val INVALID_REQUEST: typings.googlemaps.google.maps.ElevationStatus.INVALID_REQUEST with String = js.native
  /* "OK" */ val OK: typings.googlemaps.google.maps.ElevationStatus.OK with String = js.native
  /* "OVER_QUERY_LIMIT" */ val OVER_QUERY_LIMIT: typings.googlemaps.google.maps.ElevationStatus.OVER_QUERY_LIMIT with String = js.native
  /* "REQUEST_DENIED" */ val REQUEST_DENIED: typings.googlemaps.google.maps.ElevationStatus.REQUEST_DENIED with String = js.native
  /* "UNKNOWN_ERROR" */ val UNKNOWN_ERROR: typings.googlemaps.google.maps.ElevationStatus.UNKNOWN_ERROR with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ElevationStatus with String] = js.native
}

