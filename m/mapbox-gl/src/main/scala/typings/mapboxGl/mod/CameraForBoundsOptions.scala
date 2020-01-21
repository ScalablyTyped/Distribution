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
    bearing: Int | Double = null,
    center: LngLatLike = null,
    maxZoom: Int | Double = null,
    offset: PointLike = null,
    padding: Double | PaddingOptions = null,
    pitch: Int | Double = null,
    zoom: Int | Double = null
  ): CameraForBoundsOptions = {
    val __obj = js.Dynamic.literal()
    if (around != null) __obj.updateDynamic("around")(around.asInstanceOf[js.Any])
    if (bearing != null) __obj.updateDynamic("bearing")(bearing.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (pitch != null) __obj.updateDynamic("pitch")(pitch.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraForBoundsOptions]
  }
}

