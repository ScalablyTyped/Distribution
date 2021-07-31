package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/CssBaseline.CssBaselineClassKey>> */
trait PartialStyleRulesCssBasel extends StObject {
  
  var `@global`: js.UndefOr[CSSProperties] = js.undefined
}
object PartialStyleRulesCssBasel {
  
  @scala.inline
  def apply(): PartialStyleRulesCssBasel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesCssBasel]
  }
  
  @scala.inline
  implicit class PartialStyleRulesCssBaselMutableBuilder[Self <: PartialStyleRulesCssBasel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `set@global`(value: CSSProperties): Self = StObject.set(x, "@global", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set@globalUndefined`: Self = StObject.set(x, "@global", js.undefined)
  }
}
