package typings.googlemaps.google.maps

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
  
  /* "bestguess" */ val BEST_GUESS: typings.googlemaps.google.maps.TrafficModel.BEST_GUESS with String = js.native
  /* "optimistic" */ val OPTIMISTIC: typings.googlemaps.google.maps.TrafficModel.OPTIMISTIC with String = js.native
  /* "pessimistic" */ val PESSIMISTIC: typings.googlemaps.google.maps.TrafficModel.PESSIMISTIC with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TrafficModel with String] = js.native
}

