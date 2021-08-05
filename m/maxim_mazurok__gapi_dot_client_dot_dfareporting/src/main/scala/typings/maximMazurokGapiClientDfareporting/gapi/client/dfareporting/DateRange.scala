package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateRange extends StObject {
  
  var endDate: js.UndefOr[String] = js.undefined
  
  /** The kind of resource this is, in this case dfareporting#dateRange. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The date range relative to the date of when the report is run. */
  var relativeDateRange: js.UndefOr[String] = js.undefined
  
  var startDate: js.UndefOr[String] = js.undefined
}
object DateRange {
  
  inline def apply(): DateRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateRange]
  }
  
  extension [Self <: DateRange](x: Self) {
    
    inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setRelativeDateRange(value: String): Self = StObject.set(x, "relativeDateRange", value.asInstanceOf[js.Any])
    
    inline def setRelativeDateRangeUndefined: Self = StObject.set(x, "relativeDateRange", js.undefined)
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
  }
}
