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
  
  val ERROR: ERROR with java.lang.String = js.native
  val OK: OK with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[googlemapsLib.googleNs.mapsNs.MaxZoomStatus with java.lang.String] = js.native
}

