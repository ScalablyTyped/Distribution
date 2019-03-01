package typings
package jsplumbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderStyle extends js.Object {
  var borderStyle: js.UndefOr[java.lang.String] = js.undefined
  var borderWidth: js.UndefOr[scala.Double] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var fill: js.UndefOr[java.lang.String] = js.undefined
  var font: js.UndefOr[java.lang.String] = js.undefined
  // integer
  var padding: js.UndefOr[scala.Double] = js.undefined
}

object Anon_BorderStyle {
  @scala.inline
  def apply(
    borderStyle: java.lang.String = null,
    borderWidth: scala.Int | scala.Double = null,
    color: java.lang.String = null,
    fill: java.lang.String = null,
    font: java.lang.String = null,
    padding: scala.Int | scala.Double = null
  ): Anon_BorderStyle = {
    val __obj = js.Dynamic.literal()
    if (borderStyle != null) __obj.updateDynamic("borderStyle")(borderStyle)
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (font != null) __obj.updateDynamic("font")(font)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BorderStyle]
  }
}

