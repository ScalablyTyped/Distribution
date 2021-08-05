package typings.luxon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZoneOptions extends StObject {
  
  /**
    * @deprecated since 0.2.12. Use keepLocalTime instead
    */
  var keepCalendarTime: js.UndefOr[Boolean] = js.undefined
  
  var keepLocalTime: js.UndefOr[Boolean] = js.undefined
}
object ZoneOptions {
  
  inline def apply(): ZoneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoneOptions]
  }
  
  extension [Self <: ZoneOptions](x: Self) {
    
    inline def setKeepCalendarTime(value: Boolean): Self = StObject.set(x, "keepCalendarTime", value.asInstanceOf[js.Any])
    
    inline def setKeepCalendarTimeUndefined: Self = StObject.set(x, "keepCalendarTime", js.undefined)
    
    inline def setKeepLocalTime(value: Boolean): Self = StObject.set(x, "keepLocalTime", value.asInstanceOf[js.Any])
    
    inline def setKeepLocalTimeUndefined: Self = StObject.set(x, "keepLocalTime", js.undefined)
  }
}
