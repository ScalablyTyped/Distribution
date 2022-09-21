package typings.googleapis.osconfigV1Mod.osconfigV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDate extends StObject {
  
  /**
    * Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a year by itself or a year and month where the day isn't significant.
    */
  var day: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day.
    */
  var month: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year.
    */
  var year: js.UndefOr[Double | Null] = js.undefined
}
object SchemaDate {
  
  inline def apply(): SchemaDate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDate]
  }
  
  extension [Self <: SchemaDate](x: Self) {
    
    inline def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setDayNull: Self = StObject.set(x, "day", null)
    
    inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setMonthNull: Self = StObject.set(x, "month", null)
    
    inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    
    inline def setYearNull: Self = StObject.set(x, "year", null)
    
    inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
  }
}
