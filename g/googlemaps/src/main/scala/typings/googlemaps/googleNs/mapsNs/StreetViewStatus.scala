package typings.googlemaps.googleNs.mapsNs

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
  
  /* 0 */ val OK: typings.googlemaps.googleNs.mapsNs.StreetViewStatus.OK with Double = js.native
  /* 1 */ val UNKNOWN_ERROR: typings.googlemaps.googleNs.mapsNs.StreetViewStatus.UNKNOWN_ERROR with Double = js.native
  /* 2 */ val ZERO_RESULTS: typings.googlemaps.googleNs.mapsNs.StreetViewStatus.ZERO_RESULTS with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StreetViewStatus with Double] = js.native
}

