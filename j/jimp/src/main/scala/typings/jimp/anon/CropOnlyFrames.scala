package typings.jimp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CropOnlyFrames extends js.Object {
  
  var cropOnlyFrames: js.UndefOr[Boolean] = js.native
  
  var cropSymmetric: js.UndefOr[Boolean] = js.native
  
  var leaveBorder: js.UndefOr[Double] = js.native
  
  var tolerance: js.UndefOr[Double] = js.native
}
object CropOnlyFrames {
  
  @scala.inline
  def apply(): CropOnlyFrames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CropOnlyFrames]
  }
  
  @scala.inline
  implicit class CropOnlyFramesOps[Self <: CropOnlyFrames] (val x: Self) extends AnyVal {
    
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
    def setCropOnlyFrames(value: Boolean): Self = this.set("cropOnlyFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCropOnlyFrames: Self = this.set("cropOnlyFrames", js.undefined)
    
    @scala.inline
    def setCropSymmetric(value: Boolean): Self = this.set("cropSymmetric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCropSymmetric: Self = this.set("cropSymmetric", js.undefined)
    
    @scala.inline
    def setLeaveBorder(value: Double): Self = this.set("leaveBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeaveBorder: Self = this.set("leaveBorder", js.undefined)
    
    @scala.inline
    def setTolerance(value: Double): Self = this.set("tolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTolerance: Self = this.set("tolerance", js.undefined)
  }
}
