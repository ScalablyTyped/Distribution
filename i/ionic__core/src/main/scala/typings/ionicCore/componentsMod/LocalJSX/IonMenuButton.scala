package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.ionicCoreStrings.button
import typings.ionicCore.ionicCoreStrings.ios
import typings.ionicCore.ionicCoreStrings.md
import typings.ionicCore.ionicCoreStrings.reset
import typings.ionicCore.ionicCoreStrings.submit
import typings.ionicCore.mod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonMenuButton extends StObject {
  
  /**
    * Automatically hides the menu button when the corresponding menu is not active
    */
  var autoHide: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.undefined
  
  /**
    * If `true`, the user cannot interact with the menu button.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional property that maps to a Menu's `menuId` prop. Can also be `start` or `end` for the menu side. This is used to find the correct menu to toggle
    */
  var menu: js.UndefOr[String] = js.undefined
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  
  /**
    * The type of the button.
    */
  var `type`: js.UndefOr[submit | reset | button] = js.undefined
}
object IonMenuButton {
  
  @scala.inline
  def apply(): IonMenuButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonMenuButton]
  }
  
  @scala.inline
  implicit class IonMenuButtonMutableBuilder[Self <: IonMenuButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoHide(value: Boolean): Self = StObject.set(x, "autoHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoHideUndefined: Self = StObject.set(x, "autoHide", js.undefined)
    
    @scala.inline
    def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setMenu(value: String): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
    
    @scala.inline
    def setMode(value: ios | md): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setType(value: submit | reset | button): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
