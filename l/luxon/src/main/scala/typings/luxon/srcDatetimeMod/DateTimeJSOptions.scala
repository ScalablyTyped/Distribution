package typings.luxon.srcDatetimeMod

import typings.luxon.srcMiscMod.CalendarSystem
import typings.luxon.srcMiscMod.NumberingSystem
import typings.luxon.srcZoneMod.Zone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<luxon.luxon/src/datetime.DateTimeOptions, 'setZone'> */
trait DateTimeJSOptions extends StObject {
  
  var locale: js.UndefOr[String] = js.undefined
  
  var numberingSystem: js.UndefOr[NumberingSystem] = js.undefined
  
  var outputCalendar: js.UndefOr[CalendarSystem] = js.undefined
  
  var zone: js.UndefOr[String | Zone] = js.undefined
}
object DateTimeJSOptions {
  
  inline def apply(): DateTimeJSOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimeJSOptions]
  }
  
  extension [Self <: DateTimeJSOptions](x: Self) {
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setNumberingSystem(value: NumberingSystem): Self = StObject.set(x, "numberingSystem", value.asInstanceOf[js.Any])
    
    inline def setNumberingSystemUndefined: Self = StObject.set(x, "numberingSystem", js.undefined)
    
    inline def setOutputCalendar(value: CalendarSystem): Self = StObject.set(x, "outputCalendar", value.asInstanceOf[js.Any])
    
    inline def setOutputCalendarUndefined: Self = StObject.set(x, "outputCalendar", js.undefined)
    
    inline def setZone(value: String | Zone): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
