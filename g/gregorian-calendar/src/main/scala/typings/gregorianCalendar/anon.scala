package typings.gregorianCalendar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Locale extends StObject {
    
    var locale: js.Object
  }
  object Locale {
    
    inline def apply(locale: js.Object): Locale = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[Locale]
    }
    
    extension [Self <: Locale](x: Self) {
      
      inline def setLocale(value: js.Object): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    }
  }
}
