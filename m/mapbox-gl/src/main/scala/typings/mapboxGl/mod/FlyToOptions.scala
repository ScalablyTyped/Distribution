package typings.mapboxGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlyToOptions
  extends AnimationOptions
     with CameraOptions {
  var curve: js.UndefOr[Double] = js.undefined
  var maxDuration: js.UndefOr[Double] = js.undefined
  var minZoom: js.UndefOr[Double] = js.undefined
  var screenSpeed: js.UndefOr[Double] = js.undefined
  var speed: js.UndefOr[Double] = js.undefined
}

object FlyToOptions {
  @scala.inline
  def apply(
    animate: js.UndefOr[Boolean] = js.undefined,
    around: LngLatLike = null,
    bearing: js.UndefOr[Double] = js.undefined,
    center: LngLatLike = null,
    curve: js.UndefOr[Double] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined,
    easing: /* time */ Double => Double = null,
    essential: js.UndefOr[Boolean] = js.undefined,
    maxDuration: js.UndefOr[Double] = js.undefined,
    minZoom: js.UndefOr[Double] = js.undefined,
    offset: PointLike = null,
    pitch: js.UndefOr[Double] = js.undefined,
    screenSpeed: js.UndefOr[Double] = js.undefined,
    speed: js.UndefOr[Double] = js.undefined,
    zoom: js.UndefOr[Double] = js.undefined
  ): FlyToOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.get.asInstanceOf[js.Any])
    if (around != null) __obj.updateDynamic("around")(around.asInstanceOf[js.Any])
    if (!js.isUndefined(bearing)) __obj.updateDynamic("bearing")(bearing.get.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (!js.isUndefined(curve)) __obj.updateDynamic("curve")(curve.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction1(easing))
    if (!js.isUndefined(essential)) __obj.updateDynamic("essential")(essential.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDuration)) __obj.updateDynamic("maxDuration")(maxDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minZoom)) __obj.updateDynamic("minZoom")(minZoom.get.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(pitch)) __obj.updateDynamic("pitch")(pitch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(screenSpeed)) __obj.updateDynamic("screenSpeed")(screenSpeed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(speed)) __obj.updateDynamic("speed")(speed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoom)) __obj.updateDynamic("zoom")(zoom.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlyToOptions]
  }
}

