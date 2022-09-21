package typings.materialUiCore.anon

import typings.materialUiStyles.withStylesWithStylesMod.CSSProperties
import typings.materialUiStyles.withStylesWithStylesMod.CreateCSSProperties
import typings.materialUiStyles.withStylesWithStylesMod.PropsFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/StepIcon.StepIconClasskey, {}>> */
trait PartialStyleRulesStepIcon extends StObject {
  
  var active: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
  
  var completed: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
  
  var error: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
  
  var root: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
  
  var text: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
}
object PartialStyleRulesStepIcon {
  
  inline def apply(): PartialStyleRulesStepIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesStepIcon]
  }
  
  extension [Self <: PartialStyleRulesStepIcon](x: Self) {
    
    inline def setActive(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "active", js.Any.fromFunction1(value))
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setCompleted(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
    
    inline def setCompletedFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "completed", js.Any.fromFunction1(value))
    
    inline def setCompletedUndefined: Self = StObject.set(x, "completed", js.undefined)
    
    inline def setError(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setRoot(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setText(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "text", js.Any.fromFunction1(value))
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
