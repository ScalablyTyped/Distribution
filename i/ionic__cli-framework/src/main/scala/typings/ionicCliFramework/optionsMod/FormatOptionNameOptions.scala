package typings.ionicCliFramework.optionsMod

import typings.ionicCliFramework.colorsMod.Colors
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
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(showAliases)) __obj.updateDynamic("showAliases")(showAliases.asInstanceOf[js.Any])
    if (!js.isUndefined(showValueSpec)) __obj.updateDynamic("showValueSpec")(showValueSpec.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatOptionNameOptions]
  }
}

