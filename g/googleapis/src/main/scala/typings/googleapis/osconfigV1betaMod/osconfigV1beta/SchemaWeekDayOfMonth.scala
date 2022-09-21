package typings.googleapis.osconfigV1betaMod.osconfigV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWeekDayOfMonth extends StObject {
  
  /**
    * Required. A day of the week.
    */
  var dayOfWeek: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Represents the number of days before or after the given week day of month that the patch deployment is scheduled for. For example if `week_ordinal` and `day_of_week` values point to the second day of the month and this `day_offset` value is set to `3`, the patch deployment takes place three days after the second Tuesday of the month. If this value is negative, for example -5, the patches are deployed five days before before the second Tuesday of the month. Allowed values are in range [-30, 30].
    */
  var dayOffset: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Required. Week number in a month. 1-4 indicates the 1st to 4th week of the month. -1 indicates the last week of the month.
    */
  var weekOrdinal: js.UndefOr[Double | Null] = js.undefined
}
object SchemaWeekDayOfMonth {
  
  inline def apply(): SchemaWeekDayOfMonth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWeekDayOfMonth]
  }
  
  extension [Self <: SchemaWeekDayOfMonth](x: Self) {
    
    inline def setDayOfWeek(value: String): Self = StObject.set(x, "dayOfWeek", value.asInstanceOf[js.Any])
    
    inline def setDayOfWeekNull: Self = StObject.set(x, "dayOfWeek", null)
    
    inline def setDayOfWeekUndefined: Self = StObject.set(x, "dayOfWeek", js.undefined)
    
    inline def setDayOffset(value: Double): Self = StObject.set(x, "dayOffset", value.asInstanceOf[js.Any])
    
    inline def setDayOffsetNull: Self = StObject.set(x, "dayOffset", null)
    
    inline def setDayOffsetUndefined: Self = StObject.set(x, "dayOffset", js.undefined)
    
    inline def setWeekOrdinal(value: Double): Self = StObject.set(x, "weekOrdinal", value.asInstanceOf[js.Any])
    
    inline def setWeekOrdinalNull: Self = StObject.set(x, "weekOrdinal", null)
    
    inline def setWeekOrdinalUndefined: Self = StObject.set(x, "weekOrdinal", js.undefined)
  }
}
