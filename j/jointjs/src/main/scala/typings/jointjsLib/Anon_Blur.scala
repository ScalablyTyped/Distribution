package typings
package jointjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Blur extends js.Object {
  var blur: js.UndefOr[scala.Double] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Blur {
  @scala.inline
  def apply(
    blur: scala.Int | scala.Double = null,
    color: java.lang.String = null,
    opacity: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): Anon_Blur = {
    val __obj = js.Dynamic.literal()
    if (blur != null) __obj.updateDynamic("blur")(blur.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Blur]
  }
}

