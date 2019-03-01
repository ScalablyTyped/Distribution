package typings
package jquerymobileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderOptions extends js.Object {
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var highlight: js.UndefOr[scala.Boolean] = js.undefined
  var initSelector: js.UndefOr[java.lang.String] = js.undefined
  var mini: js.UndefOr[scala.Boolean] = js.undefined
  var theme: js.UndefOr[java.lang.String] = js.undefined
  var trackTheme: js.UndefOr[java.lang.String] = js.undefined
}

object SliderOptions {
  @scala.inline
  def apply(
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    highlight: js.UndefOr[scala.Boolean] = js.undefined,
    initSelector: java.lang.String = null,
    mini: js.UndefOr[scala.Boolean] = js.undefined,
    theme: java.lang.String = null,
    trackTheme: java.lang.String = null
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

