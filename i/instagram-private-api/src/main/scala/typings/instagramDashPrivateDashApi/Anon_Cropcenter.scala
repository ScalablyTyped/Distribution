package typings.instagramDashPrivateDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cropcenter extends js.Object {
  var crop_center: js.Tuple2[Double, Double]
  var crop_original_size: js.Tuple2[Double, Double]
  var crop_zoom: Double
}

object Anon_Cropcenter {
  @scala.inline
  def apply(
    crop_center: js.Tuple2[Double, Double],
    crop_original_size: js.Tuple2[Double, Double],
    crop_zoom: Double
  ): Anon_Cropcenter = {
    val __obj = js.Dynamic.literal(crop_center = crop_center, crop_original_size = crop_original_size, crop_zoom = crop_zoom)
  
    __obj.asInstanceOf[Anon_Cropcenter]
  }
}

