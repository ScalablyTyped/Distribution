package typings.mapboxGl.mod

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
    bearing: js.UndefOr[Double] = js.undefined,
    center: LngLatLike = null,
    pitch: js.UndefOr[Double] = js.undefined,
    zoom: js.UndefOr[Double] = js.undefined
  ): CameraOptions = {
    val __obj = js.Dynamic.literal()
    if (around != null) __obj.updateDynamic("around")(around.asInstanceOf[js.Any])
    if (!js.isUndefined(bearing)) __obj.updateDynamic("bearing")(bearing.get.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (!js.isUndefined(pitch)) __obj.updateDynamic("pitch")(pitch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoom)) __obj.updateDynamic("zoom")(zoom.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraOptions]
  }
}

