package typings.atIonicCliDashFramework.libOptionsMod

import typings.atIonicCliDashFramework.libColorsMod.Colors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatOptionNameOptions extends js.Object {
  val colors: js.UndefOr[Colors] = js.undefined
  val showAliases: js.UndefOr[Boolean] = js.undefined
  val showValueSpec: js.UndefOr[Boolean] = js.undefined
}

object FormatOptionNameOptions {
  @scala.inline
  def apply(
    colors: Colors = null,
    showAliases: js.UndefOr[Boolean] = js.undefined,
    showValueSpec: js.UndefOr[Boolean] = js.undefined
  ): FormatOptionNameOptions = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (!js.isUndefined(showAliases)) __obj.updateDynamic("showAliases")(showAliases)
    if (!js.isUndefined(showValueSpec)) __obj.updateDynamic("showValueSpec")(showValueSpec)
    __obj.asInstanceOf[FormatOptionNameOptions]
  }
}

