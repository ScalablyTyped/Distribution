package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pages extends js.Object {
  
  var `full-color`: js.UndefOr[Double] = js.native
  
  var monochrome: js.UndefOr[Double] = js.native
}
object Pages {
  
  @scala.inline
  def apply(): Pages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pages]
  }
  
  @scala.inline
  implicit class PagesOps[Self <: Pages] (val x: Self) extends AnyVal {
    
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
    def `setFull-color`(value: Double): Self = this.set("full-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFull-color`: Self = this.set("full-color", js.undefined)
    
    @scala.inline
    def setMonochrome(value: Double): Self = this.set("monochrome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonochrome: Self = this.set("monochrome", js.undefined)
  }
}
