package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/StepButton.StepButtonClasskey>> */
@js.native
trait PartialStyleRulesStepButt extends StObject {
  
  var root: js.UndefOr[CSSProperties] = js.native
  
  var touchRipple: js.UndefOr[CSSProperties] = js.native
  
  var vertical: js.UndefOr[CSSProperties] = js.native
}
object PartialStyleRulesStepButt {
  
  @scala.inline
  def apply(): PartialStyleRulesStepButt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesStepButt]
  }
  
  @scala.inline
  implicit class PartialStyleRulesStepButtMutableBuilder[Self <: PartialStyleRulesStepButt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoot(value: CSSProperties): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setTouchRipple(value: CSSProperties): Self = StObject.set(x, "touchRipple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchRippleUndefined: Self = StObject.set(x, "touchRipple", js.undefined)
    
    @scala.inline
    def setVertical(value: CSSProperties): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
