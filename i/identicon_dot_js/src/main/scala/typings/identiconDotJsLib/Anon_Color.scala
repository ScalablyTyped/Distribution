package typings
package identiconDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  var color: identiconDotJsLib.identiconDotJsMod.Color
  var height: scala.Double
  var width: scala.Double
  var x: scala.Double
  var y: scala.Double
}

object Anon_Color {
  @scala.inline
  def apply(
    color: identiconDotJsLib.identiconDotJsMod.Color,
    height: scala.Double,
    width: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): Anon_Color = {
    val __obj = js.Dynamic.literal(color = color, height = height, width = width, x = x, y = y)
  
    __obj.asInstanceOf[Anon_Color]
  }
}

