package typings.materialDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundColorSelectedTextColor extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var selectedTextColor: js.UndefOr[String] = js.undefined
  var textColor: js.UndefOr[String] = js.undefined
}

object Anon_BackgroundColorSelectedTextColor {
  @scala.inline
  def apply(backgroundColor: String = null, selectedTextColor: String = null, textColor: String = null): Anon_BackgroundColorSelectedTextColor = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (selectedTextColor != null) __obj.updateDynamic("selectedTextColor")(selectedTextColor.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BackgroundColorSelectedTextColor]
  }
}

