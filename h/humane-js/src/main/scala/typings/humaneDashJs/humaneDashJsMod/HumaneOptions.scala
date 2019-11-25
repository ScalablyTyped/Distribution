package typings.humaneDashJs.humaneDashJsMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HumaneOptions extends HumaneMessageOptions {
  var baseCls: js.UndefOr[String] = js.undefined
  var container: js.UndefOr[Element] = js.undefined
}

object HumaneOptions {
  @scala.inline
  def apply(
    addnCls: String = null,
    baseCls: String = null,
    clickToClose: js.UndefOr[Boolean] = js.undefined,
    container: Element = null,
    timeout: Int | Double = null,
    waitForMove: js.UndefOr[Boolean] = js.undefined
  ): HumaneOptions = {
    val __obj = js.Dynamic.literal()
    if (addnCls != null) __obj.updateDynamic("addnCls")(addnCls.asInstanceOf[js.Any])
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls.asInstanceOf[js.Any])
    if (!js.isUndefined(clickToClose)) __obj.updateDynamic("clickToClose")(clickToClose.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForMove)) __obj.updateDynamic("waitForMove")(waitForMove.asInstanceOf[js.Any])
    __obj.asInstanceOf[HumaneOptions]
  }
}

