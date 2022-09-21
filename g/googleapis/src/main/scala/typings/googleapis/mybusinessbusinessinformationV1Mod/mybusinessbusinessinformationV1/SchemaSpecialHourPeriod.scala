package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSpecialHourPeriod extends StObject {
  
  /**
    * Optional. Valid values are 00:00-24:00, where 24:00 represents midnight at the end of the specified day field. Must be specified if `closed` is false.
    */
  var closeTime: js.UndefOr[SchemaTimeOfDay] = js.undefined
  
  /**
    * Optional. If true, `end_date`, `open_time`, and `close_time` are ignored, and the date specified in `start_date` is treated as the location being closed for the entire day.
    */
  var closed: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. The calendar date this special hour period ends on. If `end_date` field is not set, default to the date specified in `start_date`. If set, this field must be equal to or at most 1 day after `start_date`.
    */
  var endDate: js.UndefOr[SchemaDate] = js.undefined
  
  /**
    * Optional. Valid values are 00:00-24:00 where 24:00 represents midnight at the end of the specified day field. Must be specified if `closed` is false.
    */
  var openTime: js.UndefOr[SchemaTimeOfDay] = js.undefined
  
  /**
    * Required. The calendar date this special hour period starts on.
    */
  var startDate: js.UndefOr[SchemaDate] = js.undefined
}
object SchemaSpecialHourPeriod {
  
  inline def apply(): SchemaSpecialHourPeriod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSpecialHourPeriod]
  }
  
  extension [Self <: SchemaSpecialHourPeriod](x: Self) {
    
    inline def setCloseTime(value: SchemaTimeOfDay): Self = StObject.set(x, "closeTime", value.asInstanceOf[js.Any])
    
    inline def setCloseTimeUndefined: Self = StObject.set(x, "closeTime", js.undefined)
    
    inline def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
    
    inline def setClosedNull: Self = StObject.set(x, "closed", null)
    
    inline def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
    
    inline def setEndDate(value: SchemaDate): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setOpenTime(value: SchemaTimeOfDay): Self = StObject.set(x, "openTime", value.asInstanceOf[js.Any])
    
    inline def setOpenTimeUndefined: Self = StObject.set(x, "openTime", js.undefined)
    
    inline def setStartDate(value: SchemaDate): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
  }
}
