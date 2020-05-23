package typings.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HoverColor extends js.Object {
  var borderColor: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hoverColor: js.UndefOr[String] = js.undefined
  var selectedColor: js.UndefOr[String] = js.undefined
  var stripeColor: js.UndefOr[String] = js.undefined
  var textColor: js.UndefOr[String] = js.undefined
}

object HoverColor {
  @scala.inline
  def apply(
    borderColor: String = null,
    height: js.UndefOr[Double] = js.undefined,
    hoverColor: String = null,
    selectedColor: String = null,
    stripeColor: String = null,
    textColor: String = null
  ): HoverColor = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (hoverColor != null) __obj.updateDynamic("hoverColor")(hoverColor.asInstanceOf[js.Any])
    if (selectedColor != null) __obj.updateDynamic("selectedColor")(selectedColor.asInstanceOf[js.Any])
    if (stripeColor != null) __obj.updateDynamic("stripeColor")(stripeColor.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoverColor]
  }
}

