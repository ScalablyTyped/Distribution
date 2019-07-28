package typings.identiconDotJs

import typings.identiconDotJs.identiconDotJsMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  var color: Color
  var height: Double
  var width: Double
  var x: Double
  var y: Double
}

object Anon_Color {
  @scala.inline
  def apply(color: Color, height: Double, width: Double, x: Double, y: Double): Anon_Color = {
    val __obj = js.Dynamic.literal(color = color, height = height, width = width, x = x, y = y)
  
    __obj.asInstanceOf[Anon_Color]
  }
}

