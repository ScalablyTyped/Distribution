package typings.luxon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocaleOptions extends StObject {
  
  var locale: js.UndefOr[String] = js.native
  
  var numberingSystem: js.UndefOr[NumberingSystem] = js.native
  
  var outputCalendar: js.UndefOr[CalendarSystem] = js.native
}
object LocaleOptions {
  
  @scala.inline
  def apply(): LocaleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocaleOptions]
  }
  
  @scala.inline
  implicit class LocaleOptionsMutableBuilder[Self <: LocaleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setNumberingSystem(value: NumberingSystem): Self = StObject.set(x, "numberingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberingSystemUndefined: Self = StObject.set(x, "numberingSystem", js.undefined)
    
    @scala.inline
    def setOutputCalendar(value: CalendarSystem): Self = StObject.set(x, "outputCalendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputCalendarUndefined: Self = StObject.set(x, "outputCalendar", js.undefined)
  }
}
