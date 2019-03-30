package typings
package identiconDotJsLib.identiconDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Svg extends js.Object {
  var background: Color
  var foreground: Color
  var rectangles: js.Array[identiconDotJsLib.Anon_Color]
  var size: scala.Double
  /**
    * Returns a string with the structure 'rgb(r, g, b, a)'.
    * @param red
    * @param green
    * @param blue
    * @param alpha
    */
  def color(red: scala.Double, green: scala.Double, blue: scala.Double, alpha: scala.Double): java.lang.String
  /**
    * Returns the Svg as a base64 encoded string.
    */
  def getBase64(): java.lang.String
  /**
    * Returns the Svg as string.
    */
  def getDump(): java.lang.String
}

object Svg {
  @scala.inline
  def apply(
    background: Color,
    color: (scala.Double, scala.Double, scala.Double, scala.Double) => java.lang.String,
    foreground: Color,
    getBase64: () => java.lang.String,
    getDump: () => java.lang.String,
    rectangles: js.Array[identiconDotJsLib.Anon_Color],
    size: scala.Double
  ): Svg = {
    val __obj = js.Dynamic.literal(background = background, color = js.Any.fromFunction4(color), foreground = foreground, getBase64 = js.Any.fromFunction0(getBase64), getDump = js.Any.fromFunction0(getDump), rectangles = rectangles, size = size)
  
    __obj.asInstanceOf[Svg]
  }
}

