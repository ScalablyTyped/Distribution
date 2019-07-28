package typings.materialDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundColorBorderColorDisabledTextColor extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var borderColor: js.UndefOr[String] = js.undefined
  var disabledTextColor: js.UndefOr[String] = js.undefined
  var errorColor: js.UndefOr[String] = js.undefined
  var floatingLabelColor: js.UndefOr[String] = js.undefined
  var focusColor: js.UndefOr[String] = js.undefined
  var hintColor: js.UndefOr[String] = js.undefined
  var textColor: js.UndefOr[String] = js.undefined
}

object Anon_BackgroundColorBorderColorDisabledTextColor {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    borderColor: String = null,
    disabledTextColor: String = null,
    errorColor: String = null,
    floatingLabelColor: String = null,
    focusColor: String = null,
    hintColor: String = null,
    textColor: String = null
  ): Anon_BackgroundColorBorderColorDisabledTextColor = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (disabledTextColor != null) __obj.updateDynamic("disabledTextColor")(disabledTextColor)
    if (errorColor != null) __obj.updateDynamic("errorColor")(errorColor)
    if (floatingLabelColor != null) __obj.updateDynamic("floatingLabelColor")(floatingLabelColor)
    if (focusColor != null) __obj.updateDynamic("focusColor")(focusColor)
    if (hintColor != null) __obj.updateDynamic("hintColor")(hintColor)
    if (textColor != null) __obj.updateDynamic("textColor")(textColor)
    __obj.asInstanceOf[Anon_BackgroundColorBorderColorDisabledTextColor]
  }
}

