package typings.googlemaps.google.maps

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[StreetViewStatus with String] = js.native
  /* "OK" */ @js.native
  object OK extends TopLevel[OK with String]
  
  /* "UNKNOWN_ERROR" */ @js.native
  object UNKNOWN_ERROR extends TopLevel[UNKNOWN_ERROR with String]
  
  /* "ZERO_RESULTS" */ @js.native
  object ZERO_RESULTS extends TopLevel[ZERO_RESULTS with String]
  
}

