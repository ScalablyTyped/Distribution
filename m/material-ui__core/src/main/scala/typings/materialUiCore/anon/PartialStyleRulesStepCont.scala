package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/StepContent.StepContentClasskey>> */
trait PartialStyleRulesStepCont extends StObject {
  
  var last: js.UndefOr[CSSProperties] = js.undefined
  
  var root: js.UndefOr[CSSProperties] = js.undefined
  
  var transition: js.UndefOr[CSSProperties] = js.undefined
}
object PartialStyleRulesStepCont {
  
  @scala.inline
  def apply(): PartialStyleRulesStepCont = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesStepCont]
  }
  
  @scala.inline
  implicit class PartialStyleRulesStepContMutableBuilder[Self <: PartialStyleRulesStepCont] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLast(value: CSSProperties): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
    
    @scala.inline
    def setRoot(value: CSSProperties): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setTransition(value: CSSProperties): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
  }
}
