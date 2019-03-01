package typings
package atIonicCliDashFrameworkLib.libOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatOptionNameOptions extends js.Object {
  val colors: js.UndefOr[atIonicCliDashFrameworkLib.libColorsMod.Colors] = js.undefined
  val showAliases: js.UndefOr[scala.Boolean] = js.undefined
  val showValueSpec: js.UndefOr[scala.Boolean] = js.undefined
}

object FormatOptionNameOptions {
  @scala.inline
  def apply(
    colors: atIonicCliDashFrameworkLib.libColorsMod.Colors = null,
    showAliases: js.UndefOr[scala.Boolean] = js.undefined,
    showValueSpec: js.UndefOr[scala.Boolean] = js.undefined
  ): FormatOptionNameOptions = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (!js.isUndefined(showAliases)) __obj.updateDynamic("showAliases")(showAliases)
    if (!js.isUndefined(showValueSpec)) __obj.updateDynamic("showValueSpec")(showValueSpec)
    __obj.asInstanceOf[FormatOptionNameOptions]
  }
}

