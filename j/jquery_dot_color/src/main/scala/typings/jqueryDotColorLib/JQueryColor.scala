package typings
package jqueryDotColorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryColor extends js.Object {
  /**
       * Returns the alpha value of this color (float from 0.0 - 1.0).
       */
  def alpha(): scala.Double = js.native
  /**
       * Returns a copy of the color object with the alpha set to val.
       */
  def alpha(`val`: java.lang.String): JQueryColor = js.native
  /**
       * Returns a copy of the color object with the alpha set to val.
       */
  def alpha(`val`: scala.Double): JQueryColor = js.native
  /**
       * Will apply this color on top of the other color using alpha blending.
       */
  def blend(othercolor: JQueryColor): scala.Unit = js.native
  /**
       * Returns the blue component of the color (integer from 0 - 255).
       */
  def blue(): scala.Double = js.native
  /**
       * Returns a copy of the color object with the blue set to val.
       */
  def blue(`val`: java.lang.String): JQueryColor = js.native
  /**
       * Returns a copy of the color object with the blue set to val.
       */
  def blue(`val`: scala.Double): JQueryColor = js.native
  /**
       * Returns the green component of the color (integer from 0 - 255).
       */
  def green(): scala.Double = js.native
  /**
       * Returns a copy of the color object with the green set to val.
       */
  def green(`val`: java.lang.String): JQueryColor = js.native
  /**
       * Returns a copy of the color object with the green set to val.
       */
  def green(`val`: scala.Double): JQueryColor = js.native
  /**
       * Returns a HSL tuple [ hue, saturation, lightness, alpha ].
       */
  def hsla(): js.Array[scala.Double] = js.native
  /**
       * Returns a copy of the color with any defined values set to the new value.
       */
  def hsla(hue: scala.Double, saturation: scala.Double, lightness: scala.Double): JQueryColor = js.native
  /**
       * Returns a copy of the color with any defined values set to the new value.
       */
  def hsla(hue: scala.Double, saturation: scala.Double, lightness: scala.Double, alpha: scala.Double): JQueryColor = js.native
  /**
       * Returns a copy of the color with any defined values set to the new value.
       */
  def hsla(`val`: HslaColor): JQueryColor = js.native
  /**
       * Returns a copy of the color with any defined values set to the new value.
       */
  def hsla(vals: js.Array[scala.Double]): JQueryColor = js.native
  /**
       * Returns the hue component of the color (integer from 0 - 359).
       */
  def hue(): scala.Double = js.native
  /**
       * Returns a copy of the color object with the hue set to val.
       */
  def hue(`val`: java.lang.String): JQueryColor = js.native
  /**
       * Returns a copy of the color object with the hue set to val.
       */
  def hue(`val`: scala.Double): JQueryColor = js.native
  /**
       * Checks if two colors are equal.
       */
  def is(otherColor: JQueryColor): scala.Boolean = js.native
  /**
       * Returns the lightness component of the color (float from 0.0 - 1.0).
       */
  def lightness(): scala.Double = js.native
  /**
       * Returns a copy of the color object with the lightness set to val.
       */
  def lightness(`val`: java.lang.String): JQueryColor = js.native
  /**
       * Returns a copy of the color object with the lightness set to val.
       */
  def lightness(`val`: scala.Double): JQueryColor = js.native
  /**
       * Returns the red component of the color (integer from 0 - 255).
       */
  def red(): scala.Double = js.native
  /**
       * Returns a copy of the color object with the red set to val.
       */
  def red(`val`: java.lang.String): JQueryColor = js.native
  /**
       * Returns a copy of the color object with the red set to val.
       */
  def red(`val`: scala.Double): JQueryColor = js.native
  /**
       * Returns a rgba "tuple" [ red, green, blue, alpha ].
       */
  def rgba(): js.Array[scala.Double] = js.native
  /**
       * Returns a copy of the color with any defined values set to the new value.
       */
  def rgba(red: scala.Double, green: scala.Double, blue: scala.Double): JQueryColor = js.native
  /**
       * Returns a copy of the color with any defined values set to the new value.
       */
  def rgba(red: scala.Double, green: scala.Double, blue: scala.Double, alpha: scala.Double): JQueryColor = js.native
  /**
       * Returns a copy of the color with any defined values set to the new value.
       */
  def rgba(`val`: RgbaColor): JQueryColor = js.native
  /**
       * Returns a copy of the color with any defined values set to the new value.
       */
  def rgba(vals: js.Array[scala.Double]): JQueryColor = js.native
  /**
       * Returns the saturation component of the color (float from 0.0 - 1.0).
       */
  def saturation(): scala.Double = js.native
  /**
       * Returns a copy of the color object with the saturation set to val.
       */
  def saturation(`val`: java.lang.String): JQueryColor = js.native
  /**
       * Returns a copy of the color object with the saturation set to val.
       */
  def saturation(`val`: scala.Double): JQueryColor = js.native
  /**
       * Returns a css string "#abcdef", with "includeAlpha" uses "#rrggbbaa" (alpha *= 255).
       */
  def toHexString(): java.lang.String = js.native
  /**
       * Returns a css string "#abcdef", with "includeAlpha" uses "#rrggbbaa" (alpha *= 255).
       */
  def toHexString(includeAlpha: scala.Boolean): java.lang.String = js.native
  /**
       * Returns a css string "hsla(330, 75%, 25%, 0.4)".
       */
  def toHslaString(): java.lang.String = js.native
  /**
       * Returns a CSS string "rgba(255, 255, 255, 0.4)".
       */
  def toRgbaString(): java.lang.String = js.native
  /**
       * The color distance (0.0 - 1.0) of the way between this color and othercolor.
       */
  def transition(othercolor: JQueryColor, distance: scala.Double): JQueryColor = js.native
}

