package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a date range.
  */
trait SchemaDateRange extends StObject {
  
  /**
    * The end date of the date range, inclusive. A string of the format:
    * &quot;yyyy-MM-dd&quot;.
    */
  var endDate: js.UndefOr[String] = js.undefined
  
  /**
    * The kind of resource this is, in this case dfareporting#dateRange.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The date range relative to the date of when the report is run.
    */
  var relativeDateRange: js.UndefOr[String] = js.undefined
  
  /**
    * The start date of the date range, inclusive. A string of the format:
    * &quot;yyyy-MM-dd&quot;.
    */
  var startDate: js.UndefOr[String] = js.undefined
}
object SchemaDateRange {
  
  inline def apply(): SchemaDateRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDateRange]
  }
  
  extension [Self <: SchemaDateRange](x: Self) {
    
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
