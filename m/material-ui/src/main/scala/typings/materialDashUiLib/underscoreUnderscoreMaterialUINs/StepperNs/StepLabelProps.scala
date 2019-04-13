package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.StepperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepLabelProps extends js.Object {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var completed: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var icon: js.UndefOr[reactLib.reactMod.ReactNode | java.lang.String | scala.Double] = js.undefined
  var iconContainerStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object StepLabelProps {
  @scala.inline
  def apply(
    active: js.UndefOr[scala.Boolean] = js.undefined,
    completed: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    icon: reactLib.reactMod.ReactNode | java.lang.String | scala.Double = null,
    iconContainerStyle: reactLib.reactMod.CSSProperties = null,
    style: reactLib.reactMod.CSSProperties = null
  ): StepLabelProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (!js.isUndefined(completed)) __obj.updateDynamic("completed")(completed)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconContainerStyle != null) __obj.updateDynamic("iconContainerStyle")(iconContainerStyle)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[StepLabelProps]
  }
}

