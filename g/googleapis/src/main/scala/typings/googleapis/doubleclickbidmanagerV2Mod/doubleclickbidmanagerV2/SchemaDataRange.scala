package typings.googleapis.doubleclickbidmanagerV2Mod.doubleclickbidmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDataRange extends StObject {
  
  /**
    * The ending date for the data that is shown in the report. Note, `customEndDate` is required if `range` is `CUSTOM_DATES` and ignored otherwise.
    */
  var customEndDate: js.UndefOr[SchemaDate] = js.undefined
  
  /**
    * The starting data for the data that is shown in the report. Note, `customStartDate` is required if `range` is `CUSTOM_DATES` and ignored otherwise.
    */
  var customStartDate: js.UndefOr[SchemaDate] = js.undefined
  
  /**
    * Report data range used to generate the report.
    */
  var range: js.UndefOr[String | Null] = js.undefined
}
object SchemaDataRange {
  
  inline def apply(): SchemaDataRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataRange]
  }
  
  extension [Self <: SchemaDataRange](x: Self) {
    
    inline def setCustomEndDate(value: SchemaDate): Self = StObject.set(x, "customEndDate", value.asInstanceOf[js.Any])
    
    inline def setCustomEndDateUndefined: Self = StObject.set(x, "customEndDate", js.undefined)
    
    inline def setCustomStartDate(value: SchemaDate): Self = StObject.set(x, "customStartDate", value.asInstanceOf[js.Any])
    
    inline def setCustomStartDateUndefined: Self = StObject.set(x, "customStartDate", js.undefined)
    
    inline def setRange(value: String): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeNull: Self = StObject.set(x, "range", null)
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
