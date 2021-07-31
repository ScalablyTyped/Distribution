package typings.ionicCore.componentsMod.Components

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonMenuToggle extends StObject {
  
  /**
    * Automatically hides the content when the corresponding menu is not active.  By default, it's `true`. Change it to `false` in order to keep `ion-menu-toggle` always visible regardless the state of the menu.
    */
  var autoHide: Boolean
  
  /**
    * Optional property that maps to a Menu's `menuId` prop. Can also be `start` or `end` for the menu side. This is used to find the correct menu to toggle.  If this property is not used, `ion-menu-toggle` will toggle the first menu that is active.
    */
  var menu: js.UndefOr[String] = js.undefined
}
object IonMenuToggle {
  
  @scala.inline
  def apply(autoHide: Boolean): IonMenuToggle = {
    val __obj = js.Dynamic.literal(autoHide = autoHide.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonMenuToggle]
  }
  
  @scala.inline
  implicit class IonMenuToggleMutableBuilder[Self <: IonMenuToggle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoHide(value: Boolean): Self = StObject.set(x, "autoHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenu(value: String): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
  }
}
