package typings.instagramPrivateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cropcenter extends js.Object {
  var crop_center: js.Tuple2[Double, Double]
  var crop_original_size: js.Tuple2[Double, Double]
  var crop_zoom: Double
}

object Cropcenter {
  @scala.inline
  def apply(
    crop_center: js.Tuple2[Double, Double],
    crop_original_size: js.Tuple2[Double, Double],
    crop_zoom: Double
  ): Cropcenter = {
    val __obj = js.Dynamic.literal(crop_center = crop_center.asInstanceOf[js.Any], crop_original_size = crop_original_size.asInstanceOf[js.Any], crop_zoom = crop_zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cropcenter]
  }
}

