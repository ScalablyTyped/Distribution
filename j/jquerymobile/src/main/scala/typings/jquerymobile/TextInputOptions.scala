package typings.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextInputOptions extends js.Object {
  var clearBtn: js.UndefOr[Boolean] = js.undefined
  var clearBtnText: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var initSelector: js.UndefOr[String] = js.undefined
  var mini: js.UndefOr[Boolean] = js.undefined
  var preventFocusZoom: js.UndefOr[Boolean] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
}

object TextInputOptions {
  @scala.inline
  def apply(
    clearBtn: js.UndefOr[Boolean] = js.undefined,
    clearBtnText: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    initSelector: String = null,
    mini: js.UndefOr[Boolean] = js.undefined,
    preventFocusZoom: js.UndefOr[Boolean] = js.undefined,
    theme: String = null
  ): TextInputOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clearBtn)) __obj.updateDynamic("clearBtn")(clearBtn)
    if (clearBtnText != null) __obj.updateDynamic("clearBtnText")(clearBtnText)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (initSelector != null) __obj.updateDynamic("initSelector")(initSelector)
    if (!js.isUndefined(mini)) __obj.updateDynamic("mini")(mini)
    if (!js.isUndefined(preventFocusZoom)) __obj.updateDynamic("preventFocusZoom")(preventFocusZoom)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[TextInputOptions]
  }
}

