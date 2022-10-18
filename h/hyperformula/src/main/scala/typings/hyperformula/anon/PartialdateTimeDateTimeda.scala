package typings.hyperformula.anon

import typings.hyperformula.typingsDateTimeHelperMod.DateTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  dateTime :hyperformula.hyperformula/typings/DateTimeHelper.DateTime,   dateFormat :string,   timeFormat :string}> */
trait PartialdateTimeDateTimeda extends StObject {
  
  var dateFormat: js.UndefOr[String] = js.undefined
  
  var dateTime: js.UndefOr[DateTime] = js.undefined
  
  var timeFormat: js.UndefOr[String] = js.undefined
}
object PartialdateTimeDateTimeda {
  
  inline def apply(): PartialdateTimeDateTimeda = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialdateTimeDateTimeda]
  }
  
  extension [Self <: PartialdateTimeDateTimeda](x: Self) {
    
    inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
    
    inline def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
    
    inline def setDateTime(value: DateTime): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
    
    inline def setDateTimeUndefined: Self = StObject.set(x, "dateTime", js.undefined)
    
    inline def setTimeFormat(value: String): Self = StObject.set(x, "timeFormat", value.asInstanceOf[js.Any])
    
    inline def setTimeFormatUndefined: Self = StObject.set(x, "timeFormat", js.undefined)
  }
}
