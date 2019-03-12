package typings
package kendoDashUiLib.kendoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterOptions extends js.Object {
  var change: js.UndefOr[js.Function1[/* e */ RouterChangeEvent, scala.Unit]] = js.undefined
  var hashBang: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreCase: js.UndefOr[scala.Boolean] = js.undefined
  var init: js.UndefOr[js.Function1[/* e */ RouterEvent, scala.Unit]] = js.undefined
  var pushState: js.UndefOr[scala.Boolean] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
  var routeMissing: js.UndefOr[js.Function1[/* e */ RouterRouteMissingEvent, scala.Unit]] = js.undefined
  var same: js.UndefOr[js.Function1[/* e */ RouterEvent, scala.Unit]] = js.undefined
}

object RouterOptions {
  @scala.inline
  def apply(
    change: /* e */ RouterChangeEvent => scala.Unit = null,
    hashBang: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreCase: js.UndefOr[scala.Boolean] = js.undefined,
    init: /* e */ RouterEvent => scala.Unit = null,
    pushState: js.UndefOr[scala.Boolean] = js.undefined,
    root: java.lang.String = null,
    routeMissing: /* e */ RouterRouteMissingEvent => scala.Unit = null,
    same: /* e */ RouterEvent => scala.Unit = null
  ): RouterOptions = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (!js.isUndefined(hashBang)) __obj.updateDynamic("hashBang")(hashBang)
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase)
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1(init))
    if (!js.isUndefined(pushState)) __obj.updateDynamic("pushState")(pushState)
    if (root != null) __obj.updateDynamic("root")(root)
    if (routeMissing != null) __obj.updateDynamic("routeMissing")(js.Any.fromFunction1(routeMissing))
    if (same != null) __obj.updateDynamic("same")(js.Any.fromFunction1(same))
    __obj.asInstanceOf[RouterOptions]
  }
}

