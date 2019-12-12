package typings.googlemaps.google.maps

import org.scalablytyped.runtime.TopLevel
import typings.googlemaps.google.maps.TrafficModel.BEST_GUESS
import typings.googlemaps.google.maps.TrafficModel.OPTIMISTIC
import typings.googlemaps.google.maps.TrafficModel.PESSIMISTIC
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TrafficModel with String] = js.native
  /* "bestguess" */ @js.native
  object BEST_GUESS extends TopLevel[BEST_GUESS with String]
  
  /* "optimistic" */ @js.native
  object OPTIMISTIC extends TopLevel[OPTIMISTIC with String]
  
  /* "pessimistic" */ @js.native
  object PESSIMISTIC extends TopLevel[PESSIMISTIC with String]
  
}

