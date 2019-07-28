package typings.knockoutDashSecureDashBinding

import typings.knockout.KnockoutBindingHandlers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutSecureBindingOptions extends js.Object {
  var attribute: js.UndefOr[String] = js.undefined
  var bindings: js.UndefOr[KnockoutBindingHandlers] = js.undefined
  var globals: js.UndefOr[js.Any] = js.undefined
  var noVirtualElements: js.UndefOr[Boolean] = js.undefined
}

object KnockoutSecureBindingOptions {
  @scala.inline
  def apply(
    attribute: String = null,
    bindings: KnockoutBindingHandlers = null,
    globals: js.Any = null,
    noVirtualElements: js.UndefOr[Boolean] = js.undefined
  ): KnockoutSecureBindingOptions = {
    val __obj = js.Dynamic.literal()
    if (attribute != null) __obj.updateDynamic("attribute")(attribute)
    if (bindings != null) __obj.updateDynamic("bindings")(bindings)
    if (globals != null) __obj.updateDynamic("globals")(globals)
    if (!js.isUndefined(noVirtualElements)) __obj.updateDynamic("noVirtualElements")(noVirtualElements)
    __obj.asInstanceOf[KnockoutSecureBindingOptions]
  }
}

