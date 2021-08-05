package typings.layuiSrc.layui

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RateOption extends StObject {
  
  var choose: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  
  var elem: js.UndefOr[String | HTMLElement] = js.undefined
  
  var half: js.UndefOr[Boolean] = js.undefined
  
  var length: js.UndefOr[Double] = js.undefined
  
  var readonly: js.UndefOr[Boolean] = js.undefined
  
  var setText: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  
  var text: js.UndefOr[Boolean] = js.undefined
  
  var theme: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
}
object RateOption {
  
  inline def apply(): RateOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RateOption]
  }
  
  extension [Self <: RateOption](x: Self) {
    
    inline def setChoose(value: /* value */ Double => Unit): Self = StObject.set(x, "choose", js.Any.fromFunction1(value))
    
    inline def setChooseUndefined: Self = StObject.set(x, "choose", js.undefined)
    
    inline def setElem(value: String | HTMLElement): Self = StObject.set(x, "elem", value.asInstanceOf[js.Any])
    
    inline def setElemUndefined: Self = StObject.set(x, "elem", js.undefined)
    
    inline def setHalf(value: Boolean): Self = StObject.set(x, "half", value.asInstanceOf[js.Any])
    
    inline def setHalfUndefined: Self = StObject.set(x, "half", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    
    inline def setSetText(value: /* value */ Double => Unit): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
    
    inline def setSetTextUndefined: Self = StObject.set(x, "setText", js.undefined)
    
    inline def setText(value: Boolean): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
