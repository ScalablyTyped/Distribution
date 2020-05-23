package typings.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonFilterColor extends js.Object {
  var buttonFilterColor: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var disabledTextColor: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
  var fontWeight: js.UndefOr[Double] = js.undefined
  var primaryTextColor: js.UndefOr[String] = js.undefined
  var secondaryTextColor: js.UndefOr[String] = js.undefined
  var textColor: js.UndefOr[String] = js.undefined
}

object ButtonFilterColor {
  @scala.inline
  def apply(
    buttonFilterColor: String = null,
    color: String = null,
    disabledTextColor: String = null,
    fontSize: js.UndefOr[Double] = js.undefined,
    fontWeight: js.UndefOr[Double] = js.undefined,
    primaryTextColor: String = null,
    secondaryTextColor: String = null,
    textColor: String = null
  ): ButtonFilterColor = {
    val __obj = js.Dynamic.literal()
    if (buttonFilterColor != null) __obj.updateDynamic("buttonFilterColor")(buttonFilterColor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (disabledTextColor != null) __obj.updateDynamic("disabledTextColor")(disabledTextColor.asInstanceOf[js.Any])
    if (!js.isUndefined(fontSize)) __obj.updateDynamic("fontSize")(fontSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fontWeight)) __obj.updateDynamic("fontWeight")(fontWeight.get.asInstanceOf[js.Any])
    if (primaryTextColor != null) __obj.updateDynamic("primaryTextColor")(primaryTextColor.asInstanceOf[js.Any])
    if (secondaryTextColor != null) __obj.updateDynamic("secondaryTextColor")(secondaryTextColor.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonFilterColor]
  }
}

