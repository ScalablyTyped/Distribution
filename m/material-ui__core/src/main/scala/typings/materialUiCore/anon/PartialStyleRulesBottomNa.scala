package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/BottomNavigationAction.BottomNavigationActionClassKey>> */
trait PartialStyleRulesBottomNa extends StObject {
  
  var iconOnly: js.UndefOr[CSSProperties] = js.undefined
  
  var label: js.UndefOr[CSSProperties] = js.undefined
  
  var root: js.UndefOr[CSSProperties] = js.undefined
  
  var selected: js.UndefOr[CSSProperties] = js.undefined
  
  var wrapper: js.UndefOr[CSSProperties] = js.undefined
}
object PartialStyleRulesBottomNa {
  
  inline def apply(): PartialStyleRulesBottomNa = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesBottomNa]
  }
  
  extension [Self <: PartialStyleRulesBottomNa](x: Self) {
    
    inline def setIconOnly(value: CSSProperties): Self = StObject.set(x, "iconOnly", value.asInstanceOf[js.Any])
    
    inline def setIconOnlyUndefined: Self = StObject.set(x, "iconOnly", js.undefined)
    
    inline def setLabel(value: CSSProperties): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setRoot(value: CSSProperties): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setSelected(value: CSSProperties): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setWrapper(value: CSSProperties): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    
    inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
  }
}
