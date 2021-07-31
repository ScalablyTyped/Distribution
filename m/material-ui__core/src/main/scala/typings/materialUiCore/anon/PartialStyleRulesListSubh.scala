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
  
  @scala.inline
  def apply(): PartialStyleRulesListSubh = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesListSubh]
  }
  
  @scala.inline
  implicit class PartialStyleRulesListSubhMutableBuilder[Self <: PartialStyleRulesListSubh] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColorInherit(value: CSSProperties): Self = StObject.set(x, "colorInherit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorInheritUndefined: Self = StObject.set(x, "colorInherit", js.undefined)
    
    @scala.inline
    def setColorPrimary(value: CSSProperties): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorPrimaryUndefined: Self = StObject.set(x, "colorPrimary", js.undefined)
    
    @scala.inline
    def setGutters(value: CSSProperties): Self = StObject.set(x, "gutters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuttersUndefined: Self = StObject.set(x, "gutters", js.undefined)
    
    @scala.inline
    def setInset(value: CSSProperties): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsetUndefined: Self = StObject.set(x, "inset", js.undefined)
    
    @scala.inline
    def setRoot(value: CSSProperties): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setSticky(value: CSSProperties): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStickyUndefined: Self = StObject.set(x, "sticky", js.undefined)
  }
}
