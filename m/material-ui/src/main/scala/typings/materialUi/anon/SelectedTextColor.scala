package typings.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectedTextColor extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var selectedTextColor: js.UndefOr[String] = js.undefined
  var textColor: js.UndefOr[String] = js.undefined
}

object SelectedTextColor {
  @scala.inline
  def apply(backgroundColor: String = null, selectedTextColor: String = null, textColor: String = null): SelectedTextColor = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (selectedTextColor != null) __obj.updateDynamic("selectedTextColor")(selectedTextColor.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectedTextColor]
  }
}

