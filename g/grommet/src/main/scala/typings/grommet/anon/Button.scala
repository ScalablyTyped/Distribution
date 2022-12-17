package typings.grommet.anon

import typings.grommet.componentsBoxMod.BoxProps
import typings.grommet.themesBaseMod.ButtonType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Button extends StObject {
  
  var button: js.UndefOr[ButtonType | String] = js.undefined
  
  var container: js.UndefOr[BoxProps | `8`] = js.undefined
  
  var controls: js.UndefOr[AlignDirection] = js.undefined
  
  var icons: js.UndefOr[ColorNext] = js.undefined
}
object Button {
  
  inline def apply(): Button = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Button]
  }
  
  extension [Self <: Button](x: Self) {
    
    inline def setButton(value: ButtonType | String): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    inline def setContainer(value: BoxProps | `8`): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setControls(value: AlignDirection): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    inline def setIcons(value: ColorNext): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
  }
}
