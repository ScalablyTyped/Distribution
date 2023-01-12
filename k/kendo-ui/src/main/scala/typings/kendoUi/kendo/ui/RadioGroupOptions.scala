package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadioGroupOptions extends StObject {
  
  var change: js.UndefOr[js.Function1[/* e */ RadioGroupChangeEvent, Unit]] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var focus: js.UndefOr[js.Function1[/* e */ RadioGroupFocusEvent, Unit]] = js.undefined
  
  var inputName: js.UndefOr[String] = js.undefined
  
  var inputSize: js.UndefOr[String] = js.undefined
  
  var items: js.UndefOr[js.Array[RadioGroupItem]] = js.undefined
  
  var labelPosition: js.UndefOr[String] = js.undefined
  
  var layout: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var select: js.UndefOr[js.Function1[/* e */ RadioGroupSelectEvent, Unit]] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object RadioGroupOptions {
  
  inline def apply(): RadioGroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadioGroupOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RadioGroupOptions] (val x: Self) extends AnyVal {
    
    inline def setChange(value: /* e */ RadioGroupChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFocus(value: /* e */ RadioGroupFocusEvent => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction1(value))
    
    inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    inline def setInputName(value: String): Self = StObject.set(x, "inputName", value.asInstanceOf[js.Any])
    
    inline def setInputNameUndefined: Self = StObject.set(x, "inputName", js.undefined)
    
    inline def setInputSize(value: String): Self = StObject.set(x, "inputSize", value.asInstanceOf[js.Any])
    
    inline def setInputSizeUndefined: Self = StObject.set(x, "inputSize", js.undefined)
    
    inline def setItems(value: js.Array[RadioGroupItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: RadioGroupItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setLabelPosition(value: String): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
    
    inline def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
    
    inline def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSelect(value: /* e */ RadioGroupSelectEvent => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
