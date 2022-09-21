package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDateRange extends StObject {
  
  /**
    * The end date for the query in the format `YYYY-MM-DD`.
    */
  var endDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The start date for the query in the format `YYYY-MM-DD`.
    */
  var startDate: js.UndefOr[String | Null] = js.undefined
}
object SchemaDateRange {
  
  inline def apply(): SchemaDateRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDateRange]
  }
  
  extension [Self <: SchemaDateRange](x: Self) {
    
    inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateNull: Self = StObject.set(x, "endDate", null)
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateNull: Self = StObject.set(x, "startDate", null)
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
  }
}
