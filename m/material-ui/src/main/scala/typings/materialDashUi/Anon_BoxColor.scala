package typings.materialDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BoxColor extends js.Object {
  var boxColor: js.UndefOr[String] = js.undefined
  var checkedColor: js.UndefOr[String] = js.undefined
  var disabledColor: js.UndefOr[String] = js.undefined
  var labelColor: js.UndefOr[String] = js.undefined
  var labelDisabledColor: js.UndefOr[String] = js.undefined
  var requiredColor: js.UndefOr[String] = js.undefined
}

object Anon_BoxColor {
  @scala.inline
  def apply(
    boxColor: String = null,
    checkedColor: String = null,
    disabledColor: String = null,
    labelColor: String = null,
    labelDisabledColor: String = null,
    requiredColor: String = null
  ): Anon_BoxColor = {
    val __obj = js.Dynamic.literal()
    if (boxColor != null) __obj.updateDynamic("boxColor")(boxColor)
    if (checkedColor != null) __obj.updateDynamic("checkedColor")(checkedColor)
    if (disabledColor != null) __obj.updateDynamic("disabledColor")(disabledColor)
    if (labelColor != null) __obj.updateDynamic("labelColor")(labelColor)
    if (labelDisabledColor != null) __obj.updateDynamic("labelDisabledColor")(labelDisabledColor)
    if (requiredColor != null) __obj.updateDynamic("requiredColor")(requiredColor)
    __obj.asInstanceOf[Anon_BoxColor]
  }
}

