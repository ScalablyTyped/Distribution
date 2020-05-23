package typings.googlemaps.google.maps

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
  
}

