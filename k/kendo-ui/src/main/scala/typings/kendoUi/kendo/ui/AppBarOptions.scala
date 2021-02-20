package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppBarOptions extends StObject {
  
  var items: js.UndefOr[js.Array[AppBarItem]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var position: js.UndefOr[String] = js.native
  
  var positionMode: js.UndefOr[String] = js.native
  
  var resize: js.UndefOr[js.Function1[/* e */ AppBarResizeEvent, Unit]] = js.native
  
  var themeColor: js.UndefOr[String] = js.native
}
object AppBarOptions {
  
  @scala.inline
  def apply(): AppBarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppBarOptions]
  }
  
  @scala.inline
  implicit class AppBarOptionsMutableBuilder[Self <: AppBarOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[AppBarItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: AppBarItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionMode(value: String): Self = StObject.set(x, "positionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionModeUndefined: Self = StObject.set(x, "positionMode", js.undefined)
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setResize(value: /* e */ AppBarResizeEvent => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    @scala.inline
    def setThemeColor(value: String): Self = StObject.set(x, "themeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeColorUndefined: Self = StObject.set(x, "themeColor", js.undefined)
  }
}
