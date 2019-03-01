package typings
package materialDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ButtonSize extends js.Object {
  var buttonSize: js.UndefOr[scala.Double] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var disabledColor: js.UndefOr[java.lang.String] = js.undefined
  var disabledTextColor: js.UndefOr[java.lang.String] = js.undefined
  var iconColor: js.UndefOr[java.lang.String] = js.undefined
  var miniSize: js.UndefOr[scala.Double] = js.undefined
  var secondaryColor: js.UndefOr[java.lang.String] = js.undefined
  var secondaryIconColor: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ButtonSize {
  @scala.inline
  def apply(
    buttonSize: scala.Int | scala.Double = null,
    color: java.lang.String = null,
    disabledColor: java.lang.String = null,
    disabledTextColor: java.lang.String = null,
    iconColor: java.lang.String = null,
    miniSize: scala.Int | scala.Double = null,
    secondaryColor: java.lang.String = null,
    secondaryIconColor: java.lang.String = null
  ): Anon_ButtonSize = {
    val __obj = js.Dynamic.literal()
    if (buttonSize != null) __obj.updateDynamic("buttonSize")(buttonSize.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (disabledColor != null) __obj.updateDynamic("disabledColor")(disabledColor)
    if (disabledTextColor != null) __obj.updateDynamic("disabledTextColor")(disabledTextColor)
    if (iconColor != null) __obj.updateDynamic("iconColor")(iconColor)
    if (miniSize != null) __obj.updateDynamic("miniSize")(miniSize.asInstanceOf[js.Any])
    if (secondaryColor != null) __obj.updateDynamic("secondaryColor")(secondaryColor)
    if (secondaryIconColor != null) __obj.updateDynamic("secondaryIconColor")(secondaryIconColor)
    __obj.asInstanceOf[Anon_ButtonSize]
  }
}

