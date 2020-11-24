package typings.instagramPrivateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cropbottom extends js.Object {
  
  var crop_bottom: Double = js.native
  
  var crop_left: Double = js.native
  
  var crop_right: Double = js.native
  
  var crop_top: Double = js.native
}
object Cropbottom {
  
  @scala.inline
  def apply(crop_bottom: Double, crop_left: Double, crop_right: Double, crop_top: Double): Cropbottom = {
    val __obj = js.Dynamic.literal(crop_bottom = crop_bottom.asInstanceOf[js.Any], crop_left = crop_left.asInstanceOf[js.Any], crop_right = crop_right.asInstanceOf[js.Any], crop_top = crop_top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cropbottom]
  }
  
  @scala.inline
  implicit class CropbottomOps[Self <: Cropbottom] (val x: Self) extends AnyVal {
    
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
    def setCrop_bottom(value: Double): Self = this.set("crop_bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrop_left(value: Double): Self = this.set("crop_left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrop_right(value: Double): Self = this.set("crop_right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrop_top(value: Double): Self = this.set("crop_top", value.asInstanceOf[js.Any])
  }
}
