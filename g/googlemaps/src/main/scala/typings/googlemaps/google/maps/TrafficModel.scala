package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TrafficModel extends js.Object

@JSGlobal("google.maps.TrafficModel")
@js.native
object TrafficModel extends js.Object {
  @js.native
  sealed trait BEST_GUESS extends TrafficModel
  
  @js.native
  sealed trait OPTIMISTIC extends TrafficModel
  
  @js.native
  sealed trait PESSIMISTIC extends TrafficModel
  
}

