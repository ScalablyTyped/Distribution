package typings
package jointjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlurColor extends js.Object {
  var blur: js.UndefOr[scala.Double] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var dx: js.UndefOr[scala.Double] = js.undefined
  var dy: js.UndefOr[scala.Double] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
}

object Anon_BlurColor {
  @scala.inline
  def apply(
    blur: scala.Int | scala.Double = null,
    color: java.lang.String = null,
    dx: scala.Int | scala.Double = null,
    dy: scala.Int | scala.Double = null,
    opacity: scala.Int | scala.Double = null
  ): Anon_BlurColor = {
    val __obj = js.Dynamic.literal()
    if (blur != null) __obj.updateDynamic("blur")(blur.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (dx != null) __obj.updateDynamic("dx")(dx.asInstanceOf[js.Any])
    if (dy != null) __obj.updateDynamic("dy")(dy.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BlurColor]
  }
}

