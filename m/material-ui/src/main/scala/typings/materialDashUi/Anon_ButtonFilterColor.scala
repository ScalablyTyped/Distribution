package typings.materialDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ButtonFilterColor extends js.Object {
  var buttonFilterColor: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var disabledTextColor: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
  var fontWeight: js.UndefOr[Double] = js.undefined
  var primaryTextColor: js.UndefOr[String] = js.undefined
  var secondaryTextColor: js.UndefOr[String] = js.undefined
  var textColor: js.UndefOr[String] = js.undefined
}

object Anon_ButtonFilterColor {
  @scala.inline
  def apply(
    buttonFilterColor: String = null,
    color: String = null,
    disabledTextColor: String = null,
    fontSize: Int | Double = null,
    fontWeight: Int | Double = null,
    primaryTextColor: String = null,
    secondaryTextColor: String = null,
    textColor: String = null
  ): Anon_ButtonFilterColor = {
    val __obj = js.Dynamic.literal()
    if (buttonFilterColor != null) __obj.updateDynamic("buttonFilterColor")(buttonFilterColor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (disabledTextColor != null) __obj.updateDynamic("disabledTextColor")(disabledTextColor.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (primaryTextColor != null) __obj.updateDynamic("primaryTextColor")(primaryTextColor.asInstanceOf[js.Any])
    if (secondaryTextColor != null) __obj.updateDynamic("secondaryTextColor")(secondaryTextColor.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ButtonFilterColor]
  }
}

