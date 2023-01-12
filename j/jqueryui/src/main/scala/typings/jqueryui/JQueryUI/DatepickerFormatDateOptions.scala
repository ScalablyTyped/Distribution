package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatepickerFormatDateOptions extends StObject {
  
  var dayNames: js.UndefOr[js.Array[String]] = js.undefined
  
  var dayNamesShort: js.UndefOr[js.Array[String]] = js.undefined
  
  var monthNames: js.UndefOr[js.Array[String]] = js.undefined
  
  var monthNamesShort: js.UndefOr[js.Array[String]] = js.undefined
}
object DatepickerFormatDateOptions {
  
  inline def apply(): DatepickerFormatDateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatepickerFormatDateOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatepickerFormatDateOptions] (val x: Self) extends AnyVal {
    
    inline def setDayNames(value: js.Array[String]): Self = StObject.set(x, "dayNames", value.asInstanceOf[js.Any])
    
    inline def setDayNamesShort(value: js.Array[String]): Self = StObject.set(x, "dayNamesShort", value.asInstanceOf[js.Any])
    
    inline def setDayNamesShortUndefined: Self = StObject.set(x, "dayNamesShort", js.undefined)
    
    inline def setDayNamesShortVarargs(value: String*): Self = StObject.set(x, "dayNamesShort", js.Array(value*))
    
    inline def setDayNamesUndefined: Self = StObject.set(x, "dayNames", js.undefined)
    
    inline def setDayNamesVarargs(value: String*): Self = StObject.set(x, "dayNames", js.Array(value*))
    
    inline def setMonthNames(value: js.Array[String]): Self = StObject.set(x, "monthNames", value.asInstanceOf[js.Any])
    
    inline def setMonthNamesShort(value: js.Array[String]): Self = StObject.set(x, "monthNamesShort", value.asInstanceOf[js.Any])
    
    inline def setMonthNamesShortUndefined: Self = StObject.set(x, "monthNamesShort", js.undefined)
    
    inline def setMonthNamesShortVarargs(value: String*): Self = StObject.set(x, "monthNamesShort", js.Array(value*))
    
    inline def setMonthNamesUndefined: Self = StObject.set(x, "monthNames", js.undefined)
    
    inline def setMonthNamesVarargs(value: String*): Self = StObject.set(x, "monthNames", js.Array(value*))
  }
}
