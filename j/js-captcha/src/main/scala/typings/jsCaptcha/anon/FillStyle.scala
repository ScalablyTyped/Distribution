package typings.jsCaptcha.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FillStyle extends js.Object {
  var fillStyle: js.UndefOr[String] = js.undefined
  var font: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var textAlign: js.UndefOr[String] = js.undefined
  var textBaseline: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object FillStyle {
  @scala.inline
  def apply(
    fillStyle: String = null,
    font: String = null,
    height: js.UndefOr[Double] = js.undefined,
    textAlign: String = null,
    textBaseline: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): FillStyle = {
    val __obj = js.Dynamic.literal()
    if (fillStyle != null) __obj.updateDynamic("fillStyle")(fillStyle.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (textBaseline != null) __obj.updateDynamic("textBaseline")(textBaseline.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillStyle]
  }
}

