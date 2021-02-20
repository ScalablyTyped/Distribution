package typings.layuiSrc.layui

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RateOption extends StObject {
  
  var choose: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  
  var elem: js.UndefOr[String | HTMLElement] = js.native
  
  var half: js.UndefOr[Boolean] = js.native
  
  var length: js.UndefOr[Double] = js.native
  
  var readonly: js.UndefOr[Boolean] = js.native
  
  var setText: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  
  var text: js.UndefOr[Boolean] = js.native
  
  var theme: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[Double] = js.native
}
object RateOption {
  
  @scala.inline
  def apply(): RateOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RateOption]
  }
  
  @scala.inline
  implicit class RateOptionMutableBuilder[Self <: RateOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChoose(value: /* value */ Double => Unit): Self = StObject.set(x, "choose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChooseUndefined: Self = StObject.set(x, "choose", js.undefined)
    
    @scala.inline
    def setElem(value: String | HTMLElement): Self = StObject.set(x, "elem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElemUndefined: Self = StObject.set(x, "elem", js.undefined)
    
    @scala.inline
    def setHalf(value: Boolean): Self = StObject.set(x, "half", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHalfUndefined: Self = StObject.set(x, "half", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    
    @scala.inline
    def setSetText(value: /* value */ Double => Unit): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTextUndefined: Self = StObject.set(x, "setText", js.undefined)
    
    @scala.inline
    def setText(value: Boolean): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
