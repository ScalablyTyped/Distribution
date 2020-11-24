package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrinterVolumeSupported extends js.Object {
  
  var `x-dimension`: js.UndefOr[Double] = js.native
  
  var `y-dimension`: js.UndefOr[Double] = js.native
  
  var `z-dimension`: js.UndefOr[Double] = js.native
}
object PrinterVolumeSupported {
  
  @scala.inline
  def apply(): PrinterVolumeSupported = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrinterVolumeSupported]
  }
  
  @scala.inline
  implicit class PrinterVolumeSupportedOps[Self <: PrinterVolumeSupported] (val x: Self) extends AnyVal {
    
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
    def `setX-dimension`(value: Double): Self = this.set("x-dimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteX-dimension`: Self = this.set("x-dimension", js.undefined)
    
    @scala.inline
    def `setY-dimension`(value: Double): Self = this.set("y-dimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteY-dimension`: Self = this.set("y-dimension", js.undefined)
    
    @scala.inline
    def `setZ-dimension`(value: Double): Self = this.set("z-dimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteZ-dimension`: Self = this.set("z-dimension", js.undefined)
  }
}
