package typings.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseIconOptions extends LayerOptions {
  
  var className: js.UndefOr[String] = js.native
  
  var iconAnchor: js.UndefOr[PointExpression] = js.native
  
  var iconRetinaUrl: js.UndefOr[String] = js.native
  
  var iconSize: js.UndefOr[PointExpression] = js.native
  
  var iconUrl: js.UndefOr[String] = js.native
  
  var popupAnchor: js.UndefOr[PointExpression] = js.native
  
  var shadowAnchor: js.UndefOr[PointExpression] = js.native
  
  var shadowRetinaUrl: js.UndefOr[String] = js.native
  
  var shadowSize: js.UndefOr[PointExpression] = js.native
  
  var shadowUrl: js.UndefOr[String] = js.native
  
  var tooltipAnchor: js.UndefOr[PointExpression] = js.native
}
object BaseIconOptions {
  
  @scala.inline
  def apply(): BaseIconOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseIconOptions]
  }
  
  @scala.inline
  implicit class BaseIconOptionsOps[Self <: BaseIconOptions] (val x: Self) extends AnyVal {
    
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
    def setIconAnchor(value: PointExpression): Self = this.set("iconAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconAnchor: Self = this.set("iconAnchor", js.undefined)
    
    @scala.inline
    def setIconRetinaUrl(value: String): Self = this.set("iconRetinaUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconRetinaUrl: Self = this.set("iconRetinaUrl", js.undefined)
    
    @scala.inline
    def setIconSize(value: PointExpression): Self = this.set("iconSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconSize: Self = this.set("iconSize", js.undefined)
    
    @scala.inline
    def setIconUrl(value: String): Self = this.set("iconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconUrl: Self = this.set("iconUrl", js.undefined)
    
    @scala.inline
    def setPopupAnchor(value: PointExpression): Self = this.set("popupAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopupAnchor: Self = this.set("popupAnchor", js.undefined)
    
    @scala.inline
    def setShadowAnchor(value: PointExpression): Self = this.set("shadowAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowAnchor: Self = this.set("shadowAnchor", js.undefined)
    
    @scala.inline
    def setShadowRetinaUrl(value: String): Self = this.set("shadowRetinaUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowRetinaUrl: Self = this.set("shadowRetinaUrl", js.undefined)
    
    @scala.inline
    def setShadowSize(value: PointExpression): Self = this.set("shadowSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowSize: Self = this.set("shadowSize", js.undefined)
    
    @scala.inline
    def setShadowUrl(value: String): Self = this.set("shadowUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowUrl: Self = this.set("shadowUrl", js.undefined)
    
    @scala.inline
    def setTooltipAnchor(value: PointExpression): Self = this.set("tooltipAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipAnchor: Self = this.set("tooltipAnchor", js.undefined)
  }
}
