package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/List.ListClassKey>> */
trait PartialStyleRulesListClas extends StObject {
  
  var dense: js.UndefOr[CSSProperties] = js.undefined
  
  var padding: js.UndefOr[CSSProperties] = js.undefined
  
  var root: js.UndefOr[CSSProperties] = js.undefined
  
  var subheader: js.UndefOr[CSSProperties] = js.undefined
}
object PartialStyleRulesListClas {
  
  inline def apply(): PartialStyleRulesListClas = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesListClas]
  }
  
  extension [Self <: PartialStyleRulesListClas](x: Self) {
    
    inline def setDense(value: CSSProperties): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
    
    inline def setDenseUndefined: Self = StObject.set(x, "dense", js.undefined)
    
    inline def setPadding(value: CSSProperties): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setRoot(value: CSSProperties): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setSubheader(value: CSSProperties): Self = StObject.set(x, "subheader", value.asInstanceOf[js.Any])
    
    inline def setSubheaderUndefined: Self = StObject.set(x, "subheader", js.undefined)
  }
}
