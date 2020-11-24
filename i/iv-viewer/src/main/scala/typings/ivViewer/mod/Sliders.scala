package typings.ivViewer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sliders extends js.Object {
  
  var imageSlider: js.UndefOr[Slider] = js.native
  
  var snapSlider: js.UndefOr[Slider] = js.native
  
  var zoomSlider: js.UndefOr[Slider] = js.native
}
object Sliders {
  
  @scala.inline
  def apply(): Sliders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sliders]
  }
  
  @scala.inline
  implicit class SlidersOps[Self <: Sliders] (val x: Self) extends AnyVal {
    
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
    def setImageSlider(value: Slider): Self = this.set("imageSlider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageSlider: Self = this.set("imageSlider", js.undefined)
    
    @scala.inline
    def setSnapSlider(value: Slider): Self = this.set("snapSlider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapSlider: Self = this.set("snapSlider", js.undefined)
    
    @scala.inline
    def setZoomSlider(value: Slider): Self = this.set("zoomSlider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomSlider: Self = this.set("zoomSlider", js.undefined)
  }
}
