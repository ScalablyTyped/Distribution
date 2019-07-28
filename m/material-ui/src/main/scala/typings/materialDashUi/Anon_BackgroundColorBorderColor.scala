package typings.materialDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundColorBorderColor extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var borderColor: js.UndefOr[String] = js.undefined
  var checkedColor: js.UndefOr[String] = js.undefined
  var disabledColor: js.UndefOr[String] = js.undefined
  var labelColor: js.UndefOr[String] = js.undefined
  var labelDisabledColor: js.UndefOr[String] = js.undefined
  var requiredColor: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
}

object Anon_BackgroundColorBorderColor {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    borderColor: String = null,
    checkedColor: String = null,
    disabledColor: String = null,
    labelColor: String = null,
    labelDisabledColor: String = null,
    requiredColor: String = null,
    size: Int | Double = null
  ): Anon_BackgroundColorBorderColor = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (checkedColor != null) __obj.updateDynamic("checkedColor")(checkedColor)
    if (disabledColor != null) __obj.updateDynamic("disabledColor")(disabledColor)
    if (labelColor != null) __obj.updateDynamic("labelColor")(labelColor)
    if (labelDisabledColor != null) __obj.updateDynamic("labelDisabledColor")(labelDisabledColor)
    if (requiredColor != null) __obj.updateDynamic("requiredColor")(requiredColor)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BackgroundColorBorderColor]
  }
}

