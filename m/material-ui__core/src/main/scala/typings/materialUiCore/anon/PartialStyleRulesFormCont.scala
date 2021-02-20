package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/FormControl.FormControlClassKey>> */
@js.native
trait PartialStyleRulesFormCont extends StObject {
  
  var fullWidth: js.UndefOr[CSSProperties] = js.native
  
  var marginDense: js.UndefOr[CSSProperties] = js.native
  
  var marginNormal: js.UndefOr[CSSProperties] = js.native
  
  var root: js.UndefOr[CSSProperties] = js.native
}
object PartialStyleRulesFormCont {
  
  @scala.inline
  def apply(): PartialStyleRulesFormCont = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesFormCont]
  }
  
  @scala.inline
  implicit class PartialStyleRulesFormContMutableBuilder[Self <: PartialStyleRulesFormCont] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFullWidth(value: CSSProperties): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
    
    @scala.inline
    def setMarginDense(value: CSSProperties): Self = StObject.set(x, "marginDense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginDenseUndefined: Self = StObject.set(x, "marginDense", js.undefined)
    
    @scala.inline
    def setMarginNormal(value: CSSProperties): Self = StObject.set(x, "marginNormal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginNormalUndefined: Self = StObject.set(x, "marginNormal", js.undefined)
    
    @scala.inline
    def setRoot(value: CSSProperties): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
