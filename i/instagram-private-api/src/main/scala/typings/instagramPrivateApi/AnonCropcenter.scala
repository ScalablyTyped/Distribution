package typings.instagramPrivateApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCropcenter extends js.Object {
  var crop_center: js.Tuple2[Double, Double]
  var crop_original_size: js.Tuple2[Double, Double]
  var crop_zoom: Double
}

object AnonCropcenter {
  @scala.inline
  def apply(
    crop_center: js.Tuple2[Double, Double],
    crop_original_size: js.Tuple2[Double, Double],
    crop_zoom: Double
  ): AnonCropcenter = {
    val __obj = js.Dynamic.literal(crop_center = crop_center.asInstanceOf[js.Any], crop_original_size = crop_original_size.asInstanceOf[js.Any], crop_zoom = crop_zoom.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCropcenter]
  }
}

