package typings.hummusRecipe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverlayOptions extends js.Object {
  
  var fitHeight: js.UndefOr[Boolean] = js.native
  
  var fitWidth: js.UndefOr[Boolean] = js.native
  
  var keepAspectRatio: js.UndefOr[Boolean] = js.native
  
  var scale: js.UndefOr[Double] = js.native
}
object OverlayOptions {
  
  @scala.inline
  def apply(): OverlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverlayOptions]
  }
  
  @scala.inline
  implicit class OverlayOptionsOps[Self <: OverlayOptions] (val x: Self) extends AnyVal {
    
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
    def setFitHeight(value: Boolean): Self = this.set("fitHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFitHeight: Self = this.set("fitHeight", js.undefined)
    
    @scala.inline
    def setFitWidth(value: Boolean): Self = this.set("fitWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFitWidth: Self = this.set("fitWidth", js.undefined)
    
    @scala.inline
    def setKeepAspectRatio(value: Boolean): Self = this.set("keepAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepAspectRatio: Self = this.set("keepAspectRatio", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
  }
}
