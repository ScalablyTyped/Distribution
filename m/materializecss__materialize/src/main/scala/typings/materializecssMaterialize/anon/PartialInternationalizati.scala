package typings.materializecssMaterialize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@materializecss/materialize.M.InternationalizationOptions> */
trait PartialInternationalizati extends StObject {
  
  var cancel: js.UndefOr[String] = js.undefined
  
  var clear: js.UndefOr[String] = js.undefined
  
  var done: js.UndefOr[String] = js.undefined
  
  var months: js.UndefOr[js.Array[String]] = js.undefined
  
  var monthsShort: js.UndefOr[js.Array[String]] = js.undefined
  
  var nextMonth: js.UndefOr[String] = js.undefined
  
  var previousMonth: js.UndefOr[String] = js.undefined
  
  var weekdays: js.UndefOr[js.Array[String]] = js.undefined
  
  var weekdaysAbbrev: js.UndefOr[js.Array[String]] = js.undefined
  
  var weekdaysShort: js.UndefOr[js.Array[String]] = js.undefined
}
object PartialInternationalizati {
  
  inline def apply(): PartialInternationalizati = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialInternationalizati]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialInternationalizati] (val x: Self) extends AnyVal {
    
    inline def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setClear(value: String): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
    
    inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    
    inline def setDone(value: String): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
    
    inline def setMonths(value: js.Array[String]): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
    
    inline def setMonthsShort(value: js.Array[String]): Self = StObject.set(x, "monthsShort", value.asInstanceOf[js.Any])
    
    inline def setMonthsShortUndefined: Self = StObject.set(x, "monthsShort", js.undefined)
    
    inline def setMonthsShortVarargs(value: String*): Self = StObject.set(x, "monthsShort", js.Array(value*))
    
    inline def setMonthsUndefined: Self = StObject.set(x, "months", js.undefined)
    
    inline def setMonthsVarargs(value: String*): Self = StObject.set(x, "months", js.Array(value*))
    
    inline def setNextMonth(value: String): Self = StObject.set(x, "nextMonth", value.asInstanceOf[js.Any])
    
    inline def setNextMonthUndefined: Self = StObject.set(x, "nextMonth", js.undefined)
    
    inline def setPreviousMonth(value: String): Self = StObject.set(x, "previousMonth", value.asInstanceOf[js.Any])
    
    inline def setPreviousMonthUndefined: Self = StObject.set(x, "previousMonth", js.undefined)
    
    inline def setWeekdays(value: js.Array[String]): Self = StObject.set(x, "weekdays", value.asInstanceOf[js.Any])
    
    inline def setWeekdaysAbbrev(value: js.Array[String]): Self = StObject.set(x, "weekdaysAbbrev", value.asInstanceOf[js.Any])
    
    inline def setWeekdaysAbbrevUndefined: Self = StObject.set(x, "weekdaysAbbrev", js.undefined)
    
    inline def setWeekdaysAbbrevVarargs(value: String*): Self = StObject.set(x, "weekdaysAbbrev", js.Array(value*))
    
    inline def setWeekdaysShort(value: js.Array[String]): Self = StObject.set(x, "weekdaysShort", value.asInstanceOf[js.Any])
    
    inline def setWeekdaysShortUndefined: Self = StObject.set(x, "weekdaysShort", js.undefined)
    
    inline def setWeekdaysShortVarargs(value: String*): Self = StObject.set(x, "weekdaysShort", js.Array(value*))
    
    inline def setWeekdaysUndefined: Self = StObject.set(x, "weekdays", js.undefined)
    
    inline def setWeekdaysVarargs(value: String*): Self = StObject.set(x, "weekdays", js.Array(value*))
  }
}
