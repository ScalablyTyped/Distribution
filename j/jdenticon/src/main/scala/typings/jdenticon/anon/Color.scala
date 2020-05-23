package typings.jdenticon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  /**
    * Specifies the lightness range of colored shapes of an icon. The range is expressed as an array
    * containing two numbers, representing the minimum and maximum lightness in the range [0.0, 1.0].
    */
  var color: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * Specifies the lightness range of grayscale shapes of an icon. The range is expressed as an array
    * containing two numbers, representing the minimum and maximum lightness in the range [0.0, 1.0].
    */
  var grayscale: js.UndefOr[js.Array[Double]] = js.undefined
}

object Color {
  @scala.inline
  def apply(color: js.Array[Double] = null, grayscale: js.Array[Double] = null): Color = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (grayscale != null) __obj.updateDynamic("grayscale")(grayscale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}

