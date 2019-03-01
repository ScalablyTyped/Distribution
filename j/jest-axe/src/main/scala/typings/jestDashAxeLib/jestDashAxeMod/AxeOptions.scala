package typings
package jestDashAxeLib.jestDashAxeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxeOptions extends js.Object {
  var elementRef: js.UndefOr[scala.Boolean] = js.undefined
  var iframes: js.UndefOr[scala.Boolean] = js.undefined
  var rules: js.UndefOr[js.Object] = js.undefined
  var runOnly: js.UndefOr[axeDashCoreLib.axeDashCoreMod.axeNs.RunOnly] = js.undefined
  var selectors: js.UndefOr[scala.Boolean] = js.undefined
}

object AxeOptions {
  @scala.inline
  def apply(
    elementRef: js.UndefOr[scala.Boolean] = js.undefined,
    iframes: js.UndefOr[scala.Boolean] = js.undefined,
    rules: js.Object = null,
    runOnly: axeDashCoreLib.axeDashCoreMod.axeNs.RunOnly = null,
    selectors: js.UndefOr[scala.Boolean] = js.undefined
  ): AxeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(elementRef)) __obj.updateDynamic("elementRef")(elementRef)
    if (!js.isUndefined(iframes)) __obj.updateDynamic("iframes")(iframes)
    if (rules != null) __obj.updateDynamic("rules")(rules)
    if (runOnly != null) __obj.updateDynamic("runOnly")(runOnly)
    if (!js.isUndefined(selectors)) __obj.updateDynamic("selectors")(selectors)
    __obj.asInstanceOf[AxeOptions]
  }
}

