package typings
package materialDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionColor extends js.Object {
  var actionColor: js.UndefOr[java.lang.String] = js.undefined
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var textColor: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ActionColor {
  @scala.inline
  def apply(
    actionColor: java.lang.String = null,
    backgroundColor: java.lang.String = null,
    textColor: java.lang.String = null
  ): Anon_ActionColor = {
    val __obj = js.Dynamic.literal()
    if (actionColor != null) __obj.updateDynamic("actionColor")(actionColor)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (textColor != null) __obj.updateDynamic("textColor")(textColor)
    __obj.asInstanceOf[Anon_ActionColor]
  }
}

