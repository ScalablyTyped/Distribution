package typings.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoxColor extends js.Object {
  var boxColor: js.UndefOr[String] = js.undefined
  var checkedColor: js.UndefOr[String] = js.undefined
  var disabledColor: js.UndefOr[String] = js.undefined
  var labelColor: js.UndefOr[String] = js.undefined
  var labelDisabledColor: js.UndefOr[String] = js.undefined
  var requiredColor: js.UndefOr[String] = js.undefined
}

object BoxColor {
  @scala.inline
  def apply(
    boxColor: String = null,
    checkedColor: String = null,
    disabledColor: String = null,
    labelColor: String = null,
    labelDisabledColor: String = null,
    requiredColor: String = null
  ): BoxColor = {
    val __obj = js.Dynamic.literal()
    if (boxColor != null) __obj.updateDynamic("boxColor")(boxColor.asInstanceOf[js.Any])
    if (checkedColor != null) __obj.updateDynamic("checkedColor")(checkedColor.asInstanceOf[js.Any])
    if (disabledColor != null) __obj.updateDynamic("disabledColor")(disabledColor.asInstanceOf[js.Any])
    if (labelColor != null) __obj.updateDynamic("labelColor")(labelColor.asInstanceOf[js.Any])
    if (labelDisabledColor != null) __obj.updateDynamic("labelDisabledColor")(labelDisabledColor.asInstanceOf[js.Any])
    if (requiredColor != null) __obj.updateDynamic("requiredColor")(requiredColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxColor]
  }
}

