package typings.googlemaps.google.maps.places

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
  
}

