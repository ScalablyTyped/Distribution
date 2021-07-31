package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Radio.RadioClassKey>> */
trait PartialStyleRulesRadioCla extends StObject {
  
  var checked: js.UndefOr[CSSProperties] = js.undefined
  
  var colorPrimary: js.UndefOr[CSSProperties] = js.undefined
  
  var colorSecondary: js.UndefOr[CSSProperties] = js.undefined
  
  var disabled: js.UndefOr[CSSProperties] = js.undefined
  
  var input: js.UndefOr[CSSProperties] = js.undefined
  
  var root: js.UndefOr[CSSProperties] = js.undefined
}
object PartialStyleRulesRadioCla {
  
  @scala.inline
  def apply(): PartialStyleRulesRadioCla = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesRadioCla]
  }
  
  @scala.inline
  implicit class PartialStyleRulesRadioClaMutableBuilder[Self <: PartialStyleRulesRadioCla] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecked(value: CSSProperties): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    @scala.inline
    def setColorPrimary(value: CSSProperties): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorPrimaryUndefined: Self = StObject.set(x, "colorPrimary", js.undefined)
    
    @scala.inline
    def setColorSecondary(value: CSSProperties): Self = StObject.set(x, "colorSecondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorSecondaryUndefined: Self = StObject.set(x, "colorSecondary", js.undefined)
    
    @scala.inline
    def setDisabled(value: CSSProperties): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setInput(value: CSSProperties): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setRoot(value: CSSProperties): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
