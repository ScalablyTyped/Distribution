package typings.leafletDotFullscreen.leafletMod.ControlNs

import typings.leaflet.leafletMod.ControlPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullscreenOptions extends js.Object {
  var content: js.UndefOr[String] = js.undefined
  var forcePseudoFullscreen: js.UndefOr[Boolean] = js.undefined
  var forceSeparateButton: js.UndefOr[Boolean] = js.undefined
  var position: js.UndefOr[ControlPosition] = js.undefined
  var pseudoFullscreen: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var titleCancel: js.UndefOr[String] = js.undefined
}

object FullscreenOptions {
  @scala.inline
  def apply(
    content: String = null,
    forcePseudoFullscreen: js.UndefOr[Boolean] = js.undefined,
    forceSeparateButton: js.UndefOr[Boolean] = js.undefined,
    position: ControlPosition = null,
    pseudoFullscreen: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    titleCancel: String = null
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

