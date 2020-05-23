package typings.identiconJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Svg extends js.Object {
  var background: Color
  var foreground: Color
  var rectangles: js.Array[typings.identiconJs.anon.Color]
  var size: Double
  /**
    * Returns a string with the structure 'rgb(r, g, b, a)'.
    * @param red
    * @param green
    * @param blue
    * @param alpha
    */
  def color(red: Double, green: Double, blue: Double, alpha: Double): String
  /**
    * Returns the Svg as a base64 encoded string.
    */
  def getBase64(): String
  /**
    * Returns the Svg as string.
    */
  def getDump(): String
}

object Svg {
  @scala.inline
  def apply(
    background: Color,
    color: (Double, Double, Double, Double) => String,
    foreground: Color,
    getBase64: () => String,
    getDump: () => String,
    rectangles: js.Array[typings.identiconJs.anon.Color],
    size: Double
  ): Svg = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], color = js.Any.fromFunction4(color), foreground = foreground.asInstanceOf[js.Any], getBase64 = js.Any.fromFunction0(getBase64), getDump = js.Any.fromFunction0(getDump), rectangles = rectangles.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Svg]
  }
}

