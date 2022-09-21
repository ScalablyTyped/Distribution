package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterCalendar extends StObject {
  
  var enterCalendar: js.UndefOr[String] = js.undefined
  
  var exitCalendar: js.UndefOr[String] = js.undefined
}
object EnterCalendar {
  
  inline def apply(): EnterCalendar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnterCalendar]
  }
  
  extension [Self <: EnterCalendar](x: Self) {
    
    inline def setEnterCalendar(value: String): Self = StObject.set(x, "enterCalendar", value.asInstanceOf[js.Any])
    
    inline def setEnterCalendarUndefined: Self = StObject.set(x, "enterCalendar", js.undefined)
    
    inline def setExitCalendar(value: String): Self = StObject.set(x, "exitCalendar", value.asInstanceOf[js.Any])
    
    inline def setExitCalendarUndefined: Self = StObject.set(x, "exitCalendar", js.undefined)
  }
}
