package typings.materialDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
  var textColor: js.UndefOr[String] = js.undefined
  var titleFontWeight: js.UndefOr[Double] = js.undefined
}

object Anon_Color {
  @scala.inline
  def apply(
    color: String = null,
    height: Int | Double = null,
    padding: Int | Double = null,
    textColor: String = null,
    titleFontWeight: Int | Double = null
  ): Anon_Color = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor)
    if (titleFontWeight != null) __obj.updateDynamic("titleFontWeight")(titleFontWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Color]
  }
}

