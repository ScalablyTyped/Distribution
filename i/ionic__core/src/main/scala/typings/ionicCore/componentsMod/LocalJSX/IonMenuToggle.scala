package typings.ionicCore.componentsMod.LocalJSX

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonMenuToggle extends StObject {
  
  /**
    * Automatically hides the content when the corresponding menu is not active.  By default, it's `true`. Change it to `false` in order to keep `ion-menu-toggle` always visible regardless the state of the menu.
    */
  var autoHide: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional property that maps to a Menu's `menuId` prop. Can also be `start` or `end` for the menu side. This is used to find the correct menu to toggle.  If this property is not used, `ion-menu-toggle` will toggle the first menu that is active.
    */
  var menu: js.UndefOr[String] = js.undefined
}
object IonMenuToggle {
  
  inline def apply(): IonMenuToggle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonMenuToggle]
  }
  
  extension [Self <: IonMenuToggle](x: Self) {
    
    inline def setAutoHide(value: Boolean): Self = StObject.set(x, "autoHide", value.asInstanceOf[js.Any])
    
    inline def setAutoHideUndefined: Self = StObject.set(x, "autoHide", js.undefined)
    
    inline def setMenu(value: String): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
  }
}
