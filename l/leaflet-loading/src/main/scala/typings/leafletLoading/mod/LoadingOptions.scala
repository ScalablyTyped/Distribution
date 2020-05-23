package typings.leafletLoading.mod

import typings.leaflet.mod.ControlOptions
import typings.leaflet.mod.ControlPosition
import typings.leaflet.mod.Control_.Zoom
import typings.leafletLoading.anon.Length
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadingOptions extends ControlOptions {
  var delayIndicator: js.UndefOr[Double] = js.undefined
  var separate: js.UndefOr[Boolean] = js.undefined
  var spin: js.UndefOr[Length] = js.undefined
  var spinjs: js.UndefOr[Boolean] = js.undefined
  var zoomControl: js.UndefOr[Zoom] = js.undefined
}

object LoadingOptions {
  @scala.inline
  def apply(
    delayIndicator: js.UndefOr[Double] = js.undefined,
    position: ControlPosition = null,
    separate: js.UndefOr[Boolean] = js.undefined,
    spin: Length = null,
    spinjs: js.UndefOr[Boolean] = js.undefined,
    zoomControl: Zoom = null
  ): LoadingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delayIndicator)) __obj.updateDynamic("delayIndicator")(delayIndicator.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(separate)) __obj.updateDynamic("separate")(separate.get.asInstanceOf[js.Any])
    if (spin != null) __obj.updateDynamic("spin")(spin.asInstanceOf[js.Any])
    if (!js.isUndefined(spinjs)) __obj.updateDynamic("spinjs")(spinjs.get.asInstanceOf[js.Any])
    if (zoomControl != null) __obj.updateDynamic("zoomControl")(zoomControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingOptions]
  }
}

