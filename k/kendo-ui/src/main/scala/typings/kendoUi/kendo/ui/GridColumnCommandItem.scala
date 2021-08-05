package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridColumnCommandItem extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var click: js.UndefOr[js.Function] = js.undefined
  
  var iconClass: js.UndefOr[String | GridColumnCommandItemIconClass] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var template: js.UndefOr[String] = js.undefined
  
  var text: js.UndefOr[String | GridColumnCommandItemText] = js.undefined
  
  var visible: js.UndefOr[js.Function] = js.undefined
}
object GridColumnCommandItem {
  
  inline def apply(): GridColumnCommandItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridColumnCommandItem]
  }
  
  extension [Self <: GridColumnCommandItem](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setClick(value: js.Function): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    inline def setIconClass(value: String | GridColumnCommandItemIconClass): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setText(value: String | GridColumnCommandItemText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setVisible(value: js.Function): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
