package typings.humaneJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HumaneMessageOptions extends js.Object {
  var addnCls: js.UndefOr[String] = js.undefined
  var clickToClose: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var waitForMove: js.UndefOr[Boolean] = js.undefined
}

object HumaneMessageOptions {
  @scala.inline
  def apply(
    addnCls: String = null,
    clickToClose: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    waitForMove: js.UndefOr[Boolean] = js.undefined
  ): HumaneMessageOptions = {
    val __obj = js.Dynamic.literal()
    if (addnCls != null) __obj.updateDynamic("addnCls")(addnCls.asInstanceOf[js.Any])
    if (!js.isUndefined(clickToClose)) __obj.updateDynamic("clickToClose")(clickToClose.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForMove)) __obj.updateDynamic("waitForMove")(waitForMove.asInstanceOf[js.Any])
    __obj.asInstanceOf[HumaneMessageOptions]
  }
}

