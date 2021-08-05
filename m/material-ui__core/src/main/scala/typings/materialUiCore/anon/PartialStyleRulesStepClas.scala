package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Step.StepClasskey>> */
trait PartialStyleRulesStepClas extends StObject {
  
  var alternativeLabel: js.UndefOr[CSSProperties] = js.undefined
  
  var horizontal: js.UndefOr[CSSProperties] = js.undefined
  
  var root: js.UndefOr[CSSProperties] = js.undefined
  
  var vertical: js.UndefOr[CSSProperties] = js.undefined
}
object PartialStyleRulesStepClas {
  
  inline def apply(): PartialStyleRulesStepClas = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesStepClas]
  }
  
  extension [Self <: PartialStyleRulesStepClas](x: Self) {
    
    inline def setAlternativeLabel(value: CSSProperties): Self = StObject.set(x, "alternativeLabel", value.asInstanceOf[js.Any])
    
    inline def setAlternativeLabelUndefined: Self = StObject.set(x, "alternativeLabel", js.undefined)
    
    inline def setHorizontal(value: CSSProperties): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    inline def setRoot(value: CSSProperties): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setVertical(value: CSSProperties): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
