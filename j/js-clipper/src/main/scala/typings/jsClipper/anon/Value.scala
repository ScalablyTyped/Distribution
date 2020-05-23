package typings.jsClipper.anon

import typings.jsClipper.ClipperLib.Polygons
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  var value: Polygons
}

object Value {
  @scala.inline
  def apply(value: Polygons): Value = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}

