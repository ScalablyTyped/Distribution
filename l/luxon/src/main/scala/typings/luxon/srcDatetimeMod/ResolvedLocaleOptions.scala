package typings.luxon.srcDatetimeMod

import typings.luxon.srcMiscMod.CalendarSystem
import typings.luxon.srcMiscMod.NumberingSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<luxon.luxon/src/datetime.LocaleOptions> */
trait ResolvedLocaleOptions extends StObject {
  
  var locale: String
  
  var numberingSystem: NumberingSystem
  
  var outputCalendar: CalendarSystem
}
object ResolvedLocaleOptions {
  
  inline def apply(locale: String, numberingSystem: NumberingSystem, outputCalendar: CalendarSystem): ResolvedLocaleOptions = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], numberingSystem = numberingSystem.asInstanceOf[js.Any], outputCalendar = outputCalendar.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedLocaleOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResolvedLocaleOptions] (val x: Self) extends AnyVal {
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setNumberingSystem(value: NumberingSystem): Self = StObject.set(x, "numberingSystem", value.asInstanceOf[js.Any])
    
    inline def setOutputCalendar(value: CalendarSystem): Self = StObject.set(x, "outputCalendar", value.asInstanceOf[js.Any])
  }
}
