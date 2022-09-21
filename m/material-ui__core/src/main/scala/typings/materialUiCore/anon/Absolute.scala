package typings.materialUiCore.anon

import typings.materialUiCore.materialUiCoreStrings.fullWidth
import typings.materialUiCore.materialUiCoreStrings.horizontal
import typings.materialUiCore.materialUiCoreStrings.inset
import typings.materialUiCore.materialUiCoreStrings.middle
import typings.materialUiCore.materialUiCoreStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Absolute extends StObject {
  
  /**
    * Absolutely position the element.
    */
  var absolute: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, a vertical divider will have the correct height when used in flex container.
    * (By default, a vertical divider will have a calculated height of `0px` if it is the child of a flex container.)
    */
  var flexItem: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the divider will have a lighter color.
    */
  var light: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The divider orientation.
    */
  var orientation: js.UndefOr[horizontal | vertical] = js.undefined
  
  /**
    * The variant to use.
    */
  var variant: js.UndefOr[fullWidth | inset | middle] = js.undefined
}
object Absolute {
  
  inline def apply(): Absolute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Absolute]
  }
  
  extension [Self <: Absolute](x: Self) {
    
    inline def setAbsolute(value: Boolean): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
    
    inline def setAbsoluteUndefined: Self = StObject.set(x, "absolute", js.undefined)
    
    inline def setFlexItem(value: Boolean): Self = StObject.set(x, "flexItem", value.asInstanceOf[js.Any])
    
    inline def setFlexItemUndefined: Self = StObject.set(x, "flexItem", js.undefined)
    
    inline def setLight(value: Boolean): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    inline def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
    
    inline def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setVariant(value: fullWidth | inset | middle): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
