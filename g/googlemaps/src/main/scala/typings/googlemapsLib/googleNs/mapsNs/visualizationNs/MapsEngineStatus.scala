package typings
package googlemapsLib.googleNs.mapsNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MapsEngineStatus extends js.Object

@JSGlobal("google.maps.visualization.MapsEngineStatus")
@js.native
object MapsEngineStatus extends js.Object {
  @js.native
  sealed trait INVALID_LAYER
    extends googlemapsLib.googleNs.mapsNs.visualizationNs.MapsEngineStatus
  
  @js.native
  sealed trait OK
    extends googlemapsLib.googleNs.mapsNs.visualizationNs.MapsEngineStatus
  
  @js.native
  sealed trait UNKNOWN_ERROR
    extends googlemapsLib.googleNs.mapsNs.visualizationNs.MapsEngineStatus
  
  /* 0 */ val INVALID_LAYER: INVALID_LAYER with scala.Double = js.native
  /* 1 */ val OK: OK with scala.Double = js.native
  /* 2 */ val UNKNOWN_ERROR: UNKNOWN_ERROR with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[googlemapsLib.googleNs.mapsNs.visualizationNs.MapsEngineStatus with scala.Double] = js.native
}

