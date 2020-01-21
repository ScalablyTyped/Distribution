package typings.mapboxGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FitBoundsOptions extends FlyToOptions {
  var linear: js.UndefOr[Boolean] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var padding: js.UndefOr[Double | PaddingOptions] = js.undefined
}

object FitBoundsOptions {
  @scala.inline
  def apply(
    animate: js.UndefOr[Boolean] = js.undefined,
    around: LngLatLike = null,
    bearing: Int | Double = null,
    center: LngLatLike = null,
    curve: Int | Double = null,
    duration: Int | Double = null,
    easing: /* time */ Double => Double = null,
    essential: js.UndefOr[Boolean] = js.undefined,
    linear: js.UndefOr[Boolean] = js.undefined,
    maxDuration: Int | Double = null,
    maxZoom: Int | Double = null,
    minZoom: Int | Double = null,
    offset: PointLike = null,
    padding: Double | PaddingOptions = null,
    pitch: Int | Double = null,
    screenSpeed: Int | Double = null,
    speed: Int | Double = null,
    zoom: Int | Double = null
  ): FitBoundsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (around != null) __obj.updateDynamic("around")(around.asInstanceOf[js.Any])
    if (bearing != null) __obj.updateDynamic("bearing")(bearing.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (curve != null) __obj.updateDynamic("curve")(curve.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction1(easing))
    if (!js.isUndefined(essential)) __obj.updateDynamic("essential")(essential.asInstanceOf[js.Any])
    if (!js.isUndefined(linear)) __obj.updateDynamic("linear")(linear.asInstanceOf[js.Any])
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

