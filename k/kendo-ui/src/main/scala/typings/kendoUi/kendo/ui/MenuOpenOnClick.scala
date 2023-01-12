package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuOpenOnClick extends StObject {
  
  var rootMenuItems: js.UndefOr[Boolean] = js.undefined
  
  var subMenuItems: js.UndefOr[Boolean] = js.undefined
}
object MenuOpenOnClick {
  
  inline def apply(): MenuOpenOnClick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuOpenOnClick]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MenuOpenOnClick] (val x: Self) extends AnyVal {
    
    inline def setRootMenuItems(value: Boolean): Self = StObject.set(x, "rootMenuItems", value.asInstanceOf[js.Any])
    
    inline def setRootMenuItemsUndefined: Self = StObject.set(x, "rootMenuItems", js.undefined)
    
    inline def setSubMenuItems(value: Boolean): Self = StObject.set(x, "subMenuItems", value.asInstanceOf[js.Any])
    
    inline def setSubMenuItemsUndefined: Self = StObject.set(x, "subMenuItems", js.undefined)
  }
}
