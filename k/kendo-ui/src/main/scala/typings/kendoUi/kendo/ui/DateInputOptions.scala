package typings.kendoUi.kendo.ui

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateInputOptions extends StObject {
  
  var change: js.UndefOr[js.Function1[/* e */ DateInputChangeEvent, Unit]] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var max: js.UndefOr[Date] = js.undefined
  
  var messages: js.UndefOr[DateInputMessages] = js.undefined
  
  var min: js.UndefOr[Date] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[Date] = js.undefined
}
object DateInputOptions {
  
  inline def apply(): DateInputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateInputOptions]
  }
  
  extension [Self <: DateInputOptions](x: Self) {
    
    inline def setChange(value: /* e */ DateInputChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setMax(value: Date): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMessages(value: DateInputMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMin(value: Date): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
