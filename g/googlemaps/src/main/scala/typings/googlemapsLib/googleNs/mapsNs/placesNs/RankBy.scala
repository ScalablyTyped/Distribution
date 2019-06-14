package typings
package googlemapsLib.googleNs.mapsNs.placesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RankBy extends js.Object

@JSGlobal("google.maps.places.RankBy")
@js.native
object RankBy extends js.Object {
  @js.native
  sealed trait DISTANCE
    extends googlemapsLib.googleNs.mapsNs.placesNs.RankBy
  
  @js.native
  sealed trait PROMINENCE
    extends googlemapsLib.googleNs.mapsNs.placesNs.RankBy
  
  /* 0 */ val DISTANCE: DISTANCE with scala.Double = js.native
  /* 1 */ val PROMINENCE: PROMINENCE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[googlemapsLib.googleNs.mapsNs.placesNs.RankBy with scala.Double] = js.native
}

