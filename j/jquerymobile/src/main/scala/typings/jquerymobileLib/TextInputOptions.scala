package typings
package jquerymobileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextInputOptions extends js.Object {
  var clearBtn: js.UndefOr[scala.Boolean] = js.undefined
  var clearBtnText: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var initSelector: js.UndefOr[java.lang.String] = js.undefined
  var mini: js.UndefOr[scala.Boolean] = js.undefined
  var preventFocusZoom: js.UndefOr[scala.Boolean] = js.undefined
  var theme: js.UndefOr[java.lang.String] = js.undefined
}

object TextInputOptions {
  @scala.inline
  def apply(
    clearBtn: js.UndefOr[scala.Boolean] = js.undefined,
    clearBtnText: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    initSelector: java.lang.String = null,
    mini: js.UndefOr[scala.Boolean] = js.undefined,
    preventFocusZoom: js.UndefOr[scala.Boolean] = js.undefined,
    theme: java.lang.String = null
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

