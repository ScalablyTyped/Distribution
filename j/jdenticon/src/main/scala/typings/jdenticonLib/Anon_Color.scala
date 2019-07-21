package typings
package jdenticonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  /**
    * Specifies the lightness range of colored shapes of an icon. The range is expressed as an array
    * containing two numbers, representing the minimum and maximum lightness in the range [0.0, 1.0].
    */
  var color: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * Specifies the lightness range of grayscale shapes of an icon. The range is expressed as an array
    * containing two numbers, representing the minimum and maximum lightness in the range [0.0, 1.0].
    */
  var grayscale: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object Anon_Color {
  @scala.inline
  def apply(color: js.Array[scala.Double] = null, grayscale: js.Array[scala.Double] = null): Anon_Color = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (grayscale != null) __obj.updateDynamic("grayscale")(grayscale)
    __obj.asInstanceOf[Anon_Color]
  }
}

