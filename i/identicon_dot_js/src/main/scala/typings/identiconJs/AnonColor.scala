package typings.identiconJs

import typings.identiconJs.mod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColor extends js.Object {
  var color: Color
  var height: Double
  var width: Double
  var x: Double
  var y: Double
}

object AnonColor {
  @scala.inline
  def apply(color: Color, height: Double, width: Double, x: Double, y: Double): AnonColor = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonColor]
  }
}

