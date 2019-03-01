package typings
package jquerymobileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogOptions extends js.Object {
  var closeBtn: js.UndefOr[java.lang.String] = js.undefined
  var closeBtnText: js.UndefOr[java.lang.String] = js.undefined
  var corners: js.UndefOr[scala.Boolean] = js.undefined
  var initSelector: js.UndefOr[java.lang.String] = js.undefined
  var overlayTheme: js.UndefOr[java.lang.String] = js.undefined
}

object DialogOptions {
  @scala.inline
  def apply(
    closeBtn: java.lang.String = null,
    closeBtnText: java.lang.String = null,
    corners: js.UndefOr[scala.Boolean] = js.undefined,
    initSelector: java.lang.String = null,
    overlayTheme: java.lang.String = null
  ): DialogOptions = {
    val __obj = js.Dynamic.literal()
    if (closeBtn != null) __obj.updateDynamic("closeBtn")(closeBtn)
    if (closeBtnText != null) __obj.updateDynamic("closeBtnText")(closeBtnText)
    if (!js.isUndefined(corners)) __obj.updateDynamic("corners")(corners)
    if (initSelector != null) __obj.updateDynamic("initSelector")(initSelector)
    if (overlayTheme != null) __obj.updateDynamic("overlayTheme")(overlayTheme)
    __obj.asInstanceOf[DialogOptions]
  }
}

