package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Toolbar.ToolbarClassKey>> */
trait PartialStyleRulesToolbarC extends StObject {
  
  var dense: js.UndefOr[CSSProperties] = js.undefined
  
  var gutters: js.UndefOr[CSSProperties] = js.undefined
  
  var regular: js.UndefOr[CSSProperties] = js.undefined
  
  var root: js.UndefOr[CSSProperties] = js.undefined
}
object PartialStyleRulesToolbarC {
  
  inline def apply(): PartialStyleRulesToolbarC = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesToolbarC]
  }
  
  extension [Self <: PartialStyleRulesToolbarC](x: Self) {
    
    inline def setDense(value: CSSProperties): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
    
    inline def setDenseUndefined: Self = StObject.set(x, "dense", js.undefined)
    
    inline def setGutters(value: CSSProperties): Self = StObject.set(x, "gutters", value.asInstanceOf[js.Any])
    
    inline def setGuttersUndefined: Self = StObject.set(x, "gutters", js.undefined)
    
    inline def setRegular(value: CSSProperties): Self = StObject.set(x, "regular", value.asInstanceOf[js.Any])
    
    inline def setRegularUndefined: Self = StObject.set(x, "regular", js.undefined)
    
    inline def setRoot(value: CSSProperties): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
