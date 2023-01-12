package typings.materialUiCore.anon

import typings.materialUiStyles.withStylesWithStylesMod.CSSProperties
import typings.materialUiStyles.withStylesWithStylesMod.CreateCSSProperties
import typings.materialUiStyles.withStylesWithStylesMod.PropsFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Menu.MenuClassKey, {}>> */
trait PartialStyleRulesMenuClas extends StObject {
  
  var list: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
  
  var paper: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
}
object PartialStyleRulesMenuClas {
  
  inline def apply(): PartialStyleRulesMenuClas = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesMenuClas]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialStyleRulesMenuClas] (val x: Self) extends AnyVal {
    
    inline def setList(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setListFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "list", js.Any.fromFunction1(value))
    
    inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
    
    inline def setPaper(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "paper", value.asInstanceOf[js.Any])
    
    inline def setPaperFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "paper", js.Any.fromFunction1(value))
    
    inline def setPaperUndefined: Self = StObject.set(x, "paper", js.undefined)
  }
}
