package typings.leafletDashLoading.leafletMod

import typings.leaflet.leafletMod.ControlNs.Zoom
import typings.leaflet.leafletMod.ControlOptions
import typings.leaflet.leafletMod.ControlPosition
import typings.leafletDashLoading.Anon_Length
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadingOptions extends ControlOptions {
  var delayIndicator: js.UndefOr[Double] = js.undefined
  var separate: js.UndefOr[Boolean] = js.undefined
  var spin: js.UndefOr[Anon_Length] = js.undefined
  var spinjs: js.UndefOr[Boolean] = js.undefined
  var zoomControl: js.UndefOr[Zoom] = js.undefined
}

object LoadingOptions {
  @scala.inline
  def apply(
    delayIndicator: Int | Double = null,
    position: ControlPosition = null,
    separate: js.UndefOr[Boolean] = js.undefined,
    spin: Anon_Length = null,
    spinjs: js.UndefOr[Boolean] = js.undefined,
    zoomControl: Zoom = null
  ): LoadingOptions = {
    val __obj = js.Dynamic.literal()
    if (delayIndicator != null) __obj.updateDynamic("delayIndicator")(delayIndicator.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(separate)) __obj.updateDynamic("separate")(separate)
    if (spin != null) __obj.updateDynamic("spin")(spin)
    if (!js.isUndefined(spinjs)) __obj.updateDynamic("spinjs")(spinjs)
    if (zoomControl != null) __obj.updateDynamic("zoomControl")(zoomControl)
    __obj.asInstanceOf[LoadingOptions]
  }
}

