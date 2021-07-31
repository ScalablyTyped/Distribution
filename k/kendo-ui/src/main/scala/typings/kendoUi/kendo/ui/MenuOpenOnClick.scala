package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuOpenOnClick extends StObject {
  
  var rootMenuItems: js.UndefOr[Boolean] = js.undefined
  
  var subMenuItems: js.UndefOr[Boolean] = js.undefined
}
object MenuOpenOnClick {
  
  @scala.inline
  def apply(): MenuOpenOnClick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuOpenOnClick]
  }
  
  @scala.inline
  implicit class MenuOpenOnClickMutableBuilder[Self <: MenuOpenOnClick] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRootMenuItems(value: Boolean): Self = StObject.set(x, "rootMenuItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootMenuItemsUndefined: Self = StObject.set(x, "rootMenuItems", js.undefined)
    
    @scala.inline
    def setSubMenuItems(value: Boolean): Self = StObject.set(x, "subMenuItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubMenuItemsUndefined: Self = StObject.set(x, "subMenuItems", js.undefined)
  }
}
