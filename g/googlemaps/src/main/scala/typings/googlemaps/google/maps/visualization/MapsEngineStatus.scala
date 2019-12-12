package typings.googlemaps.google.maps.visualization

import org.scalablytyped.runtime.TopLevel
import typings.googlemaps.google.maps.visualization.MapsEngineStatus.INVALID_LAYER
import typings.googlemaps.google.maps.visualization.MapsEngineStatus.OK
import typings.googlemaps.google.maps.visualization.MapsEngineStatus.UNKNOWN_ERROR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MapsEngineStatus extends js.Object

@JSGlobal("google.maps.visualization.MapsEngineStatus")
@js.native
object MapsEngineStatus extends js.Object {
  @js.native
  sealed trait INVALID_LAYER extends MapsEngineStatus
  
  @js.native
  sealed trait OK extends MapsEngineStatus
  
  @js.native
  sealed trait UNKNOWN_ERROR extends MapsEngineStatus
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[MapsEngineStatus with String] = js.native
  /* "INVALID_LAYER" */ @js.native
  object INVALID_LAYER extends TopLevel[INVALID_LAYER with String]
  
  /* "OK" */ @js.native
  object OK extends TopLevel[OK with String]
  
  /* "UNKNOWN_ERROR" */ @js.native
  object UNKNOWN_ERROR extends TopLevel[UNKNOWN_ERROR with String]
  
}

