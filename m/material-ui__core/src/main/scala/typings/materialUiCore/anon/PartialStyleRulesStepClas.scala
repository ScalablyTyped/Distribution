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
  
  @scala.inline
  def apply(): PartialStyleRulesStepClas = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesStepClas]
  }
  
  @scala.inline
  implicit class PartialStyleRulesStepClasMutableBuilder[Self <: PartialStyleRulesStepClas] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternativeLabel(value: CSSProperties): Self = StObject.set(x, "alternativeLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternativeLabelUndefined: Self = StObject.set(x, "alternativeLabel", js.undefined)
    
    @scala.inline
    def setHorizontal(value: CSSProperties): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    @scala.inline
    def setRoot(value: CSSProperties): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setVertical(value: CSSProperties): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
