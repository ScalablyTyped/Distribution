package typings.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogOptions extends js.Object {
  var closeBtn: js.UndefOr[String] = js.undefined
  var closeBtnText: js.UndefOr[String] = js.undefined
  var corners: js.UndefOr[Boolean] = js.undefined
  var initSelector: js.UndefOr[String] = js.undefined
  var overlayTheme: js.UndefOr[String] = js.undefined
}

object DialogOptions {
  @scala.inline
  def apply(
    closeBtn: String = null,
    closeBtnText: String = null,
    corners: js.UndefOr[Boolean] = js.undefined,
    initSelector: String = null,
    overlayTheme: String = null
  ): DialogOptions = {
    val __obj = js.Dynamic.literal()
    if (closeBtn != null) __obj.updateDynamic("closeBtn")(closeBtn.asInstanceOf[js.Any])
    if (closeBtnText != null) __obj.updateDynamic("closeBtnText")(closeBtnText.asInstanceOf[js.Any])
    if (!js.isUndefined(corners)) __obj.updateDynamic("corners")(corners.get.asInstanceOf[js.Any])
    if (initSelector != null) __obj.updateDynamic("initSelector")(initSelector.asInstanceOf[js.Any])
    if (overlayTheme != null) __obj.updateDynamic("overlayTheme")(overlayTheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogOptions]
  }
}

