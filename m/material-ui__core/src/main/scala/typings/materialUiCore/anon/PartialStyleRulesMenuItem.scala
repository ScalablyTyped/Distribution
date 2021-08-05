package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/MenuItem.MenuItemClassKey>> */
trait PartialStyleRulesMenuItem extends StObject {
  
  var gutters: js.UndefOr[CSSProperties] = js.undefined
  
  var root: js.UndefOr[CSSProperties] = js.undefined
  
  var selected: js.UndefOr[CSSProperties] = js.undefined
}
object PartialStyleRulesMenuItem {
  
  inline def apply(): PartialStyleRulesMenuItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesMenuItem]
  }
  
  extension [Self <: PartialStyleRulesMenuItem](x: Self) {
    
    inline def setGutters(value: CSSProperties): Self = StObject.set(x, "gutters", value.asInstanceOf[js.Any])
    
    inline def setGuttersUndefined: Self = StObject.set(x, "gutters", js.undefined)
    
    inline def setRoot(value: CSSProperties): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setSelected(value: CSSProperties): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
  }
}
