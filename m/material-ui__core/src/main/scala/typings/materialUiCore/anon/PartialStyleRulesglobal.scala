package typings.materialUiCore.anon

import typings.materialUiStyles.withStylesWithStylesMod.CSSProperties
import typings.materialUiStyles.withStylesWithStylesMod.CreateCSSProperties
import typings.materialUiStyles.withStylesWithStylesMod.PropsFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<'@global', {}>> */
trait PartialStyleRulesglobal extends StObject {
  
  var `@global`: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
}
object PartialStyleRulesglobal {
  
  inline def apply(): PartialStyleRulesglobal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesglobal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialStyleRulesglobal] (val x: Self) extends AnyVal {
    
    inline def `set@global`(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "@global", value.asInstanceOf[js.Any])
    
    inline def `set@globalFunction1`(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "@global", js.Any.fromFunction1(value))
    
    inline def `set@globalUndefined`: Self = StObject.set(x, "@global", js.undefined)
  }
}
