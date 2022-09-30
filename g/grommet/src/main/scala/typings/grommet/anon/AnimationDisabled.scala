package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationDisabled extends StObject {
  
  var animation: js.UndefOr[`29`] = js.undefined
  
  var disabled: js.UndefOr[`30`] = js.undefined
  
  var icons: js.UndefOr[Current] = js.undefined
}
object AnimationDisabled {
  
  inline def apply(): AnimationDisabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationDisabled]
  }
  
  extension [Self <: AnimationDisabled](x: Self) {
    
    inline def setAnimation(value: `29`): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setDisabled(value: `30`): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setIcons(value: Current): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
  }
}
