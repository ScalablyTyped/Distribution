package typings.mapsjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var color: String
  var thickness: Double
}

object Color {
  @scala.inline
  def apply(color: String, thickness: Double): Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}

