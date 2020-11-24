package typings.jqueryColor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryColor extends js.Object {
  
  /**
    * Returns the alpha value of this color (float from 0.0 - 1.0).
    */
  def alpha(): Double = js.native
  /**
    * Returns a copy of the color object with the alpha set to val.
    */
  def alpha(`val`: String): JQueryColor = js.native
  /**
    * Returns a copy of the color object with the alpha set to val.
    */
  def alpha(`val`: Double): JQueryColor = js.native
  
  /**
    * Will apply this color on top of the other color using alpha blending.
    */
  def blend(othercolor: JQueryColor): Unit = js.native
  
  /**
    * Returns the blue component of the color (integer from 0 - 255).
    */
  def blue(): Double = js.native
  /**
    * Returns a copy of the color object with the blue set to val.
    */
  def blue(`val`: String): JQueryColor = js.native
  /**
    * Returns a copy of the color object with the blue set to val.
    */
  def blue(`val`: Double): JQueryColor = js.native
  
  /**
    * Returns the green component of the color (integer from 0 - 255).
    */
  def green(): Double = js.native
  /**
    * Returns a copy of the color object with the green set to val.
    */
  def green(`val`: String): JQueryColor = js.native
  /**
    * Returns a copy of the color object with the green set to val.
    */
  def green(`val`: Double): JQueryColor = js.native
  
  /**
    * Returns a HSL tuple [ hue, saturation, lightness, alpha ].
    */
  def hsla(): js.Array[Double] = js.native
  /**
    * Returns a copy of the color with any defined values set to the new value.
    */
  def hsla(hue: Double, saturation: Double, lightness: Double): JQueryColor = js.native
  def hsla(hue: Double, saturation: Double, lightness: Double, alpha: Double): JQueryColor = js.native
  /**
    * Returns a copy of the color with any defined values set to the new value.
    */
  def hsla(vals: js.Array[Double]): JQueryColor = js.native
  /**
    * Returns a copy of the color with any defined values set to the new value.
    */
  def hsla(`val`: HslaColor): JQueryColor = js.native
  
  /**
    * Returns the hue component of the color (integer from 0 - 359).
    */
  def hue(): Double = js.native
  /**
    * Returns a copy of the color object with the hue set to val.
    */
  def hue(`val`: String): JQueryColor = js.native
  /**
    * Returns a copy of the color object with the hue set to val.
    */
  def hue(`val`: Double): JQueryColor = js.native
  
  /**
    * Checks if two colors are equal.
    */
  def is(otherColor: JQueryColor): Boolean = js.native
  
  /**
    * Returns the lightness component of the color (float from 0.0 - 1.0).
    */
  def lightness(): Double = js.native
  /**
    * Returns a copy of the color object with the lightness set to val.
    */
  def lightness(`val`: String): JQueryColor = js.native
  /**
    * Returns a copy of the color object with the lightness set to val.
    */
  def lightness(`val`: Double): JQueryColor = js.native
  
  /**
    * Returns the red component of the color (integer from 0 - 255).
    */
  def red(): Double = js.native
  /**
    * Returns a copy of the color object with the red set to val.
    */
  def red(`val`: String): JQueryColor = js.native
  /**
    * Returns a copy of the color object with the red set to val.
    */
  def red(`val`: Double): JQueryColor = js.native
  
  /**
    * Returns a rgba "tuple" [ red, green, blue, alpha ].
    */
  def rgba(): js.Array[Double] = js.native
  /**
    * Returns a copy of the color with any defined values set to the new value.
    */
  def rgba(red: Double, green: Double, blue: Double): JQueryColor = js.native
  def rgba(red: Double, green: Double, blue: Double, alpha: Double): JQueryColor = js.native
  /**
    * Returns a copy of the color with any defined values set to the new value.
    */
  def rgba(vals: js.Array[Double]): JQueryColor = js.native
  /**
    * Returns a copy of the color with any defined values set to the new value.
    */
  def rgba(`val`: RgbaColor): JQueryColor = js.native
  
  /**
    * Returns the saturation component of the color (float from 0.0 - 1.0).
    */
  def saturation(): Double = js.native
  /**
    * Returns a copy of the color object with the saturation set to val.
    */
  def saturation(`val`: String): JQueryColor = js.native
  /**
    * Returns a copy of the color object with the saturation set to val.
    */
  def saturation(`val`: Double): JQueryColor = js.native
  
  /**
    * Returns a css string "#abcdef", with "includeAlpha" uses "#rrggbbaa" (alpha *= 255).
    */
  def toHexString(): String = js.native
  def toHexString(includeAlpha: Boolean): String = js.native
  
  /**
    * Returns a css string "hsla(330, 75%, 25%, 0.4)".
    */
  def toHslaString(): String = js.native
  
  /**
    * Returns a CSS string "rgba(255, 255, 255, 0.4)".
    */
  def toRgbaString(): String = js.native
  
  /**
    * The color distance (0.0 - 1.0) of the way between this color and othercolor.
    */
  def transition(othercolor: JQueryColor, distance: Double): JQueryColor = js.native
}
