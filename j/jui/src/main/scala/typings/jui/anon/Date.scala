package typings.jui.anon

import typings.jui.juiStrings.daily
import typings.jui.juiStrings.monthly
import typings.jui.juiStrings.now
import typings.jui.juiStrings.yearly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Date extends StObject {
  
  /**
    * @cfg {Date} [date="now"]
    * Selects a specific date as a basic
    */
  var date: js.UndefOr[now | typings.std.Date] = js.undefined
  
  var event: js.UndefOr[js.Any] = js.undefined
  
  /**
    * @cfg {String} [format="yyyy-MM-dd"]
    * Format of the date handed over when selecting a specific date
    */
  var format: js.UndefOr[String] = js.undefined
  
  /**
    * @cfg {Date} [maxDate="null"]
    * Selects a specific maximum date
    */
  var maxDate: js.UndefOr[typings.std.Date] = js.undefined
  
  /**
    * @cfg {Date} [minDate="null"]
    * Selects a specific minimum date
    */
  var minDate: js.UndefOr[typings.std.Date] = js.undefined
  
  /**
    * @cfg {String} [titleFormat="yyyy.MM"]
    * Title format of a calendar
    */
  var titleFormat: js.UndefOr[String] = js.undefined
  
  var tpl: js.UndefOr[js.Any] = js.undefined
  
  /**
    * @cfg {"daily"/"monthly"/"yearly"} [type="daily"]
    * Determines the type of a calendar
    */
  var `type`: js.UndefOr[daily | monthly | yearly] = js.undefined
}
object Date {
  
  inline def apply(): Date = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Date]
  }
  
  extension [Self <: Date](x: Self) {
    
    inline def setDate(value: now | typings.std.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setMaxDate(value: typings.std.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
    
    inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
    
    inline def setMinDate(value: typings.std.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
    
    inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
    
    inline def setTitleFormat(value: String): Self = StObject.set(x, "titleFormat", value.asInstanceOf[js.Any])
    
    inline def setTitleFormatUndefined: Self = StObject.set(x, "titleFormat", js.undefined)
    
    inline def setTpl(value: js.Any): Self = StObject.set(x, "tpl", value.asInstanceOf[js.Any])
    
    inline def setTplUndefined: Self = StObject.set(x, "tpl", js.undefined)
    
    inline def setType(value: daily | monthly | yearly): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
