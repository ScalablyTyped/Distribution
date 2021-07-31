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
  
  @scala.inline
  def apply(): PartialStyleRulesListClas = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesListClas]
  }
  
  @scala.inline
  implicit class PartialStyleRulesListClasMutableBuilder[Self <: PartialStyleRulesListClas] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDense(value: CSSProperties): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDenseUndefined: Self = StObject.set(x, "dense", js.undefined)
    
    @scala.inline
    def setPadding(value: CSSProperties): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setRoot(value: CSSProperties): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setSubheader(value: CSSProperties): Self = StObject.set(x, "subheader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubheaderUndefined: Self = StObject.set(x, "subheader", js.undefined)
  }
}
