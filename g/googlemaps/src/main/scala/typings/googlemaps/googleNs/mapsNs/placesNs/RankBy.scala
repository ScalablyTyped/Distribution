package typings.googlemaps.googleNs.mapsNs.placesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RankBy extends js.Object

@JSGlobal("google.maps.places.RankBy")
@js.native
object RankBy extends js.Object {
  @js.native
  sealed trait DISTANCE extends RankBy
  
  @js.native
  sealed trait PROMINENCE extends RankBy
  
  /* 0 */ val DISTANCE: typings.googlemaps.googleNs.mapsNs.placesNs.RankBy.DISTANCE with Double = js.native
  /* 1 */ val PROMINENCE: typings.googlemaps.googleNs.mapsNs.placesNs.RankBy.PROMINENCE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RankBy with Double] = js.native
}

