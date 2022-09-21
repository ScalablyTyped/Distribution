package typings.materialUiCore.anon

import typings.materialUiStyles.withStylesWithStylesMod.CSSProperties
import typings.materialUiStyles.withStylesWithStylesMod.CreateCSSProperties
import typings.materialUiStyles.withStylesWithStylesMod.PropsFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/ListSubheader.ListSubheaderClassKey, {}>> */
trait PartialStyleRulesListSubh extends StObject {
  
  var colorInherit: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
  
  var colorPrimary: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
  
  var gutters: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
  
  var inset: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
  
  var root: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
  
  var sticky: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
}
object PartialStyleRulesListSubh {
  
  inline def apply(): PartialStyleRulesListSubh = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesListSubh]
  }
  
  extension [Self <: PartialStyleRulesListSubh](x: Self) {
    
    inline def setColorInherit(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "colorInherit", value.asInstanceOf[js.Any])
    
    inline def setColorInheritFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "colorInherit", js.Any.fromFunction1(value))
    
    inline def setColorInheritUndefined: Self = StObject.set(x, "colorInherit", js.undefined)
    
    inline def setColorPrimary(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
    
    inline def setColorPrimaryFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "colorPrimary", js.Any.fromFunction1(value))
    
    inline def setColorPrimaryUndefined: Self = StObject.set(x, "colorPrimary", js.undefined)
    
    inline def setGutters(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "gutters", value.asInstanceOf[js.Any])
    
    inline def setGuttersFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "gutters", js.Any.fromFunction1(value))
    
    inline def setGuttersUndefined: Self = StObject.set(x, "gutters", js.undefined)
    
    inline def setInset(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
    
    inline def setInsetFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "inset", js.Any.fromFunction1(value))
    
    inline def setInsetUndefined: Self = StObject.set(x, "inset", js.undefined)
    
    inline def setRoot(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setSticky(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
    
    inline def setStickyFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "sticky", js.Any.fromFunction1(value))
    
    inline def setStickyUndefined: Self = StObject.set(x, "sticky", js.undefined)
  }
}
