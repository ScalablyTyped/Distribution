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
  
  val OK: OK with java.lang.String = js.native
  val UNKNOWN_ERROR: UNKNOWN_ERROR with java.lang.String = js.native
  val ZERO_RESULTS: ZERO_RESULTS with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[googlemapsLib.googleNs.mapsNs.StreetViewStatus with java.lang.String] = js.native
}

