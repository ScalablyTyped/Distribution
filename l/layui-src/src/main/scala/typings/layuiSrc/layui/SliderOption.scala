package typings.layuiSrc.layui

import typings.layuiSrc.layuiSrcStrings.default
import typings.layuiSrc.layuiSrcStrings.vertical
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderOption extends StObject {
  
  var change: js.UndefOr[js.Function1[/* value */ Double | js.Array[Double], String]] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var elem: js.UndefOr[String | HTMLElement] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var input: js.UndefOr[Boolean] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var mix: js.UndefOr[Double] = js.undefined
  
  var range: js.UndefOr[Boolean] = js.undefined
  
  var setTips: js.UndefOr[js.Function1[/* value */ Double | js.Array[Double], String]] = js.undefined
  
  var showstep: js.UndefOr[Boolean] = js.undefined
  
  var step: js.UndefOr[Double] = js.undefined
  
  var theme: js.UndefOr[String] = js.undefined
  
  var tips: js.UndefOr[Boolean] = js.undefined
  
  var `type`: js.UndefOr[default | vertical] = js.undefined
  
  var value: js.UndefOr[Double | js.Array[Double]] = js.undefined
}
object SliderOption {
  
  inline def apply(): SliderOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderOption]
  }
  
  extension [Self <: SliderOption](x: Self) {
    
    inline def setChange(value: /* value */ Double | js.Array[Double] => String): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setElem(value: String | HTMLElement): Self = StObject.set(x, "elem", value.asInstanceOf[js.Any])
    
    inline def setElemUndefined: Self = StObject.set(x, "elem", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setInput(value: Boolean): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMix(value: Double): Self = StObject.set(x, "mix", value.asInstanceOf[js.Any])
    
    inline def setMixUndefined: Self = StObject.set(x, "mix", js.undefined)
    
    inline def setRange(value: Boolean): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setSetTips(value: /* value */ Double | js.Array[Double] => String): Self = StObject.set(x, "setTips", js.Any.fromFunction1(value))
    
    inline def setSetTipsUndefined: Self = StObject.set(x, "setTips", js.undefined)
    
    inline def setShowstep(value: Boolean): Self = StObject.set(x, "showstep", value.asInstanceOf[js.Any])
    
    inline def setShowstepUndefined: Self = StObject.set(x, "showstep", js.undefined)
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTips(value: Boolean): Self = StObject.set(x, "tips", value.asInstanceOf[js.Any])
    
    inline def setTipsUndefined: Self = StObject.set(x, "tips", js.undefined)
    
    inline def setType(value: default | vertical): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: Double | js.Array[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: Double*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
