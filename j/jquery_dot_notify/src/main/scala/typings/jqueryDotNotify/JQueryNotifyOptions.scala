package typings.jqueryDotNotify

import typings.jqueryDotNotify.jqueryDotNotifyStrings.above
import typings.jqueryDotNotify.jqueryDotNotifyStrings.below
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryNotifyOptions extends js.Object {
  var close: js.UndefOr[js.Function0[Unit]] = js.undefined
  var custom: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var expires: js.UndefOr[Double] = js.undefined
  var open: js.UndefOr[js.Function0[Unit]] = js.undefined
  var queue: js.UndefOr[Boolean] = js.undefined
  var speed: js.UndefOr[Double] = js.undefined
  var stack: js.UndefOr[below | above] = js.undefined
}

object JQueryNotifyOptions {
  @scala.inline
  def apply(
    close: () => Unit = null,
    custom: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    expires: Int | Double = null,
    open: () => Unit = null,
    queue: js.UndefOr[Boolean] = js.undefined,
    speed: Int | Double = null,
    stack: below | above = null
  ): JQueryNotifyOptions = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction0(close))
    if (!js.isUndefined(custom)) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction0(open))
    if (!js.isUndefined(queue)) __obj.updateDynamic("queue")(queue.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryNotifyOptions]
  }
}

