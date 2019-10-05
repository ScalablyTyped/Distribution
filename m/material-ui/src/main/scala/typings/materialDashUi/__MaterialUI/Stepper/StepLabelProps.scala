package typings.materialDashUi.__MaterialUI.Stepper

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepLabelProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var completed: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[ReactNode | String | Double] = js.undefined
  var iconContainerStyle: js.UndefOr[CSSProperties] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object StepLabelProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    completed: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    icon: ReactNode | String | Double = null,
    iconContainerStyle: CSSProperties = null,
    style: CSSProperties = null
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

