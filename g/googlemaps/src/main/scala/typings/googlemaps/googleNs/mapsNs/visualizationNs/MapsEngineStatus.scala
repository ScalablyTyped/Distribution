package typings.googlemaps.googleNs.mapsNs.visualizationNs

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
  
  /* 0 */ val INVALID_LAYER: typings.googlemaps.googleNs.mapsNs.visualizationNs.MapsEngineStatus.INVALID_LAYER with Double = js.native
  /* 1 */ val OK: typings.googlemaps.googleNs.mapsNs.visualizationNs.MapsEngineStatus.OK with Double = js.native
  /* 2 */ val UNKNOWN_ERROR: typings.googlemaps.googleNs.mapsNs.visualizationNs.MapsEngineStatus.UNKNOWN_ERROR with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MapsEngineStatus with Double] = js.native
}

