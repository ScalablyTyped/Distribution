package typings
package jqueryDotNotifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryNotifyOptions extends js.Object {
  var close: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var custom: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var expires: js.UndefOr[scala.Double] = js.undefined
  var open: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var queue: js.UndefOr[scala.Boolean] = js.undefined
  var speed: js.UndefOr[scala.Double] = js.undefined
  var stack: js.UndefOr[
    jqueryDotNotifyLib.jqueryDotNotifyLibStrings.below | jqueryDotNotifyLib.jqueryDotNotifyLibStrings.above
  ] = js.undefined
}

object JQueryNotifyOptions {
  @scala.inline
  def apply(
    close: js.Function0[scala.Unit] = null,
    custom: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    expires: scala.Int | scala.Double = null,
    open: js.Function0[scala.Unit] = null,
    queue: js.UndefOr[scala.Boolean] = js.undefined,
    speed: scala.Int | scala.Double = null,
    stack: jqueryDotNotifyLib.jqueryDotNotifyLibStrings.below | jqueryDotNotifyLib.jqueryDotNotifyLibStrings.above = null
  ): JQueryNotifyOptions = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close)
    if (!js.isUndefined(custom)) __obj.updateDynamic("custom")(custom)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(open)
    if (!js.isUndefined(queue)) __obj.updateDynamic("queue")(queue)
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryNotifyOptions]
  }
}

