package typings.mapboxGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EaseToOptions
  extends AnimationOptions
     with CameraOptions {
  var delayEndEvents: js.UndefOr[Double] = js.undefined
}

object EaseToOptions {
  @scala.inline
  def apply(
    animate: js.UndefOr[Boolean] = js.undefined,
    around: LngLatLike = null,
    bearing: Int | Double = null,
    center: LngLatLike = null,
    delayEndEvents: Int | Double = null,
    duration: Int | Double = null,
    easing: /* time */ Double => Double = null,
    essential: js.UndefOr[Boolean] = js.undefined,
    offset: PointLike = null,
    pitch: Int | Double = null,
    zoom: Int | Double = null
  ): EaseToOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (around != null) __obj.updateDynamic("around")(around.asInstanceOf[js.Any])
    if (bearing != null) __obj.updateDynamic("bearing")(bearing.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (delayEndEvents != null) __obj.updateDynamic("delayEndEvents")(delayEndEvents.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction1(easing))
    if (!js.isUndefined(essential)) __obj.updateDynamic("essential")(essential.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (pitch != null) __obj.updateDynamic("pitch")(pitch.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[EaseToOptions]
  }
}

