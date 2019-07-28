package typings.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderOptions extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var highlight: js.UndefOr[Boolean] = js.undefined
  var initSelector: js.UndefOr[String] = js.undefined
  var mini: js.UndefOr[Boolean] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
  var trackTheme: js.UndefOr[String] = js.undefined
}

object SliderOptions {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    highlight: js.UndefOr[Boolean] = js.undefined,
    initSelector: String = null,
    mini: js.UndefOr[Boolean] = js.undefined,
    theme: String = null,
    trackTheme: String = null
  ): SliderOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight)
    if (initSelector != null) __obj.updateDynamic("initSelector")(initSelector)
    if (!js.isUndefined(mini)) __obj.updateDynamic("mini")(mini)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (trackTheme != null) __obj.updateDynamic("trackTheme")(trackTheme)
    __obj.asInstanceOf[SliderOptions]
  }
}

