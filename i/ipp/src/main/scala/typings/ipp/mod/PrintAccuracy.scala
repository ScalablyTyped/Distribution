package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrintAccuracy extends js.Object {
  
  var `accuracy-units`: js.UndefOr[AccuracyUnits] = js.native
  
  var `x-accuracy`: js.UndefOr[Double] = js.native
  
  var `y-accuracy`: js.UndefOr[Double] = js.native
  
  var `z-accuracy`: js.UndefOr[Double] = js.native
}
object PrintAccuracy {
  
  @scala.inline
  def apply(): PrintAccuracy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintAccuracy]
  }
  
  @scala.inline
  implicit class PrintAccuracyOps[Self <: PrintAccuracy] (val x: Self) extends AnyVal {
    
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
    def `setAccuracy-units`(value: AccuracyUnits): Self = this.set("accuracy-units", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAccuracy-units`: Self = this.set("accuracy-units", js.undefined)
    
    @scala.inline
    def `setX-accuracy`(value: Double): Self = this.set("x-accuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteX-accuracy`: Self = this.set("x-accuracy", js.undefined)
    
    @scala.inline
    def `setY-accuracy`(value: Double): Self = this.set("y-accuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteY-accuracy`: Self = this.set("y-accuracy", js.undefined)
    
    @scala.inline
    def `setZ-accuracy`(value: Double): Self = this.set("z-accuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteZ-accuracy`: Self = this.set("z-accuracy", js.undefined)
  }
}
