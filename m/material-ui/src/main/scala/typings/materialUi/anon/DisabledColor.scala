package typings.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisabledColor extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var disabledColor: js.UndefOr[String] = js.undefined
  var disabledTextColor: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
  var fontWeight: js.UndefOr[Double] = js.undefined
  var primaryColor: js.UndefOr[String] = js.undefined
  var primaryTextColor: js.UndefOr[String] = js.undefined
  var secondaryColor: js.UndefOr[String] = js.undefined
  var secondaryTextColor: js.UndefOr[String] = js.undefined
  var textColor: js.UndefOr[String] = js.undefined
}

object DisabledColor {
  @scala.inline
  def apply(
    color: String = null,
    disabledColor: String = null,
    disabledTextColor: String = null,
    fontSize: js.UndefOr[Double] = js.undefined,
    fontWeight: js.UndefOr[Double] = js.undefined,
    primaryColor: String = null,
    primaryTextColor: String = null,
    secondaryColor: String = null,
    secondaryTextColor: String = null,
    textColor: String = null
  ): DisabledColor = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (disabledColor != null) __obj.updateDynamic("disabledColor")(disabledColor.asInstanceOf[js.Any])
    if (disabledTextColor != null) __obj.updateDynamic("disabledTextColor")(disabledTextColor.asInstanceOf[js.Any])
    if (!js.isUndefined(fontSize)) __obj.updateDynamic("fontSize")(fontSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fontWeight)) __obj.updateDynamic("fontWeight")(fontWeight.get.asInstanceOf[js.Any])
    if (primaryColor != null) __obj.updateDynamic("primaryColor")(primaryColor.asInstanceOf[js.Any])
    if (primaryTextColor != null) __obj.updateDynamic("primaryTextColor")(primaryTextColor.asInstanceOf[js.Any])
    if (secondaryColor != null) __obj.updateDynamic("secondaryColor")(secondaryColor.asInstanceOf[js.Any])
    if (secondaryTextColor != null) __obj.updateDynamic("secondaryTextColor")(secondaryTextColor.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisabledColor]
  }
}

