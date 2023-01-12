package typings.jspreadsheetCe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
// Column options
// ----------------------------------------------------------------------
trait CalendarOptions extends StObject {
  
  /** Date format */
  var format: js.UndefOr[String] = js.undefined
  
  /** Fullscreen (this is automatic set for screensize < 800) */
  var fullscreen: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Translations can be done here
    * Default: ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"]
    */
  var months: js.UndefOr[
    js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String]
  ] = js.undefined
  
  // tslint:disable-next-line ban-types
  var onchange: js.UndefOr[js.Function] = js.undefined
  
  /** Events */
  // tslint:disable-next-line ban-types
  var onclose: js.UndefOr[js.Function] = js.undefined
  
  /** Placeholder */
  var placeholder: js.UndefOr[CellValue] = js.undefined
  
  /** Allow keyboard date entry */
  var readonly: js.UndefOr[Boolean] = js.undefined
  
  /** Show the reset button */
  var resetButton: js.UndefOr[Boolean] = js.undefined
  
  /** Show timepicker */
  var time: js.UndefOr[Boolean] = js.undefined
  
  /** Today is default */
  var today: js.UndefOr[Boolean] = js.undefined
  
  /** Value */
  var value: js.UndefOr[CellValue] = js.undefined
  
  /**
    * Default: ["Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"]
    */
  var weekdays: js.UndefOr[js.Tuple7[String, String, String, String, String, String, String]] = js.undefined
  
  /**
    * Default: ["S", "M", "T", "W", "T", "F", "S"]
    */
  var weekdays_short: js.UndefOr[js.Tuple7[String, String, String, String, String, String, String]] = js.undefined
}
object CalendarOptions {
  
  inline def apply(): CalendarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CalendarOptions] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
    
    inline def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
    
    inline def setMonths(
      value: js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String]
    ): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
    
    inline def setMonthsUndefined: Self = StObject.set(x, "months", js.undefined)
    
    inline def setOnchange(value: js.Function): Self = StObject.set(x, "onchange", value.asInstanceOf[js.Any])
    
    inline def setOnchangeUndefined: Self = StObject.set(x, "onchange", js.undefined)
    
    inline def setOnclose(value: js.Function): Self = StObject.set(x, "onclose", value.asInstanceOf[js.Any])
    
    inline def setOncloseUndefined: Self = StObject.set(x, "onclose", js.undefined)
    
    inline def setPlaceholder(value: CellValue): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    
    inline def setResetButton(value: Boolean): Self = StObject.set(x, "resetButton", value.asInstanceOf[js.Any])
    
    inline def setResetButtonUndefined: Self = StObject.set(x, "resetButton", js.undefined)
    
    inline def setTime(value: Boolean): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setToday(value: Boolean): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
    
    inline def setTodayUndefined: Self = StObject.set(x, "today", js.undefined)
    
    inline def setValue(value: CellValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setWeekdays(value: js.Tuple7[String, String, String, String, String, String, String]): Self = StObject.set(x, "weekdays", value.asInstanceOf[js.Any])
    
    inline def setWeekdaysUndefined: Self = StObject.set(x, "weekdays", js.undefined)
    
    inline def setWeekdays_short(value: js.Tuple7[String, String, String, String, String, String, String]): Self = StObject.set(x, "weekdays_short", value.asInstanceOf[js.Any])
    
    inline def setWeekdays_shortUndefined: Self = StObject.set(x, "weekdays_short", js.undefined)
  }
}
