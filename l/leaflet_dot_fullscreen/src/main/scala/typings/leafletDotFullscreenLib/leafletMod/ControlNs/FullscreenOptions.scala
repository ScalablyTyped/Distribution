package typings
package leafletDotFullscreenLib.leafletMod.ControlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullscreenOptions extends js.Object {
  var content: js.UndefOr[java.lang.String] = js.undefined
  var forcePseudoFullscreen: js.UndefOr[scala.Boolean] = js.undefined
  var forceSeparateButton: js.UndefOr[scala.Boolean] = js.undefined
  var position: js.UndefOr[leafletLib.leafletMod.ControlPosition] = js.undefined
  var pseudoFullscreen: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var titleCancel: js.UndefOr[java.lang.String] = js.undefined
}

object FullscreenOptions {
  @scala.inline
  def apply(
    content: java.lang.String = null,
    forcePseudoFullscreen: js.UndefOr[scala.Boolean] = js.undefined,
    forceSeparateButton: js.UndefOr[scala.Boolean] = js.undefined,
    position: leafletLib.leafletMod.ControlPosition = null,
    pseudoFullscreen: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null,
    titleCancel: java.lang.String = null
  ): FullscreenOptions = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (!js.isUndefined(forcePseudoFullscreen)) __obj.updateDynamic("forcePseudoFullscreen")(forcePseudoFullscreen)
    if (!js.isUndefined(forceSeparateButton)) __obj.updateDynamic("forceSeparateButton")(forceSeparateButton)
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(pseudoFullscreen)) __obj.updateDynamic("pseudoFullscreen")(pseudoFullscreen)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleCancel != null) __obj.updateDynamic("titleCancel")(titleCancel)
    __obj.asInstanceOf[FullscreenOptions]
  }
}

