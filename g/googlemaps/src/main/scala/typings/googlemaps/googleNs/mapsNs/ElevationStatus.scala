package typings.googlemaps.googleNs.mapsNs

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
  
  /* 0 */ val INVALID_REQUEST: typings.googlemaps.googleNs.mapsNs.ElevationStatus.INVALID_REQUEST with Double = js.native
  /* 1 */ val OK: typings.googlemaps.googleNs.mapsNs.ElevationStatus.OK with Double = js.native
  /* 2 */ val OVER_QUERY_LIMIT: typings.googlemaps.googleNs.mapsNs.ElevationStatus.OVER_QUERY_LIMIT with Double = js.native
  /* 3 */ val REQUEST_DENIED: typings.googlemaps.googleNs.mapsNs.ElevationStatus.REQUEST_DENIED with Double = js.native
  /* 4 */ val UNKNOWN_ERROR: typings.googlemaps.googleNs.mapsNs.ElevationStatus.UNKNOWN_ERROR with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ElevationStatus with Double] = js.native
}

