package typings.leafletFullscreen.mod.Control_

import typings.leaflet.mod.ControlPosition
import typings.leafletFullscreen.leafletFullscreenBooleans.`false`
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullscreenOptions extends js.Object {
  var content: js.UndefOr[String] = js.undefined
  var forcePseudoFullscreen: js.UndefOr[Boolean] = js.undefined
  var forceSeparateButton: js.UndefOr[Boolean] = js.undefined
  var fullscreenElement: js.UndefOr[`false` | HTMLElement] = js.undefined
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
    fullscreenElement: `false` | HTMLElement = null,
    position: ControlPosition = null,
    pseudoFullscreen: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    titleCancel: String = null
  ): FullscreenOptions = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(forcePseudoFullscreen)) __obj.updateDynamic("forcePseudoFullscreen")(forcePseudoFullscreen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceSeparateButton)) __obj.updateDynamic("forceSeparateButton")(forceSeparateButton.get.asInstanceOf[js.Any])
    if (fullscreenElement != null) __obj.updateDynamic("fullscreenElement")(fullscreenElement.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(pseudoFullscreen)) __obj.updateDynamic("pseudoFullscreen")(pseudoFullscreen.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleCancel != null) __obj.updateDynamic("titleCancel")(titleCancel.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullscreenOptions]
  }
}

