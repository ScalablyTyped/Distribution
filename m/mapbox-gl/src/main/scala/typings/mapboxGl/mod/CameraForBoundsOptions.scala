package typings.mapboxGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraForBoundsOptions extends CameraOptions {
  var maxZoom: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[PointLike] = js.undefined
  var padding: js.UndefOr[Double | PaddingOptions] = js.undefined
}

object CameraForBoundsOptions {
  @scala.inline
  def apply(
    around: LngLatLike = null,
    bearing: js.UndefOr[Double] = js.undefined,
    center: LngLatLike = null,
    maxZoom: js.UndefOr[Double] = js.undefined,
    offset: PointLike = null,
    padding: Double | PaddingOptions = null,
    pitch: js.UndefOr[Double] = js.undefined,
    zoom: js.UndefOr[Double] = js.undefined
  ): CameraForBoundsOptions = {
    val __obj = js.Dynamic.literal()
    if (around != null) __obj.updateDynamic("around")(around.asInstanceOf[js.Any])
    if (!js.isUndefined(bearing)) __obj.updateDynamic("bearing")(bearing.get.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (!js.isUndefined(maxZoom)) __obj.updateDynamic("maxZoom")(maxZoom.get.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(pitch)) __obj.updateDynamic("pitch")(pitch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoom)) __obj.updateDynamic("zoom")(zoom.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraForBoundsOptions]
  }
}

