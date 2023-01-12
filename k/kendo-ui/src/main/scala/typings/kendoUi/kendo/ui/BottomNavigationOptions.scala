package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BottomNavigationOptions extends StObject {
  
  var border: js.UndefOr[Boolean] = js.undefined
  
  var fill: js.UndefOr[String] = js.undefined
  
  var itemFlow: js.UndefOr[String] = js.undefined
  
  var items: js.UndefOr[js.Array[BottomNavigationItem]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var positionMode: js.UndefOr[String] = js.undefined
  
  var select: js.UndefOr[js.Function1[/* e */ BottomNavigationSelectEvent, Unit]] = js.undefined
  
  var shadow: js.UndefOr[Boolean] = js.undefined
  
  var template: js.UndefOr[String | js.Function] = js.undefined
  
  var themeColor: js.UndefOr[String] = js.undefined
}
object BottomNavigationOptions {
  
  inline def apply(): BottomNavigationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BottomNavigationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BottomNavigationOptions] (val x: Self) extends AnyVal {
    
    inline def setBorder(value: Boolean): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setItemFlow(value: String): Self = StObject.set(x, "itemFlow", value.asInstanceOf[js.Any])
    
    inline def setItemFlowUndefined: Self = StObject.set(x, "itemFlow", js.undefined)
    
    inline def setItems(value: js.Array[BottomNavigationItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: BottomNavigationItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPositionMode(value: String): Self = StObject.set(x, "positionMode", value.asInstanceOf[js.Any])
    
    inline def setPositionModeUndefined: Self = StObject.set(x, "positionMode", js.undefined)
    
    inline def setSelect(value: /* e */ BottomNavigationSelectEvent => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setShadow(value: Boolean): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    inline def setTemplate(value: String | js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setThemeColor(value: String): Self = StObject.set(x, "themeColor", value.asInstanceOf[js.Any])
    
    inline def setThemeColorUndefined: Self = StObject.set(x, "themeColor", js.undefined)
  }
}
