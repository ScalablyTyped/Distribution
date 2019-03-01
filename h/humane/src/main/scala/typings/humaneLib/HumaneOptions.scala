package typings
package humaneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HumaneOptions extends js.Object {
  var addnCls: js.UndefOr[java.lang.String] = js.undefined
  var baseCls: js.UndefOr[java.lang.String] = js.undefined
  var clickToClose: js.UndefOr[scala.Boolean] = js.undefined
  var forceNew: js.UndefOr[scala.Boolean] = js.undefined
  var queue: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var waitForMove: js.UndefOr[scala.Boolean] = js.undefined
}

object HumaneOptions {
  @scala.inline
  def apply(
    addnCls: java.lang.String = null,
    baseCls: java.lang.String = null,
    clickToClose: js.UndefOr[scala.Boolean] = js.undefined,
    forceNew: js.UndefOr[scala.Boolean] = js.undefined,
    queue: js.Array[java.lang.String] = null,
    timeout: scala.Int | scala.Double = null,
    waitForMove: js.UndefOr[scala.Boolean] = js.undefined
  ): HumaneOptions = {
    val __obj = js.Dynamic.literal()
    if (addnCls != null) __obj.updateDynamic("addnCls")(addnCls)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (!js.isUndefined(clickToClose)) __obj.updateDynamic("clickToClose")(clickToClose)
    if (!js.isUndefined(forceNew)) __obj.updateDynamic("forceNew")(forceNew)
    if (queue != null) __obj.updateDynamic("queue")(queue)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForMove)) __obj.updateDynamic("waitForMove")(waitForMove)
    __obj.asInstanceOf[HumaneOptions]
  }
}

