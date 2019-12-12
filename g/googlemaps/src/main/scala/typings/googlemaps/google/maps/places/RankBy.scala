package typings.googlemaps.google.maps.places

import org.scalablytyped.runtime.TopLevel
import typings.googlemaps.google.maps.places.RankBy.DISTANCE
import typings.googlemaps.google.maps.places.RankBy.PROMINENCE
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RankBy with Double] = js.native
  /* 1 */ @js.native
  object DISTANCE extends TopLevel[DISTANCE with Double]
  
  /* 0 */ @js.native
  object PROMINENCE extends TopLevel[PROMINENCE with Double]
  
}

