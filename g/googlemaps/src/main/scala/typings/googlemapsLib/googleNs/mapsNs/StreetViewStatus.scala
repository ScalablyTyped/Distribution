package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StreetViewStatus extends js.Object

@JSGlobal("google.maps.StreetViewStatus")
@js.native
object StreetViewStatus extends js.Object {
  @js.native
  sealed trait OK
    extends googlemapsLib.googleNs.mapsNs.StreetViewStatus
  
  @js.native
  sealed trait UNKNOWN_ERROR
    extends googlemapsLib.googleNs.mapsNs.StreetViewStatus
  
  @js.native
  sealed trait ZERO_RESULTS
    extends googlemapsLib.googleNs.mapsNs.StreetViewStatus
  
  /* 0 */ val OK: OK with scala.Double = js.native
  /* 1 */ val UNKNOWN_ERROR: UNKNOWN_ERROR with scala.Double = js.native
  /* 2 */ val ZERO_RESULTS: ZERO_RESULTS with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[googlemapsLib.googleNs.mapsNs.StreetViewStatus with scala.Double] = js.native
}

