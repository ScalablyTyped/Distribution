package typings.luxon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateTimeJSOptions
  extends StObject
     with LocaleOptions {
  
  var zone: js.UndefOr[String | Zone] = js.undefined
}
object DateTimeJSOptions {
  
  inline def apply(): DateTimeJSOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimeJSOptions]
  }
  
  extension [Self <: DateTimeJSOptions](x: Self) {
    
    inline def setZone(value: String | Zone): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
