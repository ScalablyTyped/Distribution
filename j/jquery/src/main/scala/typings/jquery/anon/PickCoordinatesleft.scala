package typings.jquery.anon

import typings.jquery.JQuery._CoordinatesPartial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<jquery.JQuery.Coordinates, 'left'> */
trait PickCoordinatesleft extends _CoordinatesPartial {
  var left: Double
}

object PickCoordinatesleft {
  @scala.inline
  def apply(left: Double): PickCoordinatesleft = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickCoordinatesleft]
  }
}

