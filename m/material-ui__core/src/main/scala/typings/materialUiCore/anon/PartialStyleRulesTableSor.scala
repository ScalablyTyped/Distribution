package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/TableSortLabel.TableSortLabelClassKey>> */
trait PartialStyleRulesTableSor extends StObject {
  
  var active: js.UndefOr[CSSProperties] = js.undefined
  
  var icon: js.UndefOr[CSSProperties] = js.undefined
  
  var iconDirectionAsc: js.UndefOr[CSSProperties] = js.undefined
  
  var iconDirectionDesc: js.UndefOr[CSSProperties] = js.undefined
  
  var root: js.UndefOr[CSSProperties] = js.undefined
}
object PartialStyleRulesTableSor {
  
  inline def apply(): PartialStyleRulesTableSor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesTableSor]
  }
  
  extension [Self <: PartialStyleRulesTableSor](x: Self) {
    
    inline def setActive(value: CSSProperties): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setIcon(value: CSSProperties): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconDirectionAsc(value: CSSProperties): Self = StObject.set(x, "iconDirectionAsc", value.asInstanceOf[js.Any])
    
    inline def setIconDirectionAscUndefined: Self = StObject.set(x, "iconDirectionAsc", js.undefined)
    
    inline def setIconDirectionDesc(value: CSSProperties): Self = StObject.set(x, "iconDirectionDesc", value.asInstanceOf[js.Any])
    
    inline def setIconDirectionDescUndefined: Self = StObject.set(x, "iconDirectionDesc", js.undefined)
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setRoot(value: CSSProperties): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
