package typings
package jquerymobileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchInputOptions extends js.Object {
  var clearSearchButtonText: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var initSelector: js.UndefOr[java.lang.String] = js.undefined
  var mini: js.UndefOr[scala.Boolean] = js.undefined
  var theme: js.UndefOr[java.lang.String] = js.undefined
}

object SearchInputOptions {
  @scala.inline
  def apply(
    clearSearchButtonText: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    initSelector: java.lang.String = null,
    mini: js.UndefOr[scala.Boolean] = js.undefined,
    theme: java.lang.String = null
  ): SearchInputOptions = {
    val __obj = js.Dynamic.literal()
    if (clearSearchButtonText != null) __obj.updateDynamic("clearSearchButtonText")(clearSearchButtonText)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (initSelector != null) __obj.updateDynamic("initSelector")(initSelector)
    if (!js.isUndefined(mini)) __obj.updateDynamic("mini")(mini)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[SearchInputOptions]
  }
}

