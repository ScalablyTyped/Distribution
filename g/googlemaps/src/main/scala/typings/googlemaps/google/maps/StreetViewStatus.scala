package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StreetViewStatus extends js.Object

@JSGlobal("google.maps.StreetViewStatus")
@js.native
object StreetViewStatus extends js.Object {
  @js.native
  sealed trait OK extends StreetViewStatus
  
  @js.native
  sealed trait UNKNOWN_ERROR extends StreetViewStatus
  
  @js.native
  sealed trait ZERO_RESULTS extends StreetViewStatus
  
  /* "OK" */ val OK: typings.googlemaps.google.maps.StreetViewStatus.OK with String = js.native
  /* "UNKNOWN_ERROR" */ val UNKNOWN_ERROR: typings.googlemaps.google.maps.StreetViewStatus.UNKNOWN_ERROR with String = js.native
  /* "ZERO_RESULTS" */ val ZERO_RESULTS: typings.googlemaps.google.maps.StreetViewStatus.ZERO_RESULTS with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[StreetViewStatus with String] = js.native
}

