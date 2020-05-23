package typings.jsClipper.ClipperLib

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExPolygon extends js.Object {
  var holes: ArrayLike[ArrayLike[IntPoint]]
  var outer: ArrayLike[IntPoint]
}

object ExPolygon {
  @scala.inline
  def apply(holes: ArrayLike[ArrayLike[IntPoint]], outer: ArrayLike[IntPoint]): ExPolygon = {
    val __obj = js.Dynamic.literal(holes = holes.asInstanceOf[js.Any], outer = outer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExPolygon]
  }
}

