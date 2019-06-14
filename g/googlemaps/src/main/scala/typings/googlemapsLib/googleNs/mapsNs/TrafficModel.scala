package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TrafficModel extends js.Object

@JSGlobal("google.maps.TrafficModel")
@js.native
object TrafficModel extends js.Object {
  @js.native
  sealed trait BEST_GUESS
    extends googlemapsLib.googleNs.mapsNs.TrafficModel
  
  @js.native
  sealed trait OPTIMISTIC
    extends googlemapsLib.googleNs.mapsNs.TrafficModel
  
  @js.native
  sealed trait PESSIMISTIC
    extends googlemapsLib.googleNs.mapsNs.TrafficModel
  
  /* 0 */ val BEST_GUESS: BEST_GUESS with scala.Double = js.native
  /* 1 */ val OPTIMISTIC: OPTIMISTIC with scala.Double = js.native
  /* 2 */ val PESSIMISTIC: PESSIMISTIC with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[googlemapsLib.googleNs.mapsNs.TrafficModel with scala.Double] = js.native
}

