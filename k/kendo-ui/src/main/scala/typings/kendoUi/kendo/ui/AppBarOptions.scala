package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppBarOptions extends StObject {
  
  var items: js.UndefOr[js.Array[AppBarItem]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
  
  var positionMode: js.UndefOr[String] = js.undefined
  
  var resize: js.UndefOr[js.Function1[/* e */ AppBarResizeEvent, Unit]] = js.undefined
  
  var themeColor: js.UndefOr[String] = js.undefined
}
object AppBarOptions {
  
  inline def apply(): AppBarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppBarOptions]
  }
  
  extension [Self <: AppBarOptions](x: Self) {
    
    inline def setItems(value: js.Array[AppBarItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: AppBarItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionMode(value: String): Self = StObject.set(x, "positionMode", value.asInstanceOf[js.Any])
    
    inline def setPositionModeUndefined: Self = StObject.set(x, "positionMode", js.undefined)
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setResize(value: /* e */ AppBarResizeEvent => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction1(value))
    
    inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    inline def setThemeColor(value: String): Self = StObject.set(x, "themeColor", value.asInstanceOf[js.Any])
    
    inline def setThemeColorUndefined: Self = StObject.set(x, "themeColor", js.undefined)
  }
}
