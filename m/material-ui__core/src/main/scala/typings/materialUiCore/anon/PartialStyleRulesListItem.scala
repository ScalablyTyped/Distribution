package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/ListItemText.ListItemTextClassKey>> */
trait PartialStyleRulesListItem extends StObject {
  
  var dense: js.UndefOr[CSSProperties] = js.undefined
  
  var inset: js.UndefOr[CSSProperties] = js.undefined
  
  var primary: js.UndefOr[CSSProperties] = js.undefined
  
  var root: js.UndefOr[CSSProperties] = js.undefined
  
  var secondary: js.UndefOr[CSSProperties] = js.undefined
  
  var textDense: js.UndefOr[CSSProperties] = js.undefined
}
object PartialStyleRulesListItem {
  
  inline def apply(): PartialStyleRulesListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesListItem]
  }
  
  extension [Self <: PartialStyleRulesListItem](x: Self) {
    
    inline def setDense(value: CSSProperties): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
    
    inline def setDenseUndefined: Self = StObject.set(x, "dense", js.undefined)
    
    inline def setInset(value: CSSProperties): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
    
    inline def setInsetUndefined: Self = StObject.set(x, "inset", js.undefined)
    
    inline def setPrimary(value: CSSProperties): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    inline def setRoot(value: CSSProperties): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setSecondary(value: CSSProperties): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    
    inline def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
    
    inline def setTextDense(value: CSSProperties): Self = StObject.set(x, "textDense", value.asInstanceOf[js.Any])
    
    inline def setTextDenseUndefined: Self = StObject.set(x, "textDense", js.undefined)
  }
}
