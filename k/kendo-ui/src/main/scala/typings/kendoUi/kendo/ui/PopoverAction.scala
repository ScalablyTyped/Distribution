package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopoverAction extends StObject {
  
  var click: js.UndefOr[js.Function] = js.undefined
  
  var iconClass: js.UndefOr[js.Function] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object PopoverAction {
  
  inline def apply(): PopoverAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopoverAction]
  }
  
  extension [Self <: PopoverAction](x: Self) {
    
    inline def setClick(value: js.Function): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    inline def setIconClass(value: js.Function): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
