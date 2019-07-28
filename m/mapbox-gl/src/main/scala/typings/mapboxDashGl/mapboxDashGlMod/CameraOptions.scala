package typings.mapboxDashGl.mapboxDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraOptions extends js.Object {
  /** If zooming, the zoom center (defaults to map center) */
  var around: js.UndefOr[LngLatLike] = js.undefined
  /** Map rotation bearing in degrees counter-clockwise from north */
  var bearing: js.UndefOr[Double] = js.undefined
  /** Map center */
  var center: js.UndefOr[LngLatLike] = js.undefined
  /** Map angle in degrees at which the camera is looking at the ground */
  var pitch: js.UndefOr[Double] = js.undefined
  /** Map zoom level */
  var zoom: js.UndefOr[Double] = js.undefined
}

object CameraOptions {
  @scala.inline
  def apply(
    around: LngLatLike = null,
    bearing: Int | Double = null,
    center: LngLatLike = null,
    pitch: Int | Double = null,
    zoom: Int | Double = null
  ): CameraOptions = {
    val __obj = js.Dynamic.literal()
    if (around != null) __obj.updateDynamic("around")(around.asInstanceOf[js.Any])
    if (bearing != null) __obj.updateDynamic("bearing")(bearing.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (pitch != null) __obj.updateDynamic("pitch")(pitch.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraOptions]
  }
}

