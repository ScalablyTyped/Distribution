package typings.jsplumb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderStyle extends js.Object {
  var borderStyle: js.UndefOr[String] = js.undefined
  var borderWidth: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var fill: js.UndefOr[String] = js.undefined
  var font: js.UndefOr[String] = js.undefined
  // integer
  var padding: js.UndefOr[Double] = js.undefined
}

object Anon_BorderStyle {
  @scala.inline
  def apply(
    borderStyle: String = null,
    borderWidth: Int | Double = null,
    color: String = null,
    fill: String = null,
    font: String = null,
    padding: Int | Double = null
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

