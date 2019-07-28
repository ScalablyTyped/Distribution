package typings.materialDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderColorHeight extends js.Object {
  var borderColor: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hoverColor: js.UndefOr[String] = js.undefined
  var selectedColor: js.UndefOr[String] = js.undefined
  var stripeColor: js.UndefOr[String] = js.undefined
  var textColor: js.UndefOr[String] = js.undefined
}

object Anon_BorderColorHeight {
  @scala.inline
  def apply(
    borderColor: String = null,
    height: Int | Double = null,
    hoverColor: String = null,
    selectedColor: String = null,
    stripeColor: String = null,
    textColor: String = null
  ): Anon_BorderColorHeight = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hoverColor != null) __obj.updateDynamic("hoverColor")(hoverColor)
    if (selectedColor != null) __obj.updateDynamic("selectedColor")(selectedColor)
    if (stripeColor != null) __obj.updateDynamic("stripeColor")(stripeColor)
    if (textColor != null) __obj.updateDynamic("textColor")(textColor)
    __obj.asInstanceOf[Anon_BorderColorHeight]
  }
}

