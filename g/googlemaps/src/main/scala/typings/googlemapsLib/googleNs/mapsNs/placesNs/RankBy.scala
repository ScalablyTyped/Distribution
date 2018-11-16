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
  
  val DISTANCE: DISTANCE with java.lang.String = js.native
  val PROMINENCE: PROMINENCE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[googlemapsLib.googleNs.mapsNs.placesNs.RankBy with java.lang.String] = js.native
}

