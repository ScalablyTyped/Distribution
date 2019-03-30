package typings
package identiconDotJsLib.identiconDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Identicon extends js.Object {
  var background: Color = js.native
  var foreground: Color = js.native
  var format: identiconDotJsLib.identiconDotJsLibStrings.svg | identiconDotJsLib.identiconDotJsLibStrings.png = js.native
  var hash: java.lang.String = js.native
  var margin: scala.Double = js.native
  var size: scala.Double = js.native
  /**
    * Converts from hsl to rgb.
    * @param h hue
    * @param s saturation
    * @param b brightness
    */
  def hsl2rgb(h: scala.Double, s: scala.Double, b: scala.Double): js.Tuple3[scala.Double, scala.Double, scala.Double] = js.native
  /**
    * Returns a new blank image as Svg or PNGlib.
    */
  def image(): Svg | PNGlib = js.native
  /**
    * Returns true if the identicon is a Svg.
    */
  def isSvg(): scala.Boolean = js.native
  def rectangle(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double, color: Color, image: PNGlib): scala.Unit = js.native
  /**
    * Places a rectangle at the given position with the given width, height and color in the image.
    * @param x The x coordinate.
    * @param y The y coordinate
    * @param w The width.
    * @param h The height.
    * @param color The color.
    * @param image The image.
    */
  def rectangle(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double, color: Color, image: Svg): scala.Unit = js.native
  /**
    * Returns a new image as Svg or PNGlib with the identicon applied.
    */
  def render(): Svg | PNGlib = js.native
}

