package typings.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupOptions extends js.Object {
  var corners: js.UndefOr[Boolean] = js.undefined
  var history: js.UndefOr[Boolean] = js.undefined
  var initSelector: js.UndefOr[String] = js.undefined
  var overlayTheme: js.UndefOr[String] = js.undefined
  var positionTo: js.UndefOr[String] = js.undefined
  var shadow: js.UndefOr[Boolean] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
  var tolerance: js.UndefOr[String] = js.undefined
  var transition: js.UndefOr[String] = js.undefined
}

object PopupOptions {
  @scala.inline
  def apply(
    corners: js.UndefOr[Boolean] = js.undefined,
    history: js.UndefOr[Boolean] = js.undefined,
    initSelector: String = null,
    overlayTheme: String = null,
    positionTo: String = null,
    shadow: js.UndefOr[Boolean] = js.undefined,
    theme: String = null,
    tolerance: String = null,
    transition: String = null
  ): PopupOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(corners)) __obj.updateDynamic("corners")(corners)
    if (!js.isUndefined(history)) __obj.updateDynamic("history")(history)
    if (initSelector != null) __obj.updateDynamic("initSelector")(initSelector)
    if (overlayTheme != null) __obj.updateDynamic("overlayTheme")(overlayTheme)
    if (positionTo != null) __obj.updateDynamic("positionTo")(positionTo)
    if (!js.isUndefined(shadow)) __obj.updateDynamic("shadow")(shadow)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (tolerance != null) __obj.updateDynamic("tolerance")(tolerance)
    if (transition != null) __obj.updateDynamic("transition")(transition)
    __obj.asInstanceOf[PopupOptions]
  }
}

