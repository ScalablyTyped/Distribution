package typings.googlemaps.google.maps

import org.scalablytyped.runtime.TopLevel
import typings.googlemaps.google.maps.MaxZoomStatus.ERROR
import typings.googlemaps.google.maps.MaxZoomStatus.OK
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[MaxZoomStatus with String] = js.native
  /* "ERROR" */ @js.native
  object ERROR extends TopLevel[ERROR with String]
  
  /* "OK" */ @js.native
  object OK extends TopLevel[OK with String]
  
}

