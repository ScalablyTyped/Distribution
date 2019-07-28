package typings.googlemaps.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* 0 */ val BEST_GUESS: typings.googlemaps.googleNs.mapsNs.TrafficModel.BEST_GUESS with Double = js.native
  /* 1 */ val OPTIMISTIC: typings.googlemaps.googleNs.mapsNs.TrafficModel.OPTIMISTIC with Double = js.native
  /* 2 */ val PESSIMISTIC: typings.googlemaps.googleNs.mapsNs.TrafficModel.PESSIMISTIC with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TrafficModel with Double] = js.native
}

