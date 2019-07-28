package typings.googlemaps.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MaxZoomStatus extends js.Object

@JSGlobal("google.maps.MaxZoomStatus")
@js.native
object MaxZoomStatus extends js.Object {
  @js.native
  sealed trait ERROR extends MaxZoomStatus
  
  @js.native
  sealed trait OK extends MaxZoomStatus
  
  /* 0 */ val ERROR: typings.googlemaps.googleNs.mapsNs.MaxZoomStatus.ERROR with Double = js.native
  /* 1 */ val OK: typings.googlemaps.googleNs.mapsNs.MaxZoomStatus.OK with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MaxZoomStatus with Double] = js.native
}

