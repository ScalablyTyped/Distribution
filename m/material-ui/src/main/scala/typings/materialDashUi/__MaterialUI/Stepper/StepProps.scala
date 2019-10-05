package typings.materialDashUi.__MaterialUI.Stepper

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var completed: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object StepProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    completed: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null
  ): StepProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (!js.isUndefined(completed)) __obj.updateDynamic("completed")(completed)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[StepProps]
  }
}

