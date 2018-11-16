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
  
  val BEST_GUESS: BEST_GUESS with java.lang.String = js.native
  val OPTIMISTIC: OPTIMISTIC with java.lang.String = js.native
  val PESSIMISTIC: PESSIMISTIC with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[googlemapsLib.googleNs.mapsNs.TrafficModel with java.lang.String] = js.native
}

