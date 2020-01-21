package typings.identiconJs.mod

import typings.identiconJs.identiconJsStrings.png
import typings.identiconJs.identiconJsStrings.svg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Identicon extends js.Object {
  var background: Color = js.native
  var foreground: Color = js.native
  var format: svg | png = js.native
  var hash: String = js.native
  var margin: Double = js.native
  var size: Double = js.native
  /**
    * Converts from hsl to rgb.
    * @param h hue
    * @param s saturation
    * @param b brightness
    */
  def hsl2rgb(h: Double, s: Double, b: Double): js.Tuple3[Double, Double, Double] = js.native
  /**
    * Returns a new blank image as Svg or PNGlib.
    */
  def image(): Svg | PNGlib = js.native
  /**
    * Returns true if the identicon is a Svg.
    */
  def isSvg(): Boolean = js.native
  def rectangle(x: Double, y: Double, w: Double, h: Double, color: Color, image: PNGlib): Unit = js.native
  /**
    * Places a rectangle at the given position with the given width, height and color in the image.
    * @param x The x coordinate.
    * @param y The y coordinate
    * @param w The width.
    * @param h The height.
    * @param color The color.
    * @param image The image.
    */
  def rectangle(x: Double, y: Double, w: Double, h: Double, color: Color, image: Svg): Unit = js.native
  /**
    * Returns a new image as Svg or PNGlib with the identicon applied.
    */
  def render(): Svg | PNGlib = js.native
}

