package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inputs extends StObject {
  
  /** Date input values. Not supported by Chat apps. */
  var dateInput: js.UndefOr[DateInput] = js.undefined
  
  /** Date and time input values. Not supported by Chat apps. */
  var dateTimeInput: js.UndefOr[DateTimeInput] = js.undefined
  
  /** Input parameter for regular widgets. For single-valued widgets, it is a single value list. For multi-valued widgets, such as checkbox, all the values are presented. */
  var stringInputs: js.UndefOr[StringInputs] = js.undefined
  
  /** Time input values. Not supported by Chat apps. */
  var timeInput: js.UndefOr[TimeInput] = js.undefined
}
object Inputs {
  
  inline def apply(): Inputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Inputs]
  }
  
  extension [Self <: Inputs](x: Self) {
    
    inline def setDateInput(value: DateInput): Self = StObject.set(x, "dateInput", value.asInstanceOf[js.Any])
    
    inline def setDateInputUndefined: Self = StObject.set(x, "dateInput", js.undefined)
    
    inline def setDateTimeInput(value: DateTimeInput): Self = StObject.set(x, "dateTimeInput", value.asInstanceOf[js.Any])
    
    inline def setDateTimeInputUndefined: Self = StObject.set(x, "dateTimeInput", js.undefined)
    
    inline def setStringInputs(value: StringInputs): Self = StObject.set(x, "stringInputs", value.asInstanceOf[js.Any])
    
    inline def setStringInputsUndefined: Self = StObject.set(x, "stringInputs", js.undefined)
    
    inline def setTimeInput(value: TimeInput): Self = StObject.set(x, "timeInput", value.asInstanceOf[js.Any])
    
    inline def setTimeInputUndefined: Self = StObject.set(x, "timeInput", js.undefined)
  }
}
