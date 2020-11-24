package typings.leafletLabel.mod

import typings.leaflet.mod.Point_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelOptions extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var clickable: js.UndefOr[Boolean] = js.native
  
  var direction: js.UndefOr[String] = js.native
  
  var noHide: js.UndefOr[Boolean] = js.native
  
  var offset: js.UndefOr[Point_] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
   // 'left' | 'right' | 'auto';
  var pane: js.UndefOr[String] = js.native
  
  var zoomAnimation: js.UndefOr[Boolean] = js.native
}
object LabelOptions {
  
  @scala.inline
  def apply(): LabelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelOptions]
  }
  
  @scala.inline
  implicit class LabelOptionsOps[Self <: LabelOptions] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setClickable(value: Boolean): Self = this.set("clickable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickable: Self = this.set("clickable", js.undefined)
    
    @scala.inline
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setNoHide(value: Boolean): Self = this.set("noHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoHide: Self = this.set("noHide", js.undefined)
    
    @scala.inline
    def setOffset(value: Point_): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setPane(value: String): Self = this.set("pane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePane: Self = this.set("pane", js.undefined)
    
    @scala.inline
    def setZoomAnimation(value: Boolean): Self = this.set("zoomAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomAnimation: Self = this.set("zoomAnimation", js.undefined)
  }
}
