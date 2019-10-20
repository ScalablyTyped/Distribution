package typings.googlemaps.google.maps.visualization

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
  
  /* "INVALID_LAYER" */ val INVALID_LAYER: typings.googlemaps.google.maps.visualization.MapsEngineStatus.INVALID_LAYER with String = js.native
  /* "OK" */ val OK: typings.googlemaps.google.maps.visualization.MapsEngineStatus.OK with String = js.native
  /* "UNKNOWN_ERROR" */ val UNKNOWN_ERROR: typings.googlemaps.google.maps.visualization.MapsEngineStatus.UNKNOWN_ERROR with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[MapsEngineStatus with String] = js.native
}

