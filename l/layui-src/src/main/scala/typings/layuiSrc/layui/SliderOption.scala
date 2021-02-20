package typings.layuiSrc.layui

import typings.layuiSrc.layuiSrcStrings.default
import typings.layuiSrc.layuiSrcStrings.vertical
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliderOption extends StObject {
  
  var change: js.UndefOr[js.Function1[/* value */ Double | js.Array[Double], String]] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var elem: js.UndefOr[String | HTMLElement] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var input: js.UndefOr[Boolean] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  var mix: js.UndefOr[Double] = js.native
  
  var range: js.UndefOr[Boolean] = js.native
  
  var setTips: js.UndefOr[js.Function1[/* value */ Double | js.Array[Double], String]] = js.native
  
  var showstep: js.UndefOr[Boolean] = js.native
  
  var step: js.UndefOr[Double] = js.native
  
  var theme: js.UndefOr[String] = js.native
  
  var tips: js.UndefOr[Boolean] = js.native
  
  var `type`: js.UndefOr[default | vertical] = js.native
  
  var value: js.UndefOr[Double | js.Array[Double]] = js.native
}
object SliderOption {
  
  @scala.inline
  def apply(): SliderOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderOption]
  }
  
  @scala.inline
  implicit class SliderOptionMutableBuilder[Self <: SliderOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange(value: /* value */ Double | js.Array[Double] => String): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setElem(value: String | HTMLElement): Self = StObject.set(x, "elem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElemUndefined: Self = StObject.set(x, "elem", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setInput(value: Boolean): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMix(value: Double): Self = StObject.set(x, "mix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMixUndefined: Self = StObject.set(x, "mix", js.undefined)
    
    @scala.inline
    def setRange(value: Boolean): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setSetTips(value: /* value */ Double | js.Array[Double] => String): Self = StObject.set(x, "setTips", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTipsUndefined: Self = StObject.set(x, "setTips", js.undefined)
    
    @scala.inline
    def setShowstep(value: Boolean): Self = StObject.set(x, "showstep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowstepUndefined: Self = StObject.set(x, "showstep", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setTips(value: Boolean): Self = StObject.set(x, "tips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTipsUndefined: Self = StObject.set(x, "tips", js.undefined)
    
    @scala.inline
    def setType(value: default | vertical): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: Double | js.Array[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: Double*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
