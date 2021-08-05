package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartYAxisItemLabelsDateFormats extends StObject {
  
  var days: js.UndefOr[String] = js.undefined
  
  var hours: js.UndefOr[String] = js.undefined
  
  var months: js.UndefOr[String] = js.undefined
  
  var weeks: js.UndefOr[String] = js.undefined
  
  var years: js.UndefOr[String] = js.undefined
}
object ChartYAxisItemLabelsDateFormats {
  
  inline def apply(): ChartYAxisItemLabelsDateFormats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartYAxisItemLabelsDateFormats]
  }
  
  extension [Self <: ChartYAxisItemLabelsDateFormats](x: Self) {
    
    inline def setDays(value: String): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
    
    inline def setDaysUndefined: Self = StObject.set(x, "days", js.undefined)
    
    inline def setHours(value: String): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
    
    inline def setHoursUndefined: Self = StObject.set(x, "hours", js.undefined)
    
    inline def setMonths(value: String): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
    
    inline def setMonthsUndefined: Self = StObject.set(x, "months", js.undefined)
    
    inline def setWeeks(value: String): Self = StObject.set(x, "weeks", value.asInstanceOf[js.Any])
    
    inline def setWeeksUndefined: Self = StObject.set(x, "weeks", js.undefined)
    
    inline def setYears(value: String): Self = StObject.set(x, "years", value.asInstanceOf[js.Any])
    
    inline def setYearsUndefined: Self = StObject.set(x, "years", js.undefined)
  }
}
