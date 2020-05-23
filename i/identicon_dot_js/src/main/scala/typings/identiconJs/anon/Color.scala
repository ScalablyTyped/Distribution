package typings.identiconJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var color: typings.identiconJs.mod.Color
  var height: Double
  var width: Double
  var x: Double
  var y: Double
}

object Color {
  @scala.inline
  def apply(color: typings.identiconJs.mod.Color, height: Double, width: Double, x: Double, y: Double): Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}

