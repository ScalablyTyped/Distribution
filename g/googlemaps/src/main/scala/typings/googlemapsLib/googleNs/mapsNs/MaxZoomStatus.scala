package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MaxZoomStatus extends js.Object

@JSGlobal("google.maps.MaxZoomStatus")
@js.native
object MaxZoomStatus extends js.Object {
  @js.native
  sealed trait ERROR
    extends googlemapsLib.googleNs.mapsNs.MaxZoomStatus
  
  @js.native
  sealed trait OK
    extends googlemapsLib.googleNs.mapsNs.MaxZoomStatus
  
  /* 0 */ val ERROR: ERROR with scala.Double = js.native
  /* 1 */ val OK: OK with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[googlemapsLib.googleNs.mapsNs.MaxZoomStatus with scala.Double] = js.native
}

