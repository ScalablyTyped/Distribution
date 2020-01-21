package typings.leafletLoading.mod

import typings.leaflet.mod.ControlOptions
import typings.leaflet.mod.ControlPosition
import typings.leaflet.mod.Control_.Zoom
import typings.leafletLoading.AnonLength
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadingOptions extends ControlOptions {
  var delayIndicator: js.UndefOr[Double] = js.undefined
  var separate: js.UndefOr[Boolean] = js.undefined
  var spin: js.UndefOr[AnonLength] = js.undefined
  var spinjs: js.UndefOr[Boolean] = js.undefined
  var zoomControl: js.UndefOr[Zoom] = js.undefined
}

object LoadingOptions {
  @scala.inline
  def apply(
    delayIndicator: Int | Double = null,
    position: ControlPosition = null,
    separate: js.UndefOr[Boolean] = js.undefined,
    spin: AnonLength = null,
    spinjs: js.UndefOr[Boolean] = js.undefined,
    zoomControl: Zoom = null
  ): LoadingOptions = {
    val __obj = js.Dynamic.literal()
    if (delayIndicator != null) __obj.updateDynamic("delayIndicator")(delayIndicator.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(separate)) __obj.updateDynamic("separate")(separate.asInstanceOf[js.Any])
    if (spin != null) __obj.updateDynamic("spin")(spin.asInstanceOf[js.Any])
    if (!js.isUndefined(spinjs)) __obj.updateDynamic("spinjs")(spinjs.asInstanceOf[js.Any])
    if (zoomControl != null) __obj.updateDynamic("zoomControl")(zoomControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingOptions]
  }
}

