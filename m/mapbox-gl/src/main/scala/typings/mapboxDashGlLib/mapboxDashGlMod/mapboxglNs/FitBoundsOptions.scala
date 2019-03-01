package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FitBoundsOptions extends FlyToOptions {
  var linear: js.UndefOr[scala.Boolean] = js.undefined
  var maxZoom: js.UndefOr[scala.Double] = js.undefined
  var padding: js.UndefOr[scala.Double | PaddingOptions] = js.undefined
}

object FitBoundsOptions {
  @scala.inline
  def apply(
    animate: js.UndefOr[scala.Boolean] = js.undefined,
    around: LngLatLike = null,
    bearing: scala.Int | scala.Double = null,
    center: LngLatLike = null,
    curve: scala.Int | scala.Double = null,
    duration: scala.Int | scala.Double = null,
    easing: js.Function1[/* time */ scala.Double, scala.Double] = null,
    linear: js.UndefOr[scala.Boolean] = js.undefined,
    maxDuration: scala.Int | scala.Double = null,
    maxZoom: scala.Int | scala.Double = null,
    minZoom: scala.Int | scala.Double = null,
    offset: PointLike = null,
    padding: scala.Double | PaddingOptions = null,
    pitch: scala.Int | scala.Double = null,
    screenSpeed: scala.Int | scala.Double = null,
    speed: scala.Int | scala.Double = null,
    zoom: scala.Int | scala.Double = null
  ): FitBoundsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (around != null) __obj.updateDynamic("around")(around.asInstanceOf[js.Any])
    if (bearing != null) __obj.updateDynamic("bearing")(bearing.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (curve != null) __obj.updateDynamic("curve")(curve.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (!js.isUndefined(linear)) __obj.updateDynamic("linear")(linear)
    if (maxDuration != null) __obj.updateDynamic("maxDuration")(maxDuration.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (pitch != null) __obj.updateDynamic("pitch")(pitch.asInstanceOf[js.Any])
    if (screenSpeed != null) __obj.updateDynamic("screenSpeed")(screenSpeed.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[FitBoundsOptions]
  }
}

