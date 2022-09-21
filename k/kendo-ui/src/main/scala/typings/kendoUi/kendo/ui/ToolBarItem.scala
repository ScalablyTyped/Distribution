package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToolBarItem extends StObject {
  
  var attributes: js.UndefOr[Any] = js.undefined
  
  var buttons: js.UndefOr[js.Array[ToolBarItemButton]] = js.undefined
  
  var click: js.UndefOr[js.Function] = js.undefined
  
  var enable: js.UndefOr[Boolean] = js.undefined
  
  var group: js.UndefOr[String] = js.undefined
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  var icon: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var imageUrl: js.UndefOr[String] = js.undefined
  
  var menuButtons: js.UndefOr[js.Array[ToolBarItemMenuButton]] = js.undefined
  
  var overflow: js.UndefOr[String] = js.undefined
  
  var overflowTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var primary: js.UndefOr[Boolean] = js.undefined
  
  var selected: js.UndefOr[Boolean] = js.undefined
  
  var showIcon: js.UndefOr[String] = js.undefined
  
  var showText: js.UndefOr[String] = js.undefined
  
  var spriteCssClass: js.UndefOr[String] = js.undefined
  
  var template: js.UndefOr[String | js.Function] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var togglable: js.UndefOr[Boolean] = js.undefined
  
  var toggle: js.UndefOr[js.Function] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object ToolBarItem {
  
  inline def apply(): ToolBarItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolBarItem]
  }
  
  extension [Self <: ToolBarItem](x: Self) {
    
    inline def setAttributes(value: Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setButtons(value: js.Array[ToolBarItemButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: ToolBarItemButton*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setClick(value: js.Function): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    inline def setMenuButtons(value: js.Array[ToolBarItemMenuButton]): Self = StObject.set(x, "menuButtons", value.asInstanceOf[js.Any])
    
    inline def setMenuButtonsUndefined: Self = StObject.set(x, "menuButtons", js.undefined)
    
    inline def setMenuButtonsVarargs(value: ToolBarItemMenuButton*): Self = StObject.set(x, "menuButtons", js.Array(value*))
    
    inline def setOverflow(value: String): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    inline def setOverflowTemplate(value: String | js.Function): Self = StObject.set(x, "overflowTemplate", value.asInstanceOf[js.Any])
    
    inline def setOverflowTemplateUndefined: Self = StObject.set(x, "overflowTemplate", js.undefined)
    
    inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
    
    inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setShowIcon(value: String): Self = StObject.set(x, "showIcon", value.asInstanceOf[js.Any])
    
    inline def setShowIconUndefined: Self = StObject.set(x, "showIcon", js.undefined)
    
    inline def setShowText(value: String): Self = StObject.set(x, "showText", value.asInstanceOf[js.Any])
    
    inline def setShowTextUndefined: Self = StObject.set(x, "showText", js.undefined)
    
    inline def setSpriteCssClass(value: String): Self = StObject.set(x, "spriteCssClass", value.asInstanceOf[js.Any])
    
    inline def setSpriteCssClassUndefined: Self = StObject.set(x, "spriteCssClass", js.undefined)
    
    inline def setTemplate(value: String | js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTogglable(value: Boolean): Self = StObject.set(x, "togglable", value.asInstanceOf[js.Any])
    
    inline def setTogglableUndefined: Self = StObject.set(x, "togglable", js.undefined)
    
    inline def setToggle(value: js.Function): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
    
    inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
