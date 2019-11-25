package typings.jestDashAxe.jestDashAxeMod

import typings.axeDashCore.axeDashCoreMod.RunOnly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxeOptions extends js.Object {
  var elementRef: js.UndefOr[Boolean] = js.undefined
  var iframes: js.UndefOr[Boolean] = js.undefined
  var rules: js.UndefOr[js.Object] = js.undefined
  var runOnly: js.UndefOr[RunOnly] = js.undefined
  var selectors: js.UndefOr[Boolean] = js.undefined
}

object AxeOptions {
  @scala.inline
  def apply(
    elementRef: js.UndefOr[Boolean] = js.undefined,
    iframes: js.UndefOr[Boolean] = js.undefined,
    rules: js.Object = null,
    runOnly: RunOnly = null,
    selectors: js.UndefOr[Boolean] = js.undefined
  ): AxeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(elementRef)) __obj.updateDynamic("elementRef")(elementRef.asInstanceOf[js.Any])
    if (!js.isUndefined(iframes)) __obj.updateDynamic("iframes")(iframes.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (runOnly != null) __obj.updateDynamic("runOnly")(runOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(selectors)) __obj.updateDynamic("selectors")(selectors.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxeOptions]
  }
}

