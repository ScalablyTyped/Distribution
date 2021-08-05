package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/createPalette.TypeAction> */
trait PartialTypeAction extends StObject {
  
  var active: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[String] = js.undefined
  
  var disabledBackground: js.UndefOr[String] = js.undefined
  
  var hover: js.UndefOr[String] = js.undefined
  
  var hoverOpacity: js.UndefOr[Double] = js.undefined
  
  var selected: js.UndefOr[String] = js.undefined
}
object PartialTypeAction {
  
  inline def apply(): PartialTypeAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTypeAction]
  }
  
  extension [Self <: PartialTypeAction](x: Self) {
    
    inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledBackground(value: String): Self = StObject.set(x, "disabledBackground", value.asInstanceOf[js.Any])
    
    inline def setDisabledBackgroundUndefined: Self = StObject.set(x, "disabledBackground", js.undefined)
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setHover(value: String): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverOpacity(value: Double): Self = StObject.set(x, "hoverOpacity", value.asInstanceOf[js.Any])
    
    inline def setHoverOpacityUndefined: Self = StObject.set(x, "hoverOpacity", js.undefined)
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    inline def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
  }
}
