package typings
package jointjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorMargin extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var margin: js.UndefOr[scala.Double] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Anon_ColorMargin {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    margin: scala.Int | scala.Double = null,
    opacity: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): Anon_ColorMargin = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColorMargin]
  }
}

