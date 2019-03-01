package typings
package knockoutDashSecureDashBindingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutSecureBindingOptions extends js.Object {
  var attribute: js.UndefOr[java.lang.String] = js.undefined
  var bindings: js.UndefOr[knockoutLib.KnockoutBindingHandlers] = js.undefined
  var globals: js.UndefOr[js.Any] = js.undefined
  var noVirtualElements: js.UndefOr[scala.Boolean] = js.undefined
}

object KnockoutSecureBindingOptions {
  @scala.inline
  def apply(
    attribute: java.lang.String = null,
    bindings: knockoutLib.KnockoutBindingHandlers = null,
    globals: js.Any = null,
    noVirtualElements: js.UndefOr[scala.Boolean] = js.undefined
  ): KnockoutSecureBindingOptions = {
    val __obj = js.Dynamic.literal()
    if (attribute != null) __obj.updateDynamic("attribute")(attribute)
    if (bindings != null) __obj.updateDynamic("bindings")(bindings)
    if (globals != null) __obj.updateDynamic("globals")(globals)
    if (!js.isUndefined(noVirtualElements)) __obj.updateDynamic("noVirtualElements")(noVirtualElements)
    __obj.asInstanceOf[KnockoutSecureBindingOptions]
  }
}

