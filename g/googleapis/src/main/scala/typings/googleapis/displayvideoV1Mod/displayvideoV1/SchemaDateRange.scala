package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDateRange extends StObject {
  
  /**
    * The upper bound of the date range, inclusive. Must specify a positive value for `year`, `month`, and `day`.
    */
  var endDate: js.UndefOr[SchemaDate] = js.undefined
  
  /**
    * The lower bound of the date range, inclusive. Must specify a positive value for `year`, `month`, and `day`.
    */
  var startDate: js.UndefOr[SchemaDate] = js.undefined
}
object SchemaDateRange {
  
  inline def apply(): SchemaDateRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDateRange]
  }
  
  extension [Self <: SchemaDateRange](x: Self) {
    
    inline def setEndDate(value: SchemaDate): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setStartDate(value: SchemaDate): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
  }
}
