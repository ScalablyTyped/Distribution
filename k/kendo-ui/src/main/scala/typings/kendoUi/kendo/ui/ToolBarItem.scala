package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolBarItem extends StObject {
  
  var attributes: js.UndefOr[js.Any] = js.native
  
  var buttons: js.UndefOr[js.Array[ToolBarItemButton]] = js.native
  
  var click: js.UndefOr[js.Function] = js.native
  
  var enable: js.UndefOr[Boolean] = js.native
  
  var group: js.UndefOr[String] = js.native
  
  var hidden: js.UndefOr[Boolean] = js.native
  
  var icon: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var imageUrl: js.UndefOr[String] = js.native
  
  var menuButtons: js.UndefOr[js.Array[ToolBarItemMenuButton]] = js.native
  
  var overflow: js.UndefOr[String] = js.native
  
  var overflowTemplate: js.UndefOr[String | js.Function] = js.native
  
  var primary: js.UndefOr[Boolean] = js.native
  
  var selected: js.UndefOr[Boolean] = js.native
  
  var showIcon: js.UndefOr[String] = js.native
  
  var showText: js.UndefOr[String] = js.native
  
  var spriteCssClass: js.UndefOr[String] = js.native
  
  var template: js.UndefOr[String | js.Function] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var togglable: js.UndefOr[Boolean] = js.native
  
  var toggle: js.UndefOr[js.Function] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object ToolBarItem {
  
  @scala.inline
  def apply(): ToolBarItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolBarItem]
  }
  
  @scala.inline
  implicit class ToolBarItemMutableBuilder[Self <: ToolBarItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: js.Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setButtons(value: js.Array[ToolBarItemButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    @scala.inline
    def setButtonsVarargs(value: ToolBarItemButton*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    @scala.inline
    def setClick(value: js.Function): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    @scala.inline
    def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    @scala.inline
    def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    @scala.inline
    def setMenuButtons(value: js.Array[ToolBarItemMenuButton]): Self = StObject.set(x, "menuButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuButtonsUndefined: Self = StObject.set(x, "menuButtons", js.undefined)
    
    @scala.inline
    def setMenuButtonsVarargs(value: ToolBarItemMenuButton*): Self = StObject.set(x, "menuButtons", js.Array(value :_*))
    
    @scala.inline
    def setOverflow(value: String): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowTemplate(value: String | js.Function): Self = StObject.set(x, "overflowTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowTemplateUndefined: Self = StObject.set(x, "overflowTemplate", js.undefined)
    
    @scala.inline
    def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
    
    @scala.inline
    def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setShowIcon(value: String): Self = StObject.set(x, "showIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowIconUndefined: Self = StObject.set(x, "showIcon", js.undefined)
    
    @scala.inline
    def setShowText(value: String): Self = StObject.set(x, "showText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTextUndefined: Self = StObject.set(x, "showText", js.undefined)
    
    @scala.inline
    def setSpriteCssClass(value: String): Self = StObject.set(x, "spriteCssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpriteCssClassUndefined: Self = StObject.set(x, "spriteCssClass", js.undefined)
    
    @scala.inline
    def setTemplate(value: String | js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTogglable(value: Boolean): Self = StObject.set(x, "togglable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTogglableUndefined: Self = StObject.set(x, "togglable", js.undefined)
    
    @scala.inline
    def setToggle(value: js.Function): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
