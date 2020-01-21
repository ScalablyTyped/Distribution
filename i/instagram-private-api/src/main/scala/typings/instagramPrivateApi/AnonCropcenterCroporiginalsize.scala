package typings.instagramPrivateApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCropcenterCroporiginalsize extends js.Object {
  var crop_center: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var crop_original_size: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var crop_zoom: js.UndefOr[Double | String] = js.undefined
}

object AnonCropcenterCroporiginalsize {
  @scala.inline
  def apply(
    crop_center: js.Tuple2[Double, Double] = null,
    crop_original_size: js.Tuple2[Double, Double] = null,
    crop_zoom: Double | String = null
  ): AnonCropcenterCroporiginalsize = {
    val __obj = js.Dynamic.literal()
    if (crop_center != null) __obj.updateDynamic("crop_center")(crop_center.asInstanceOf[js.Any])
    if (crop_original_size != null) __obj.updateDynamic("crop_original_size")(crop_original_size.asInstanceOf[js.Any])
    if (crop_zoom != null) __obj.updateDynamic("crop_zoom")(crop_zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCropcenterCroporiginalsize]
  }
}

