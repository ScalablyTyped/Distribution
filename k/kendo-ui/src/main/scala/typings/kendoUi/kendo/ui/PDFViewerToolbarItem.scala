package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFViewerToolbarItem extends js.Object {
  
  var attributes: js.UndefOr[js.Any] = js.native
  
  var click: js.UndefOr[js.Function] = js.native
  
  var command: js.UndefOr[String] = js.native
  
  var enable: js.UndefOr[Boolean] = js.native
  
  var hidden: js.UndefOr[Boolean] = js.native
  
  var icon: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var imageUrl: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var overflow: js.UndefOr[String] = js.native
  
  var primary: js.UndefOr[Boolean] = js.native
  
  var showIcon: js.UndefOr[String] = js.native
  
  var showText: js.UndefOr[String] = js.native
  
  var spriteCssClass: js.UndefOr[String] = js.native
  
  var template: js.UndefOr[String | js.Function] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var togglable: js.UndefOr[Boolean] = js.native
  
  var toggle: js.UndefOr[js.Function] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object PDFViewerToolbarItem {
  
  @scala.inline
  def apply(): PDFViewerToolbarItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFViewerToolbarItem]
  }
  
  @scala.inline
  implicit class PDFViewerToolbarItemOps[Self <: PDFViewerToolbarItem] (val x: Self) extends AnyVal {
    
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
    def setAttributes(value: js.Any): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setClick(value: js.Function): Self = this.set("click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    
    @scala.inline
    def setCommand(value: String): Self = this.set("command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommand: Self = this.set("command", js.undefined)
    
    @scala.inline
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageUrl: Self = this.set("imageUrl", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOverflow(value: String): Self = this.set("overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflow: Self = this.set("overflow", js.undefined)
    
    @scala.inline
    def setPrimary(value: Boolean): Self = this.set("primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
    
    @scala.inline
    def setShowIcon(value: String): Self = this.set("showIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowIcon: Self = this.set("showIcon", js.undefined)
    
    @scala.inline
    def setShowText(value: String): Self = this.set("showText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowText: Self = this.set("showText", js.undefined)
    
    @scala.inline
    def setSpriteCssClass(value: String): Self = this.set("spriteCssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpriteCssClass: Self = this.set("spriteCssClass", js.undefined)
    
    @scala.inline
    def setTemplate(value: String | js.Function): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTogglable(value: Boolean): Self = this.set("togglable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTogglable: Self = this.set("togglable", js.undefined)
    
    @scala.inline
    def setToggle(value: js.Function): Self = this.set("toggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToggle: Self = this.set("toggle", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
