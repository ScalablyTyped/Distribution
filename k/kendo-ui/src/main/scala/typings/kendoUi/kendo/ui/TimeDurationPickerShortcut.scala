package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeDurationPickerShortcut extends StObject {
  
  var text: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
}
object TimeDurationPickerShortcut {
  
  inline def apply(): TimeDurationPickerShortcut = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeDurationPickerShortcut]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeDurationPickerShortcut] (val x: Self) extends AnyVal {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
