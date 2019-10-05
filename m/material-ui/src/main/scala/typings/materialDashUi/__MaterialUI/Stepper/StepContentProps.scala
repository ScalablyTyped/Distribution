package typings.materialDashUi.__MaterialUI.Stepper

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepContentProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var last: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object StepContentProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    last: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null
  ): StepContentProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (!js.isUndefined(last)) __obj.updateDynamic("last")(last)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[StepContentProps]
  }
}

