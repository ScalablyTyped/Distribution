package typings
package materialDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderColorHeight extends js.Object {
  var borderColor: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var hoverColor: js.UndefOr[java.lang.String] = js.undefined
  var selectedColor: js.UndefOr[java.lang.String] = js.undefined
  var stripeColor: js.UndefOr[java.lang.String] = js.undefined
  var textColor: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_BorderColorHeight {
  @scala.inline
  def apply(
    borderColor: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    hoverColor: java.lang.String = null,
    selectedColor: java.lang.String = null,
    stripeColor: java.lang.String = null,
    textColor: java.lang.String = null
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

