package typings.googlemaps.google.maps.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MapsEngineStatus extends js.Object

// TODO find source documentation
@JSGlobal("google.maps.visualization.MapsEngineStatus")
@js.native
object MapsEngineStatus extends js.Object {
  @js.native
  sealed trait INVALID_LAYER extends MapsEngineStatus
  
  @js.native
  sealed trait OK extends MapsEngineStatus
  
  @js.native
  sealed trait UNKNOWN_ERROR extends MapsEngineStatus
  
}

