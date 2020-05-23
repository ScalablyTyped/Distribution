package typings.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisabledTextColor extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var borderColor: js.UndefOr[String] = js.undefined
  var disabledTextColor: js.UndefOr[String] = js.undefined
  var errorColor: js.UndefOr[String] = js.undefined
  var floatingLabelColor: js.UndefOr[String] = js.undefined
  var focusColor: js.UndefOr[String] = js.undefined
  var hintColor: js.UndefOr[String] = js.undefined
  var textColor: js.UndefOr[String] = js.undefined
}

object DisabledTextColor {
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
  ): DisabledTextColor = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (disabledTextColor != null) __obj.updateDynamic("disabledTextColor")(disabledTextColor.asInstanceOf[js.Any])
    if (errorColor != null) __obj.updateDynamic("errorColor")(errorColor.asInstanceOf[js.Any])
    if (floatingLabelColor != null) __obj.updateDynamic("floatingLabelColor")(floatingLabelColor.asInstanceOf[js.Any])
    if (focusColor != null) __obj.updateDynamic("focusColor")(focusColor.asInstanceOf[js.Any])
    if (hintColor != null) __obj.updateDynamic("hintColor")(hintColor.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisabledTextColor]
  }
}

