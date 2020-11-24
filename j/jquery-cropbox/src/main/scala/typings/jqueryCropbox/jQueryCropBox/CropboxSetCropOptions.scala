package typings.jqueryCropbox.jQueryCropBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CropboxSetCropOptions extends js.Object {
  
  var cropH: Double = js.native
  
  var cropW: Double = js.native
  
  var cropX: Double = js.native
  
  var cropY: Double = js.native
}
object CropboxSetCropOptions {
  
  @scala.inline
  def apply(cropH: Double, cropW: Double, cropX: Double, cropY: Double): CropboxSetCropOptions = {
    val __obj = js.Dynamic.literal(cropH = cropH.asInstanceOf[js.Any], cropW = cropW.asInstanceOf[js.Any], cropX = cropX.asInstanceOf[js.Any], cropY = cropY.asInstanceOf[js.Any])
    __obj.asInstanceOf[CropboxSetCropOptions]
  }
  
  @scala.inline
  implicit class CropboxSetCropOptionsOps[Self <: CropboxSetCropOptions] (val x: Self) extends AnyVal {
    
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
    def setCropH(value: Double): Self = this.set("cropH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCropW(value: Double): Self = this.set("cropW", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCropX(value: Double): Self = this.set("cropX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCropY(value: Double): Self = this.set("cropY", value.asInstanceOf[js.Any])
  }
}
