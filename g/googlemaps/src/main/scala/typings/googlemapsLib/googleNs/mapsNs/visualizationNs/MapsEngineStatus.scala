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
  
  val INVALID_LAYER: INVALID_LAYER with java.lang.String = js.native
  val OK: OK with java.lang.String = js.native
  val UNKNOWN_ERROR: UNKNOWN_ERROR with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googlemapsLib.googleNs.mapsNs.visualizationNs.MapsEngineStatus with java.lang.String
  ] = js.native
}

