package typings.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
  var textColor: js.UndefOr[String] = js.undefined
  var titleFontWeight: js.UndefOr[Double] = js.undefined
}

object Color {
  @scala.inline
  def apply(
    color: String = null,
    height: js.UndefOr[Double] = js.undefined,
    padding: js.UndefOr[Double] = js.undefined,
    textColor: String = null,
    titleFontWeight: js.UndefOr[Double] = js.undefined
  ): Color = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    if (!js.isUndefined(titleFontWeight)) __obj.updateDynamic("titleFontWeight")(titleFontWeight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}

