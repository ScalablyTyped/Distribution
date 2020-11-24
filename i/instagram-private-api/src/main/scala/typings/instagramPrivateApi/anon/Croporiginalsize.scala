package typings.instagramPrivateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Croporiginalsize extends js.Object {
  
  var crop_center: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  
  var crop_original_size: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  
  var crop_zoom: js.UndefOr[Double | String] = js.native
}
object Croporiginalsize {
  
  @scala.inline
  def apply(): Croporiginalsize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Croporiginalsize]
  }
  
  @scala.inline
  implicit class CroporiginalsizeOps[Self <: Croporiginalsize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCrop_center(value: js.Tuple2[Double, Double]): Self = this.set("crop_center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrop_center: Self = this.set("crop_center", js.undefined)
    
    @scala.inline
    def setCrop_original_size(value: js.Tuple2[Double, Double]): Self = this.set("crop_original_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrop_original_size: Self = this.set("crop_original_size", js.undefined)
    
    @scala.inline
    def setCrop_zoom(value: Double | String): Self = this.set("crop_zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrop_zoom: Self = this.set("crop_zoom", js.undefined)
  }
}
