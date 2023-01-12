package typings.materialUiLab.anon

import typings.materialUiLab.materialUiLabBooleans.`false`
import typings.materialUiLab.materialUiLabStrings.circle
import typings.materialUiLab.materialUiLabStrings.pulse
import typings.materialUiLab.materialUiLabStrings.rect
import typings.materialUiLab.materialUiLabStrings.text
import typings.materialUiLab.materialUiLabStrings.wave
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animation extends StObject {
  
  var animation: js.UndefOr[pulse | wave | `false`] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var height: js.UndefOr[Double | String] = js.undefined
  
  var variant: js.UndefOr[text | rect | circle] = js.undefined
  
  var width: js.UndefOr[Double | String] = js.undefined
}
object Animation {
  
  inline def apply(): Animation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Animation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Animation] (val x: Self) extends AnyVal {
    
    inline def setAnimation(value: pulse | wave | `false`): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setVariant(value: text | rect | circle): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
