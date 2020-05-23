package typings.kendoUi.kendo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterOptions extends js.Object {
  var change: js.UndefOr[js.Function1[/* e */ RouterChangeEvent, Unit]] = js.undefined
  var hashBang: js.UndefOr[Boolean] = js.undefined
  var ignoreCase: js.UndefOr[Boolean] = js.undefined
  var init: js.UndefOr[js.Function1[/* e */ RouterEvent, Unit]] = js.undefined
  var pushState: js.UndefOr[Boolean] = js.undefined
  var root: js.UndefOr[String] = js.undefined
  var routeMissing: js.UndefOr[js.Function1[/* e */ RouterRouteMissingEvent, Unit]] = js.undefined
  var same: js.UndefOr[js.Function1[/* e */ RouterEvent, Unit]] = js.undefined
}

object RouterOptions {
  @scala.inline
  def apply(
    change: /* e */ RouterChangeEvent => Unit = null,
    hashBang: js.UndefOr[Boolean] = js.undefined,
    ignoreCase: js.UndefOr[Boolean] = js.undefined,
    init: /* e */ RouterEvent => Unit = null,
    pushState: js.UndefOr[Boolean] = js.undefined,
    root: String = null,
    routeMissing: /* e */ RouterRouteMissingEvent => Unit = null,
    same: /* e */ RouterEvent => Unit = null
  ): RouterOptions = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (!js.isUndefined(hashBang)) __obj.updateDynamic("hashBang")(hashBang.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase.get.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1(init))
    if (!js.isUndefined(pushState)) __obj.updateDynamic("pushState")(pushState.get.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (routeMissing != null) __obj.updateDynamic("routeMissing")(js.Any.fromFunction1(routeMissing))
    if (same != null) __obj.updateDynamic("same")(js.Any.fromFunction1(same))
    __obj.asInstanceOf[RouterOptions]
  }
}

