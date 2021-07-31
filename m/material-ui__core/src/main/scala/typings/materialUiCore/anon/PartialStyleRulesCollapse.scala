package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Collapse.CollapseClassKey>> */
trait PartialStyleRulesCollapse extends StObject {
  
  var container: js.UndefOr[CSSProperties] = js.undefined
  
  var entered: js.UndefOr[CSSProperties] = js.undefined
  
  var wrapper: js.UndefOr[CSSProperties] = js.undefined
  
  var wrapperInner: js.UndefOr[CSSProperties] = js.undefined
}
object PartialStyleRulesCollapse {
  
  @scala.inline
  def apply(): PartialStyleRulesCollapse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesCollapse]
  }
  
  @scala.inline
  implicit class PartialStyleRulesCollapseMutableBuilder[Self <: PartialStyleRulesCollapse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainer(value: CSSProperties): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setEntered(value: CSSProperties): Self = StObject.set(x, "entered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnteredUndefined: Self = StObject.set(x, "entered", js.undefined)
    
    @scala.inline
    def setWrapper(value: CSSProperties): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapperInner(value: CSSProperties): Self = StObject.set(x, "wrapperInner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapperInnerUndefined: Self = StObject.set(x, "wrapperInner", js.undefined)
    
    @scala.inline
    def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
  }
}
