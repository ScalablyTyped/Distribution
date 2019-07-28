package typings.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchInputOptions extends js.Object {
  var clearSearchButtonText: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var initSelector: js.UndefOr[String] = js.undefined
  var mini: js.UndefOr[Boolean] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
}

object SearchInputOptions {
  @scala.inline
  def apply(
    clearSearchButtonText: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    initSelector: String = null,
    mini: js.UndefOr[Boolean] = js.undefined,
    theme: String = null
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

