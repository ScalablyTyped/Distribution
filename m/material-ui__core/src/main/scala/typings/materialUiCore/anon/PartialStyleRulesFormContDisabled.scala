package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/FormControlLabel.FormControlLabelClassKey>> */
trait PartialStyleRulesFormContDisabled extends StObject {
  
  var disabled: js.UndefOr[CSSProperties] = js.undefined
  
  var label: js.UndefOr[CSSProperties] = js.undefined
  
  var root: js.UndefOr[CSSProperties] = js.undefined
  
  var start: js.UndefOr[CSSProperties] = js.undefined
}
object PartialStyleRulesFormContDisabled {
  
  @scala.inline
  def apply(): PartialStyleRulesFormContDisabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesFormContDisabled]
  }
  
  @scala.inline
  implicit class PartialStyleRulesFormContDisabledMutableBuilder[Self <: PartialStyleRulesFormContDisabled] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: CSSProperties): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setLabel(value: CSSProperties): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setRoot(value: CSSProperties): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setStart(value: CSSProperties): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
