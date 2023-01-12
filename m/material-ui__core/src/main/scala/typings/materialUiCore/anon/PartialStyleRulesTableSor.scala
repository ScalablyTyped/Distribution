package typings.materialUiCore.anon

import typings.materialUiStyles.withStylesWithStylesMod.CSSProperties
import typings.materialUiStyles.withStylesWithStylesMod.CreateCSSProperties
import typings.materialUiStyles.withStylesWithStylesMod.PropsFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/TableSortLabel.TableSortLabelClassKey, {}>> */
trait PartialStyleRulesTableSor extends StObject {
  
  var active: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
  
  var icon: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
  
  var iconDirectionAsc: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
  
  var iconDirectionDesc: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
  
  var root: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
}
object PartialStyleRulesTableSor {
  
  inline def apply(): PartialStyleRulesTableSor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesTableSor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialStyleRulesTableSor] (val x: Self) extends AnyVal {
    
    inline def setActive(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "active", js.Any.fromFunction1(value))
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setIcon(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconDirectionAsc(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "iconDirectionAsc", value.asInstanceOf[js.Any])
    
    inline def setIconDirectionAscFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "iconDirectionAsc", js.Any.fromFunction1(value))
    
    inline def setIconDirectionAscUndefined: Self = StObject.set(x, "iconDirectionAsc", js.undefined)
    
    inline def setIconDirectionDesc(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "iconDirectionDesc", value.asInstanceOf[js.Any])
    
    inline def setIconDirectionDescFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "iconDirectionDesc", js.Any.fromFunction1(value))
    
    inline def setIconDirectionDescUndefined: Self = StObject.set(x, "iconDirectionDesc", js.undefined)
    
    inline def setIconFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setRoot(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
