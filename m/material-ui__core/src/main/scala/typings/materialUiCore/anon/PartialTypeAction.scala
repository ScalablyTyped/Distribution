package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/createPalette.TypeAction> */
@js.native
trait PartialTypeAction extends js.Object {
  
  var active: js.UndefOr[String] = js.native
  
  var disabled: js.UndefOr[String] = js.native
  
  var disabledBackground: js.UndefOr[String] = js.native
  
  var hover: js.UndefOr[String] = js.native
  
  var hoverOpacity: js.UndefOr[Double] = js.native
  
  var selected: js.UndefOr[String] = js.native
}
object PartialTypeAction {
  
  @scala.inline
  def apply(): PartialTypeAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTypeAction]
  }
  
  @scala.inline
  implicit class PartialTypeActionOps[Self <: PartialTypeAction] (val x: Self) extends AnyVal {
    
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
    def setActive(value: String): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setDisabled(value: String): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDisabledBackground(value: String): Self = this.set("disabledBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledBackground: Self = this.set("disabledBackground", js.undefined)
    
    @scala.inline
    def setHover(value: String): Self = this.set("hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHover: Self = this.set("hover", js.undefined)
    
    @scala.inline
    def setHoverOpacity(value: Double): Self = this.set("hoverOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverOpacity: Self = this.set("hoverOpacity", js.undefined)
    
    @scala.inline
    def setSelected(value: String): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
  }
}
