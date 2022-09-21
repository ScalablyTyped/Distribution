package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTimePeriod extends StObject {
  
  /**
    * Required. Indicates the day of the week this period ends on.
    */
  var closeDay: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Valid values are 00:00-24:00, where 24:00 represents midnight at the end of the specified day field.
    */
  var closeTime: js.UndefOr[SchemaTimeOfDay] = js.undefined
  
  /**
    * Required. Indicates the day of the week this period starts on.
    */
  var openDay: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Valid values are 00:00-24:00, where 24:00 represents midnight at the end of the specified day field.
    */
  var openTime: js.UndefOr[SchemaTimeOfDay] = js.undefined
}
object SchemaTimePeriod {
  
  inline def apply(): SchemaTimePeriod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimePeriod]
  }
  
  extension [Self <: SchemaTimePeriod](x: Self) {
    
    inline def setCloseDay(value: String): Self = StObject.set(x, "closeDay", value.asInstanceOf[js.Any])
    
    inline def setCloseDayNull: Self = StObject.set(x, "closeDay", null)
    
    inline def setCloseDayUndefined: Self = StObject.set(x, "closeDay", js.undefined)
    
    inline def setCloseTime(value: SchemaTimeOfDay): Self = StObject.set(x, "closeTime", value.asInstanceOf[js.Any])
    
    inline def setCloseTimeUndefined: Self = StObject.set(x, "closeTime", js.undefined)
    
    inline def setOpenDay(value: String): Self = StObject.set(x, "openDay", value.asInstanceOf[js.Any])
    
    inline def setOpenDayNull: Self = StObject.set(x, "openDay", null)
    
    inline def setOpenDayUndefined: Self = StObject.set(x, "openDay", js.undefined)
    
    inline def setOpenTime(value: SchemaTimeOfDay): Self = StObject.set(x, "openTime", value.asInstanceOf[js.Any])
    
    inline def setOpenTimeUndefined: Self = StObject.set(x, "openTime", js.undefined)
  }
}
