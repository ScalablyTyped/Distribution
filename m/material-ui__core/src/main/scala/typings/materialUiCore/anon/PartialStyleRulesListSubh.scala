package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/ListSubheader.ListSubheaderClassKey>> */
trait PartialStyleRulesListSubh extends StObject {
  
  var colorInherit: js.UndefOr[CSSProperties] = js.undefined
  
  var colorPrimary: js.UndefOr[CSSProperties] = js.undefined
  
  var gutters: js.UndefOr[CSSProperties] = js.undefined
  
  var inset: js.UndefOr[CSSProperties] = js.undefined
  
  var root: js.UndefOr[CSSProperties] = js.undefined
  
  var sticky: js.UndefOr[CSSProperties] = js.undefined
}
object PartialStyleRulesListSubh {
  
  inline def apply(): PartialStyleRulesListSubh = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesListSubh]
  }
  
  extension [Self <: PartialStyleRulesListSubh](x: Self) {
    
    inline def setColorInherit(value: CSSProperties): Self = StObject.set(x, "colorInherit", value.asInstanceOf[js.Any])
    
    inline def setColorInheritUndefined: Self = StObject.set(x, "colorInherit", js.undefined)
    
    inline def setColorPrimary(value: CSSProperties): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
    
    inline def setColorPrimaryUndefined: Self = StObject.set(x, "colorPrimary", js.undefined)
    
    inline def setGutters(value: CSSProperties): Self = StObject.set(x, "gutters", value.asInstanceOf[js.Any])
    
    inline def setGuttersUndefined: Self = StObject.set(x, "gutters", js.undefined)
    
    inline def setInset(value: CSSProperties): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
    
    inline def setInsetUndefined: Self = StObject.set(x, "inset", js.undefined)
    
    inline def setRoot(value: CSSProperties): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setSticky(value: CSSProperties): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
    
    inline def setStickyUndefined: Self = StObject.set(x, "sticky", js.undefined)
  }
}
