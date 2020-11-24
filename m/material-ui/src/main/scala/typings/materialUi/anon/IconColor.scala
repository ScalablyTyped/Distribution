package typings.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IconColor extends js.Object {
  
  var backgroundColor: js.UndefOr[String] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var hoverColor: js.UndefOr[String] = js.native
  
  var iconColor: js.UndefOr[String] = js.native
  
  var menuHoverColor: js.UndefOr[String] = js.native
  
  var separatorColor: js.UndefOr[String] = js.native
  
  var titleFontSize: js.UndefOr[Double] = js.native
}
object IconColor {
  
  @scala.inline
  def apply(): IconColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconColor]
  }
  
  @scala.inline
  implicit class IconColorOps[Self <: IconColor] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHoverColor(value: String): Self = this.set("hoverColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverColor: Self = this.set("hoverColor", js.undefined)
    
    @scala.inline
    def setIconColor(value: String): Self = this.set("iconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconColor: Self = this.set("iconColor", js.undefined)
    
    @scala.inline
    def setMenuHoverColor(value: String): Self = this.set("menuHoverColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuHoverColor: Self = this.set("menuHoverColor", js.undefined)
    
    @scala.inline
    def setSeparatorColor(value: String): Self = this.set("separatorColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparatorColor: Self = this.set("separatorColor", js.undefined)
    
    @scala.inline
    def setTitleFontSize(value: Double): Self = this.set("titleFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleFontSize: Self = this.set("titleFontSize", js.undefined)
  }
}
