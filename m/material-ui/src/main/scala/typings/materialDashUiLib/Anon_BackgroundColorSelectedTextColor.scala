package typings
package materialDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundColorSelectedTextColor extends js.Object {
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var selectedTextColor: js.UndefOr[java.lang.String] = js.undefined
  var textColor: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_BackgroundColorSelectedTextColor {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String = null,
    selectedTextColor: java.lang.String = null,
    textColor: java.lang.String = null
  ): Anon_BackgroundColorSelectedTextColor = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (selectedTextColor != null) __obj.updateDynamic("selectedTextColor")(selectedTextColor)
    if (textColor != null) __obj.updateDynamic("textColor")(textColor)
    __obj.asInstanceOf[Anon_BackgroundColorSelectedTextColor]
  }
}

