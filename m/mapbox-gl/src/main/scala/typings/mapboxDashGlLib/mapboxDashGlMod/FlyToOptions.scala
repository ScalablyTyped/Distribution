package typings
package mapboxDashGlLib.mapboxDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlyToOptions
  extends AnimationOptions
     with CameraOptions {
  var curve: js.UndefOr[scala.Double] = js.undefined
  var maxDuration: js.UndefOr[scala.Double] = js.undefined
  var minZoom: js.UndefOr[scala.Double] = js.undefined
  var screenSpeed: js.UndefOr[scala.Double] = js.undefined
  var speed: js.UndefOr[scala.Double] = js.undefined
}

object FlyToOptions {
  @scala.inline
  def apply(
    animate: js.UndefOr[scala.Boolean] = js.undefined,
    around: LngLatLike = null,
    bearing: scala.Int | scala.Double = null,
    center: LngLatLike = null,
    curve: scala.Int | scala.Double = null,
    duration: scala.Int | scala.Double = null,
    easing: /* time */ scala.Double => scala.Double = null,
    maxDuration: scala.Int | scala.Double = null,
    minZoom: scala.Int | scala.Double = null,
    offset: PointLike = null,
    pitch: scala.Int | scala.Double = null,
    screenSpeed: scala.Int | scala.Double = null,
    speed: scala.Int | scala.Double = null,
    zoom: scala.Int | scala.Double = null
  ): FlyToOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (around != null) __obj.updateDynamic("around")(around.asInstanceOf[js.Any])
    if (bearing != null) __obj.updateDynamic("bearing")(bearing.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (curve != null) __obj.updateDynamic("curve")(curve.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction1(easing))
    if (maxDuration != null) __obj.updateDynamic("maxDuration")(maxDuration.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (pitch != null) __obj.updateDynamic("pitch")(pitch.asInstanceOf[js.Any])
    if (screenSpeed != null) __obj.updateDynamic("screenSpeed")(screenSpeed.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlyToOptions]
  }
}

