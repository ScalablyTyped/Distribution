package typings.materialDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorDisabledColor extends js.Object {
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

object Anon_ColorDisabledColor {
  @scala.inline
  def apply(
    color: String = null,
    disabledColor: String = null,
    disabledTextColor: String = null,
    fontSize: Int | Double = null,
    fontWeight: Int | Double = null,
    primaryColor: String = null,
    primaryTextColor: String = null,
    secondaryColor: String = null,
    secondaryTextColor: String = null,
    textColor: String = null
  ): Anon_ColorDisabledColor = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (disabledColor != null) __obj.updateDynamic("disabledColor")(disabledColor)
    if (disabledTextColor != null) __obj.updateDynamic("disabledTextColor")(disabledTextColor)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (primaryColor != null) __obj.updateDynamic("primaryColor")(primaryColor)
    if (primaryTextColor != null) __obj.updateDynamic("primaryTextColor")(primaryTextColor)
    if (secondaryColor != null) __obj.updateDynamic("secondaryColor")(secondaryColor)
    if (secondaryTextColor != null) __obj.updateDynamic("secondaryTextColor")(secondaryTextColor)
    if (textColor != null) __obj.updateDynamic("textColor")(textColor)
    __obj.asInstanceOf[Anon_ColorDisabledColor]
  }
}

